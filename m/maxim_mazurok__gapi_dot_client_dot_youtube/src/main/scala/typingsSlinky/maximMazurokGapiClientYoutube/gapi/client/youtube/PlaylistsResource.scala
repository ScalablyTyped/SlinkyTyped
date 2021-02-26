package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.CallbackChannelId
import typingsSlinky.maximMazurokGapiClientYoutube.anon.OnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel
import typingsSlinky.maximMazurokGapiClientYoutube.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientYoutube.anon.PrettyPrintQuotaUser
import typingsSlinky.maximMazurokGapiClientYoutube.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientYoutube.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistsResource extends StObject {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUser): Request[Unit] = js.native
  
  /** Inserts a new resource into this collection. */
  def insert(request: OnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel): Request[Playlist] = js.native
  def insert(request: UploadType, body: Playlist): Request[Playlist] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[PlaylistListResponse] = js.native
  def list(request: CallbackChannelId): Request[PlaylistListResponse] = js.native
  
  /** Updates an existing resource. */
  def update(request: PrettyPrintQuotaUser): Request[Playlist] = js.native
  def update(request: PrettyPrint, body: Playlist): Request[Playlist] = js.native
}
