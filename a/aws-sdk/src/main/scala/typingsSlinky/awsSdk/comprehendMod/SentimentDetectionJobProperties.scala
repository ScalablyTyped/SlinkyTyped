package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SentimentDetectionJobProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that gives Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.native
  
  /**
    * The time that the sentiment detection job ended.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The input data configuration that you supplied when you created the sentiment detection job.
    */
  var InputDataConfig: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.InputDataConfig] = js.native
  
  /**
    * The identifier assigned to the sentiment detection job.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.JobId] = js.native
  
  /**
    * The name that you assigned to the sentiment detection job
    */
  var JobName: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.JobName] = js.native
  
  /**
    * The current status of the sentiment detection job. If the status is FAILED, the Messages field shows the reason for the failure.
    */
  var JobStatus: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.JobStatus] = js.native
  
  /**
    * The language code of the input documents.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.LanguageCode] = js.native
  
  /**
    * A description of the status of a job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.native
  
  /**
    * The output data configuration that you supplied when you created the sentiment detection job.
    */
  var OutputDataConfig: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.OutputDataConfig] = js.native
  
  /**
    * The time that the sentiment detection job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.native
  
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  
  /**
    *  Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your sentiment detection job. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.VpcConfig] = js.native
}
object SentimentDetectionJobProperties {
  
  @scala.inline
  def apply(): SentimentDetectionJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentDetectionJobProperties]
  }
  
  @scala.inline
  implicit class SentimentDetectionJobPropertiesMutableBuilder[Self <: SentimentDetectionJobProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    @scala.inline
    def setSubmitTime(value: js.Date): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
    
    @scala.inline
    def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
