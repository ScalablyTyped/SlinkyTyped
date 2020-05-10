package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDataSourceRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID of the data source. This ID is unique per AWS Region for each AWS account.
    */
  var DataSourceId: ResourceId = js.native
}

object DeleteDataSourceRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSourceId: ResourceId): DeleteDataSourceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSourceId = DataSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataSourceRequest]
  }
  @scala.inline
  implicit class DeleteDataSourceRequestOps[Self <: DeleteDataSourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccountId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSourceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

