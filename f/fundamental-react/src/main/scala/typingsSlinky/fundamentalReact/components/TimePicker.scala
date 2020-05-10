package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.AnonHour
import typingsSlinky.fundamentalReact.AnonMeridiemPM
import typingsSlinky.fundamentalReact.timePickerMod.TimePickerProps
import typingsSlinky.fundamentalReact.timePickerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimePicker {
  @JSImport("fundamental-react/lib/TimePicker/TimePicker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def format12Hours(value: Boolean): this.type = set("format12Hours", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def localizedText(value: AnonMeridiemPM): this.type = set("localizedText", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* repeated */ js.Any => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
    @scala.inline
    def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def spinners(value: Boolean): this.type = set("spinners", value.asInstanceOf[js.Any])
    @scala.inline
    def time(value: AnonHour): this.type = set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

