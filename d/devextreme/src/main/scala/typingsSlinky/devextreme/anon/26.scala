package typingsSlinky.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `26` extends StObject {
  
  var value: js.UndefOr[js.Date | Double] = js.native
  
  var valueText: js.UndefOr[String] = js.native
}
object `26` {
  
  @scala.inline
  def apply(): `26` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit class `26MutableBuilder`[Self <: `26`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Date | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDate(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
