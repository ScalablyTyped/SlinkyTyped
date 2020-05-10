package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoAgeGating extends js.Object {
  var alcoholContent: js.UndefOr[Boolean] = js.native
  var restricted: js.UndefOr[Boolean] = js.native
  var videoGameRating: js.UndefOr[String] = js.native
}

object VideoAgeGating {
  @scala.inline
  def apply(): VideoAgeGating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAgeGating]
  }
  @scala.inline
  implicit class VideoAgeGatingOps[Self <: VideoAgeGating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlcoholContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alcoholContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlcoholContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alcoholContent")(js.undefined)
        ret
    }
    @scala.inline
    def withRestricted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestricted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoGameRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoGameRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoGameRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoGameRating")(js.undefined)
        ret
    }
  }
  
}

