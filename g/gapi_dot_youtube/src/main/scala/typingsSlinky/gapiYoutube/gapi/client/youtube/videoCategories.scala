package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.AnonHl
import typingsSlinky.gapiYoutube.GoogleApiYouTubePageInfo
import typingsSlinky.gapiYoutube.GoogleApiYouTubeVideoCategoryResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait videoCategories extends js.Object {
  /**
    * Returns a list of categories that can be associated with YouTube videos.
    */
  def list(`object`: AnonHl): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeVideoCategoryResource]]
}

object videoCategories {
  @scala.inline
  def apply(list: AnonHl => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeVideoCategoryResource]]): videoCategories = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[videoCategories]
  }
}

