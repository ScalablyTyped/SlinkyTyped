package typingsSlinky.reactOverlays.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactOverlays.anon.Props
import typingsSlinky.reactOverlays.anon.UseDropdownToggleHelpersp
import typingsSlinky.reactOverlays.dropdownContextMod.DropDirection
import typingsSlinky.reactOverlays.dropdownMenuMod.DropdownMenuProps
import typingsSlinky.reactOverlays.dropdownMenuMod.UseDropdownMenuValue
import typingsSlinky.reactOverlays.dropdownMod.DropdownProps
import typingsSlinky.reactOverlays.dropdownToggleMod.DropdownToggleProps
import typingsSlinky.reactOverlays.reactOverlaysBooleans.`false`
import typingsSlinky.reactOverlays.reactOverlaysBooleans.`true`
import typingsSlinky.reactOverlays.reactOverlaysStrings.keyboard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  @JSImport("react-overlays/esm", "Dropdown")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def alignEnd(value: Boolean): this.type = set("alignEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultShow(value: Boolean): this.type = set("defaultShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def drop(value: DropDirection): this.type = set("drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusFirstItemOnShow(value: `false` | `true` | keyboard): this.type = set("focusFirstItemOnShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemSelector(value: String): this.type = set("itemSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    children: Props => ReactElement,
    onToggle: (Boolean, js.UndefOr[SyntheticEvent[Event, Element]]) => Unit
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), onToggle = js.Any.fromFunction2(onToggle))
    new Builder(js.Array(this.component, __props.asInstanceOf[DropdownProps]))
  }
  
  object Menu {
    
    @JSImport("react-overlays/esm", "Dropdown.Menu")
    @js.native
    object component extends js.Object
    
    def withProps(p: DropdownMenuProps): SharedBuilder_DropdownMenuProps_2032938684 = new SharedBuilder_DropdownMenuProps_2032938684(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(children: UseDropdownMenuValue => ReactElement): SharedBuilder_DropdownMenuProps_2032938684 = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      new SharedBuilder_DropdownMenuProps_2032938684(js.Array(this.component, __props.asInstanceOf[DropdownMenuProps]))
    }
  }
  
  object Toggle {
    
    @JSImport("react-overlays/esm", "Dropdown.Toggle")
    @js.native
    object component extends js.Object
    
    def withProps(p: DropdownToggleProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(children: UseDropdownToggleHelpersp => ReactElement): Default[tag.type, js.Object] = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[DropdownToggleProps]))
    }
  }
}
