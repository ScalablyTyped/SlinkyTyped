package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDataSetPermissionsResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DataSetArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ID for the dataset whose permissions you want to update. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object UpdateDataSetPermissionsResponse {
  
  @scala.inline
  def apply(): UpdateDataSetPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDataSetPermissionsResponse]
  }
  
  @scala.inline
  implicit class UpdateDataSetPermissionsResponseOps[Self <: UpdateDataSetPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSetArn(value: Arn): Self = this.set("DataSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSetArn: Self = this.set("DataSetArn", js.undefined)
    
    @scala.inline
    def setDataSetId(value: ResourceId): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSetId: Self = this.set("DataSetId", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
