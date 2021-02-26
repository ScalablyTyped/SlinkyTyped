package typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileScriptRequest extends StObject {
  
  /**
    * Specifies in which execution context to perform script run. If the parameter is omitted the
    * evaluation will be performed in the context of the inspected page.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.native
  
  /**
    * Expression to compile.
    */
  var expression: String = js.native
  
  /**
    * Specifies whether the compiled script should be persisted.
    */
  var persistScript: Boolean = js.native
  
  /**
    * Source url to be set for the script.
    */
  var sourceURL: String = js.native
}
object CompileScriptRequest {
  
  @scala.inline
  def apply(expression: String, persistScript: Boolean, sourceURL: String): CompileScriptRequest = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], persistScript = persistScript.asInstanceOf[js.Any], sourceURL = sourceURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileScriptRequest]
  }
  
  @scala.inline
  implicit class CompileScriptRequestMutableBuilder[Self <: CompileScriptRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionContextIdUndefined: Self = StObject.set(x, "executionContextId", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistScript(value: Boolean): Self = StObject.set(x, "persistScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
  }
}
