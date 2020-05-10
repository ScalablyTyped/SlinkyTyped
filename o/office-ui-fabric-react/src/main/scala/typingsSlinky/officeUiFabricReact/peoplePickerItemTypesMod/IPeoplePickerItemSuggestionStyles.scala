package typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerItemSuggestionStyles extends js.Object {
  /** Refers to the element wrapping the Persona of the suggested PeoplePicker item. */
  var personaWrapper: IStyle = js.native
  /** Root container element of a suggested PeoplePicker item. */
  var root: IStyle = js.native
  /** SubComponent (Persona, PersonaCoin) styles. */
  var subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles = js.native
}

object IPeoplePickerItemSuggestionStyles {
  @scala.inline
  def apply(subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles): IPeoplePickerItemSuggestionStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSuggestionStyles]
  }
  @scala.inline
  implicit class IPeoplePickerItemSuggestionStylesOps[Self <: IPeoplePickerItemSuggestionStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubComponentStyles(value: IPeoplePickerItemSelectedSubComponentStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subComponentStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonaWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonaWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonaWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaWrapper")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
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
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
  }
  
}

