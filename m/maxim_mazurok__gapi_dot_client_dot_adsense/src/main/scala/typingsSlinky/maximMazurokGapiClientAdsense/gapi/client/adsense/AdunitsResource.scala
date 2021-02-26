package typingsSlinky.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdsense.anon.AdClientIdAlt
import typingsSlinky.maximMazurokGapiClientAdsense.anon.IncludeInactive
import typingsSlinky.maximMazurokGapiClientAdsense.anon.PageToken
import typingsSlinky.maximMazurokGapiClientAdsense.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientAdsense.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientAdsense.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdunitsResource extends StObject {
  
  var customchannels: CustomchannelsResource = js.native
  
  /** Gets the specified ad unit in the specified ad client for the specified account. */
  def get(): Request[AdUnit] = js.native
  def get(request: PrettyPrint): Request[AdUnit] = js.native
  def get(request: QuotaUser): Request[AdUnit] = js.native
  
  /** Get ad code for the specified ad unit. */
  def getAdCode(): Request[AdCode] = js.native
  def getAdCode(request: PrettyPrint): Request[AdCode] = js.native
  def getAdCode(request: QuotaUser): Request[AdCode] = js.native
  
  /** List all ad units in the specified ad client for the specified account. */
  def list(): Request[AdUnits] = js.native
  def list(request: AdClientIdAlt): Request[AdUnits] = js.native
  def list(request: IncludeInactive): Request[AdUnits] = js.native
  def list(request: PageToken): Request[AdUnits] = js.native
  def list(request: UserIp): Request[AdUnits] = js.native
}
