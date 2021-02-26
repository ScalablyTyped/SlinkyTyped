package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.textFieldTypesMod.ITextField
import typingsSlinky.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/TextField.base", "TextFieldBase")
  @js.native
  class TextFieldBase protected ()
    extends Component[ITextFieldProps, ITextFieldState, ITextFieldSnapshot]
       with ITextField {
    def this(props: ITextFieldProps) = this()
    
    var _adjustInputHeight: js.Any = js.native
    
    var _async: js.Any = js.native
    
    var _classNames: js.Any = js.native
    
    var _delayedValidate: js.Any = js.native
    
    var _descriptionId: js.Any = js.native
    
    /**
      * Current error message from either `props.errorMessage` or the result of `props.onGetErrorMessage`.
      *
      * - If there is no validation error or we have not validated the input value, errorMessage is an empty string.
      * - If we have done the validation and there is validation error, errorMessage is the validation error message.
      */
    val _errorMessage: js.Any = js.native
    
    /** Fallback ID if none is provided in props. Access proper value via `this._id`. */
    var _fallbackId: js.Any = js.native
    
    var _hasWarnedNullValue: js.Any = js.native
    
    /** Returns `props.id` if available, or a fallback if not. */
    val _id: js.Any = js.native
    
    val _isControlled: js.Any = js.native
    
    /**
      * If a custom description render function is supplied then treat description as always available.
      * Otherwise defer to the presence of description or error message text.
      */
    val _isDescriptionAvailable: js.Any = js.native
    
    var _labelId: js.Any = js.native
    
    /** Most recent value from a change or input event, to help avoid processing events twice */
    var _lastChangeValue: js.Any = js.native
    
    var _lastValidation: js.Any = js.native
    
    var _latestValidateValue: js.Any = js.native
    
    var _notifyAfterValidate: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onFocus: js.Any = js.native
    
    var _onInputChange: js.Any = js.native
    
    var _onRenderDescription: js.Any = js.native
    
    var _onRenderLabel: js.Any = js.native
    
    var _onRenderPrefix: js.Any = js.native
    
    var _onRenderSuffix: js.Any = js.native
    
    var _onRevealButtonClick: js.Any = js.native
    
    var _renderInput: js.Any = js.native
    
    var _renderTextArea: js.Any = js.native
    
    var _textElement: js.Any = js.native
    
    var _validate: js.Any = js.native
    
    var _warnControlledUsage: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTextFieldBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTextFieldBase(prevProps: ITextFieldProps, prevState: ITextFieldState, snapshot: ITextFieldSnapshot): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTextFieldBase(): Unit = js.native
    
    @JSName("getSnapshotBeforeUpdate")
    def getSnapshotBeforeUpdate_MTextFieldBase(prevProps: ITextFieldProps, prevState: ITextFieldState): ITextFieldSnapshot | Null = js.native
  }
  /* static members */
  object TextFieldBase {
    
    @JSImport("office-ui-fabric-react/lib/components/TextField/TextField.base", "TextFieldBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/TextField/TextField.base", "TextFieldBase.defaultProps")
    @js.native
    def defaultProps: ITextFieldProps = js.native
    @scala.inline
    def defaultProps_=(x: ITextFieldProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITextFieldSnapshot extends StObject {
    
    /**
      * If set, the text field is changing between single- and multi-line, so we'll need to reset
      * selection/cursor after the change completes.
      */
    var selection: js.UndefOr[js.Tuple2[Double | Null, Double | Null]] = js.native
  }
  object ITextFieldSnapshot {
    
    @scala.inline
    def apply(): ITextFieldSnapshot = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextFieldSnapshot]
    }
    
    @scala.inline
    implicit class ITextFieldSnapshotMutableBuilder[Self <: ITextFieldSnapshot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelection(value: js.Tuple2[Double | Null, Double | Null]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    }
  }
  
  @js.native
  trait ITextFieldState extends StObject {
    
    /**
      * Dynamic error message returned by `onGetErrorMessage`.
      * Use `this._errorMessage` to get the actual current error message.
      */
    var errorMessage: String | ReactElement = js.native
    
    /** Is true when the control has focus. */
    var isFocused: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether this field has `type='password'` and `canRevealPassword=true`, and the password is
      * currently being revealed.
      */
    var isRevealingPassword: js.UndefOr[Boolean] = js.native
    
    /** The currently displayed value if uncontrolled. */
    var uncontrolledValue: js.UndefOr[String] = js.native
  }
  object ITextFieldState {
    
    @scala.inline
    def apply(errorMessage: String | ReactElement): ITextFieldState = {
      val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextFieldState]
    }
    
    @scala.inline
    implicit class ITextFieldStateMutableBuilder[Self <: ITextFieldState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorMessage(value: String | ReactElement): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageReactElement(value: ReactElement): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      @scala.inline
      def setIsRevealingPassword(value: Boolean): Self = StObject.set(x, "isRevealingPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRevealingPasswordUndefined: Self = StObject.set(x, "isRevealingPassword", js.undefined)
      
      @scala.inline
      def setUncontrolledValue(value: String): Self = StObject.set(x, "uncontrolledValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncontrolledValueUndefined: Self = StObject.set(x, "uncontrolledValue", js.undefined)
    }
  }
}
