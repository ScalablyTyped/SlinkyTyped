package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phase2DHGroupNumbersRequestListValue extends StObject {
  
  /**
    * The Diffie-Hellmann group number.
    */
  var Value: js.UndefOr[Integer] = js.native
}
object Phase2DHGroupNumbersRequestListValue {
  
  @scala.inline
  def apply(): Phase2DHGroupNumbersRequestListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase2DHGroupNumbersRequestListValue]
  }
  
  @scala.inline
  implicit class Phase2DHGroupNumbersRequestListValueMutableBuilder[Self <: Phase2DHGroupNumbersRequestListValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Integer): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
