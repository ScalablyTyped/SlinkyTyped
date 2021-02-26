package typingsSlinky.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdsense.anon.AccountId
import typingsSlinky.maximMazurokGapiClientAdsense.anon.Alt
import typingsSlinky.maximMazurokGapiClientAdsense.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdclientsResource extends StObject {
  
  /** Get Auto ad code for a given ad client. */
  def getAdCode(): Request[AdCode] = js.native
  def getAdCode(request: AccountId): Request[AdCode] = js.native
  
  /** List all ad clients in the specified account. */
  def list(): Request[AdClients] = js.native
  def list(request: Alt): Request[AdClients] = js.native
  def list(request: Fields): Request[AdClients] = js.native
}
