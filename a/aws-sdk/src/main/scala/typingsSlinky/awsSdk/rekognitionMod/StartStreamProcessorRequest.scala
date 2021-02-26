package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartStreamProcessorRequest extends StObject {
  
  /**
    * The name of the stream processor to start processing.
    */
  var Name: StreamProcessorName = js.native
}
object StartStreamProcessorRequest {
  
  @scala.inline
  def apply(Name: StreamProcessorName): StartStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartStreamProcessorRequest]
  }
  
  @scala.inline
  implicit class StartStreamProcessorRequestMutableBuilder[Self <: StartStreamProcessorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
