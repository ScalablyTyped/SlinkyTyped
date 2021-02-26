package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartPiiEntitiesDetectionJobRequest extends StObject {
  
  /**
    * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: IamRoleArn = js.native
  
  /**
    * The input properties for a PII entities detection job.
    */
  var InputDataConfig: typingsSlinky.awsSdk.comprehendMod.InputDataConfig = js.native
  
  /**
    * The identifier of the job.
    */
  var JobName: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.JobName] = js.native
  
  /**
    * The language of the input documents.
    */
  var LanguageCode: typingsSlinky.awsSdk.comprehendMod.LanguageCode = js.native
  
  /**
    * Specifies whether the output provides the locations (offsets) of PII entities or a file in which PII entities are redacted.
    */
  var Mode: PiiEntitiesDetectionMode = js.native
  
  /**
    * Provides conﬁguration parameters for the output of PII entity detection jobs.
    */
  var OutputDataConfig: typingsSlinky.awsSdk.comprehendMod.OutputDataConfig = js.native
  
  /**
    * Provides configuration parameters for PII entity redaction. This parameter is required if you set the Mode parameter to ONLY_REDACTION. In that case, you must provide a RedactionConfig definition that includes the PiiEntityTypes parameter.
    */
  var RedactionConfig: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.RedactionConfig] = js.native
}
object StartPiiEntitiesDetectionJobRequest {
  
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn,
    InputDataConfig: InputDataConfig,
    LanguageCode: LanguageCode,
    Mode: PiiEntitiesDetectionMode,
    OutputDataConfig: OutputDataConfig
  ): StartPiiEntitiesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPiiEntitiesDetectionJobRequest]
  }
  
  @scala.inline
  implicit class StartPiiEntitiesDetectionJobRequestMutableBuilder[Self <: StartPiiEntitiesDetectionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: PiiEntitiesDetectionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactionConfig(value: RedactionConfig): Self = StObject.set(x, "RedactionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactionConfigUndefined: Self = StObject.set(x, "RedactionConfig", js.undefined)
  }
}
