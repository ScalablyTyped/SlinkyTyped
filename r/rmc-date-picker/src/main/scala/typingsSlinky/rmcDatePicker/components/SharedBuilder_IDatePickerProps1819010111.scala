package typingsSlinky.rmcDatePicker.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_IDatePickerProps1819010111[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def date(value: js.Any): this.type = set("date", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultDate(value: js.Any): this.type = set("defaultDate", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def formatDay(value: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => _): this.type = set("formatDay", js.Any.fromFunction2(value))
  
  @scala.inline
  def formatMonth(value: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => _): this.type = set("formatMonth", js.Any.fromFunction2(value))
  
  @scala.inline
  def itemStyle(value: js.Any): this.type = set("itemStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def locale(value: js.Any): this.type = set("locale", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxDate(value: js.Any): this.type = set("maxDate", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxHour(value: Double): this.type = set("maxHour", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxMinute(value: Double): this.type = set("maxMinute", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minDate(value: js.Any): this.type = set("minDate", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minHour(value: Double): this.type = set("minHour", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minMinute(value: Double): this.type = set("minMinute", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mode(value: String): this.type = set("mode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onDateChange(value: /* date */ js.Any => Unit): this.type = set("onDateChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onScrollChange(value: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit): this.type = set("onScrollChange", js.Any.fromFunction3(value))
  
  @scala.inline
  def onValueChange(value: (/* vals */ js.Any, /* index */ Double) => Unit): this.type = set("onValueChange", js.Any.fromFunction2(value))
  
  @scala.inline
  def pickerPrefixCls(value: String): this.type = set("pickerPrefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootNativeProps(value: js.Object): this.type = set("rootNativeProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
}
