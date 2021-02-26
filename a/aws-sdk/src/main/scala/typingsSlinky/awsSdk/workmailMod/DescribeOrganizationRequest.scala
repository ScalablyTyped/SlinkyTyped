package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOrganizationRequest extends StObject {
  
  /**
    * The identifier for the organization to be described.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
}
object DescribeOrganizationRequest {
  
  @scala.inline
  def apply(OrganizationId: OrganizationId): DescribeOrganizationRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationRequest]
  }
  
  @scala.inline
  implicit class DescribeOrganizationRequestMutableBuilder[Self <: DescribeOrganizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
