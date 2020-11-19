package typingsSlinky.reactBootstrapDatePicker.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapDatePicker.mod.DatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBootstrapDatePicker {
  
  @JSImport("react-bootstrap-date-picker", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def calendarContainer(value: js.Any): this.type = set("calendarContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def calendarPlacement(value: String): this.type = set("calendarPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cellPadding(value: String): this.type = set("cellPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearButtonElementReactElement(value: ReactElement): this.type = set("clearButtonElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearButtonElement(value: ReactElement): this.type = set("clearButtonElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customControlFunctionComponent(value: ReactComponentClass[_]): this.type = set("customControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customControlComponentClass(value: ReactComponentClass[_]): this.type = set("customControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customControl(value: ReactComponentClass[_]): this.type = set("customControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dateFormat(value: String): this.type = set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dayLabelsVarargs(value: String*): this.type = set("dayLabels", js.Array(value :_*))
    
    @scala.inline
    def dayLabels(value: js.Array[String]): this.type = set("dayLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: String): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: String): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def monthLabelsVarargs(value: String*): this.type = set("monthLabels", js.Array(value :_*))
    
    @scala.inline
    def monthLabels(value: js.Array[String]): this.type = set("monthLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextButtonElementReactElement(value: ReactElement): this.type = set("nextButtonElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextButtonElement(value: ReactElement): this.type = set("nextButtonElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[_] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: (/* value */ String, /* formattedValue */ String) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClear(value: () => Unit): this.type = set("onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[_] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def previousButtonElementReactElement(value: ReactElement): this.type = set("previousButtonElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previousButtonElement(value: ReactElement): this.type = set("previousButtonElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showClearButton(value: Boolean): this.type = set("showClearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTodayButton(value: Boolean): this.type = set("showTodayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def todayButtonLabel(value: String): this.type = set("todayButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def weekStartsOnMonday(value: Boolean): this.type = set("weekStartsOnMonday", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactBootstrapDatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
