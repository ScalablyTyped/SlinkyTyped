package typingsSlinky.atom.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var newValue: StringDictionary[js.Array[String]] = js.native
  
  var oldValue: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}
object `0` {
  
  @scala.inline
  def apply(newValue: StringDictionary[js.Array[String]]): `0` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
