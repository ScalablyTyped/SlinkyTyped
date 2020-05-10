package typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod

import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonaWithMenu extends IPersonaProps {
  /** Additional menuItems to be rendered in a contextualMenu for each Persona. */
  var menuItems: js.UndefOr[js.Array[IContextualMenuItem]] = js.native
}

object IPersonaWithMenu {
  @scala.inline
  def apply(): IPersonaWithMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaWithMenu]
  }
  @scala.inline
  implicit class IPersonaWithMenuOps[Self <: IPersonaWithMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenuItems(value: js.Array[IContextualMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(js.undefined)
        ret
    }
  }
  
}

