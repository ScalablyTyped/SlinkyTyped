package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHumanTaskUisResponse extends StObject {
  
  /**
    * An array of objects describing the human task user interfaces.
    */
  var HumanTaskUiSummaries: typingsSlinky.awsSdk.sagemakerMod.HumanTaskUiSummaries = js.native
  
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListHumanTaskUisResponse {
  
  @scala.inline
  def apply(HumanTaskUiSummaries: HumanTaskUiSummaries): ListHumanTaskUisResponse = {
    val __obj = js.Dynamic.literal(HumanTaskUiSummaries = HumanTaskUiSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanTaskUisResponse]
  }
  
  @scala.inline
  implicit class ListHumanTaskUisResponseMutableBuilder[Self <: ListHumanTaskUisResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanTaskUiSummaries(value: HumanTaskUiSummaries): Self = StObject.set(x, "HumanTaskUiSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanTaskUiSummariesVarargs(value: HumanTaskUiSummary*): Self = StObject.set(x, "HumanTaskUiSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
