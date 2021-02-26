package typingsSlinky.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColsValue extends StObject {
  
  var cols: js.Array[_] = js.native
  
  var value: js.Array[_] = js.native
}
object ColsValue {
  
  @scala.inline
  def apply(cols: js.Array[_], value: js.Array[_]): ColsValue = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColsValue]
  }
  
  @scala.inline
  implicit class ColsValueMutableBuilder[Self <: ColsValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCols(value: js.Array[_]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsVarargs(value: js.Any*): Self = StObject.set(x, "cols", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
