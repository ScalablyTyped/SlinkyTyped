package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.AllThreadsRelatedToChannelId
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Alt
import typingsSlinky.maximMazurokGapiClientYoutube.anon.AltCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentThreadsResource extends StObject {
  
  /** Inserts a new resource into this collection. */
  def insert(request: AltCallback): Request[CommentThread] = js.native
  def insert(request: Alt, body: CommentThread): Request[CommentThread] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[CommentThreadListResponse] = js.native
  def list(request: AllThreadsRelatedToChannelId): Request[CommentThreadListResponse] = js.native
  
  /** Updates an existing resource. */
  def update(request: AltCallback): Request[CommentThread] = js.native
  def update(request: Alt, body: CommentThread): Request[CommentThread] = js.native
}
