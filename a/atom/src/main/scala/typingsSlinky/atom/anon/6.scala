package typingsSlinky.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `6` extends StObject {
  
  var newValue: String | Double = js.native
  
  var oldValue: js.UndefOr[String | Double] = js.native
}
object `6` {
  
  @scala.inline
  def apply(newValue: String | Double): `6` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: String | Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: String | Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
