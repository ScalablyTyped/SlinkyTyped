package typingsSlinky.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelValue extends StObject {
  
  var label: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String | Double] = js.native
}
object LabelValue {
  
  @scala.inline
  def apply(): LabelValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelValue]
  }
  
  @scala.inline
  implicit class LabelValueMutableBuilder[Self <: LabelValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
