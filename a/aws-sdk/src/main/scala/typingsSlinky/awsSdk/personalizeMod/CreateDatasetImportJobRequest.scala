package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetImportJobRequest extends js.Object {
  /**
    * The Amazon S3 bucket that contains the training data to import.
    */
  var dataSource: DataSource = js.native
  /**
    * The ARN of the dataset that receives the imported data.
    */
  var datasetArn: Arn = js.native
  /**
    * The name for the dataset import job.
    */
  var jobName: Name = js.native
  /**
    * The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
    */
  var roleArn: RoleArn = js.native
}

object CreateDatasetImportJobRequest {
  @scala.inline
  def apply(dataSource: DataSource, datasetArn: Arn, jobName: Name, roleArn: RoleArn): CreateDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], datasetArn = datasetArn.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetImportJobRequest]
  }
  @scala.inline
  implicit class CreateDatasetImportJobRequestOps[Self <: CreateDatasetImportJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasetArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

