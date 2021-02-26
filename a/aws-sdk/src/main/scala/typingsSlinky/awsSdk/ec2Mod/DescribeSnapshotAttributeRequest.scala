package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSnapshotAttributeRequest extends StObject {
  
  /**
    * The snapshot attribute you would like to view.
    */
  var Attribute: SnapshotAttributeName = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the EBS snapshot.
    */
  var SnapshotId: typingsSlinky.awsSdk.ec2Mod.SnapshotId = js.native
}
object DescribeSnapshotAttributeRequest {
  
  @scala.inline
  def apply(Attribute: SnapshotAttributeName, SnapshotId: SnapshotId): DescribeSnapshotAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSnapshotAttributeRequest]
  }
  
  @scala.inline
  implicit class DescribeSnapshotAttributeRequestMutableBuilder[Self <: DescribeSnapshotAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: SnapshotAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
