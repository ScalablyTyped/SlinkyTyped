package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.AdvertiserGroupIds
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertisersResource extends StObject {
  
  /** Gets one advertiser by ID. */
  def get(): Request[Advertiser] = js.native
  def get(request: Alt): Request[Advertiser] = js.native
  
  /** Inserts a new advertiser. */
  def insert(request: AccesstokenAlt): Request[Advertiser] = js.native
  def insert(request: Callback, body: Advertiser): Request[Advertiser] = js.native
  
  /** Retrieves a list of advertisers, possibly filtered. This method supports paging. */
  def list(): Request[AdvertisersListResponse] = js.native
  def list(request: AdvertiserGroupIds): Request[AdvertisersListResponse] = js.native
  
  /** Updates an existing advertiser. This method supports patch semantics. */
  def patch(request: AltCallback): Request[Advertiser] = js.native
  def patch(request: Alt, body: Advertiser): Request[Advertiser] = js.native
  
  /** Updates an existing advertiser. */
  def update(request: AccesstokenAlt): Request[Advertiser] = js.native
  def update(request: Callback, body: Advertiser): Request[Advertiser] = js.native
}
