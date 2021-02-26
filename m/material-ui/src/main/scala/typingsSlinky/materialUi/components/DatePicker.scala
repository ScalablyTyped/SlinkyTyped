package typingsSlinky.materialUi.components

import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.DatePicker.DatePickerProps
import typingsSlinky.materialUi.anon.TypeofDateTimeFormat
import typingsSlinky.materialUi.materialUiStrings.`inline`
import typingsSlinky.materialUi.materialUiStrings.dialog
import typingsSlinky.materialUi.materialUiStrings.landscape
import typingsSlinky.materialUi.materialUiStrings.portrait
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("material-ui", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.DatePicker] {
    
    @scala.inline
    def DateTimeFormat(value: TypeofDateTimeFormat): this.type = set("DateTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoOk(value: Boolean): this.type = set("autoOk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelLabel(value: ReactElement): this.type = set("cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelLabelReactElement(value: ReactElement): this.type = set("cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: dialog | `inline`): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultDate(value: js.Date): this.type = set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dialogContainerStyle(value: CSSProperties): this.type = set("dialogContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableYearSelection(value: Boolean): this.type = set("disableYearSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorStyle(value: CSSProperties): this.type = set("errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorText(value: ReactElement): this.type = set("errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorTextReactElement(value: ReactElement): this.type = set("errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def firstDayOfWeek(value: Double): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatingLabelStyle(value: CSSProperties): this.type = set("floatingLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatingLabelText(value: ReactElement): this.type = set("floatingLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatingLabelTextReactElement(value: ReactElement): this.type = set("floatingLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatDate(value: /* date */ js.Date => String): this.type = set("formatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideCalendarDate(value: Boolean): this.type = set("hideCalendarDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hintStyle(value: CSSProperties): this.type = set("hintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hintText(value: ReactElement): this.type = set("hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hintTextReactElement(value: ReactElement): this.type = set("hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputStyle(value: CSSProperties): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: portrait | landscape): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okLabel(value: ReactElement): this.type = set("okLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okLabelReactElement(value: ReactElement): this.type = set("okLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: (/* e */ js.Any, /* date */ js.Date) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClick(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onShow(value: () => Unit): this.type = set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def openToYearSelection(value: Boolean): this.type = set("openToYearSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowsMax(value: Double): this.type = set("rowsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldDisableDate(value: /* day */ js.Date => Boolean): this.type = set("shouldDisableDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textFieldStyle(value: CSSProperties): this.type = set("textFieldStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineDisabledStyle(value: CSSProperties): this.type = set("underlineDisabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineFocusStyle(value: CSSProperties): this.type = set("underlineFocusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineShow(value: Boolean): this.type = set("underlineShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineStyle(value: CSSProperties): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def utils(value: typingsSlinky.materialUi.MaterialUI.propTypes.utils): this.type = set("utils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
