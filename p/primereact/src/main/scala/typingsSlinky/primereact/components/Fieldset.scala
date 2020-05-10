package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.AnonEvent
import typingsSlinky.primereact.fieldsetMod.FieldsetProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Fieldset {
  @JSImport("primereact/fieldset", "Fieldset")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactFieldsetMod.Fieldset] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def legend(value: js.Any): this.type = set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* event */ Event_ => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onCollapse(value: /* event */ Event_ => Unit): this.type = set("onCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def onExpand(value: /* event */ Event_ => Unit): this.type = set("onExpand", js.Any.fromFunction1(value))
    @scala.inline
    def onToggle(value: /* e */ AnonEvent => Unit): this.type = set("onToggle", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def toggleable(value: Boolean): this.type = set("toggleable", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FieldsetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Fieldset.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

