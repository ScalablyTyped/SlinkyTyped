package typingsSlinky.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProfileJobRequest extends js.Object {
  
  /**
    * The name of the dataset that this job is to act upon.
    */
  var DatasetName: typingsSlinky.awsSdk.databrewMod.DatasetName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
    */
  var EncryptionKeyArn: js.UndefOr[typingsSlinky.awsSdk.databrewMod.EncryptionKeyArn] = js.native
  
  /**
    * The encryption mode for the job, which can be one of the following:    SSE-KMS - para&gt;SSE-KMS - server-side encryption with AWS KMS-managed keys.    SSE-S3 - Server-side encryption with keys managed by Amazon S3.  
    */
  var EncryptionMode: js.UndefOr[typingsSlinky.awsSdk.databrewMod.EncryptionMode] = js.native
  
  /**
    * A value that enables or disables Amazon CloudWatch logging for the current AWS account. If logging is enabled, CloudWatch writes one log stream for each job run.
    */
  var LogSubscription: js.UndefOr[typingsSlinky.awsSdk.databrewMod.LogSubscription] = js.native
  
  /**
    * The maximum number of nodes that DataBrew can use when the job processes data.
    */
  var MaxCapacity: js.UndefOr[typingsSlinky.awsSdk.databrewMod.MaxCapacity] = js.native
  
  /**
    * The maximum number of times to retry the job after a job run fails.
    */
  var MaxRetries: js.UndefOr[typingsSlinky.awsSdk.databrewMod.MaxRetries] = js.native
  
  /**
    * The name of the job to be created.
    */
  var Name: JobName = js.native
  
  var OutputLocation: S3Location = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role to be assumed for this request.
    */
  var RoleArn: Arn = js.native
  
  /**
    * Metadata tags to apply to this job.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of TIMEOUT.
    */
  var Timeout: js.UndefOr[typingsSlinky.awsSdk.databrewMod.Timeout] = js.native
}
object CreateProfileJobRequest {
  
  @scala.inline
  def apply(DatasetName: DatasetName, Name: JobName, OutputLocation: S3Location, RoleArn: Arn): CreateProfileJobRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutputLocation = OutputLocation.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileJobRequest]
  }
  
  @scala.inline
  implicit class CreateProfileJobRequestOps[Self <: CreateProfileJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = this.set("DatasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: JobName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocation(value: S3Location): Self = this.set("OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Arn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyArn(value: EncryptionKeyArn): Self = this.set("EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKeyArn: Self = this.set("EncryptionKeyArn", js.undefined)
    
    @scala.inline
    def setEncryptionMode(value: EncryptionMode): Self = this.set("EncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionMode: Self = this.set("EncryptionMode", js.undefined)
    
    @scala.inline
    def setLogSubscription(value: LogSubscription): Self = this.set("LogSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogSubscription: Self = this.set("LogSubscription", js.undefined)
    
    @scala.inline
    def setMaxCapacity(value: MaxCapacity): Self = this.set("MaxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCapacity: Self = this.set("MaxCapacity", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: MaxRetries): Self = this.set("MaxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("MaxRetries", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: Timeout): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("Timeout", js.undefined)
  }
}
