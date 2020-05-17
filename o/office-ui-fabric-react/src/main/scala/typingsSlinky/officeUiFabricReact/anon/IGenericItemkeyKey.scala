package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker.IGenericItem & {  key  :react.react.Key} */
@js.native
trait IGenericItemkeyKey extends js.Object {
  var ValidationState: typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState = js.native
  var imageInitials: String = js.native
  var key: typingsSlinky.react.mod.Key = js.native
  var primaryText: String = js.native
}

object IGenericItemkeyKey {
  @scala.inline
  def apply(
    ValidationState: ValidationState,
    imageInitials: String,
    key: typingsSlinky.react.mod.Key,
    primaryText: String
  ): IGenericItemkeyKey = {
    val __obj = js.Dynamic.literal(ValidationState = ValidationState.asInstanceOf[js.Any], imageInitials = imageInitials.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], primaryText = primaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericItemkeyKey]
  }
  @scala.inline
  implicit class IGenericItemkeyKeyOps[Self <: IGenericItemkeyKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidationState(value: ValidationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageInitials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageInitials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: typingsSlinky.react.mod.Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

