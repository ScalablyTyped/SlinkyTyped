package typingsSlinky.reactDayPicker.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDayPicker.classNamesMod.InputClassNames
import typingsSlinky.reactDayPicker.dayPickerInputMod.default
import typingsSlinky.reactDayPicker.modifiersMod.DayModifiers
import typingsSlinky.reactDayPicker.propsMod.DayPickerInputProps
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DayPickerInput {
  
  @JSImport("react-day-picker/types/DayPickerInput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def classNames(value: InputClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clickUnselectsDay(value: Boolean): this.type = set("clickUnselectsDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: js.Any): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dayPickerProps(value: DayPickerProps): this.type = set("dayPickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: String | js.Array[String]): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatDate(value: (/* date */ js.Date, /* format */ String, /* locale */ String) => String): this.type = set("formatDate", js.Any.fromFunction3(value))
    
    @scala.inline
    def formatVarargs(value: String*): this.type = set("format", js.Array(value :_*))
    
    @scala.inline
    def hideOnDayClick(value: Boolean): this.type = set("hideOnDayClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputProps(value: js.Object): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keepFocus(value: Boolean): this.type = set("keepFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDayChange(value: (/* day */ js.Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ default) => Unit): this.type = set("onDayChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def onDayPickerHide(value: () => Unit): this.type = set("onDayPickerHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def onDayPickerShow(value: () => Unit): this.type = set("onDayPickerShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def overlayComponent(value: js.Any): this.type = set("overlayComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def parseDate(value: (/* str */ String, /* format */ String, /* locale */ String) => js.Date | Unit): this.type = set("parseDate", js.Any.fromFunction3(value))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showOverlay(value: Boolean): this.type = set("showOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String | js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueDate(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DayPickerInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DayPickerInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
