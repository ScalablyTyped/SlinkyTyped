package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentsResource extends js.Object {
  
  /** Returns the list of all non-draft environments of the specified agent. */
  def list(): Request[GoogleCloudDialogflowV2ListEnvironmentsResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudDialogflowV2ListEnvironmentsResponse] = js.native
  
  var users: UsersResource = js.native
}
