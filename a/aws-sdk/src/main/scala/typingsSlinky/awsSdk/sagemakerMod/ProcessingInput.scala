package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessingInput extends StObject {
  
  /**
    * The name of the inputs for the processing job.
    */
  var InputName: String = js.native
  
  /**
    * The S3 inputs for the processing job. 
    */
  var S3Input: ProcessingS3Input = js.native
}
object ProcessingInput {
  
  @scala.inline
  def apply(InputName: String, S3Input: ProcessingS3Input): ProcessingInput = {
    val __obj = js.Dynamic.literal(InputName = InputName.asInstanceOf[js.Any], S3Input = S3Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingInput]
  }
  
  @scala.inline
  implicit class ProcessingInputMutableBuilder[Self <: ProcessingInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputName(value: String): Self = StObject.set(x, "InputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Input(value: ProcessingS3Input): Self = StObject.set(x, "S3Input", value.asInstanceOf[js.Any])
  }
}
