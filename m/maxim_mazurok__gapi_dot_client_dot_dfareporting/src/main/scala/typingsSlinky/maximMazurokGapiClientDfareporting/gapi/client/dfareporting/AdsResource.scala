package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.AdvertiserId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.ProfileId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdsResource extends StObject {
  
  /** Gets one ad by ID. */
  def get(): Request[Ad] = js.native
  def get(request: Alt): Request[Ad] = js.native
  
  def insert(request: Callback, body: Ad): Request[Ad] = js.native
  /** Inserts a new ad. */
  def insert(request: ProfileId): Request[Ad] = js.native
  
  /** Retrieves a list of ads, possibly filtered. This method supports paging. */
  def list(): Request[AdsListResponse] = js.native
  def list(request: AdvertiserId): Request[AdsListResponse] = js.native
  
  def patch(request: Alt, body: Ad): Request[Ad] = js.native
  /** Updates an existing ad. This method supports patch semantics. */
  def patch(request: QuotaUser): Request[Ad] = js.native
  
  def update(request: Callback, body: Ad): Request[Ad] = js.native
  /** Updates an existing ad. */
  def update(request: ProfileId): Request[Ad] = js.native
}
