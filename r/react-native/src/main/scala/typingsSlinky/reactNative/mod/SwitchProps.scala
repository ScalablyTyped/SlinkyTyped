package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.anon.False
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchProps extends SwitchPropsIOS {
  
  /**
    * If true the user won't be able to toggle the switch.
    * Default value is false.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * On iOS, custom color for the background.
    * Can be seen when the switch value is false or when the switch is disabled.
    */
  var ios_backgroundColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Invoked with the new value when the value changes.
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.native
  
  /**
    * Color of the foreground switch grip.
    */
  var thumbColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Custom colors for the switch track
    *
    * Color when false and color when true
    */
  var trackColor: js.UndefOr[False] = js.native
  
  /**
    * The value of the switch. If true the switch will be turned on.
    * Default value is false.
    */
  var value: js.UndefOr[Boolean] = js.native
}
object SwitchProps {
  
  @scala.inline
  def apply(): SwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchProps]
  }
  
  @scala.inline
  implicit class SwitchPropsMutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIos_backgroundColor(value: ColorValue): Self = StObject.set(x, "ios_backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos_backgroundColorUndefined: Self = StObject.set(x, "ios_backgroundColor", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ Boolean => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setThumbColor(value: ColorValue): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbColorUndefined: Self = StObject.set(x, "thumbColor", js.undefined)
    
    @scala.inline
    def setTrackColor(value: False): Self = StObject.set(x, "trackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackColorUndefined: Self = StObject.set(x, "trackColor", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
