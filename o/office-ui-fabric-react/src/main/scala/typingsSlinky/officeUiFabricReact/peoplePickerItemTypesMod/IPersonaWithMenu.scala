package typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod

import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMenuItemsVarargs(value: IContextualMenuItem*): Self = this.set("menuItems", js.Array(value :_*))
    
    @scala.inline
    def setMenuItems(value: js.Array[IContextualMenuItem]): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuItems: Self = this.set("menuItems", js.undefined)
  }
}
