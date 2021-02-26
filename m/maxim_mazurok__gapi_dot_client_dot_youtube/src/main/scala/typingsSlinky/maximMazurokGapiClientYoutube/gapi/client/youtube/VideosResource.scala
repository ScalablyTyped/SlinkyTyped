package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.AutoLevels
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Chart
import typingsSlinky.maximMazurokGapiClientYoutube.anon.IdKey
import typingsSlinky.maximMazurokGapiClientYoutube.anon.NotifySubscribers
import typingsSlinky.maximMazurokGapiClientYoutube.anon.OnBehalfOfContentOwnerPrettyPrint
import typingsSlinky.maximMazurokGapiClientYoutube.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientYoutube.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientYoutube.anon.QuotaUserUploadType
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Rating
import typingsSlinky.maximMazurokGapiClientYoutube.anon.UploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideosResource extends StObject {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUser): Request[Unit] = js.native
  
  /** Retrieves the ratings that the authorized user gave to a list of specified videos. */
  def getRating(): Request[VideoRatingListResponse] = js.native
  def getRating(request: IdKey): Request[VideoRatingListResponse] = js.native
  
  /** Inserts a new resource into this collection. */
  def insert(request: AutoLevels): Request[Video] = js.native
  def insert(request: NotifySubscribers, body: Video): Request[Video] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[VideoListResponse] = js.native
  def list(request: Chart): Request[VideoListResponse] = js.native
  
  /** Adds a like or dislike rating to a video or removes a rating from a video. */
  def rate(): Request[Unit] = js.native
  def rate(request: Rating): Request[Unit] = js.native
  
  /** Report abuse for a video. */
  def reportAbuse(request: OnBehalfOfContentOwnerPrettyPrint): Request[Unit] = js.native
  def reportAbuse(request: QuotaUserUploadType, body: VideoAbuseReport): Request[Unit] = js.native
  
  def update(request: PrettyPrint, body: Video): Request[Video] = js.native
  /** Updates an existing resource. */
  def update(request: UploadprotocolXgafv): Request[Video] = js.native
}
