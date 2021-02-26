package typingsSlinky.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScalingParametersRequest extends StObject {
  
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
}
object DescribeScalingParametersRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DescribeScalingParametersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingParametersRequest]
  }
  
  @scala.inline
  implicit class DescribeScalingParametersRequestMutableBuilder[Self <: DescribeScalingParametersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
