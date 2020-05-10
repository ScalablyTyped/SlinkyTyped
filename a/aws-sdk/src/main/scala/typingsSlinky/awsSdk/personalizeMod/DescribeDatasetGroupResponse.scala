package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetGroupResponse extends js.Object {
  /**
    * A listing of the dataset group's properties.
    */
  var datasetGroup: js.UndefOr[DatasetGroup] = js.native
}

object DescribeDatasetGroupResponse {
  @scala.inline
  def apply(): DescribeDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetGroupResponse]
  }
  @scala.inline
  implicit class DescribeDatasetGroupResponseOps[Self <: DescribeDatasetGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetGroup(value: DatasetGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetGroup")(js.undefined)
        ret
    }
  }
  
}

