package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSkillsResponse extends StObject {
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NextToken] = js.native
  
  /**
    * The list of enabled skills requested. Required.
    */
  var SkillSummaries: js.UndefOr[SkillSummaryList] = js.native
}
object ListSkillsResponse {
  
  @scala.inline
  def apply(): ListSkillsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsResponse]
  }
  
  @scala.inline
  implicit class ListSkillsResponseMutableBuilder[Self <: ListSkillsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSkillSummaries(value: SkillSummaryList): Self = StObject.set(x, "SkillSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillSummariesUndefined: Self = StObject.set(x, "SkillSummaries", js.undefined)
    
    @scala.inline
    def setSkillSummariesVarargs(value: SkillSummary*): Self = StObject.set(x, "SkillSummaries", js.Array(value :_*))
  }
}
