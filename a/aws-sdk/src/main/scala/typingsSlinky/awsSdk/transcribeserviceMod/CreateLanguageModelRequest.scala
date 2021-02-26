package typingsSlinky.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLanguageModelRequest extends StObject {
  
  /**
    * The Amazon Transcribe standard language model, or base model used to create your custom language model. If you want to use your custom language model to transcribe audio with a sample rate of 16 kHz or greater, choose Wideband. If you want to use your custom language model to transcribe audio with a sample rate that is less than 16 kHz, choose Narrowband.
    */
  var BaseModelName: typingsSlinky.awsSdk.transcribeserviceMod.BaseModelName = js.native
  
  /**
    * Contains the data access role and the Amazon S3 prefixes to read the required input files to create a custom language model.
    */
  var InputDataConfig: typingsSlinky.awsSdk.transcribeserviceMod.InputDataConfig = js.native
  
  /**
    * The language of the input text you're using to train your custom language model.
    */
  var LanguageCode: CLMLanguageCode = js.native
  
  /**
    * The name you choose for your custom language model when you create it.
    */
  var ModelName: typingsSlinky.awsSdk.transcribeserviceMod.ModelName = js.native
}
object CreateLanguageModelRequest {
  
  @scala.inline
  def apply(
    BaseModelName: BaseModelName,
    InputDataConfig: InputDataConfig,
    LanguageCode: CLMLanguageCode,
    ModelName: ModelName
  ): CreateLanguageModelRequest = {
    val __obj = js.Dynamic.literal(BaseModelName = BaseModelName.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLanguageModelRequest]
  }
  
  @scala.inline
  implicit class CreateLanguageModelRequestMutableBuilder[Self <: CreateLanguageModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseModelName(value: BaseModelName): Self = StObject.set(x, "BaseModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCode(value: CLMLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
  }
}
