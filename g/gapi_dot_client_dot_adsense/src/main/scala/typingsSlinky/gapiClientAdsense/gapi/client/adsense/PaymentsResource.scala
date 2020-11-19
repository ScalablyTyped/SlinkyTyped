package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsense.anon.AccountIdAlt
import typingsSlinky.gapiClientAdsense.anon.FieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentsResource extends js.Object {
  
  /** List the payments for the specified AdSense account. */
  def list(request: AccountIdAlt): Request[Payments] = js.native
  /** List the payments for this AdSense account. */
  def list(request: FieldsKey): Request[Payments] = js.native
}
