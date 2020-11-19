package typingsSlinky.rcTimePicker.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.moment.mod.Moment
import typingsSlinky.rcTimePicker.anon.Open
import typingsSlinky.rcTimePicker.anon.PartialTimePickerProps
import typingsSlinky.rcTimePicker.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcTimePicker {
  
  @JSImport("rc-time-picker", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def addon(value: PartialTimePickerProps => ReactElement): this.type = set("addon", js.Any.fromFunction1(value))
    
    @scala.inline
    def allowEmpty(value: Boolean): this.type = set("allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearIconReactElement(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearIcon(value: ReactElement): this.type = set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearText(value: String): this.type = set("clearText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultOpenValue(value: Moment): this.type = set("defaultOpenValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: Moment): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledHours(value: () => js.Array[Double]): this.type = set("disabledHours", js.Any.fromFunction0(value))
    
    @scala.inline
    def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
    
    @scala.inline
    def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
    
    @scala.inline
    def focusOnOpen(value: Boolean): this.type = set("focusOnOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideDisabledOptions(value: Boolean): this.type = set("hideDisabledOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hourStep(value: Double): this.type = set("hourStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputIconReactElement(value: ReactElement): this.type = set("inputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputIcon(value: ReactElement): this.type = set("inputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ Moment => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClose(value: /* state */ Open => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOpen(value: /* state */ Open => Unit): this.type = set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: String): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondStep(value: Double): this.type = set("secondStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Moment): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PartialTimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RcTimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
