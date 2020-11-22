package typingsSlinky.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.FilterAdClientId
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends js.Object {
  
  var adclients: AdclientsResource = js.native
  
  var adunits: AdunitsResource = js.native
  
  /** Get information about the selected associated AdSense account. */
  def get(): Request[Account] = js.native
  def get(request: PrettyPrint): Request[Account] = js.native
  
  /** List hosted accounts associated with this AdSense account by ad client id. */
  def list(): Request[Accounts] = js.native
  def list(request: FilterAdClientId): Request[Accounts] = js.native
  
  var reports: ReportsResource = js.native
}
