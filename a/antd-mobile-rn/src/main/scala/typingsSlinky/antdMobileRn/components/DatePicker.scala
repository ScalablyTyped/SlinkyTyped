package typingsSlinky.antdMobileRn.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.AnonDatePickerLocale
import typingsSlinky.antdMobileRn.antdMobileRnStrings.date
import typingsSlinky.antdMobileRn.antdMobileRnStrings.datetime
import typingsSlinky.antdMobileRn.antdMobileRnStrings.month
import typingsSlinky.antdMobileRn.antdMobileRnStrings.time
import typingsSlinky.antdMobileRn.antdMobileRnStrings.year
import typingsSlinky.antdMobileRn.datePickerIndexNativeMod.DatePickerNativeProps
import typingsSlinky.antdMobileRn.pickerStyleIndexNativeMod.IPickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker {
  @JSImport("antd-mobile-rn", "DatePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.DatePicker] {
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def dismissTextReactElement(value: ReactElement): this.type = set("dismissText", value.asInstanceOf[js.Any])
    @scala.inline
    def dismissText(value: TagMod[Any]): this.type = set("dismissText", value.asInstanceOf[js.Any])
    @scala.inline
    def extra(value: String): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def formatFunction1(value: /* value */ js.Date => String): this.type = set("format", js.Any.fromFunction1(value))
    @scala.inline
    def format(value: String | (js.Function1[/* value */ js.Date, String])): this.type = set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: AnonDatePickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(value: datetime | date | year | month | time): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def okTextReactElement(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def okText(value: TagMod[Any]): this.type = set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ js.Date => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def onValueChange(value: (/* vals */ js.Any, /* index */ Double) => Unit): this.type = set("onValueChange", js.Any.fromFunction2(value))
    @scala.inline
    def styles(value: IPickerStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerTypes(value: String): this.type = set("triggerTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DatePickerNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

