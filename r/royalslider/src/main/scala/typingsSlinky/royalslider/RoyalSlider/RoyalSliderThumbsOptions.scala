package typingsSlinky.royalslider.RoyalSlider

import typingsSlinky.royalslider.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderThumbsOptions extends js.Object {
  /**
    * Adds span element with class thumbIco to every thumbnail. Useful for styling (default: false)
    */
  var appendSpan: js.UndefOr[Boolean] = js.native
  /**
    * Replaces default thumbnail arrow. You have to add it to DOM manually. (default: null)
    */
  var arrowLeft: js.UndefOr[JQuery] = js.native
  /**
    * Replaces default thumbnail arrow. You have to add it to DOM manually. (default: null)
    */
  var arrowRight: js.UndefOr[JQuery] = js.native
  /**
    * Thumbnails arrows. (default: true)
    */
  var arrows: js.UndefOr[Boolean] = js.native
  /**
    * Auto hide thumbnails arrows on hover. (default: false)
    */
  var arrowsAutoHide: js.UndefOr[Boolean] = js.native
  /**
    * Automatically centers container with thumbs if there are small number of items (default: true)
    */
  var autoCenter: js.UndefOr[Boolean] = js.native
  /**
    * Thumbnails mouse drag. (default: true)
    */
  var drag: js.UndefOr[Boolean] = js.native
  /**
    * Margin that equals thumbs spacing for first and last item. (default: true)
    */
  var firstMargin: js.UndefOr[Boolean] = js.native
  /**
    * Reduces size of main viewport area by thumbnails width or height, use it when you set 100 % width to slider.This option is always true, when slider is in fullscreen mode. (default: true)
    */
  var fitInViewport: js.UndefOr[Boolean] = js.native
  /**
    * 'horizontal' or 'vertical'. (default: 'horizontal')
    */
  var orientation: js.UndefOr[String] = js.native
  /**
    * Spacing between thumbs. (default: 4)
    */
  var spacing: js.UndefOr[Double] = js.native
  /**
    * Thumbnails touch. (default: true)
    */
  var touch: js.UndefOr[Boolean] = js.native
  /**
    * Thumbnails transition speed. (default: 600)
    */
  var transitionSpeed: js.UndefOr[Double] = js.native
}

object RoyalSliderThumbsOptions {
  @scala.inline
  def apply(): RoyalSliderThumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderThumbsOptions]
  }
  @scala.inline
  implicit class RoyalSliderThumbsOptionsOps[Self <: RoyalSliderThumbsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendSpan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowLeft(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowRight(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRight")(js.undefined)
        ret
    }
    @scala.inline
    def withArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowsAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowsAutoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowsAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowsAutoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withFitInViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitInViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitInViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitInViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpeed")(js.undefined)
        ret
    }
  }
  
}

