package typingsSlinky.maximMazurokGapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDrive.anon.CommentId
import typingsSlinky.maximMazurokGapiClientDrive.anon.FileId
import typingsSlinky.maximMazurokGapiClientDrive.anon.IncludeDeleted
import typingsSlinky.maximMazurokGapiClientDrive.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientDrive.anon.PageSize
import typingsSlinky.maximMazurokGapiClientDrive.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsResource extends StObject {
  
  /** Creates a new comment on a file. */
  def create(request: FileId): Request[Comment] = js.native
  def create(request: Oauthtoken, body: Comment): Request[Comment] = js.native
  
  /** Deletes a comment. */
  def delete(): Request[Unit] = js.native
  def delete(request: CommentId): Request[Unit] = js.native
  
  /** Gets a comment by ID. */
  def get(): Request[Comment] = js.native
  def get(request: IncludeDeleted): Request[Comment] = js.native
  
  /** Lists a file's comments. */
  def list(): Request[CommentList] = js.native
  def list(request: PageSize): Request[CommentList] = js.native
  
  def update(request: CommentId, body: Comment): Request[Comment] = js.native
  /** Updates a comment with patch semantics. */
  def update(request: PrettyPrint): Request[Comment] = js.native
}
