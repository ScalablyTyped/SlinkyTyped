package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the keyboard navigation handler.
  */
@js.native
trait KeyboardNavigationHandlerOptionsObject extends StObject {
  
  /**
    * Function to run on initialization of module.
    */
  var init: js.Function = js.native
  
  /**
    * An array containing pairs of an array of keycodes, mapped to a
    * handler function. When the keycode is received, the handler is called
    * with the keycode as parameter.
    */
  var keyCodeMap: js.Array[js.Tuple2[js.Array[Double], js.Function]] = js.native
  
  /**
    * Function to run before moving to next/prev module. Receives moving
    * direction as parameter: +1 for next, -1 for previous.
    */
  var terminate: js.UndefOr[js.Function] = js.native
  
  /**
    * Function to run to validate module. Should return false if module
    * should not run, true otherwise. Receives chart as parameter.
    */
  var validate: js.UndefOr[js.Function] = js.native
}
object KeyboardNavigationHandlerOptionsObject {
  
  @scala.inline
  def apply(init: js.Function, keyCodeMap: js.Array[js.Tuple2[js.Array[Double], js.Function]]): KeyboardNavigationHandlerOptionsObject = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], keyCodeMap = keyCodeMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardNavigationHandlerOptionsObject]
  }
  
  @scala.inline
  implicit class KeyboardNavigationHandlerOptionsObjectMutableBuilder[Self <: KeyboardNavigationHandlerOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: js.Function): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCodeMap(value: js.Array[js.Tuple2[js.Array[Double], js.Function]]): Self = StObject.set(x, "keyCodeMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCodeMapVarargs(value: (js.Tuple2[js.Array[Double], js.Function])*): Self = StObject.set(x, "keyCodeMap", js.Array(value :_*))
    
    @scala.inline
    def setTerminate(value: js.Function): Self = StObject.set(x, "terminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateUndefined: Self = StObject.set(x, "terminate", js.undefined)
    
    @scala.inline
    def setValidate(value: js.Function): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
