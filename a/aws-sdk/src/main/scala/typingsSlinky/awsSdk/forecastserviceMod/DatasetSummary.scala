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
  def apply(
    CreationTime: js.Date = null,
    DatasetArn: Arn = null,
    DatasetName: Name = null,
    DatasetType: DatasetType = null,
    Domain: Domain = null,
    LastModificationTime: js.Date = null
  ): DatasetSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DatasetArn != null) __obj.updateDynamic("DatasetArn")(DatasetArn.asInstanceOf[js.Any])
    if (DatasetName != null) __obj.updateDynamic("DatasetName")(DatasetName.asInstanceOf[js.Any])
    if (DatasetType != null) __obj.updateDynamic("DatasetType")(DatasetType.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetSummary]
  }
}

