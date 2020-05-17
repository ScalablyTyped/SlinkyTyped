package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListSubheader.ListSubheaderClassKey>> */
@js.native
trait PartialStyleRulesListSubh extends js.Object {
  var colorInherit: js.UndefOr[CSSProperties] = js.native
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  var gutters: js.UndefOr[CSSProperties] = js.native
  var inset: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var sticky: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesListSubh {
  @scala.inline
  def apply(): PartialStyleRulesListSubh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesListSubh]
  }
  @scala.inline
  implicit class PartialStyleRulesListSubhOps[Self <: PartialStyleRulesListSubh] (val x: Self) extends AnyVal {
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
    def withGutters(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutters")(js.undefined)
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
    def withSticky(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(js.undefined)
        ret
    }
  }
  
}

