package typingsSlinky.reactOverlays.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOverlays.dropdownMod.Directions
import typingsSlinky.reactOverlays.dropdownMod.DropdownProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dropdown {
  @JSImport("react-overlays", "Dropdown")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.Dropdown] {
    @scala.inline
    def alignEnd(value: Boolean): this.type = set("alignEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def drop(value: Directions): this.type = set("drop", value.asInstanceOf[js.Any])
    @scala.inline
    def itemSelector(value: String): this.type = set("itemSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def onToggle(value: (/* isOpen */ Boolean, /* event */ SyntheticEvent[Event_, _]) => Unit): this.type = set("onToggle", js.Any.fromFunction2(value))
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Dropdown.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

