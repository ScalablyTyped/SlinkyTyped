package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.md
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.rangeInterfaceMod.RangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonRange extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  var debounce: js.UndefOr[Double] = js.native
  
  /**
    * If `true`, the user cannot interact with the range.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Show two knobs.
    */
  var dualKnobs: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum integer value of the range.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Minimum integer value of the range.
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Emitted when the range loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  
  /**
    * Emitted when the value property has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  
  /**
    * Emitted when the range has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  var pin: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  var snaps: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the value granularity.
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  var ticks: js.UndefOr[Boolean] = js.native
  
  /**
    * the value of the range.
    */
  var value: js.UndefOr[RangeValue] = js.native
}
object IonRange {
  
  @scala.inline
  def apply(): IonRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRange]
  }
  
  @scala.inline
  implicit class IonRangeMutableBuilder[Self <: IonRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDualKnobs(value: Boolean): Self = StObject.set(x, "dualKnobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDualKnobsUndefined: Self = StObject.set(x, "dualKnobs", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnIonBlur(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "onIonBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonBlurUndefined: Self = StObject.set(x, "onIonBlur", js.undefined)
    
    @scala.inline
    def setOnIonChange(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "onIonChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonChangeUndefined: Self = StObject.set(x, "onIonChange", js.undefined)
    
    @scala.inline
    def setOnIonFocus(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "onIonFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonFocusUndefined: Self = StObject.set(x, "onIonFocus", js.undefined)
    
    @scala.inline
    def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    
    @scala.inline
    def setSnaps(value: Boolean): Self = StObject.set(x, "snaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapsUndefined: Self = StObject.set(x, "snaps", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setTicks(value: Boolean): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setValue(value: RangeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
