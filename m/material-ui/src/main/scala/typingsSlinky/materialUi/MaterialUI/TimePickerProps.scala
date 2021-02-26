package typingsSlinky.materialUi.MaterialUI

import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.materialUi.materialUiStrings.`24hr`
import typingsSlinky.materialUi.materialUiStrings.ampm
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerProps extends StObject {
  
  // <TextField/> is element that get the 'other' properties
  var autoOk: js.UndefOr[Boolean] = js.native
  
  var cancelLabel: js.UndefOr[ReactElement] = js.native
  
  // From <TextField />
  var className: js.UndefOr[String] = js.native
  
  var defaultTime: js.UndefOr[js.Date] = js.native
  
  var defaultValue: js.UndefOr[String | Double] = js.native
  
  var dialogBodyStyle: js.UndefOr[CSSProperties] = js.native
  
  var dialogStyle: js.UndefOr[CSSProperties] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var errorStyle: js.UndefOr[CSSProperties] = js.native
  
  var errorText: js.UndefOr[ReactElement] = js.native
  
  var floatingLabelFixed: js.UndefOr[Boolean] = js.native
  
  var floatingLabelFocusStyle: js.UndefOr[CSSProperties] = js.native
  
  var floatingLabelStyle: js.UndefOr[CSSProperties] = js.native
  
  var floatingLabelText: js.UndefOr[ReactElement] = js.native
  
  var format: js.UndefOr[ampm | `24hr`] = js.native
  
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  var hintStyle: js.UndefOr[CSSProperties] = js.native
  
  var hintText: js.UndefOr[ReactElement] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inputStyle: js.UndefOr[CSSProperties] = js.native
  
  var minutesStep: js.UndefOr[Double] = js.native
  
  var multiLine: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var okLabel: js.UndefOr[ReactElement] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  
  var onChange: js.UndefOr[js.Function2[/* e */ js.Any, /* time */ js.Date, Unit]] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var pedantic: js.UndefOr[Boolean] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var rowsMax: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var textFieldStyle: js.UndefOr[CSSProperties] = js.native
  
  var textareaStyle: js.UndefOr[CSSProperties] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var underlineDisabledStyle: js.UndefOr[CSSProperties] = js.native
  
  var underlineFocusStyle: js.UndefOr[CSSProperties] = js.native
  
  var underlineShow: js.UndefOr[Boolean] = js.native
  
  var underlineStyle: js.UndefOr[CSSProperties] = js.native
  
  var value: js.UndefOr[js.Date] = js.native
}
object TimePickerProps {
  
  @scala.inline
  def apply(): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerProps]
  }
  
  @scala.inline
  implicit class TimePickerPropsMutableBuilder[Self <: TimePickerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoOk(value: Boolean): Self = StObject.set(x, "autoOk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoOkUndefined: Self = StObject.set(x, "autoOk", js.undefined)
    
    @scala.inline
    def setCancelLabel(value: ReactElement): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelLabelReactElement(value: ReactElement): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDefaultTime(value: js.Date): Self = StObject.set(x, "defaultTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTimeUndefined: Self = StObject.set(x, "defaultTime", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String | Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDialogBodyStyle(value: CSSProperties): Self = StObject.set(x, "dialogBodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogBodyStyleUndefined: Self = StObject.set(x, "dialogBodyStyle", js.undefined)
    
    @scala.inline
    def setDialogStyle(value: CSSProperties): Self = StObject.set(x, "dialogStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogStyleUndefined: Self = StObject.set(x, "dialogStyle", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setErrorStyle(value: CSSProperties): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
    
    @scala.inline
    def setErrorText(value: ReactElement): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTextReactElement(value: ReactElement): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
    
    @scala.inline
    def setFloatingLabelFixed(value: Boolean): Self = StObject.set(x, "floatingLabelFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelFixedUndefined: Self = StObject.set(x, "floatingLabelFixed", js.undefined)
    
    @scala.inline
    def setFloatingLabelFocusStyle(value: CSSProperties): Self = StObject.set(x, "floatingLabelFocusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelFocusStyleUndefined: Self = StObject.set(x, "floatingLabelFocusStyle", js.undefined)
    
    @scala.inline
    def setFloatingLabelStyle(value: CSSProperties): Self = StObject.set(x, "floatingLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelStyleUndefined: Self = StObject.set(x, "floatingLabelStyle", js.undefined)
    
    @scala.inline
    def setFloatingLabelText(value: ReactElement): Self = StObject.set(x, "floatingLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelTextReactElement(value: ReactElement): Self = StObject.set(x, "floatingLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelTextUndefined: Self = StObject.set(x, "floatingLabelText", js.undefined)
    
    @scala.inline
    def setFormat(value: ampm | `24hr`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setHintStyle(value: CSSProperties): Self = StObject.set(x, "hintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintStyleUndefined: Self = StObject.set(x, "hintStyle", js.undefined)
    
    @scala.inline
    def setHintText(value: ReactElement): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintTextReactElement(value: ReactElement): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    @scala.inline
    def setMinutesStep(value: Double): Self = StObject.set(x, "minutesStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesStepUndefined: Self = StObject.set(x, "minutesStep", js.undefined)
    
    @scala.inline
    def setMultiLine(value: Boolean): Self = StObject.set(x, "multiLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLineUndefined: Self = StObject.set(x, "multiLine", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOkLabel(value: ReactElement): Self = StObject.set(x, "okLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkLabelReactElement(value: ReactElement): Self = StObject.set(x, "okLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkLabelUndefined: Self = StObject.set(x, "okLabel", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[js.Object] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* e */ js.Any, /* time */ js.Date) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[js.Object] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[js.Object] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsMax(value: Double): Self = StObject.set(x, "rowsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsMaxUndefined: Self = StObject.set(x, "rowsMax", js.undefined)
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTextFieldStyle(value: CSSProperties): Self = StObject.set(x, "textFieldStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFieldStyleUndefined: Self = StObject.set(x, "textFieldStyle", js.undefined)
    
    @scala.inline
    def setTextareaStyle(value: CSSProperties): Self = StObject.set(x, "textareaStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextareaStyleUndefined: Self = StObject.set(x, "textareaStyle", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnderlineDisabledStyle(value: CSSProperties): Self = StObject.set(x, "underlineDisabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineDisabledStyleUndefined: Self = StObject.set(x, "underlineDisabledStyle", js.undefined)
    
    @scala.inline
    def setUnderlineFocusStyle(value: CSSProperties): Self = StObject.set(x, "underlineFocusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineFocusStyleUndefined: Self = StObject.set(x, "underlineFocusStyle", js.undefined)
    
    @scala.inline
    def setUnderlineShow(value: Boolean): Self = StObject.set(x, "underlineShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineShowUndefined: Self = StObject.set(x, "underlineShow", js.undefined)
    
    @scala.inline
    def setUnderlineStyle(value: CSSProperties): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    
    @scala.inline
    def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
