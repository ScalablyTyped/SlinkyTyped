package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.ReviewId
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.StartIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewsResource extends StObject {
  
  /** Gets a single review. */
  def get(): Request[Review] = js.native
  def get(request: ReviewId): Request[Review] = js.native
  
  /** Lists all reviews. */
  def list(): Request[ReviewsListResponse] = js.native
  def list(request: StartIndex): Request[ReviewsListResponse] = js.native
  
  /** Replies to a single review, or updates an existing reply. */
  def reply(request: CallbackFields): Request[ReviewsReplyResponse] = js.native
  def reply(request: FieldsKey, body: ReviewsReplyRequest): Request[ReviewsReplyResponse] = js.native
}
