package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTrialsResponse extends StObject {
  
  /**
    * A token for getting the next set of trials, if there are any.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * A list of the summaries of your trials.
    */
  var TrialSummaries: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialSummaries] = js.native
}
object ListTrialsResponse {
  
  @scala.inline
  def apply(): ListTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrialsResponse]
  }
  
  @scala.inline
  implicit class ListTrialsResponseMutableBuilder[Self <: ListTrialsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTrialSummaries(value: TrialSummaries): Self = StObject.set(x, "TrialSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialSummariesUndefined: Self = StObject.set(x, "TrialSummaries", js.undefined)
    
    @scala.inline
    def setTrialSummariesVarargs(value: TrialSummary*): Self = StObject.set(x, "TrialSummaries", js.Array(value :_*))
  }
}
