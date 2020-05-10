package typingsSlinky.officeUiFabricReact.peoplePickerMod

import typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGenericItem extends js.Object {
  var ValidationState: typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState = js.native
  var imageInitials: String = js.native
  var primaryText: String = js.native
}

object IGenericItem {
  @scala.inline
  def apply(ValidationState: ValidationState, imageInitials: String, primaryText: String): IGenericItem = {
    val __obj = js.Dynamic.literal(ValidationState = ValidationState.asInstanceOf[js.Any], imageInitials = imageInitials.asInstanceOf[js.Any], primaryText = primaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericItem]
  }
  @scala.inline
  implicit class IGenericItemOps[Self <: IGenericItem] (val x: Self) extends AnyVal {
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
    def withPrimaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

