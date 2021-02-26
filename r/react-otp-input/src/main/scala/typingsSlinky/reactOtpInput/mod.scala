package typingsSlinky.reactOtpInput

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-otp-input", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[OTPInputProps, js.Object, js.Any] {
    def this(props: OTPInputProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OTPInputProps, context: js.Any) = this()
  }
  
  @js.native
  trait OTPInputProps extends StObject {
    
    var containerStyle: js.UndefOr[String | CSSProperties] = js.native
    
    var disabledStyle: js.UndefOr[String | CSSProperties] = js.native
    
    var errorStyle: js.UndefOr[String | CSSProperties] = js.native
    
    var focusStyle: js.UndefOr[String | CSSProperties] = js.native
    
    var hasErrored: js.UndefOr[Boolean] = js.native
    
    var inputStyle: js.UndefOr[String | CSSProperties] = js.native
    
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    var isInputNum: js.UndefOr[Boolean] = js.native
    
    var numInputs: Double = js.native
    
    var onChange: js.Any = js.native
    
    var separator: js.UndefOr[ReactElement] = js.native
    
    var shouldAutoFocus: js.UndefOr[Boolean] = js.native
    
    var value: Double | String = js.native
  }
  object OTPInputProps {
    
    @scala.inline
    def apply(numInputs: Double, onChange: js.Any, value: Double | String): OTPInputProps = {
      val __obj = js.Dynamic.literal(numInputs = numInputs.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OTPInputProps]
    }
    
    @scala.inline
    implicit class OTPInputPropsMutableBuilder[Self <: OTPInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerStyle(value: String | CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setDisabledStyle(value: String | CSSProperties): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      @scala.inline
      def setErrorStyle(value: String | CSSProperties): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
      
      @scala.inline
      def setFocusStyle(value: String | CSSProperties): Self = StObject.set(x, "focusStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusStyleUndefined: Self = StObject.set(x, "focusStyle", js.undefined)
      
      @scala.inline
      def setHasErrored(value: Boolean): Self = StObject.set(x, "hasErrored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasErroredUndefined: Self = StObject.set(x, "hasErrored", js.undefined)
      
      @scala.inline
      def setInputStyle(value: String | CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setIsInputNum(value: Boolean): Self = StObject.set(x, "isInputNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInputNumUndefined: Self = StObject.set(x, "isInputNum", js.undefined)
      
      @scala.inline
      def setNumInputs(value: Double): Self = StObject.set(x, "numInputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: js.Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparator(value: ReactElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setShouldAutoFocus(value: Boolean): Self = StObject.set(x, "shouldAutoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldAutoFocusUndefined: Self = StObject.set(x, "shouldAutoFocus", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
