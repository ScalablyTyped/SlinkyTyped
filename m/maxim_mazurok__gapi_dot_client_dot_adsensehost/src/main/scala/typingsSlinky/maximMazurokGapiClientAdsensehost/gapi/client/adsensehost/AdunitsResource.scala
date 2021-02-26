package typingsSlinky.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.AccountId
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.AdUnitId
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.HostCustomChannelId
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.IncludeInactive
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.Key
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdunitsResource extends StObject {
  
  /** Delete the specified ad unit from the specified publisher AdSense account. */
  def delete(): Request[AdUnit] = js.native
  def delete(request: AdUnitId): Request[AdUnit] = js.native
  
  /** Get the specified host ad unit in this AdSense account. */
  def get(): Request[AdUnit] = js.native
  def get(request: AdUnitId): Request[AdUnit] = js.native
  
  /** Get ad code for the specified ad unit, attaching the specified host custom channels. */
  def getAdCode(): Request[AdCode] = js.native
  def getAdCode(request: HostCustomChannelId): Request[AdCode] = js.native
  
  def insert(request: AccountId, body: AdUnit): Request[AdUnit] = js.native
  /** Insert the supplied ad unit into the specified publisher AdSense account. */
  def insert(request: Key): Request[AdUnit] = js.native
  
  /** List all ad units in the specified publisher's AdSense account. */
  def list(): Request[AdUnits] = js.native
  def list(request: IncludeInactive): Request[AdUnits] = js.native
  
  def patch(request: AdUnitId, body: AdUnit): Request[AdUnit] = js.native
  /** Update the supplied ad unit in the specified publisher AdSense account. This method supports patch semantics. */
  def patch(request: Oauthtoken): Request[AdUnit] = js.native
  
  def update(request: AccountId, body: AdUnit): Request[AdUnit] = js.native
  /** Update the supplied ad unit in the specified publisher AdSense account. */
  def update(request: Key): Request[AdUnit] = js.native
}
