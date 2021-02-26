package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOrganizationConfigurationRequest extends StObject {
  
  /**
    * The ID of the detector to retrieve information about the delegated administrator from.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
}
object DescribeOrganizationConfigurationRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId): DescribeOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigurationRequest]
  }
  
  @scala.inline
  implicit class DescribeOrganizationConfigurationRequestMutableBuilder[Self <: DescribeOrganizationConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
