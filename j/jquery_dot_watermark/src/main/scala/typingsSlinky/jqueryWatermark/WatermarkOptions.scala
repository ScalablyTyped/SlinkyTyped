package typingsSlinky.jqueryWatermark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatermarkOptions extends js.Object {
  var className: js.UndefOr[String] = js.native
   // If true, plugin will detect and use native browser support for watermarks, if available. (e.g., WebKit's placeholder attribute.)
  var hideBeforeUnload: js.UndefOr[Boolean] = js.native
   // Default class name for all watermarks
  var useNative: js.UndefOr[Boolean] = js.native
}

object WatermarkOptions {
  @scala.inline
  def apply(): WatermarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatermarkOptions]
  }
  @scala.inline
  implicit class WatermarkOptionsOps[Self <: WatermarkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withHideBeforeUnload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideBeforeUnload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideBeforeUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideBeforeUnload")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(js.undefined)
        ret
    }
  }
  
}

