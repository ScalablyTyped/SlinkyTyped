package typingsSlinky.rmcTooltip.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Align extends js.Object {
  var arrowContent: Null = js.native
  var destroyTooltipOnHide: Boolean = js.native
  var placement: String = js.native
  var prefixCls: String = js.native
}

object Align {
  @scala.inline
  def apply(arrowContent: Null, destroyTooltipOnHide: Boolean, placement: String, prefixCls: String): Align = {
    val __obj = js.Dynamic.literal(arrowContent = arrowContent.asInstanceOf[js.Any], destroyTooltipOnHide = destroyTooltipOnHide.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  @scala.inline
  implicit class AlignOps[Self <: Align] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowContent(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroyTooltipOnHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyTooltipOnHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

