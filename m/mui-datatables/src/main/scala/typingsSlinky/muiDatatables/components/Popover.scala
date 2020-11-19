package typingsSlinky.muiDatatables.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTablePopover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  @JSImport("mui-datatables", "Popover")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def action(value: /* args */ js.Any => _): this.type = set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def anchorElReactElement(value: ReactElement): this.type = set("anchorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def anchorEl(value: ReactElement): this.type = set("anchorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def anchorOrigin(value: js.Any): this.type = set("anchorOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def elevation(value: Double): this.type = set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: /* args */ js.Any => _): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExited(value: /* args */ js.Any => _): this.type = set("onExited", js.Any.fromFunction1(value))
    
    @scala.inline
    def option(value: Boolean): this.type = set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ref(value: js.Any): this.type = set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transformOrigin(value: js.Any): this.type = set("transformOrigin", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTablePopover): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
