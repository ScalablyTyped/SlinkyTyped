package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetResponse extends js.Object {
  /**
    * When the dataset was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The frequency of data collection. Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "M" indicates every month and "30min" indicates every 30 minutes.
    */
  var DataFrequency: js.UndefOr[Frequency] = js.native
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
    * The AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key.
    */
  var EncryptionConfig: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.EncryptionConfig] = js.native
  /**
    * When you create a dataset, LastModificationTime is the same as CreationTime. While data is being imported to the dataset, LastModificationTime is the current time of the DescribeDataset call. After a CreateDatasetImportJob operation has finished, LastModificationTime is when the import job completed or failed.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.native
  /**
    * An array of SchemaAttribute objects that specify the dataset fields. Each SchemaAttribute specifies the name and data type of a field.
    */
  var Schema: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Schema] = js.native
  /**
    * The status of the dataset. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED    The UPDATE states apply while data is imported to the dataset from a call to the CreateDatasetImportJob operation and reflect the status of the dataset import job. For example, when the import job status is CREATE_IN_PROGRESS, the status of the dataset is UPDATE_IN_PROGRESS.  The Status of the dataset must be ACTIVE before you can import training data. 
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Status] = js.native
}

object DescribeDatasetResponse {
  @scala.inline
  def apply(): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
  @scala.inline
  implicit class DescribeDatasetResponseOps[Self <: DescribeDatasetResponse] (val x: Self) extends AnyVal {
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
    def withDataFrequency(value: Frequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFrequency")(js.undefined)
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
    def withEncryptionConfig(value: EncryptionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionConfig")(js.undefined)
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
    @scala.inline
    def withSchema(value: Schema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schema")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

