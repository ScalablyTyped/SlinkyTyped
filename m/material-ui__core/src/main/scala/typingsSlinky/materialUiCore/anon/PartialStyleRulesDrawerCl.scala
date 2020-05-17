package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Drawer.DrawerClassKey>> */
@js.native
trait PartialStyleRulesDrawerCl extends js.Object {
  var docked: js.UndefOr[CSSProperties] = js.native
  var modal: js.UndefOr[CSSProperties] = js.native
  var paper: js.UndefOr[CSSProperties] = js.native
  var paperAnchorBottom: js.UndefOr[CSSProperties] = js.native
  var paperAnchorDockedBottom: js.UndefOr[CSSProperties] = js.native
  var paperAnchorDockedLeft: js.UndefOr[CSSProperties] = js.native
  var paperAnchorDockedRight: js.UndefOr[CSSProperties] = js.native
  var paperAnchorDockedTop: js.UndefOr[CSSProperties] = js.native
  var paperAnchorLeft: js.UndefOr[CSSProperties] = js.native
  var paperAnchorRight: js.UndefOr[CSSProperties] = js.native
  var paperAnchorTop: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesDrawerCl {
  @scala.inline
  def apply(): PartialStyleRulesDrawerCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesDrawerCl]
  }
  @scala.inline
  implicit class PartialStyleRulesDrawerClOps[Self <: PartialStyleRulesDrawerCl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocked(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docked")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withPaper(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paper")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperAnchorBottom(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperAnchorBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperAnchorDockedBottom(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorDockedBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperAnchorDockedBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorDockedBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperAnchorDockedLeft(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorDockedLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperAnchorDockedLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorDockedLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperAnchorDockedRight(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorDockedRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperAnchorDockedRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorDockedRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperAnchorDockedTop(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorDockedTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperAnchorDockedTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorDockedTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperAnchorLeft(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperAnchorLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperAnchorRight(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperAnchorRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperAnchorTop(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperAnchorTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperAnchorTop")(js.undefined)
        ret
    }
  }
  
}

