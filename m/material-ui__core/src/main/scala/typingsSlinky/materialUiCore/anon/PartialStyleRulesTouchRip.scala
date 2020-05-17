package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ButtonBase/TouchRipple.TouchRippleClassKey>> */
@js.native
trait PartialStyleRulesTouchRip extends js.Object {
  var child: js.UndefOr[CSSProperties] = js.native
  var childLeaving: js.UndefOr[CSSProperties] = js.native
  var childPulsate: js.UndefOr[CSSProperties] = js.native
  var ripple: js.UndefOr[CSSProperties] = js.native
  var ripplePulsate: js.UndefOr[CSSProperties] = js.native
  var rippleVisible: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTouchRip {
  @scala.inline
  def apply(): PartialStyleRulesTouchRip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTouchRip]
  }
  @scala.inline
  implicit class PartialStyleRulesTouchRipOps[Self <: PartialStyleRulesTouchRip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChild(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.undefined)
        ret
    }
    @scala.inline
    def withChildLeaving(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childLeaving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildLeaving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childLeaving")(js.undefined)
        ret
    }
    @scala.inline
    def withChildPulsate(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childPulsate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildPulsate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childPulsate")(js.undefined)
        ret
    }
    @scala.inline
    def withRipple(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRipple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripple")(js.undefined)
        ret
    }
    @scala.inline
    def withRipplePulsate(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripplePulsate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRipplePulsate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripplePulsate")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleVisible(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleVisible")(js.undefined)
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

