package typingsSlinky.maximMazurokGapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDrive.anon.AltCommentId
import typingsSlinky.maximMazurokGapiClientDrive.anon.CommentId
import typingsSlinky.maximMazurokGapiClientDrive.anon.CommentIdFields
import typingsSlinky.maximMazurokGapiClientDrive.anon.FileIdIncludeDeleted
import typingsSlinky.maximMazurokGapiClientDrive.anon.FileIdKey
import typingsSlinky.maximMazurokGapiClientDrive.anon.ReplyId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepliesResource extends StObject {
  
  /** Creates a new reply to a comment. */
  def create(request: AltCommentId): Request[Reply] = js.native
  def create(request: CommentId, body: Reply): Request[Reply] = js.native
  
  /** Deletes a reply. */
  def delete(): Request[Unit] = js.native
  def delete(request: ReplyId): Request[Unit] = js.native
  
  /** Gets a reply by ID. */
  def get(): Request[Reply] = js.native
  def get(request: CommentIdFields): Request[Reply] = js.native
  
  /** Lists a comment's replies. */
  def list(): Request[ReplyList] = js.native
  def list(request: FileIdIncludeDeleted): Request[ReplyList] = js.native
  
  /** Updates a reply with patch semantics. */
  def update(request: FileIdKey): Request[Reply] = js.native
  def update(request: ReplyId, body: Reply): Request[Reply] = js.native
}
