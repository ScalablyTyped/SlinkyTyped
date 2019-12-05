package typingsSlinky.gapiDotClientDotAnalytics.gapi.client.analytics

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotAnalytics.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningResource extends js.Object {
  /** Creates an account ticket. */
  def createAccountTicket(request: Anon_AltFieldsKeyOauthtoken): Request[AccountTicket]
}

object ProvisioningResource {
  @scala.inline
  def apply(createAccountTicket: Anon_AltFieldsKeyOauthtoken => Request[AccountTicket]): ProvisioningResource = {
    val __obj = js.Dynamic.literal(createAccountTicket = js.Any.fromFunction1(createAccountTicket))
  
    __obj.asInstanceOf[ProvisioningResource]
  }
}

