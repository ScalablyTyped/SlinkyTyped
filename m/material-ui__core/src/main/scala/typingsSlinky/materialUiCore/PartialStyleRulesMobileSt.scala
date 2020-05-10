package typingsSlinky.materialUiCore

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/MobileStepper.MobileStepperClassKey>> */
@js.native
trait PartialStyleRulesMobileSt extends js.Object {
  var dot: js.UndefOr[CSSProperties] = js.native
  var dotActive: js.UndefOr[CSSProperties] = js.native
  var dots: js.UndefOr[CSSProperties] = js.native
  var positionBottom: js.UndefOr[CSSProperties] = js.native
  var positionStatic: js.UndefOr[CSSProperties] = js.native
  var positionTop: js.UndefOr[CSSProperties] = js.native
  var progress: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesMobileSt {
  @scala.inline
  def apply(): PartialStyleRulesMobileSt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesMobileSt]
  }
  @scala.inline
  implicit class PartialStyleRulesMobileStOps[Self <: PartialStyleRulesMobileSt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDot(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.undefined)
        ret
    }
    @scala.inline
    def withDotActive(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotActive")(js.undefined)
        ret
    }
    @scala.inline
    def withDots(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionBottom(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionStatic(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionStatic")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionTop(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionTop")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

