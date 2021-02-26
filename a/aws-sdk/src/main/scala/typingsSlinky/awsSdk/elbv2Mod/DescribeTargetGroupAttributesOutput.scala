package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTargetGroupAttributesOutput extends StObject {
  
  /**
    * Information about the target group attributes
    */
  var Attributes: js.UndefOr[TargetGroupAttributes] = js.native
}
object DescribeTargetGroupAttributesOutput {
  
  @scala.inline
  def apply(): DescribeTargetGroupAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTargetGroupAttributesOutput]
  }
  
  @scala.inline
  implicit class DescribeTargetGroupAttributesOutputMutableBuilder[Self <: DescribeTargetGroupAttributesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: TargetGroupAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: TargetGroupAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
  }
}
