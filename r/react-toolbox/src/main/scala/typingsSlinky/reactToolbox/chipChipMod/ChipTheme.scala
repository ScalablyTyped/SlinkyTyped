package typingsSlinky.reactToolbox.chipChipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChipTheme extends js.Object {
  /**
    * Added to the root element when the component includes an avatar.
    */
  var avatar: js.UndefOr[String] = js.native
  /**
    * Used for the root element.
    */
  var chip: js.UndefOr[String] = js.native
  /**
    * Added to the root element when the component is deletable.
    */
  var deletable: js.UndefOr[String] = js.native
  /**
    * Used for the delete element wrapper.
    */
  var delete: js.UndefOr[String] = js.native
  /**
    * Used for the delete icon.
    */
  var deleteIcon: js.UndefOr[String] = js.native
  /**
    * Used for the delete svg inner layer.
    */
  var deleteX: js.UndefOr[String] = js.native
}

object ChipTheme {
  @scala.inline
  def apply(): ChipTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChipTheme]
  }
  @scala.inline
  implicit class ChipThemeOps[Self <: ChipTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatar(value: String): Self = {
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
    def withChip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chip")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletable(value: String): Self = {
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
    def withDelete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteIcon(value: String): Self = {
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
    def withDeleteX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteX")(js.undefined)
        ret
    }
  }
  
}

