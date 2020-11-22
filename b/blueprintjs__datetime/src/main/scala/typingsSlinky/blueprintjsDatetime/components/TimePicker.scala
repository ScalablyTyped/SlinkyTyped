package typingsSlinky.blueprintjsDatetime.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsSlinky.blueprintjsDatetime.timeUnitMod.TimeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimePicker {
  
  @JSImport("@blueprintjs/datetime", "TimePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.TimePicker] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: js.Date): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxTime(value: js.Date): this.type = set("maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minTime(value: js.Date): this.type = set("minTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: (/* event */ SyntheticFocusEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): this.type = set("onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def onChange(value: /* newTime */ js.Date => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: (/* event */ SyntheticFocusEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): this.type = set("onFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def onKeyDown(value: (/* event */ SyntheticKeyboardEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): this.type = set("onKeyDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def onKeyUp(value: (/* event */ SyntheticKeyboardEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): this.type = set("onKeyUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def precision(value: TimePrecision): this.type = set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectAllOnFocus(value: Boolean): this.type = set("selectAllOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showArrowButtons(value: Boolean): this.type = set("showArrowButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useAmPm(value: Boolean): this.type = set("useAmPm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  def withProps(p: ITimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
