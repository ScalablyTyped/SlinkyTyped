package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNamespaceRequest extends StObject {
  
  /**
    * The ID for the AWS account that contains the QuickSight namespace that you want to describe.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The namespace that you want to describe.
    */
  var Namespace: typingsSlinky.awsSdk.quicksightMod.Namespace = js.native
}
object DescribeNamespaceRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, Namespace: Namespace): DescribeNamespaceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNamespaceRequest]
  }
  
  @scala.inline
  implicit class DescribeNamespaceRequestMutableBuilder[Self <: DescribeNamespaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
