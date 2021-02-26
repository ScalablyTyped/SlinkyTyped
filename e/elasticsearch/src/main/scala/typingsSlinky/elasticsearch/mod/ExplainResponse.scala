package typingsSlinky.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplainResponse extends StObject {
  
  var _id: String = js.native
  
  var _index: String = js.native
  
  var _type: String = js.native
  
  var explanation: ExplainResponseDetails = js.native
  
  var matched: Boolean = js.native
}
object ExplainResponse {
  
  @scala.inline
  def apply(_id: String, _index: String, _type: String, explanation: ExplainResponseDetails, matched: Boolean): ExplainResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainResponse]
  }
  
  @scala.inline
  implicit class ExplainResponseMutableBuilder[Self <: ExplainResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplanation(value: ExplainResponseDetails): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatched(value: Boolean): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_index(value: String): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
  }
}
