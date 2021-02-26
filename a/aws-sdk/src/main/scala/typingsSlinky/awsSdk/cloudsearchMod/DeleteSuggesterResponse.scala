package typingsSlinky.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSuggesterResponse extends StObject {
  
  /**
    * The status of the suggester being deleted.
    */
  var Suggester: SuggesterStatus = js.native
}
object DeleteSuggesterResponse {
  
  @scala.inline
  def apply(Suggester: SuggesterStatus): DeleteSuggesterResponse = {
    val __obj = js.Dynamic.literal(Suggester = Suggester.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSuggesterResponse]
  }
  
  @scala.inline
  implicit class DeleteSuggesterResponseMutableBuilder[Self <: DeleteSuggesterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggester(value: SuggesterStatus): Self = StObject.set(x, "Suggester", value.asInstanceOf[js.Any])
  }
}
