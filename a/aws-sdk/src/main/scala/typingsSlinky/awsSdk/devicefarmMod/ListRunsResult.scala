package typingsSlinky.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRunsResult extends StObject {
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Information about the runs.
    */
  var runs: js.UndefOr[Runs] = js.native
}
object ListRunsResult {
  
  @scala.inline
  def apply(): ListRunsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRunsResult]
  }
  
  @scala.inline
  implicit class ListRunsResultMutableBuilder[Self <: ListRunsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRuns(value: Runs): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunsUndefined: Self = StObject.set(x, "runs", js.undefined)
    
    @scala.inline
    def setRunsVarargs(value: Run*): Self = StObject.set(x, "runs", js.Array(value :_*))
  }
}
