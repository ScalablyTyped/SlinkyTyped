package typingsSlinky.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdsense.anon.AccountIdAlt
import typingsSlinky.maximMazurokGapiClientAdsense.anon.FieldsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentsResource extends StObject {
  
  /** List the payments for the specified AdSense account. */
  def list(): Request[Payments] = js.native
  def list(request: AccountIdAlt): Request[Payments] = js.native
  def list(request: FieldsKey): Request[Payments] = js.native
}
