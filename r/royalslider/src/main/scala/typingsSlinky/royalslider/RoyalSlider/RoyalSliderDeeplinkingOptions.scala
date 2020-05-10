package typingsSlinky.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderDeeplinkingOptions extends js.Object {
  /**
    * Automatically change URL after transition and listen for hash change. (default: false)
    */
  var change: js.UndefOr[Boolean] = js.native
  /**
    * Linking to slides by appending #SLIDE_INDEX to url.Slides count starts from 1. If change is set to false hash is only read once, after page load. (default: false)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Prefix that will be added to hash. For example if you set it to 'gallery-', hash would look like this: #gallery-5 (default: '')
    */
  var prefix: js.UndefOr[String] = js.native
}

object RoyalSliderDeeplinkingOptions {
  @scala.inline
  def apply(): RoyalSliderDeeplinkingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderDeeplinkingOptions]
  }
  @scala.inline
  implicit class RoyalSliderDeeplinkingOptionsOps[Self <: RoyalSliderDeeplinkingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

