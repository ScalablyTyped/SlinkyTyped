package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobMetadata extends js.Object {
  /**
    * The ID for the address that you want the Snowball shipped to.
    */
  var AddressId: js.UndefOr[typingsSlinky.awsSdk.snowballMod.AddressId] = js.native
  /**
    * The 39-character ID for the cluster, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: js.UndefOr[String] = js.native
  /**
    * The creation date for this job.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * A value that defines the real-time status of a Snowball's data transfer while the device is at AWS. This data is only available while a job has a JobState value of InProgress, for both import and export jobs.
    */
  var DataTransferProgress: js.UndefOr[DataTransfer] = js.native
  /**
    * The description of the job, provided at job creation.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the address that you want a job shipped to, after it will be shipped to its primary address. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  /**
    * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: js.UndefOr[String] = js.native
  /**
    * Links to Amazon S3 presigned URLs for the job report and logs. For import jobs, the PDF job report becomes available at the end of the import process. For export jobs, your job report typically becomes available while the Snowball for your job part is being delivered to you.
    */
  var JobLogInfo: js.UndefOr[JobLogs] = js.native
  /**
    * The current status of the jobs.
    */
  var JobState: js.UndefOr[typingsSlinky.awsSdk.snowballMod.JobState] = js.native
  /**
    * The type of job.
    */
  var JobType: js.UndefOr[typingsSlinky.awsSdk.snowballMod.JobType] = js.native
  /**
    * The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS KMS) key associated with this job. This ARN was created using the CreateKey API action in AWS KMS.
    */
  var KmsKeyARN: js.UndefOr[typingsSlinky.awsSdk.snowballMod.KmsKeyARN] = js.native
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The Notification object is returned as a part of the response syntax of the DescribeJob action in the JobMetadata data type.
    */
  var Notification: js.UndefOr[typingsSlinky.awsSdk.snowballMod.Notification] = js.native
  /**
    * An array of S3Resource objects. Each S3Resource object represents an Amazon S3 bucket that your transferred data will be exported from or imported into.
    */
  var Resources: js.UndefOr[JobResource] = js.native
  /**
    * The role ARN associated with this job. This ARN was created using the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.snowballMod.RoleARN] = js.native
  /**
    * A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
    */
  var ShippingDetails: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ShippingDetails] = js.native
  /**
    * The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose between 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
    */
  var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.native
  /**
    * The type of device used with this job.
    */
  var SnowballType: js.UndefOr[typingsSlinky.awsSdk.snowballMod.SnowballType] = js.native
  /**
    * The metadata associated with the tax documents required in your AWS Region.
    */
  var TaxDocuments: js.UndefOr[typingsSlinky.awsSdk.snowballMod.TaxDocuments] = js.native
}

object JobMetadata {
  @scala.inline
  def apply(): JobMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMetadata]
  }
  @scala.inline
  implicit class JobMetadataOps[Self <: JobMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressId(value: AddressId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressId")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTransferProgress(value: DataTransfer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransferProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTransferProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransferProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardingAddressId(value: AddressId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardingAddressId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardingAddressId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardingAddressId")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(js.undefined)
        ret
    }
    @scala.inline
    def withJobLogInfo(value: JobLogs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobLogInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobLogInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobLogInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withJobState(value: JobState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobState")(js.undefined)
        ret
    }
    @scala.inline
    def withJobType(value: JobType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobType")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyARN(value: KmsKeyARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyARN")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: JobResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(js.undefined)
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
    def withShippingDetails(value: ShippingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSnowballCapacityPreference(value: SnowballCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballCapacityPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnowballCapacityPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballCapacityPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withSnowballType(value: SnowballType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnowballType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballType")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxDocuments(value: TaxDocuments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaxDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaxDocuments")(js.undefined)
        ret
    }
  }
  
}

