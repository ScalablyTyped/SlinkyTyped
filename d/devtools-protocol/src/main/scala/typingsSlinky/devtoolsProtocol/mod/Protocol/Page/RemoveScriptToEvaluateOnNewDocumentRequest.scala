package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveScriptToEvaluateOnNewDocumentRequest extends StObject {
  
  var identifier: ScriptIdentifier = js.native
}
object RemoveScriptToEvaluateOnNewDocumentRequest {
  
  @scala.inline
  def apply(identifier: ScriptIdentifier): RemoveScriptToEvaluateOnNewDocumentRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveScriptToEvaluateOnNewDocumentRequest]
  }
  
  @scala.inline
  implicit class RemoveScriptToEvaluateOnNewDocumentRequestMutableBuilder[Self <: RemoveScriptToEvaluateOnNewDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: ScriptIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
