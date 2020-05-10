package typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerItemSelectedStyles extends js.Object {
  /** Refers to the element holding the content (Persona) of the PeoplePicker item already picked. */
  var itemContent: IStyle = js.native
  /** Refers to the remove action button on a picked PeoplePicker item. */
  var removeButton: IStyle = js.native
  /** Root element of picked PeoplePicker item */
  var root: IStyle = js.native
  /** SubComponent (Persona, PersonaCoin) styles. */
  var subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles = js.native
}

object IPeoplePickerItemSelectedStyles {
  @scala.inline
  def apply(subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles): IPeoplePickerItemSelectedStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSelectedStyles]
  }
  @scala.inline
  implicit class IPeoplePickerItemSelectedStylesOps[Self <: IPeoplePickerItemSelectedStyles] (val x: Self) extends AnyVal {
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
    def withItemContent(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemContent")(js.undefined)
        ret
    }
    @scala.inline
    def withItemContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemContent")(null)
        ret
    }
    @scala.inline
    def withRemoveButton(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButton")(null)
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

