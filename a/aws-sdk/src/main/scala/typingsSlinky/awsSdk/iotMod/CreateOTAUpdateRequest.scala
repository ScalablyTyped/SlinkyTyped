package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOTAUpdateRequest extends StObject {
  
  /**
    * A list of additional OTA update parameters which are name-value pairs.
    */
  var additionalParameters: js.UndefOr[AdditionalParameterMap] = js.native
  
  /**
    * The criteria that determine when and how a job abort takes place.
    */
  var awsJobAbortConfig: js.UndefOr[AwsJobAbortConfig] = js.native
  
  /**
    * Configuration for the rollout of OTA updates.
    */
  var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.native
  
  /**
    * Configuration information for pre-signed URLs.
    */
  var awsJobPresignedUrlConfig: js.UndefOr[AwsJobPresignedUrlConfig] = js.native
  
  /**
    * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the timer expires, it will be automatically set to TIMED_OUT.
    */
  var awsJobTimeoutConfig: js.UndefOr[AwsJobTimeoutConfig] = js.native
  
  /**
    * The description of the OTA update.
    */
  var description: js.UndefOr[OTAUpdateDescription] = js.native
  
  /**
    * The files to be streamed by the OTA update.
    */
  var files: OTAUpdateFiles = js.native
  
  /**
    * The ID of the OTA update to be created.
    */
  var otaUpdateId: OTAUpdateId = js.native
  
  /**
    * The protocol used to transfer the OTA update image. Valid values are [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are specified, the target device can choose the protocol.
    */
  var protocols: js.UndefOr[Protocols] = js.native
  
  /**
    * The IAM role that grants AWS IoT access to the Amazon S3, AWS IoT jobs and AWS Code Signing resources to create an OTA update job.
    */
  var roleArn: RoleArn = js.native
  
  /**
    * Metadata which can be used to manage updates.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a thing when a change is detected in a target. For example, an update will run on a thing when the thing is added to a target group, even after the update was completed by all things originally in the group. Valid values: CONTINUOUS | SNAPSHOT.
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.native
  
  /**
    * The devices targeted to receive OTA updates.
    */
  var targets: Targets = js.native
}
object CreateOTAUpdateRequest {
  
  @scala.inline
  def apply(files: OTAUpdateFiles, otaUpdateId: OTAUpdateId, roleArn: RoleArn, targets: Targets): CreateOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], otaUpdateId = otaUpdateId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOTAUpdateRequest]
  }
  
  @scala.inline
  implicit class CreateOTAUpdateRequestMutableBuilder[Self <: CreateOTAUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalParameters(value: AdditionalParameterMap): Self = StObject.set(x, "additionalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalParametersUndefined: Self = StObject.set(x, "additionalParameters", js.undefined)
    
    @scala.inline
    def setAwsJobAbortConfig(value: AwsJobAbortConfig): Self = StObject.set(x, "awsJobAbortConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsJobAbortConfigUndefined: Self = StObject.set(x, "awsJobAbortConfig", js.undefined)
    
    @scala.inline
    def setAwsJobExecutionsRolloutConfig(value: AwsJobExecutionsRolloutConfig): Self = StObject.set(x, "awsJobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsJobExecutionsRolloutConfigUndefined: Self = StObject.set(x, "awsJobExecutionsRolloutConfig", js.undefined)
    
    @scala.inline
    def setAwsJobPresignedUrlConfig(value: AwsJobPresignedUrlConfig): Self = StObject.set(x, "awsJobPresignedUrlConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsJobPresignedUrlConfigUndefined: Self = StObject.set(x, "awsJobPresignedUrlConfig", js.undefined)
    
    @scala.inline
    def setAwsJobTimeoutConfig(value: AwsJobTimeoutConfig): Self = StObject.set(x, "awsJobTimeoutConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsJobTimeoutConfigUndefined: Self = StObject.set(x, "awsJobTimeoutConfig", js.undefined)
    
    @scala.inline
    def setDescription(value: OTAUpdateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFiles(value: OTAUpdateFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: OTAUpdateFile*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocols(value: Protocols): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTargetSelection(value: TargetSelection): Self = StObject.set(x, "targetSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSelectionUndefined: Self = StObject.set(x, "targetSelection", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
