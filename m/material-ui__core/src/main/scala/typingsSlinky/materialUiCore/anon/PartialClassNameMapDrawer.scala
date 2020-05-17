package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Drawer/Drawer.DrawerClassKey>> */
@js.native
trait PartialClassNameMapDrawer extends js.Object {
  var docked: js.UndefOr[String] = js.native
  var modal: js.UndefOr[String] = js.native
  var paper: js.UndefOr[String] = js.native
  var paperAnchorBottom: js.UndefOr[String] = js.native
  var paperAnchorDockedBottom: js.UndefOr[String] = js.native
  var paperAnchorDockedLeft: js.UndefOr[String] = js.native
  var paperAnchorDockedRight: js.UndefOr[String] = js.native
  var paperAnchorDockedTop: js.UndefOr[String] = js.native
  var paperAnchorLeft: js.UndefOr[String] = js.native
  var paperAnchorRight: js.UndefOr[String] = js.native
  var paperAnchorTop: js.UndefOr[String] = js.native
}

object PartialClassNameMapDrawer {
  @scala.inline
  def apply(): PartialClassNameMapDrawer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapDrawer]
  }
  @scala.inline
  implicit class PartialClassNameMapDrawerOps[Self <: PartialClassNameMapDrawer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocked(value: String): Self = {
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
    def withModal(value: String): Self = {
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
    def withPaper(value: String): Self = {
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
    def withPaperAnchorBottom(value: String): Self = {
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
    def withPaperAnchorDockedBottom(value: String): Self = {
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
    def withPaperAnchorDockedLeft(value: String): Self = {
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
    def withPaperAnchorDockedRight(value: String): Self = {
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
    def withPaperAnchorDockedTop(value: String): Self = {
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
    def withPaperAnchorLeft(value: String): Self = {
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
    def withPaperAnchorRight(value: String): Self = {
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
    def withPaperAnchorTop(value: String): Self = {
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

