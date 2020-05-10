package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.AnonHl
import typingsSlinky.gapiYoutube.GoogleApiYouTubePageInfo
import typingsSlinky.gapiYoutube.GoogleApiYouTubeVideoCategoryResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait videoCategories extends js.Object {
  /**
    * Returns a list of categories that can be associated with YouTube videos.
    */
  def list(`object`: AnonHl): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeVideoCategoryResource]] = js.native
}

object videoCategories {
  @scala.inline
  def apply(list: AnonHl => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeVideoCategoryResource]]): videoCategories = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[videoCategories]
  }
  @scala.inline
  implicit class videoCategoriesOps[Self <: videoCategories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonHl => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeVideoCategoryResource]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

