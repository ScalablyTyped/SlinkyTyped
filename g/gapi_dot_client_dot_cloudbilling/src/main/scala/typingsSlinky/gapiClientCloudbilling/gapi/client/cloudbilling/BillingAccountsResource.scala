package typingsSlinky.gapiClientCloudbilling.gapi.client.cloudbilling

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudbilling.AnonAlt
import typingsSlinky.gapiClientCloudbilling.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingAccountsResource extends js.Object {
  var projects: ProjectsResource
  /**
    * Gets information about a billing account. The current authenticated user
    * must be an [owner of the billing
    * account](https://support.google.com/cloud/answer/4430947).
    */
  def get(request: AnonAlt): Request_[BillingAccount]
  /**
    * Lists the billing accounts that the current authenticated user
    * [owns](https://support.google.com/cloud/answer/4430947).
    */
  def list(request: AnonBearertoken): Request_[ListBillingAccountsResponse]
}

object BillingAccountsResource {
  @scala.inline
  def apply(
    get: AnonAlt => Request_[BillingAccount],
    list: AnonBearertoken => Request_[ListBillingAccountsResponse],
    projects: ProjectsResource
  ): BillingAccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), projects = projects.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BillingAccountsResource]
  }
}

