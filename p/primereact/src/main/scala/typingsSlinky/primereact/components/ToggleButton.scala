package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.ValueBoolean
import typingsSlinky.primereact.toggleButtonMod.ToggleButtonProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToggleButton {
  @JSImport("primereact/togglebutton", "ToggleButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactTogglebuttonMod.ToggleButton] {
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def offIcon(value: String): this.type = set("offIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def offLabel(value: String): this.type = set("offLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* e */ ValueBoolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onIcon(value: String): this.type = set("onIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def onLabel(value: String): this.type = set("onLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: js.Any): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToggleButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ToggleButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

