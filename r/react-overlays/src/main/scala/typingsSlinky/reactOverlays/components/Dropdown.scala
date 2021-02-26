package typingsSlinky.reactOverlays.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactOverlays.anon.PropsDropdownInjectedProps
import typingsSlinky.reactOverlays.anon.UseDropdownToggleHelperspProps
import typingsSlinky.reactOverlays.esmDropdownContextMod.DropDirection
import typingsSlinky.reactOverlays.esmDropdownMenuMod.DropdownMenuProps
import typingsSlinky.reactOverlays.esmDropdownMenuMod.UseDropdownMenuValue
import typingsSlinky.reactOverlays.esmDropdownMod.DropdownProps
import typingsSlinky.reactOverlays.esmDropdownToggleMod.DropdownToggleProps
import typingsSlinky.reactOverlays.reactOverlaysBooleans.`false`
import typingsSlinky.reactOverlays.reactOverlaysBooleans.`true`
import typingsSlinky.reactOverlays.reactOverlaysStrings.keyboard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  @scala.inline
  def apply(
    children: PropsDropdownInjectedProps => ReactElement,
    onToggle: (Boolean, js.UndefOr[SyntheticEvent[Event, Element]]) => Unit
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), onToggle = js.Any.fromFunction2(onToggle))
    new Builder(js.Array(this.component, __props.asInstanceOf[DropdownProps]))
  }
  
  object Menu {
    
    @scala.inline
    def apply(children: UseDropdownMenuValue => ReactElement): SharedBuilder_DropdownMenuProps1532764967 = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      new SharedBuilder_DropdownMenuProps1532764967(js.Array(this.component, __props.asInstanceOf[DropdownMenuProps]))
    }
    
    @JSImport("react-overlays/esm", "Dropdown.Menu")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: DropdownMenuProps): SharedBuilder_DropdownMenuProps1532764967 = new SharedBuilder_DropdownMenuProps1532764967(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Toggle {
    
    @scala.inline
    def apply(children: UseDropdownToggleHelperspProps => ReactElement): Default[tag.type, js.Object] = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[DropdownToggleProps]))
    }
    
    @JSImport("react-overlays/esm", "Dropdown.Toggle")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: DropdownToggleProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-overlays/esm", "Dropdown")
  @js.native
  val component: js.Object = js.native
  
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
}
