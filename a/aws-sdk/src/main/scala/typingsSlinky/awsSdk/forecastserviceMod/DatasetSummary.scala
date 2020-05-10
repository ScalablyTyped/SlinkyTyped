package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetSummary extends js.Object {
  /**
    * When the dataset was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the dataset.
    */
  var DatasetName: js.UndefOr[Name] = js.native
  /**
    * The dataset type.
    */
  var DatasetType: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.DatasetType] = js.native
  /**
    * The domain associated with the dataset.
    */
  var Domain: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Domain] = js.native
  /**
    * When you create a dataset, LastModificationTime is the same as CreationTime. While data is being imported to the dataset, LastModificationTime is the current time of the ListDatasets call. After a CreateDatasetImportJob operation has finished, LastModificationTime is when the import job completed or failed.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.native
}

object DatasetSummary {
  @scala.inline
  def apply(): DatasetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetSummary]
  }
  @scala.inline
  implicit class DatasetSummaryOps[Self <: DatasetSummary] (val x: Self) extends AnyVal {
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
    def withDatasetArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetName")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetType(value: DatasetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetType")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: Domain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(js.undefined)
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

