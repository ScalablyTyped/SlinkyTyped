package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSkillsRequest extends StObject {
  
  /**
    * Whether the skill is enabled under the user's account.
    */
  var EnablementType: js.UndefOr[EnablementTypeFilter] = js.native
  
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[SkillListMaxResults] = js.native
  
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NextToken] = js.native
  
  /**
    * The ARN of the skill group for which to list enabled skills.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
  
  /**
    * Whether the skill is publicly available or is a private skill.
    */
  var SkillType: js.UndefOr[SkillTypeFilter] = js.native
}
object ListSkillsRequest {
  
  @scala.inline
  def apply(): ListSkillsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsRequest]
  }
  
  @scala.inline
  implicit class ListSkillsRequestMutableBuilder[Self <: ListSkillsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnablementType(value: EnablementTypeFilter): Self = StObject.set(x, "EnablementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablementTypeUndefined: Self = StObject.set(x, "EnablementType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: SkillListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
    
    @scala.inline
    def setSkillType(value: SkillTypeFilter): Self = StObject.set(x, "SkillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillTypeUndefined: Self = StObject.set(x, "SkillType", js.undefined)
  }
}
