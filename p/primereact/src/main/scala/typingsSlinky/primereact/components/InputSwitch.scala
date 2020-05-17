package typingsSlinky.primereact.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.ValueBoolean
import typingsSlinky.primereact.inputSwitchMod.InputSwitchProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputSwitch {
  @JSImport("primereact/inputswitch", "InputSwitch")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactInputswitchMod.InputSwitch] {
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def offLabel(value: String): this.type = set("offLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: /* event */ Event => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* e */ ValueBoolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: /* event */ Event => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onLabel(value: String): this.type = set("onLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: js.Any): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InputSwitchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: InputSwitch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

