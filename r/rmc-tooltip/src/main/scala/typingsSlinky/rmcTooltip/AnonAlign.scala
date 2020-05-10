package typingsSlinky.rmcTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlign extends js.Object {
  var arrowContent: Null = js.native
  var destroyTooltipOnHide: Boolean = js.native
  var placement: String = js.native
  var prefixCls: String = js.native
}

object AnonAlign {
  @scala.inline
  def apply(arrowContent: Null, destroyTooltipOnHide: Boolean, placement: String, prefixCls: String): AnonAlign = {
    val __obj = js.Dynamic.literal(arrowContent = arrowContent.asInstanceOf[js.Any], destroyTooltipOnHide = destroyTooltipOnHide.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlign]
  }
  @scala.inline
  implicit class AnonAlignOps[Self <: AnonAlign] (val x: Self) extends AnyVal {
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

