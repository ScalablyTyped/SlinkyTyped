package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAuditSuppressionRequest extends StObject {
  
  var checkName: AuditCheckName = js.native
  
  var resourceIdentifier: ResourceIdentifier = js.native
}
object DescribeAuditSuppressionRequest {
  
  @scala.inline
  def apply(checkName: AuditCheckName, resourceIdentifier: ResourceIdentifier): DescribeAuditSuppressionRequest = {
    val __obj = js.Dynamic.literal(checkName = checkName.asInstanceOf[js.Any], resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditSuppressionRequest]
  }
  
  @scala.inline
  implicit class DescribeAuditSuppressionRequestMutableBuilder[Self <: DescribeAuditSuppressionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckName(value: AuditCheckName): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
  }
}
