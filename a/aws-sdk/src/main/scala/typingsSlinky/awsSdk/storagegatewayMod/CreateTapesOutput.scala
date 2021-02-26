package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTapesOutput extends StObject {
  
  /**
    * A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
    */
  var TapeARNs: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeARNs] = js.native
}
object CreateTapesOutput {
  
  @scala.inline
  def apply(): CreateTapesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTapesOutput]
  }
  
  @scala.inline
  implicit class CreateTapesOutputMutableBuilder[Self <: CreateTapesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapeARNs(value: TapeARNs): Self = StObject.set(x, "TapeARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNsUndefined: Self = StObject.set(x, "TapeARNs", js.undefined)
    
    @scala.inline
    def setTapeARNsVarargs(value: TapeARN*): Self = StObject.set(x, "TapeARNs", js.Array(value :_*))
  }
}
