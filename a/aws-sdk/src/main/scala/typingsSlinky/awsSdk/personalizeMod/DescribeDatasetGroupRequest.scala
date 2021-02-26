package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatasetGroupRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group to describe.
    */
  var datasetGroupArn: Arn = js.native
}
object DescribeDatasetGroupRequest {
  
  @scala.inline
  def apply(datasetGroupArn: Arn): DescribeDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetGroupRequest]
  }
  
  @scala.inline
  implicit class DescribeDatasetGroupRequestMutableBuilder[Self <: DescribeDatasetGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
  }
}
