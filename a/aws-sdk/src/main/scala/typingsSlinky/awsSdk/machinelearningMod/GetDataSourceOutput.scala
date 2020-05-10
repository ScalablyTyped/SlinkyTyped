package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataSourceOutput extends js.Object {
  /**
    *  The parameter is true if statistics need to be generated from the observation data. 
    */
  var ComputeStatistics: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.ComputeStatistics] = js.native
  /**
    * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the DataSource, normalized and scaled on computation resources. ComputeTime is only available if the DataSource is in the COMPLETED state and the ComputeStatistics is set to true.
    */
  var ComputeTime: js.UndefOr[LongType] = js.native
  /**
    * The time that the DataSource was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The AWS user account from which the DataSource was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.native
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var DataLocationS3: js.UndefOr[S3Url] = js.native
  /**
    * A JSON string that represents the splitting and rearrangement requirement used when this DataSource was created.
    */
  var DataRearrangement: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.DataRearrangement] = js.native
  /**
    * The total size of observations in the data files.
    */
  var DataSizeInBytes: js.UndefOr[LongType] = js.native
  /**
    * The ID assigned to the DataSource at creation. This value should be identical to the value of the DataSourceId in the request.
    */
  var DataSourceId: js.UndefOr[EntityId] = js.native
  /**
    * The schema used by all of the data files of this DataSource. Note This parameter is provided as part of the verbose format.
    */
  var DataSourceSchema: js.UndefOr[DataSchema] = js.native
  /**
    * The epoch time when Amazon Machine Learning marked the DataSource as COMPLETED or FAILED. FinishedAt is only available when the DataSource is in the COMPLETED or FAILED state.
    */
  var FinishedAt: js.UndefOr[js.Date] = js.native
  /**
    * The time of the most recent edit to the DataSource. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * A link to the file containing logs of CreateDataSourceFrom* operations.
    */
  var LogUri: js.UndefOr[PresignedS3Url] = js.native
  /**
    * The user-supplied description of the most recent details about creating the DataSource.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.Message] = js.native
  /**
    * A user-supplied name or description of the DataSource.
    */
  var Name: js.UndefOr[EntityName] = js.native
  /**
    * The number of data files referenced by the DataSource.
    */
  var NumberOfFiles: js.UndefOr[LongType] = js.native
  var RDSMetadata: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.RDSMetadata] = js.native
  var RedshiftMetadata: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.RedshiftMetadata] = js.native
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.RoleARN] = js.native
  /**
    * The epoch time when Amazon Machine Learning marked the DataSource as INPROGRESS. StartedAt isn't available if the DataSource is in the PENDING state.
    */
  var StartedAt: js.UndefOr[js.Date] = js.native
  /**
    * The current status of the DataSource. This element can have one of the following values:   PENDING - Amazon ML submitted a request to create a DataSource.  INPROGRESS - The creation process is underway.  FAILED - The request to create a DataSource did not run to completion. It is not usable.  COMPLETED - The creation process completed successfully.  DELETED - The DataSource is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
}

object GetDataSourceOutput {
  @scala.inline
  def apply(): GetDataSourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataSourceOutput]
  }
  @scala.inline
  implicit class GetDataSourceOutputOps[Self <: GetDataSourceOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeStatistics(value: ComputeStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeStatistics")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeTime(value: LongType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedByIamUser(value: AwsUserArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedByIamUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedByIamUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedByIamUser")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLocationS3(value: S3Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataLocationS3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLocationS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataLocationS3")(js.undefined)
        ret
    }
    @scala.inline
    def withDataRearrangement(value: DataRearrangement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRearrangement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRearrangement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRearrangement")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSizeInBytes(value: LongType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceSchema(value: DataSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withLogUri(value: PresignedS3Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogUri")(js.undefined)
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
    def withName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfFiles(value: LongType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withRDSMetadata(value: RDSMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RDSMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRDSMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RDSMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withRedshiftMetadata(value: RedshiftMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedshiftMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: EntityStatus): Self = {
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

