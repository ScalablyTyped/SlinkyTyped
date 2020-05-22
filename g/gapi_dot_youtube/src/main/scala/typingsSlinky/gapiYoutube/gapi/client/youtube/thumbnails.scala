package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.GoogleApiYouTubePageInfo
import typingsSlinky.gapiYoutube.GoogleApiYouTubeThumbnailResource
import typingsSlinky.gapiYoutube.anon.VideoId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait thumbnails extends js.Object {
  /**
    * Uploads a custom video thumbnail to YouTube and sets it for a video.
    */
  def set(`object`: VideoId): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]]
}

object thumbnails {
  @scala.inline
  def apply(set: VideoId => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]]): thumbnails = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[thumbnails]
  }
}

