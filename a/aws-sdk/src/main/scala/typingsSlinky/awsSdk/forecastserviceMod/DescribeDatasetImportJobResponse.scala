package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetImportJobResponse extends js.Object {
  /**
    * When the dataset import job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The size of the dataset in gigabytes (GB) after the import job has finished.
    */
  var DataSize: js.UndefOr[Double] = js.native
  /**
    * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data. If encryption is used, DataSource includes an AWS Key Management Service (KMS) key.
    */
  var DataSource: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.DataSource] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
    */
  var DatasetArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the dataset import job.
    */
  var DatasetImportJobArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the dataset import job.
    */
  var DatasetImportJobName: js.UndefOr[Name] = js.native
  /**
    * Statistical information about each field in the input data.
    */
  var FieldStatistics: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.FieldStatistics] = js.native
  /**
    * The last time that the dataset was modified. The time depends on the status of the job, as follows:    CREATE_PENDING - The same time as CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.native
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Message] = js.native
  /**
    * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the import job status is CREATE_IN_PROGRESS, the status of the dataset is UPDATE_IN_PROGRESS. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Status] = js.native
  /**
    * The format of timestamps in the dataset. The format that you specify depends on the DataFrequency specified when the dataset was created. The following formats are supported   "yyyy-MM-dd" For the following data frequencies: Y, M, W, and D   "yyyy-MM-dd HH:mm:ss" For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D  
    */
  var TimestampFormat: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.TimestampFormat] = js.native
}

object DescribeDatasetImportJobResponse {
  @scala.inline
  def apply(): DescribeDatasetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetImportJobResponse]
  }
  @scala.inline
  implicit class DescribeDatasetImportJobResponseOps[Self <: DescribeDatasetImportJobResponse] (val x: Self) extends AnyVal {
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
    def withDataSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(js.undefined)
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
    def withDatasetImportJobArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetImportJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetImportJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetImportJobArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetImportJobName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetImportJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetImportJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetImportJobName")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldStatistics(value: FieldStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldStatistics")(js.undefined)
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
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
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
    @scala.inline
    def withTimestampFormat(value: TimestampFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimestampFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimestampFormat")(js.undefined)
        ret
    }
  }
  
}

