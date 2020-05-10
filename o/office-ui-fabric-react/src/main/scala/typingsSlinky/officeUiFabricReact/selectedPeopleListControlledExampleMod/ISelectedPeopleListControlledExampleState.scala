package typingsSlinky.officeUiFabricReact.selectedPeopleListControlledExampleMod

import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectedPeopleListControlledExampleState extends js.Object {
  var currentSelectedItems: js.Array[IExtendedPersonaProps] = js.native
  var nextPersonIndex: Double = js.native
}

object ISelectedPeopleListControlledExampleState {
  @scala.inline
  def apply(currentSelectedItems: js.Array[IExtendedPersonaProps], nextPersonIndex: Double): ISelectedPeopleListControlledExampleState = {
    val __obj = js.Dynamic.literal(currentSelectedItems = currentSelectedItems.asInstanceOf[js.Any], nextPersonIndex = nextPersonIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectedPeopleListControlledExampleState]
  }
  @scala.inline
  implicit class ISelectedPeopleListControlledExampleStateOps[Self <: ISelectedPeopleListControlledExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSelectedItems(value: js.Array[IExtendedPersonaProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSelectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPersonIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPersonIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

