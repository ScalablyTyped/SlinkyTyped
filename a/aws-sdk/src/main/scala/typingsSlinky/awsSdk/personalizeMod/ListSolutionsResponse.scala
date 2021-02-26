package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSolutionsResponse extends StObject {
  
  /**
    * A token for getting the next set of solutions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of the current solutions.
    */
  var solutions: js.UndefOr[Solutions] = js.native
}
object ListSolutionsResponse {
  
  @scala.inline
  def apply(): ListSolutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSolutionsResponse]
  }
  
  @scala.inline
  implicit class ListSolutionsResponseMutableBuilder[Self <: ListSolutionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSolutions(value: Solutions): Self = StObject.set(x, "solutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionsUndefined: Self = StObject.set(x, "solutions", js.undefined)
    
    @scala.inline
    def setSolutionsVarargs(value: SolutionSummary*): Self = StObject.set(x, "solutions", js.Array(value :_*))
  }
}
