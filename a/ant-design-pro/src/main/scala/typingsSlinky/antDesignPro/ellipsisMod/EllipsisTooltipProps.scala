package typingsSlinky.antDesignPro.ellipsisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped antd.antd/lib/tooltip.TooltipPropsWithTitle | antd.antd/lib/tooltip.TooltipPropsWithOverlay */ @js.native
trait EllipsisTooltipProps extends js.Object {
  var overlayStyle: js.UndefOr[scala.Nothing] = js.native
  var title: js.UndefOr[scala.Nothing] = js.native
}

object EllipsisTooltipProps {
  @scala.inline
  def apply(): EllipsisTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipsisTooltipProps]
  }
  @scala.inline
  implicit class EllipsisTooltipPropsOps[Self <: EllipsisTooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverlayStyle(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

