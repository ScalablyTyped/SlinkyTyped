package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Alt
import typingsSlinky.maximMazurokGapiClientYoutube.anon.BanAuthor
import typingsSlinky.maximMazurokGapiClientYoutube.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsResource extends StObject {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: Uploadprotocol): Request[Unit] = js.native
  
  def insert(request: Alt, body: Comment): Request[Comment] = js.native
  /** Inserts a new resource into this collection. */
  def insert(request: Xgafv): Request[Comment] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[CommentListResponse] = js.native
  def list(request: MaxResults): Request[CommentListResponse] = js.native
  
  /** Expresses the caller's opinion that one or more comments should be flagged as spam. */
  def markAsSpam(): Request[Unit] = js.native
  def markAsSpam(request: AccesstokenAlt): Request[Unit] = js.native
  
  /** Sets the moderation status of one or more comments. */
  def setModerationStatus(): Request[Unit] = js.native
  def setModerationStatus(request: BanAuthor): Request[Unit] = js.native
  
  def update(request: Alt, body: Comment): Request[Comment] = js.native
  /** Updates an existing resource. */
  def update(request: Xgafv): Request[Comment] = js.native
}
