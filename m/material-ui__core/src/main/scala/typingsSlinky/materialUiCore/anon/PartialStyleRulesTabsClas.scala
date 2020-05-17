package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Tabs.TabsClassKey>> */
@js.native
trait PartialStyleRulesTabsClas extends js.Object {
  var centered: js.UndefOr[CSSProperties] = js.native
  var fixed: js.UndefOr[CSSProperties] = js.native
  var flexContainer: js.UndefOr[CSSProperties] = js.native
  var indicator: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var scrollButtons: js.UndefOr[CSSProperties] = js.native
  var scrollButtonsAuto: js.UndefOr[CSSProperties] = js.native
  var scrollable: js.UndefOr[CSSProperties] = js.native
  var scroller: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTabsClas {
  @scala.inline
  def apply(): PartialStyleRulesTabsClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTabsClas]
  }
  @scala.inline
  implicit class PartialStyleRulesTabsClasOps[Self <: PartialStyleRulesTabsClas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCentered(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexContainer(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicator(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(js.undefined)
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
    def withScrollButtons(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollButtonsAuto(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollButtonsAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollButtonsAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollButtonsAuto")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollable(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(js.undefined)
        ret
    }
    @scala.inline
    def withScroller(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroller")(js.undefined)
        ret
    }
  }
  
}

