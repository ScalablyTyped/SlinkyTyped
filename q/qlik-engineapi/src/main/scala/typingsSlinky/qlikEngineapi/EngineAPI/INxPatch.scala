package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxPatch...
  */
@js.native
trait INxPatch extends StObject {
  
  /**
    * Operation to perform.
    */
  var qOp: NxPatchOpType = js.native
  
  /**
    * Path to the property to add, remove or replace.
    */
  var qPath: String = js.native
  
  /**
    * This parameter is not used in a remove operation.
    * Corresponds to the value of the property to add or to the new value of the property to update.
    *
    * Examples: "false", "2", "\"New title\""
    */
  var qValue: String = js.native
}
object INxPatch {
  
  @scala.inline
  def apply(qOp: NxPatchOpType, qPath: String, qValue: String): INxPatch = {
    val __obj = js.Dynamic.literal(qOp = qOp.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPatch]
  }
  
  @scala.inline
  implicit class INxPatchMutableBuilder[Self <: INxPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQOp(value: NxPatchOpType): Self = StObject.set(x, "qOp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPath(value: String): Self = StObject.set(x, "qPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: String): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
