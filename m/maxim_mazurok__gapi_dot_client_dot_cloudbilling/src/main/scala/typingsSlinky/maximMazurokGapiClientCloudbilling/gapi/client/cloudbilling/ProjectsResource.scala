package typingsSlinky.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCloudbilling.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientCloudbilling.anon.Alt
import typingsSlinky.maximMazurokGapiClientCloudbilling.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  /**
    * Gets the billing information for a project. The current authenticated user must have [permission to view the
    * project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo ).
    */
  def getBillingInfo(): Request[ProjectBillingInfo] = js.native
  def getBillingInfo(request: Alt): Request[ProjectBillingInfo] = js.native
  
  /**
    * Lists the projects associated with a billing account. The current authenticated user must have the `billing.resourceAssociations.list` IAM permission, which is often given to
    * billing account [viewers](https://cloud.google.com/billing/docs/how-to/billing-access).
    */
  def list(): Request[ListProjectBillingInfoResponse] = js.native
  def list(request: Accesstoken): Request[ListProjectBillingInfoResponse] = js.native
  
  def updateBillingInfo(request: Alt, body: ProjectBillingInfo): Request[ProjectBillingInfo] = js.native
  /**
    * Sets or updates the billing account associated with a project. You specify the new billing account by setting the `billing_account_name` in the `ProjectBillingInfo` resource to the
    * resource name of a billing account. Associating a project with an open billing account enables billing on the project and allows charges for resource usage. If the project already
    * had a billing account, this method changes the billing account used for resource usage charges. *Note:* Incurred charges that have not yet been reported in the transaction history
    * of the Google Cloud Console might be billed to the new billing account, even if the charge occurred before the new billing account was assigned to the project. The current
    * authenticated user must have ownership privileges for both the [project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo ) and the [billing
    * account](https://cloud.google.com/billing/docs/how-to/billing-access). You can disable billing on the project by setting the `billing_account_name` field to empty. This action
    * disassociates the current billing account from the project. Any billable activity of your in-use services will stop, and your application could stop functioning as expected. Any
    * unbilled charges to date will be billed to the previously associated account. The current authenticated user must be either an owner of the project or an owner of the billing
    * account for the project. Note that associating a project with a *closed* billing account will have much the same effect as disabling billing on the project: any paid resources used
    * by the project will be shut down. Thus, unless you wish to disable billing, you should always call this method with the name of an *open* billing account.
    */
  def updateBillingInfo(request: Callback): Request[ProjectBillingInfo] = js.native
}
