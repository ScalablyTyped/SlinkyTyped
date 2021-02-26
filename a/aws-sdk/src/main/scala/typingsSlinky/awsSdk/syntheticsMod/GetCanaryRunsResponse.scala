package typingsSlinky.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCanaryRunsResponse extends StObject {
  
  /**
    * An array of structures. Each structure contains the details of one of the retrieved canary runs.
    */
  var CanaryRuns: js.UndefOr[typingsSlinky.awsSdk.syntheticsMod.CanaryRuns] = js.native
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent GetCanaryRuns operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetCanaryRunsResponse {
  
  @scala.inline
  def apply(): GetCanaryRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCanaryRunsResponse]
  }
  
  @scala.inline
  implicit class GetCanaryRunsResponseMutableBuilder[Self <: GetCanaryRunsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanaryRuns(value: CanaryRuns): Self = StObject.set(x, "CanaryRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanaryRunsUndefined: Self = StObject.set(x, "CanaryRuns", js.undefined)
    
    @scala.inline
    def setCanaryRunsVarargs(value: CanaryRun*): Self = StObject.set(x, "CanaryRuns", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
