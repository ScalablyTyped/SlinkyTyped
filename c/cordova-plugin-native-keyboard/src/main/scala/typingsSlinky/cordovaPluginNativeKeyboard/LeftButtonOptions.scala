package typingsSlinky.cordovaPluginNativeKeyboard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeftButtonOptions extends ButtonOptions {
  
  /**
    * Set to true to disable the button once text has been entered.
    *
    * Default: false
    */
  var disabledWhenTextEntered: js.UndefOr[Boolean] = js.native
}
object LeftButtonOptions {
  
  @scala.inline
  def apply(color: String, onPress: () => Unit): LeftButtonOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[LeftButtonOptions]
  }
  
  @scala.inline
  implicit class LeftButtonOptionsMutableBuilder[Self <: LeftButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabledWhenTextEntered(value: Boolean): Self = StObject.set(x, "disabledWhenTextEntered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledWhenTextEnteredUndefined: Self = StObject.set(x, "disabledWhenTextEntered", js.undefined)
  }
}
