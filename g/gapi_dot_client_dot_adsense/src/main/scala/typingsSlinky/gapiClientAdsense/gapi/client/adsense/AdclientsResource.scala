package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsense.anon.AccountId
import typingsSlinky.gapiClientAdsense.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdclientsResource extends js.Object {
  
  /** List all ad clients in the specified account. */
  def list(request: AccountId): Request[AdClients] = js.native
  /** List all ad clients in this AdSense account. */
  def list(request: Alt): Request[AdClients] = js.native
}
