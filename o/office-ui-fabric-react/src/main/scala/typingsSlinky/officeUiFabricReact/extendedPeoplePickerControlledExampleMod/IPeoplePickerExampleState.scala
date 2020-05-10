package typingsSlinky.officeUiFabricReact.extendedPeoplePickerControlledExampleMod

import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerExampleState extends js.Object {
  var currentlySelectedItems: js.Array[IExtendedPersonaProps] = js.native
  var mostRecentlyUsed: js.Array[IPersonaProps] = js.native
  var peopleList: js.Array[IPersonaProps] = js.native
  var searchMoreAvailable: Boolean = js.native
  var suggestionItems: js.Array[IPersonaProps] = js.native
}

object IPeoplePickerExampleState {
  @scala.inline
  def apply(
    currentlySelectedItems: js.Array[IExtendedPersonaProps],
    mostRecentlyUsed: js.Array[IPersonaProps],
    peopleList: js.Array[IPersonaProps],
    searchMoreAvailable: Boolean,
    suggestionItems: js.Array[IPersonaProps]
  ): IPeoplePickerExampleState = {
    val __obj = js.Dynamic.literal(currentlySelectedItems = currentlySelectedItems.asInstanceOf[js.Any], mostRecentlyUsed = mostRecentlyUsed.asInstanceOf[js.Any], peopleList = peopleList.asInstanceOf[js.Any], searchMoreAvailable = searchMoreAvailable.asInstanceOf[js.Any], suggestionItems = suggestionItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerExampleState]
  }
  @scala.inline
  implicit class IPeoplePickerExampleStateOps[Self <: IPeoplePickerExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentlySelectedItems(value: js.Array[IExtendedPersonaProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlySelectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMostRecentlyUsed(value: js.Array[IPersonaProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecentlyUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeopleList(value: js.Array[IPersonaProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peopleList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchMoreAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMoreAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestionItems(value: js.Array[IPersonaProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

