package typingsSlinky.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestartFrameParameterType extends StObject {
  
  /**
    * Call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId = js.native
}
object RestartFrameParameterType {
  
  @scala.inline
  def apply(callFrameId: CallFrameId): RestartFrameParameterType = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartFrameParameterType]
  }
  
  @scala.inline
  implicit class RestartFrameParameterTypeMutableBuilder[Self <: RestartFrameParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallFrameId(value: CallFrameId): Self = StObject.set(x, "callFrameId", value.asInstanceOf[js.Any])
  }
}
