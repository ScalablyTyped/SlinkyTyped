package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.positioningTypesMod.Position
import typingsSlinky.officeUiFabricReact.spinButtonTypesMod.ISpinButton
import typingsSlinky.officeUiFabricReact.spinButtonTypesMod.ISpinButtonProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinButtonSpinButtonMod {
  
  @js.native
  sealed trait KeyboardSpinDirection extends StObject
  @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "KeyboardSpinDirection")
  @js.native
  object KeyboardSpinDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KeyboardSpinDirection with Double] = js.native
    
    @js.native
    sealed trait down extends KeyboardSpinDirection
    /* -1 */ val down: typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.down with Double = js.native
    
    @js.native
    sealed trait notSpinning extends KeyboardSpinDirection
    /* 0 */ val notSpinning: typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.notSpinning with Double = js.native
    
    @js.native
    sealed trait up extends KeyboardSpinDirection
    /* 1 */ val up: typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.up with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "SpinButton")
  @js.native
  class SpinButton protected ()
    extends Component[ISpinButtonProps, ISpinButtonState, js.Any]
       with ISpinButton {
    def this(props: ISpinButtonProps) = this()
    
    /**
      * Invoked when a component is receiving new props. This method is not called for the initial render.
      */
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MSpinButton(newProps: ISpinButtonProps): Unit = js.native
    
    var _async: js.Any = js.native
    
    var _calculatePrecision: js.Any = js.native
    
    var _currentStepFunctionHandle: js.Any = js.native
    
    /**
      * Increment function to use if one is not passed in
      */
    var _defaultOnDecrement: js.Any = js.native
    
    /**
      * Increment function to use if one is not passed in
      */
    var _defaultOnIncrement: js.Any = js.native
    
    /**
      * Validate function to use if one is not passed in
      */
    var _defaultOnValidate: js.Any = js.native
    
    /**
      * Handle keydown on the text field. We need to update
      * the value when up or down arrow are depressed
      * @param event - the keyboardEvent that was fired
      */
    var _handleKeyDown: js.Any = js.native
    
    /**
      * Make sure that we have stopped spinning on keyUp
      * if the up or down arrow fired this event
      * @param event - keyboard event
      */
    var _handleKeyUp: js.Any = js.native
    
    var _initialStepDelay: js.Any = js.native
    
    var _input: js.Any = js.native
    
    var _inputId: js.Any = js.native
    
    var _labelId: js.Any = js.native
    
    var _lastValidValue: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onChange: js.Any = js.native
    
    var _onDecrement: js.Any = js.native
    
    var _onDecrementMouseDown: js.Any = js.native
    
    var _onFocus: js.Any = js.native
    
    var _onIncrement: js.Any = js.native
    
    var _onIncrementMouseDown: js.Any = js.native
    
    /**
      * The method is needed to ensure we are updating the actual input value.
      * without this our value will never change (and validation will not have the correct number)
      * @param event - the event that was fired
      */
    var _onInputChange: js.Any = js.native
    
    var _onValidate: js.Any = js.native
    
    var _precision: js.Any = js.native
    
    var _spinningByMouse: js.Any = js.native
    
    var _stepDelay: js.Any = js.native
    
    /**
      * Stop spinning (clear any currently pending update and set spinning to false)
      */
    var _stop: js.Any = js.native
    
    /**
      * Update the value with the given stepFunction
      * @param shouldSpin - should we fire off another updateValue when we are done here? This should be true
      * when spinning in response to a mouseDown
      * @param stepFunction - function to use to step by
      * @param event - The event that triggered the updateValue
      */
    var _updateValue: js.Any = js.native
    
    /**
      * This is used when validating text entry in the input on blur or when enter key is pressed
      * (not when changed via the buttons).
      * @param event - the event that fired
      */
    var _validate: js.Any = js.native
    
    var _valueToValidate: js.Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSpinButton(): Unit = js.native
  }
  /* static members */
  object SpinButton {
    
    @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "SpinButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "SpinButton.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    @scala.inline
    def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/SpinButton/SpinButton.types.ISpinButtonProps, 'step' | 'min' | 'max' | 'disabled' | 'labelPosition' | 'label' | 'incrementButtonIcon' | 'decrementButtonIcon'>> */
  @js.native
  trait DefaultProps extends StObject {
    
    var decrementButtonIcon: IIconProps = js.native
    
    var disabled: Boolean = js.native
    
    var incrementButtonIcon: IIconProps = js.native
    
    var label: String = js.native
    
    var labelPosition: Position = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var step: Double = js.native
  }
  object DefaultProps {
    
    @scala.inline
    def apply(
      decrementButtonIcon: IIconProps,
      disabled: Boolean,
      incrementButtonIcon: IIconProps,
      label: String,
      labelPosition: Position,
      max: Double,
      min: Double,
      step: Double
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(decrementButtonIcon = decrementButtonIcon.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], incrementButtonIcon = incrementButtonIcon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    @scala.inline
    implicit class DefaultPropsMutableBuilder[Self <: DefaultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecrementButtonIcon(value: IIconProps): Self = StObject.set(x, "decrementButtonIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementButtonIcon(value: IIconProps): Self = StObject.set(x, "incrementButtonIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPosition(value: Position): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISpinButtonState extends StObject {
    
    /**
      * Is true when the control has focus.
      */
    var isFocused: Boolean = js.native
    
    /**
      * keyboard spin direction, used to style the up or down button
      * as active when up/down arrow is pressed
      */
    var keyboardSpinDirection: KeyboardSpinDirection = js.native
    
    /**
      * the value of the spin button
      */
    var value: String = js.native
  }
  object ISpinButtonState {
    
    @scala.inline
    def apply(isFocused: Boolean, keyboardSpinDirection: KeyboardSpinDirection, value: String): ISpinButtonState = {
      val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], keyboardSpinDirection = keyboardSpinDirection.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpinButtonState]
    }
    
    @scala.inline
    implicit class ISpinButtonStateMutableBuilder[Self <: ISpinButtonState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardSpinDirection(value: KeyboardSpinDirection): Self = StObject.set(x, "keyboardSpinDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
