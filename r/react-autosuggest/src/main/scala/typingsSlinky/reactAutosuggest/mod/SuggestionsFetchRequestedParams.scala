package typingsSlinky.reactAutosuggest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestionsFetchRequestedParams extends StObject {
  
  var reason: FetchRequestedReasons = js.native
  
  var value: String = js.native
}
object SuggestionsFetchRequestedParams {
  
  @scala.inline
  def apply(reason: FetchRequestedReasons, value: String): SuggestionsFetchRequestedParams = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionsFetchRequestedParams]
  }
  
  @scala.inline
  implicit class SuggestionsFetchRequestedParamsMutableBuilder[Self <: SuggestionsFetchRequestedParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: FetchRequestedReasons): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
