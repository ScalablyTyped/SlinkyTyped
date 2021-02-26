package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMailboxExportJobRequest extends StObject {
  
  /**
    * The mailbox export job ID.
    */
  var JobId: MailboxExportJobId = js.native
  
  /**
    * The organization ID.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
}
object DescribeMailboxExportJobRequest {
  
  @scala.inline
  def apply(JobId: MailboxExportJobId, OrganizationId: OrganizationId): DescribeMailboxExportJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMailboxExportJobRequest]
  }
  
  @scala.inline
  implicit class DescribeMailboxExportJobRequestMutableBuilder[Self <: DescribeMailboxExportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: MailboxExportJobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
