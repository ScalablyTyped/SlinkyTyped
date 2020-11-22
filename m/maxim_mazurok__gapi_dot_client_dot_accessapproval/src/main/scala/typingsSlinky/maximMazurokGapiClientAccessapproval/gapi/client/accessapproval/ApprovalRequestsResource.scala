package typingsSlinky.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAccessapproval.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientAccessapproval.anon.Alt
import typingsSlinky.maximMazurokGapiClientAccessapproval.anon.Callback
import typingsSlinky.maximMazurokGapiClientAccessapproval.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApprovalRequestsResource extends js.Object {
  
  /**
    * Approves a request and returns the updated ApprovalRequest. Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a
    * pending state.
    */
  def approve(request: Accesstoken): Request[ApprovalRequest] = js.native
  def approve(request: Alt, body: ApproveApprovalRequestMessage): Request[ApprovalRequest] = js.native
  
  def dismiss(request: Alt, body: DismissApprovalRequestMessage): Request[ApprovalRequest] = js.native
  /**
    * Dismisses a request. Returns the updated ApprovalRequest. NOTE: This does not deny access to the resource if another request has been made and approved. It is equivalent in effect
    * to ignoring the request altogether. Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a pending state.
    */
  def dismiss(request: Callback): Request[ApprovalRequest] = js.native
  
  /** Gets an approval request. Returns NOT_FOUND if the request does not exist. */
  def get(): Request[ApprovalRequest] = js.native
  def get(request: Alt): Request[ApprovalRequest] = js.native
  
  /**
    * Lists approval requests associated with a project, folder, or organization. Approval requests can be filtered by state (pending, active, dismissed). The order is reverse
    * chronological.
    */
  def list(): Request[ListApprovalRequestsResponse] = js.native
  def list(request: Fields): Request[ListApprovalRequestsResponse] = js.native
}
