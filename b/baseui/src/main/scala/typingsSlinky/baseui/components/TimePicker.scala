package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.AnonSelect
import typingsSlinky.baseui.baseuiStrings.`12`
import typingsSlinky.baseui.baseuiStrings.`24`
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.timepickerMod.TimePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimePicker {
  @JSImport("baseui/timepicker", "TimePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.timepickerMod.TimePicker] {
    @scala.inline
    def creatable(value: Boolean): this.type = set("creatable", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def format(value: `12` | `24`): this.type = set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def nullable(value: Boolean): this.type = set("nullable", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* args */ js.Date => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: AnonSelect): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: mini | default_ | compact | large_): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  def withProps(p: TimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

