package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Fields
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.KeyLocationListId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.ResourceUploadType
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.UpdateMaskUploadType
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.UploadTypeUploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationListsResource extends StObject {
  
  var assignedLocations: AssignedLocationsResource = js.native
  
  def create(request: AdvertiserId, body: LocationList): Request[LocationList] = js.native
  /** Creates a new location list. Returns the newly created location list if successful. */
  def create(request: ResourceUploadType): Request[LocationList] = js.native
  
  /** Gets a location list. */
  def get(): Request[LocationList] = js.native
  def get(request: KeyLocationListId): Request[LocationList] = js.native
  
  /** Lists location lists based on a given advertiser id. */
  def list(): Request[ListLocationListsResponse] = js.native
  def list(request: Fields): Request[ListLocationListsResponse] = js.native
  
  /** Updates a location list. Returns the updated location list if successful. */
  def patch(request: UpdateMaskUploadType): Request[LocationList] = js.native
  def patch(request: UploadTypeUploadprotocol, body: LocationList): Request[LocationList] = js.native
}
