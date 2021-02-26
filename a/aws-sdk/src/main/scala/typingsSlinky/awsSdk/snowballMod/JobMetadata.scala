package typingsSlinky.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobMetadata extends StObject {
  
  /**
    * The ID for the address that you want the Snow device shipped to.
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
    * A value that defines the real-time status of a Snow device's data transfer while the device is at AWS. This data is only available while a job has a JobState value of InProgress, for both import and export jobs.
    */
  var DataTransferProgress: js.UndefOr[DataTransfer] = js.native
  
  /**
    * The description of the job, provided at job creation.
    */
  var Description: js.UndefOr[String] = js.native
  
  var DeviceConfiguration: js.UndefOr[typingsSlinky.awsSdk.snowballMod.DeviceConfiguration] = js.native
  
  /**
    * The ID of the address that you want a job shipped to, after it will be shipped to its primary address. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  
  /**
    * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: js.UndefOr[String] = js.native
  
  /**
    * Links to Amazon S3 presigned URLs for the job report and logs. For import jobs, the PDF job report becomes available at the end of the import process. For export jobs, your job report typically becomes available while the Snow device for your job part is being delivered to you.
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
    * The Snow device capacity preference for this job, specified at job creation. In US regions, you can choose between 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
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
  implicit class JobMetadataMutableBuilder[Self <: JobMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressId(value: AddressId): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressIdUndefined: Self = StObject.set(x, "AddressId", js.undefined)
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDataTransferProgress(value: DataTransfer): Self = StObject.set(x, "DataTransferProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransferProgressUndefined: Self = StObject.set(x, "DataTransferProgress", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDeviceConfiguration(value: DeviceConfiguration): Self = StObject.set(x, "DeviceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceConfigurationUndefined: Self = StObject.set(x, "DeviceConfiguration", js.undefined)
    
    @scala.inline
    def setForwardingAddressId(value: AddressId): Self = StObject.set(x, "ForwardingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingAddressIdUndefined: Self = StObject.set(x, "ForwardingAddressId", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobLogInfo(value: JobLogs): Self = StObject.set(x, "JobLogInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobLogInfoUndefined: Self = StObject.set(x, "JobLogInfo", js.undefined)
    
    @scala.inline
    def setJobState(value: JobState): Self = StObject.set(x, "JobState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStateUndefined: Self = StObject.set(x, "JobState", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    @scala.inline
    def setKmsKeyARN(value: KmsKeyARN): Self = StObject.set(x, "KmsKeyARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyARNUndefined: Self = StObject.set(x, "KmsKeyARN", js.undefined)
    
    @scala.inline
    def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
    
    @scala.inline
    def setResources(value: JobResource): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    @scala.inline
    def setShippingDetails(value: ShippingDetails): Self = StObject.set(x, "ShippingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingDetailsUndefined: Self = StObject.set(x, "ShippingDetails", js.undefined)
    
    @scala.inline
    def setSnowballCapacityPreference(value: SnowballCapacity): Self = StObject.set(x, "SnowballCapacityPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballCapacityPreferenceUndefined: Self = StObject.set(x, "SnowballCapacityPreference", js.undefined)
    
    @scala.inline
    def setSnowballType(value: SnowballType): Self = StObject.set(x, "SnowballType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballTypeUndefined: Self = StObject.set(x, "SnowballType", js.undefined)
    
    @scala.inline
    def setTaxDocuments(value: TaxDocuments): Self = StObject.set(x, "TaxDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxDocumentsUndefined: Self = StObject.set(x, "TaxDocuments", js.undefined)
  }
}
