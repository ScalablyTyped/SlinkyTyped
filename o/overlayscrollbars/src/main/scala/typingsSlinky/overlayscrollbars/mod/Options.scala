package typingsSlinky.overlayscrollbars.mod

import typingsSlinky.overlayscrollbars.anon.AutoHide
import typingsSlinky.overlayscrollbars.anon.DynHeight
import typingsSlinky.overlayscrollbars.anon.Initialize
import typingsSlinky.overlayscrollbars.anon.OnContentSizeChanged
import typingsSlinky.overlayscrollbars.anon.XOverflowBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var autoUpdate: js.UndefOr[Boolean | Null] = js.native
  var autoUpdateInterval: js.UndefOr[Double] = js.native
  var callbacks: js.UndefOr[OnContentSizeChanged] = js.native
  var className: js.UndefOr[String | Null] = js.native
  var clipAlways: js.UndefOr[Boolean] = js.native
  var nativeScrollbarsOverlaid: js.UndefOr[Initialize] = js.native
  var normalizeRTL: js.UndefOr[Boolean] = js.native
  var overflowBehavior: js.UndefOr[XOverflowBehavior] = js.native
  var paddingAbsolute: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[ResizeBehavior] = js.native
  var scrollbars: js.UndefOr[AutoHide] = js.native
  var sizeAutoCapable: js.UndefOr[Boolean] = js.native
  var textarea: js.UndefOr[DynHeight] = js.native
  var updateOnLoad: js.UndefOr[String | js.Array[String] | Null] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUpdateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdate")(null)
        ret
    }
    @scala.inline
    def withAutoUpdateInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdateInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbacks(value: OnContentSizeChanged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(null)
        ret
    }
    @scala.inline
    def withClipAlways(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipAlways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipAlways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipAlways")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeScrollbarsOverlaid(value: Initialize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeScrollbarsOverlaid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeScrollbarsOverlaid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeScrollbarsOverlaid")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowBehavior(value: XOverflowBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingAbsolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingAbsolute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingAbsolute")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: ResizeBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbars(value: AutoHide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbars")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeAutoCapable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeAutoCapable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeAutoCapable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeAutoCapable")(js.undefined)
        ret
    }
    @scala.inline
    def withTextarea(value: DynHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textarea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextarea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textarea")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOnLoad(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOnLoadNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnLoad")(null)
        ret
    }
  }
  
}

