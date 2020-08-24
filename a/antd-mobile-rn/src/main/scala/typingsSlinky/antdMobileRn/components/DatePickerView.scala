package typingsSlinky.antdMobileRn.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.anon.DatePickerLocale
import typingsSlinky.antdMobileRn.antdMobileRnStrings.date
import typingsSlinky.antdMobileRn.antdMobileRnStrings.datetime
import typingsSlinky.antdMobileRn.antdMobileRnStrings.month
import typingsSlinky.antdMobileRn.antdMobileRnStrings.time
import typingsSlinky.antdMobileRn.antdMobileRnStrings.year
import typingsSlinky.antdMobileRn.datePickerViewPropsTypeMod.DatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePickerView {
  @JSImport("antd-mobile-rn", "DatePickerView")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.DatePickerView] {
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def dismissTextReactElement(value: ReactElement): this.type = set("dismissText", value.asInstanceOf[js.Any])
    @scala.inline
    def dismissText(value: ReactElement): this.type = set("dismissText", value.asInstanceOf[js.Any])
    @scala.inline
    def extra(value: String): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def formatFunction1(value: /* value */ js.Date => String): this.type = set("format", js.Any.fromFunction1(value))
    @scala.inline
    def format(value: String | (js.Function1[/* value */ js.Date, String])): this.type = set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: DatePickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
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
    def okText(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ js.Date => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def onScrollChange(value: (/* newValue */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit): this.type = set("onScrollChange", js.Any.fromFunction3(value))
    @scala.inline
    def onValueChange(value: (/* vals */ js.Any, /* index */ Double) => Unit): this.type = set("onValueChange", js.Any.fromFunction2(value))
    @scala.inline
    def styles(value: js.Any): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerTypes(value: String): this.type = set("triggerTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DatePickerView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

