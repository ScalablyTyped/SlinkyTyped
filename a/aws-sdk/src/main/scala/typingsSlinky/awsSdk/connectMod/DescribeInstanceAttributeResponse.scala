package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceAttributeResponse extends StObject {
  
  /**
    * The type of attribute.
    */
  var Attribute: js.UndefOr[typingsSlinky.awsSdk.connectMod.Attribute] = js.native
}
object DescribeInstanceAttributeResponse {
  
  @scala.inline
  def apply(): DescribeInstanceAttributeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceAttributeResponse]
  }
  
  @scala.inline
  implicit class DescribeInstanceAttributeResponseMutableBuilder[Self <: DescribeInstanceAttributeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: Attribute): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
  }
}
