package typingsSlinky.antd.anon

import typingsSlinky.antd.sliderMod.HandleGeneratorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixCls extends js.Object {
  var info: HandleGeneratorInfo = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var tooltipPrefixCls: js.UndefOr[String] = js.native
}

object PrefixCls {
  @scala.inline
  def apply(info: HandleGeneratorInfo): PrefixCls = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixCls]
  }
  @scala.inline
  implicit class PrefixClsOps[Self <: PrefixCls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: HandleGeneratorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
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
    def withTooltipPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPrefixCls")(js.undefined)
        ret
    }
  }
  
}

