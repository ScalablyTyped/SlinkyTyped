package typingsSlinky.reactToolbox.listItemActionsMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactToolbox.listItemActionMod.ListItemActionTheme
import typingsSlinky.reactToolbox.reactToolboxStrings.left
import typingsSlinky.reactToolbox.reactToolboxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemActionsProps extends js.Object {
  
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactElement] = js.native
  
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[ListItemActionsTheme with ListItemActionTheme] = js.native
  
  /**
    * List item action type.
    */
  var `type`: js.UndefOr[left | right] = js.native
}
object ListItemActionsProps {
  
  @scala.inline
  def apply(): ListItemActionsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemActionsProps]
  }
  
  @scala.inline
  implicit class ListItemActionsPropsOps[Self <: ListItemActionsProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setTheme(value: ListItemActionsTheme with ListItemActionTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setType(value: left | right): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
