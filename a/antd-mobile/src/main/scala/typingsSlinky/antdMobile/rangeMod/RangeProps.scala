package typingsSlinky.antdMobile.rangeMod

import typingsSlinky.antdMobile.rangePropsTypeMod.RangePropsType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeProps extends RangePropsType {
  var handleStyle: js.UndefOr[js.Array[CSSProperties]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var railStyle: js.UndefOr[CSSProperties] = js.native
  var trackStyle: js.UndefOr[js.Array[CSSProperties]] = js.native
}

object RangeProps {
  @scala.inline
  def apply(): RangeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeProps]
  }
  @scala.inline
  implicit class RangePropsOps[Self <: RangeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleStyle(value: js.Array[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRailStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackStyle(value: js.Array[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStyle")(js.undefined)
        ret
    }
  }
  
}

