package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Icon.IconClassKey>> */
@js.native
trait PartialStyleRulesIconClas extends js.Object {
  var colorAction: js.UndefOr[CSSProperties] = js.native
  var colorDisabled: js.UndefOr[CSSProperties] = js.native
  var colorError: js.UndefOr[CSSProperties] = js.native
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  var fontSizeInherit: js.UndefOr[CSSProperties] = js.native
  var fontSizeLarge: js.UndefOr[CSSProperties] = js.native
  var fontSizeSmall: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesIconClas {
  @scala.inline
  def apply(): PartialStyleRulesIconClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesIconClas]
  }
  @scala.inline
  implicit class PartialStyleRulesIconClasOps[Self <: PartialStyleRulesIconClas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorAction(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAction")(js.undefined)
        ret
    }
    @scala.inline
    def withColorDisabled(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withColorError(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorError")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPrimary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSecondary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSecondary")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSizeInherit(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeInherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizeInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeInherit")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSizeLarge(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizeLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSizeSmall(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizeSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeSmall")(js.undefined)
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

