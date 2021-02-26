package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatasetGroupResponse extends StObject {
  
  /**
    * When the dataset group was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
    */
  var DatasetArns: js.UndefOr[ArnList] = js.native
  
  /**
    * The ARN of the dataset group.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the dataset group.
    */
  var DatasetGroupName: js.UndefOr[Name] = js.native
  
  /**
    * The domain associated with the dataset group.
    */
  var Domain: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Domain] = js.native
  
  /**
    * When the dataset group was created or last updated from a call to the UpdateDatasetGroup operation. While the dataset group is being updated, LastModificationTime is the current time of the DescribeDatasetGroup call.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The status of the dataset group. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED    The UPDATE states apply when you call the UpdateDatasetGroup operation.  The Status of the dataset group must be ACTIVE before you can use the dataset group to create a predictor. 
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Status] = js.native
}
object DescribeDatasetGroupResponse {
  
  @scala.inline
  def apply(): DescribeDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeDatasetGroupResponseMutableBuilder[Self <: DescribeDatasetGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDatasetArns(value: ArnList): Self = StObject.set(x, "DatasetArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetArnsUndefined: Self = StObject.set(x, "DatasetArns", js.undefined)
    
    @scala.inline
    def setDatasetArnsVarargs(value: Arn*): Self = StObject.set(x, "DatasetArns", js.Array(value :_*))
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "DatasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetGroupArnUndefined: Self = StObject.set(x, "DatasetGroupArn", js.undefined)
    
    @scala.inline
    def setDatasetGroupName(value: Name): Self = StObject.set(x, "DatasetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetGroupNameUndefined: Self = StObject.set(x, "DatasetGroupName", js.undefined)
    
    @scala.inline
    def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
