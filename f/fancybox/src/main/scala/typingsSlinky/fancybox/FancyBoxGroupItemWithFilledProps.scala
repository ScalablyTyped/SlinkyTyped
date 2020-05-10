package typingsSlinky.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxGroupItemWithFilledProps extends FancyBoxGroupItem {
  @JSName("$thumb")
  var $thumb: js.UndefOr[JQuery] = js.native
  var contentType: js.UndefOr[String] = js.native
  var index: js.UndefOr[Double] = js.native
  var thumb: js.UndefOr[js.Any] = js.native
}

object FancyBoxGroupItemWithFilledProps {
  @scala.inline
  def apply(src: String): FancyBoxGroupItemWithFilledProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGroupItemWithFilledProps]
  }
  @scala.inline
  implicit class FancyBoxGroupItemWithFilledPropsOps[Self <: FancyBoxGroupItemWithFilledProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$thumb(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$thumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$thumb")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withThumb(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(js.undefined)
        ret
    }
  }
  
}

