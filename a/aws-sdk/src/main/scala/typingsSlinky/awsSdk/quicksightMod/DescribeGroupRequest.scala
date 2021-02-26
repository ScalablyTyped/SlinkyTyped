package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGroupRequest extends StObject {
  
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The name of the group that you want to describe.
    */
  var GroupName: typingsSlinky.awsSdk.quicksightMod.GroupName = js.native
  
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typingsSlinky.awsSdk.quicksightMod.Namespace = js.native
}
object DescribeGroupRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, GroupName: GroupName, Namespace: Namespace): DescribeGroupRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupRequest]
  }
  
  @scala.inline
  implicit class DescribeGroupRequestMutableBuilder[Self <: DescribeGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
