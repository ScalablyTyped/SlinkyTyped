package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListActiveViolationsResponse extends StObject {
  
  /**
    * The list of active violations.
    */
  var activeViolations: js.UndefOr[ActiveViolations] = js.native
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListActiveViolationsResponse {
  
  @scala.inline
  def apply(): ListActiveViolationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActiveViolationsResponse]
  }
  
  @scala.inline
  implicit class ListActiveViolationsResponseMutableBuilder[Self <: ListActiveViolationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveViolations(value: ActiveViolations): Self = StObject.set(x, "activeViolations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveViolationsUndefined: Self = StObject.set(x, "activeViolations", js.undefined)
    
    @scala.inline
    def setActiveViolationsVarargs(value: ActiveViolation*): Self = StObject.set(x, "activeViolations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
