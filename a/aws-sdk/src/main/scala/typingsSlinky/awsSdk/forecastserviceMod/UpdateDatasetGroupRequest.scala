package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDatasetGroupRequest extends js.Object {
  /**
    * An array of the Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
    */
  var DatasetArns: ArnList = js.native
  /**
    * The ARN of the dataset group.
    */
  var DatasetGroupArn: Arn = js.native
}

object UpdateDatasetGroupRequest {
  @scala.inline
  def apply(DatasetArns: ArnList, DatasetGroupArn: Arn): UpdateDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetArns = DatasetArns.asInstanceOf[js.Any], DatasetGroupArn = DatasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetGroupRequest]
  }
  @scala.inline
  implicit class UpdateDatasetGroupRequestOps[Self <: UpdateDatasetGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetArns(value: ArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasetGroupArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

