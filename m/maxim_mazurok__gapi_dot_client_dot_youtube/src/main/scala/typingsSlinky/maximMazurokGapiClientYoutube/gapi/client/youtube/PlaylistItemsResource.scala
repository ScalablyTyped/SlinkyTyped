package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.OnBehalfOfContentOwnerPart
import typingsSlinky.maximMazurokGapiClientYoutube.anon.PlaylistId
import typingsSlinky.maximMazurokGapiClientYoutube.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientYoutube.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistItemsResource extends StObject {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUser): Request[Unit] = js.native
  
  /** Inserts a new resource into this collection. */
  def insert(request: OnBehalfOfContentOwnerPart): Request[PlaylistItem] = js.native
  def insert(request: PrettyPrint, body: PlaylistItem): Request[PlaylistItem] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[PlaylistItemListResponse] = js.native
  def list(request: PlaylistId): Request[PlaylistItemListResponse] = js.native
  
  /** Updates an existing resource. */
  def update(request: OnBehalfOfContentOwnerPart): Request[PlaylistItem] = js.native
  def update(request: PrettyPrint, body: PlaylistItem): Request[PlaylistItem] = js.native
}
