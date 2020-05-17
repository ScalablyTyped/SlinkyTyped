package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableSortLabel.TableSortLabelClassKey>> */
@js.native
trait PartialStyleRulesTableSor extends js.Object {
  var active: js.UndefOr[CSSProperties] = js.native
  var icon: js.UndefOr[CSSProperties] = js.native
  var iconDirectionAsc: js.UndefOr[CSSProperties] = js.native
  var iconDirectionDesc: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTableSor {
  @scala.inline
  def apply(): PartialStyleRulesTableSor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTableSor]
  }
  @scala.inline
  implicit class PartialStyleRulesTableSorOps[Self <: PartialStyleRulesTableSor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconDirectionAsc(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconDirectionAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconDirectionAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconDirectionAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withIconDirectionDesc(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconDirectionDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconDirectionDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconDirectionDesc")(js.undefined)
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

