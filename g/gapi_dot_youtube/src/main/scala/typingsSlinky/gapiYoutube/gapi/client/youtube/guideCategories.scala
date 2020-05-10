package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.AnonHl
import typingsSlinky.gapiYoutube.GoogleApiYouTubeGuideCategoryResource
import typingsSlinky.gapiYoutube.GoogleApiYouTubePageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait guideCategories extends js.Object {
  /**
    * Returns a list of categories that can be associated with YouTube channels.
    */
  def list(`object`: AnonHl): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeGuideCategoryResource]] = js.native
}

object guideCategories {
  @scala.inline
  def apply(list: AnonHl => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeGuideCategoryResource]]): guideCategories = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[guideCategories]
  }
  @scala.inline
  implicit class guideCategoriesOps[Self <: guideCategories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonHl => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeGuideCategoryResource]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

