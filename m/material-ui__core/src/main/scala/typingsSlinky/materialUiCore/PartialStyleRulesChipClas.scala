package typingsSlinky.materialUiCore

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Chip.ChipClassKey>> */
@js.native
trait PartialStyleRulesChipClas extends js.Object {
  var avatar: js.UndefOr[CSSProperties] = js.native
  var avatarChildren: js.UndefOr[CSSProperties] = js.native
  var avatarPrimary: js.UndefOr[CSSProperties] = js.native
  var avatarSecondary: js.UndefOr[CSSProperties] = js.native
  var clickable: js.UndefOr[CSSProperties] = js.native
  var clickablePrimary: js.UndefOr[CSSProperties] = js.native
  var clickableSecondary: js.UndefOr[CSSProperties] = js.native
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  var deletable: js.UndefOr[CSSProperties] = js.native
  var deletablePrimary: js.UndefOr[CSSProperties] = js.native
  var deletableSecondary: js.UndefOr[CSSProperties] = js.native
  var deleteIcon: js.UndefOr[CSSProperties] = js.native
  var deleteIconOutlinedColorPrimary: js.UndefOr[CSSProperties] = js.native
  var deleteIconOutlinedColorSecondary: js.UndefOr[CSSProperties] = js.native
  var deleteIconPrimary: js.UndefOr[CSSProperties] = js.native
  var deleteIconSecondary: js.UndefOr[CSSProperties] = js.native
  var label: js.UndefOr[CSSProperties] = js.native
  var outlined: js.UndefOr[CSSProperties] = js.native
  var outlinedPrimary: js.UndefOr[CSSProperties] = js.native
  var outlinedSecondary: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesChipClas {
  @scala.inline
  def apply(): PartialStyleRulesChipClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesChipClas]
  }
  @scala.inline
  implicit class PartialStyleRulesChipClasOps[Self <: PartialStyleRulesChipClas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatar(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(js.undefined)
        ret
    }
    @scala.inline
    def withAvatarChildren(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatarChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withAvatarPrimary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatarPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withAvatarSecondary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatarSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarSecondary")(js.undefined)
        ret
    }
    @scala.inline
    def withClickable(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
        ret
    }
    @scala.inline
    def withClickablePrimary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickablePrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickablePrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickablePrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withClickableSecondary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickableSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickableSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickableSecondary")(js.undefined)
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
    def withDeletable(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletable")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletablePrimary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletablePrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletablePrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletablePrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletableSecondary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletableSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletableSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletableSecondary")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteIcon(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteIconOutlinedColorPrimary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteIconOutlinedColorPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteIconOutlinedColorPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteIconOutlinedColorPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteIconOutlinedColorSecondary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteIconOutlinedColorSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteIconOutlinedColorSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteIconOutlinedColorSecondary")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteIconPrimary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteIconPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteIconPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteIconPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteIconSecondary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteIconSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteIconSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteIconSecondary")(js.undefined)
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
    def withOutlined(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlined")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlinedPrimary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlinedPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlinedPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlinedPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlinedSecondary(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlinedSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlinedSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlinedSecondary")(js.undefined)
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

