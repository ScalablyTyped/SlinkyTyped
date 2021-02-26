package typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackTrace extends StObject {
  
  /**
    * JavaScript function name.
    */
  var callFrames: js.Array[CallFrame] = js.native
  
  /**
    * String label of this stack trace. For async traces this may be a name of the function that
    * initiated the async call.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Asynchronous JavaScript stack trace that preceded this stack, if available.
    */
  var parent: js.UndefOr[StackTrace] = js.native
  
  /**
    * Asynchronous JavaScript stack trace that preceded this stack, if available.
    */
  var parentId: js.UndefOr[StackTraceId] = js.native
}
object StackTrace {
  
  @scala.inline
  def apply(callFrames: js.Array[CallFrame]): StackTrace = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTrace]
  }
  
  @scala.inline
  implicit class StackTraceMutableBuilder[Self <: StackTrace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallFrames(value: js.Array[CallFrame]): Self = StObject.set(x, "callFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallFramesVarargs(value: CallFrame*): Self = StObject.set(x, "callFrames", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setParent(value: StackTrace): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: StackTraceId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
