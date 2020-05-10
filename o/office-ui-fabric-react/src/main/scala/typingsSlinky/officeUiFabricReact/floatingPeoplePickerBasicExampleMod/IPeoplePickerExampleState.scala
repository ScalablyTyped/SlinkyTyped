package typingsSlinky.officeUiFabricReact.floatingPeoplePickerBasicExampleMod

import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerExampleState extends js.Object {
  var peopleList: js.Array[IPersonaProps] = js.native
  var searchValue: String = js.native
}

object IPeoplePickerExampleState {
  @scala.inline
  def apply(peopleList: js.Array[IPersonaProps], searchValue: String): IPeoplePickerExampleState = {
    val __obj = js.Dynamic.literal(peopleList = peopleList.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerExampleState]
  }
  @scala.inline
  implicit class IPeoplePickerExampleStateOps[Self <: IPeoplePickerExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeopleList(value: js.Array[IPersonaProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peopleList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

