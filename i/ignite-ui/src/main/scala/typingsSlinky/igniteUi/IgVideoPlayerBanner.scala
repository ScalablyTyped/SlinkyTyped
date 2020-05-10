package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgVideoPlayerBanner
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets whether to apply animation effects when showing or hiding the banner. If set to true, the animation is played for banner.duration in milliseconds.
  	 *
  	 */
  var animate: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether to automatically hide the banner. If set to true, the banner is hidden after [hidedelay](ui.igvideoplayer#options:banners.hidedelay) in milliseconds.
  	 *
  	 */
  var autohide: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether the user will be able to close the banner or not.
  	 *
  	 */
  var closeBanner: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the banner specific css class, that will be applied on the banner grid.
  	 *
  	 */
  var css: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the banner animation duration.
  	 *
  	 */
  var duration: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the banner height
  	 *
  	 */
  var height: js.UndefOr[Double | String] = js.native
  /**
  	 * Gets/Sets the banner autohide delay in milliseconds. It is taken into account only if the banner.autohide option is set to true.
  	 *
  	 */
  var hidedelay: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the banner image url.
  	 *
  	 */
  var imageUrl: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the banner link that will open in new window.
  	 *
  	 */
  var link: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets an array of numbers. Each number specifies on which second in the movie the banner will pop.
  	 *
  	 */
  var times: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets/Sets whether the banner is visible or not.
  	 *
  	 */
  var visible: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the banner width
  	 *
  	 */
  var width: js.UndefOr[Double | String] = js.native
}

object IgVideoPlayerBanner {
  @scala.inline
  def apply(): IgVideoPlayerBanner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerBanner]
  }
  @scala.inline
  implicit class IgVideoPlayerBannerOps[Self <: IgVideoPlayerBanner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutohide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutohide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohide")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseBanner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBanner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseBanner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBanner")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHidedelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidedelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidedelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidedelay")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withTimes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

