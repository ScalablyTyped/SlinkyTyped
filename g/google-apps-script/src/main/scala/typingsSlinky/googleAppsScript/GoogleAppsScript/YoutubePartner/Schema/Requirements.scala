package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Requirements extends js.Object {
  var caption: js.UndefOr[Boolean] = js.native
  var hdTranscode: js.UndefOr[Boolean] = js.native
  var posterArt: js.UndefOr[Boolean] = js.native
  var spotlightArt: js.UndefOr[Boolean] = js.native
  var spotlightReview: js.UndefOr[Boolean] = js.native
  var trailer: js.UndefOr[Boolean] = js.native
}

object Requirements {
  @scala.inline
  def apply(): Requirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Requirements]
  }
  @scala.inline
  implicit class RequirementsOps[Self <: Requirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withHdTranscode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hdTranscode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHdTranscode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hdTranscode")(js.undefined)
        ret
    }
    @scala.inline
    def withPosterArt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posterArt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosterArt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posterArt")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotlightArt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightArt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotlightArt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightArt")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotlightReview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotlightReview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightReview")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailer")(js.undefined)
        ret
    }
  }
  
}

