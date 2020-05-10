package typingsSlinky.officeUiFabricReact.selectedPeopleListMod

import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExtendedPersonaProps extends IPersonaProps {
  var blockRecipientRemoval: js.UndefOr[Boolean] = js.native
  var canExpand: js.UndefOr[Boolean] = js.native
  var isEditing: js.UndefOr[Boolean] = js.native
  var isValid: Boolean = js.native
  var key: js.UndefOr[Key] = js.native
  var shouldBlockSelection: js.UndefOr[Boolean] = js.native
}

object IExtendedPersonaProps {
  @scala.inline
  def apply(isValid: Boolean): IExtendedPersonaProps = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtendedPersonaProps]
  }
  @scala.inline
  implicit class IExtendedPersonaPropsOps[Self <: IExtendedPersonaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockRecipientRemoval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRecipientRemoval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockRecipientRemoval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRecipientRemoval")(js.undefined)
        ret
    }
    @scala.inline
    def withCanExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldBlockSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldBlockSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldBlockSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldBlockSelection")(js.undefined)
        ret
    }
  }
  
}

