package typingsSlinky.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a GET all indirections request.
  */
@js.native
trait AllIndirectionsResponse extends ResponseBase {
  
  @JSName("result")
  var result_AllIndirectionsResponse: js.Array[Indirection] = js.native
}
object AllIndirectionsResponse {
  
  @scala.inline
  def apply(result: js.Array[Indirection]): AllIndirectionsResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllIndirectionsResponse]
  }
  
  @scala.inline
  implicit class AllIndirectionsResponseMutableBuilder[Self <: AllIndirectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Array[Indirection]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: Indirection*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
