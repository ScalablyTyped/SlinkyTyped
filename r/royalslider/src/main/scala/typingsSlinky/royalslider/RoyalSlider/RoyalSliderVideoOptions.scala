package typingsSlinky.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderVideoOptions extends js.Object {
  /**
    * Auto hide arrows when video is playing  (default: true)
    */
  var autoHideArrows: js.UndefOr[Boolean] = js.native
  /**
    * Auto hide animated blocks when video is playing. (default: false)
    */
  var autoHideBlocks: js.UndefOr[Boolean] = js.native
  /**
    * Auto hide navigation when video is playing. (default: false)
    */
  var autoHideControlNav: js.UndefOr[Boolean] = js.native
  /**
    * Vimeo embed code. %id% is replaced by video id. (default: '<iframe src="http://player.vimeo.com/video/%id%?byline=0&amp;portrait=0&amp;autoplay=1" frameborder="no" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>')
    */
  var vimeoCode: js.UndefOr[String] = js.native
  /**
    * Youtube embed code. %id% is replaced by video id. (default: '<iframe src="http://www.youtube.com/embed/%id%?rel=1&autoplay=1&showinfo=0" frameborder="no"></iframe>')
    */
  var youTubeCode: js.UndefOr[String] = js.native
}

object RoyalSliderVideoOptions {
  @scala.inline
  def apply(): RoyalSliderVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderVideoOptions]
  }
  @scala.inline
  implicit class RoyalSliderVideoOptionsOps[Self <: RoyalSliderVideoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHideArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHideArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideArrows")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHideBlocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHideBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHideControlNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideControlNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHideControlNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideControlNav")(js.undefined)
        ret
    }
    @scala.inline
    def withVimeoCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vimeoCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVimeoCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vimeoCode")(js.undefined)
        ret
    }
    @scala.inline
    def withYouTubeCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youTubeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYouTubeCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youTubeCode")(js.undefined)
        ret
    }
  }
  
}

