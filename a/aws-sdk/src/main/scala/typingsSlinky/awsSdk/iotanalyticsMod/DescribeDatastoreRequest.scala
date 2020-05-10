package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatastoreRequest extends js.Object {
  /**
    * The name of the data store
    */
  var datastoreName: DatastoreName = js.native
  /**
    * If true, additional statistical information about the data store is included in the response. This feature cannot be used with a data store whose S3 storage is customer-managed.
    */
  var includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.native
}

object DescribeDatastoreRequest {
  @scala.inline
  def apply(datastoreName: DatastoreName): DescribeDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatastoreRequest]
  }
  @scala.inline
  implicit class DescribeDatastoreRequestOps[Self <: DescribeDatastoreRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatastoreName(value: DatastoreName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeStatistics(value: IncludeStatisticsFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeStatistics")(js.undefined)
        ret
    }
  }
  
}

