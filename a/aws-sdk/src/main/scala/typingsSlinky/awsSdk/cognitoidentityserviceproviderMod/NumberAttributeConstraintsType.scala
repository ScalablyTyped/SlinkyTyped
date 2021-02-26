package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberAttributeConstraintsType extends StObject {
  
  /**
    * The maximum value of an attribute that is of the number data type.
    */
  var MaxValue: js.UndefOr[StringType] = js.native
  
  /**
    * The minimum value of an attribute that is of the number data type.
    */
  var MinValue: js.UndefOr[StringType] = js.native
}
object NumberAttributeConstraintsType {
  
  @scala.inline
  def apply(): NumberAttributeConstraintsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberAttributeConstraintsType]
  }
  
  @scala.inline
  implicit class NumberAttributeConstraintsTypeMutableBuilder[Self <: NumberAttributeConstraintsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxValue(value: StringType): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "MaxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: StringType): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "MinValue", js.undefined)
  }
}
