package typingsSlinky.blueprintjsTimezone.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsTimezone.anon.PartialIButtonProps
import typingsSlinky.blueprintjsTimezone.anon.PartialIPopoverProps
import typingsSlinky.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat
import typingsSlinky.blueprintjsTimezone.timezonePickerMod.ITimezonePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimezonePicker {
  @JSImport("@blueprintjs/timezone", "TimezonePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTimezone.mod.TimezonePicker] {
    @scala.inline
    def buttonProps(value: PartialIButtonProps): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def date(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def inputProps(value: IInputGroupProps with HTMLInputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def popoverProps(value: PartialIPopoverProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def showLocalTimezone(value: Boolean): this.type = set("showLocalTimezone", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueDisplayFormat(value: TimezoneDisplayFormat): this.type = set("valueDisplayFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITimezonePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: String => Unit): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[ITimezonePickerProps]))
  }
}

