package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for listing debuggees.
  */
@js.native
trait SchemaListDebuggeesResponse extends StObject {
  
  /**
    * List of debuggees accessible to the calling user. The fields
    * `debuggee.id` and `description` are guaranteed to be set. The
    * `description` field is a human readable field provided by agents and can
    * be displayed to users.
    */
  var debuggees: js.UndefOr[js.Array[SchemaDebuggee]] = js.native
}
object SchemaListDebuggeesResponse {
  
  @scala.inline
  def apply(): SchemaListDebuggeesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDebuggeesResponse]
  }
  
  @scala.inline
  implicit class SchemaListDebuggeesResponseMutableBuilder[Self <: SchemaListDebuggeesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebuggees(value: js.Array[SchemaDebuggee]): Self = StObject.set(x, "debuggees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggeesUndefined: Self = StObject.set(x, "debuggees", js.undefined)
    
    @scala.inline
    def setDebuggeesVarargs(value: SchemaDebuggee*): Self = StObject.set(x, "debuggees", js.Array(value :_*))
  }
}
