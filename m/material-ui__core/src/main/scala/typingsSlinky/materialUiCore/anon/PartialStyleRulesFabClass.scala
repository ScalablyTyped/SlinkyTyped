package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Fab.FabClassKey>> */
@js.native
trait PartialStyleRulesFabClass extends js.Object {
  var colorInherit: js.UndefOr[CSSProperties] = js.native
  var disabled: js.UndefOr[CSSProperties] = js.native
  var extended: js.UndefOr[CSSProperties] = js.native
  var focusVisible: js.UndefOr[CSSProperties] = js.native
  var label: js.UndefOr[CSSProperties] = js.native
  var primary: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var secondary: js.UndefOr[CSSProperties] = js.native
  var sizeMedium: js.UndefOr[CSSProperties] = js.native
  var sizeSmall: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesFabClass {
  @scala.inline
  def apply(): PartialStyleRulesFabClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesFabClass]
  }
  @scala.inline
  implicit class PartialStyleRulesFabClassOps[Self <: PartialStyleRulesFabClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorInherit(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorInherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorInherit")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExtended(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extended")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusVisible(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
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
    @scala.inline
    def withSecondary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeMedium(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeMedium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeMedium")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeSmall(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSmall")(js.undefined)
        ret
    }
  }
  
}

