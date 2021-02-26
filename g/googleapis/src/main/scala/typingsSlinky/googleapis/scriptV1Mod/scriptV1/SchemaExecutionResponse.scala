package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that provides the return value of a function executed using the
  * Apps Script API. If the script function returns successfully, the response
  * body&#39;s response field contains this `ExecutionResponse` object.
  */
@js.native
trait SchemaExecutionResponse extends StObject {
  
  /**
    * The return value of the script function. The type matches the object type
    * returned in Apps Script. Functions called using the Apps Script API
    * cannot return Apps Script-specific objects (such as a `Document` or a
    * `Calendar`); they can only return primitive types such as a `string`,
    * `number`, `array`, `object`, or `boolean`.
    */
  var result: js.UndefOr[js.Any] = js.native
}
object SchemaExecutionResponse {
  
  @scala.inline
  def apply(): SchemaExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionResponse]
  }
  
  @scala.inline
  implicit class SchemaExecutionResponseMutableBuilder[Self <: SchemaExecutionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
