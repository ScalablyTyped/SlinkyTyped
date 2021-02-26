package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextInputProps
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputProps extends TextInputProps {
  
  /**
    * Renders component in place of the React Native `TextInput` (optional)
    */
  var InputComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  
  /**
    * Styling for Input Component Container (optional)
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Disables the input field
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Style of the input field when disabled
    */
  var disabledInputStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * 	Adds error message (optional)
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * 	props to be passed to the React Native Text component used to display the error message (optional)
    */
  var errorProps: js.UndefOr[TextProps] = js.native
  
  /**
    * 	Add styling to error message (optional)
    */
  var errorStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * Styling for Input Component Container (optional)
    */
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * 	Adds styling to input component (optional)
    */
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * 	Adds label (optional)
    */
  var label: js.UndefOr[String | ReactElement] = js.native
  
  /**
    *  props to be passed to the React Native Text component used to display the label (optional)
    */
  var labelProps: js.UndefOr[TextProps] = js.native
  
  /**
    * 	Add styling to label (optional)
    */
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * Displays an icon to the left (optional)
    */
  var leftIcon: js.UndefOr[IconNode] = js.native
  
  /**
    * Styling for left Icon Component container
    */
  var leftIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    *  displays error message
    */
  var renderErrorMessage: js.UndefOr[Boolean] = js.native
  
  /**
    * Displays an icon to the right (optional)
    */
  var rightIcon: js.UndefOr[IconNode] = js.native
  
  /**
    * Styling for the right icon container
    */
  var rightIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object InputProps {
  
  @scala.inline
  def apply(): InputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProps]
  }
  
  @scala.inline
  implicit class InputPropsMutableBuilder[Self <: InputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledInputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledInputStyleNull: Self = StObject.set(x, "disabledInputStyle", null)
    
    @scala.inline
    def setDisabledInputStyleUndefined: Self = StObject.set(x, "disabledInputStyle", js.undefined)
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setErrorProps(value: TextProps): Self = StObject.set(x, "errorProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorPropsUndefined: Self = StObject.set(x, "errorProps", js.undefined)
    
    @scala.inline
    def setErrorStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStyleNull: Self = StObject.set(x, "errorStyle", null)
    
    @scala.inline
    def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
    
    @scala.inline
    def setInputComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "InputComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "InputComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "InputComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputComponentUndefined: Self = StObject.set(x, "InputComponent", js.undefined)
    
    @scala.inline
    def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
    
    @scala.inline
    def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
    
    @scala.inline
    def setInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
    
    @scala.inline
    def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: String | ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelProps(value: TextProps): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPropsUndefined: Self = StObject.set(x, "labelProps", js.undefined)
    
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: IconNode): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "leftIconContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconContainerStyleNull: Self = StObject.set(x, "leftIconContainerStyle", null)
    
    @scala.inline
    def setLeftIconContainerStyleUndefined: Self = StObject.set(x, "leftIconContainerStyle", js.undefined)
    
    @scala.inline
    def setLeftIconReactElement(value: ReactElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    @scala.inline
    def setRenderErrorMessage(value: Boolean): Self = StObject.set(x, "renderErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderErrorMessageUndefined: Self = StObject.set(x, "renderErrorMessage", js.undefined)
    
    @scala.inline
    def setRightIcon(value: IconNode): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "rightIconContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconContainerStyleNull: Self = StObject.set(x, "rightIconContainerStyle", null)
    
    @scala.inline
    def setRightIconContainerStyleUndefined: Self = StObject.set(x, "rightIconContainerStyle", js.undefined)
    
    @scala.inline
    def setRightIconReactElement(value: ReactElement): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
  }
}
