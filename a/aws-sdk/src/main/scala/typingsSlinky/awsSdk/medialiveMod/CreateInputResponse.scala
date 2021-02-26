package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInputResponse extends StObject {
  
  var Input: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Input] = js.native
}
object CreateInputResponse {
  
  @scala.inline
  def apply(): CreateInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputResponse]
  }
  
  @scala.inline
  implicit class CreateInputResponseMutableBuilder[Self <: CreateInputResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
  }
}
