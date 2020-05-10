package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetGroupSummary extends js.Object {
  /**
    * When the dataset group was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the dataset group.
    */
  var DatasetGroupName: js.UndefOr[Name] = js.native
  /**
    * When the dataset group was created or last updated from a call to the UpdateDatasetGroup operation. While the dataset group is being updated, LastModificationTime is the current time of the ListDatasetGroups call.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.native
}

object DatasetGroupSummary {
  @scala.inline
  def apply(): DatasetGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetGroupSummary]
  }
  @scala.inline
  implicit class DatasetGroupSummaryOps[Self <: DatasetGroupSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetGroupArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetGroupName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModificationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModificationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModificationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModificationTime")(js.undefined)
        ret
    }
  }
  
}

