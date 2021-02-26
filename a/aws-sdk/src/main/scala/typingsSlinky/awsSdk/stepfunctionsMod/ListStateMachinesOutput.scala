package typingsSlinky.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStateMachinesOutput extends StObject {
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.native
  
  var stateMachines: StateMachineList = js.native
}
object ListStateMachinesOutput {
  
  @scala.inline
  def apply(stateMachines: StateMachineList): ListStateMachinesOutput = {
    val __obj = js.Dynamic.literal(stateMachines = stateMachines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStateMachinesOutput]
  }
  
  @scala.inline
  implicit class ListStateMachinesOutputMutableBuilder[Self <: ListStateMachinesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PageToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setStateMachines(value: StateMachineList): Self = StObject.set(x, "stateMachines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMachinesVarargs(value: StateMachineListItem*): Self = StObject.set(x, "stateMachines", js.Array(value :_*))
  }
}
