package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListItemText.ListItemTextClassKey>> */
@js.native
trait PartialStyleRulesListItemDense extends js.Object {
  var dense: js.UndefOr[CSSProperties] = js.native
  var inset: js.UndefOr[CSSProperties] = js.native
  var primary: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var secondary: js.UndefOr[CSSProperties] = js.native
  var textDense: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesListItemDense {
  @scala.inline
  def apply(): PartialStyleRulesListItemDense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesListItemDense]
  }
  @scala.inline
  implicit class PartialStyleRulesListItemDenseOps[Self <: PartialStyleRulesListItemDense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDense(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dense")(js.undefined)
        ret
    }
    @scala.inline
    def withInset(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(js.undefined)
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
    def withTextDense(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDense")(js.undefined)
        ret
    }
  }
  
}

