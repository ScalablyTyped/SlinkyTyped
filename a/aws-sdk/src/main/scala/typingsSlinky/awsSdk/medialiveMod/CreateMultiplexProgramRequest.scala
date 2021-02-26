package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMultiplexProgramRequest extends StObject {
  
  /**
    * ID of the multiplex where the program is to be created.
    */
  var MultiplexId: string = js.native
  
  /**
    * The settings for this multiplex program.
    */
  var MultiplexProgramSettings: typingsSlinky.awsSdk.medialiveMod.MultiplexProgramSettings = js.native
  
  /**
    * Name of multiplex program.
    */
  var ProgramName: string = js.native
  
  /**
    * Unique request ID. This prevents retries from creating multiple
  resources.
    */
  var RequestId: string = js.native
}
object CreateMultiplexProgramRequest {
  
  @scala.inline
  def apply(
    MultiplexId: string,
    MultiplexProgramSettings: MultiplexProgramSettings,
    ProgramName: string,
    RequestId: string
  ): CreateMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], MultiplexProgramSettings = MultiplexProgramSettings.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiplexProgramRequest]
  }
  
  @scala.inline
  implicit class CreateMultiplexProgramRequestMutableBuilder[Self <: CreateMultiplexProgramRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexProgramSettings(value: MultiplexProgramSettings): Self = StObject.set(x, "MultiplexProgramSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: string): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
  }
}
