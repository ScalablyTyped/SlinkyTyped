package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamFunSettings extends js.Object {
  // If set to true, enables users to include custom memes.
  var allowCustomMemes: js.UndefOr[Boolean] = js.native
  // If set to true, enables Giphy use.
  var allowGiphy: js.UndefOr[Boolean] = js.native
  // If set to true, enables users to include stickers and memes.
  var allowStickersAndMemes: js.UndefOr[Boolean] = js.native
  // Giphy content rating. Possible values are: moderate, strict.
  var giphyContentRating: js.UndefOr[GiphyRatingType] = js.native
}

object TeamFunSettings {
  @scala.inline
  def apply(): TeamFunSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamFunSettings]
  }
  @scala.inline
  implicit class TeamFunSettingsOps[Self <: TeamFunSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCustomMemes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCustomMemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCustomMemes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCustomMemes")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowGiphy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGiphy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowGiphy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGiphy")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowStickersAndMemes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowStickersAndMemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowStickersAndMemes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowStickersAndMemes")(js.undefined)
        ret
    }
    @scala.inline
    def withGiphyContentRating(value: GiphyRatingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("giphyContentRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGiphyContentRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("giphyContentRating")(js.undefined)
        ret
    }
  }
  
}

