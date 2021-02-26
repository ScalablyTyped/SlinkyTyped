package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMultiplexProgramResponse extends StObject {
  
  /**
    * The newly created multiplex program.
    */
  var MultiplexProgram: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MultiplexProgram] = js.native
}
object CreateMultiplexProgramResponse {
  
  @scala.inline
  def apply(): CreateMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMultiplexProgramResponse]
  }
  
  @scala.inline
  implicit class CreateMultiplexProgramResponseMutableBuilder[Self <: CreateMultiplexProgramResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplexProgram(value: MultiplexProgram): Self = StObject.set(x, "MultiplexProgram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexProgramUndefined: Self = StObject.set(x, "MultiplexProgram", js.undefined)
  }
}
