package typingsSlinky.antDesignReactNative.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.AnonDatePickerLocale
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.date
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.datetime
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.month
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.time
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.year
import typingsSlinky.antDesignReactNative.datePickerViewMod.default
import typingsSlinky.antDesignReactNative.datePickerViewPropsTypeMod.DatePickerProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePickerView {
  @JSImport("@ant-design/react-native/lib/date-picker-view", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def date(value: js.Any): this.type = set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultDate(value: js.Date): this.type = set("defaultDate", value.asInstanceOf[js.Any])
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
    def formatDay(value: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => _): this.type = set("formatDay", js.Any.fromFunction2(value))
    @scala.inline
    def formatMonth(value: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => _): this.type = set("formatMonth", js.Any.fromFunction2(value))
    @scala.inline
    def itemStyle(value: StyleProp[ViewStyle]): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def itemStyleNull: this.type = set("itemStyle", null)
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
    def onDateChange(value: /* date */ js.Any => Unit): this.type = set("onDateChange", js.Any.fromFunction1(value))
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def onScrollChange(value: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit): this.type = set("onScrollChange", js.Any.fromFunction3(value))
    @scala.inline
    def onValueChange(value: (/* vals */ js.Any, /* index */ Double) => Unit): this.type = set("onValueChange", js.Any.fromFunction2(value))
    @scala.inline
    def rootNativeProps(value: js.Object): this.type = set("rootNativeProps", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def styles(value: js.Any): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerTypes(value: String): this.type = set("triggerTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DatePickerView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

