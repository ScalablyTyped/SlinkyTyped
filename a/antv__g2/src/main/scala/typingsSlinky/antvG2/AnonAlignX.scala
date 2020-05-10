package typingsSlinky.antvG2

import typingsSlinky.antvG2.antvG2Strings.bottom
import typingsSlinky.antvG2.antvG2Strings.left
import typingsSlinky.antvG2.antvG2Strings.middle
import typingsSlinky.antvG2.antvG2Strings.right
import typingsSlinky.antvG2.antvG2Strings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlignX extends js.Object {
  var alignX: js.UndefOr[left | middle | right] = js.native
  var alignY: js.UndefOr[top | middle | bottom] = js.native
  /**
    * html 代码
    */
  var html: js.UndefOr[String] = js.native
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
  /**
    * html的起始位置，值为原始数据值，支持 callback
    */
  var position: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object AnonAlignX {
  @scala.inline
  def apply(): AnonAlignX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAlignX]
  }
  @scala.inline
  implicit class AnonAlignXOps[Self <: AnonAlignX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignX(value: left | middle | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignX")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignY(value: top | middle | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignY")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: js.Any | js.Function | (js.Array[String | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

