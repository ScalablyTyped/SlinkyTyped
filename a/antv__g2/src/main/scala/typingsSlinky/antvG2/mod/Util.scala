package typingsSlinky.antvG2.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Util extends /* other */ StringDictionary[lodashFn] {
  
  var each: lodashFn = js.native
  
  var isFunction: lodashFn = js.native
  
  var isNumber: lodashFn = js.native
  
  var isObject: lodashFn = js.native
  
  var isString: lodashFn = js.native
  
  var map: lodashFn = js.native
}
object Util {
  
  @JSImport("@antv/g2", "Util")
  @js.native
  val ^ : Util = js.native
  
  @scala.inline
  implicit class UtilMutableBuilder[Self <: Util] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEach(value: lodashFn): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFunction(value: lodashFn): Self = StObject.set(x, "isFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNumber(value: lodashFn): Self = StObject.set(x, "isNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsObject(value: lodashFn): Self = StObject.set(x, "isObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsString(value: lodashFn): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: lodashFn): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
