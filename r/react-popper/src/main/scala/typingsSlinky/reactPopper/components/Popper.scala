package typingsSlinky.reactPopper.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.popperJs.mod.Placement
import typingsSlinky.popperJs.mod.ReferenceObject
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactPopper.mod.PopperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popper {
  @JSImport("react-popper", "Popper")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPopper.mod.Popper] {
    @scala.inline
    def eventsEnabled(value: Boolean): this.type = set("eventsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def innerRef(value: Ref[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    @scala.inline
    def modifiers(value: Modifiers): this.type = set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def positionFixed(value: Boolean): this.type = set("positionFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def referenceElement(value: ReferenceObject): this.type = set("referenceElement", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Popper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

