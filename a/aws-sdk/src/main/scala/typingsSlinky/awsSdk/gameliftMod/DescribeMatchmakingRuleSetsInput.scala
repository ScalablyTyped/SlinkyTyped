package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMatchmakingRuleSetsInput extends StObject {
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[RuleSetLimit] = js.native
  
  /**
    * A list of one or more matchmaking rule set names to retrieve details for. (Note: The rule set name is different from the optional "name" field in the rule set body.) You can use either the rule set name or ARN value. 
    */
  var Names: js.UndefOr[MatchmakingRuleSetNameList] = js.native
  
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DescribeMatchmakingRuleSetsInput {
  
  @scala.inline
  def apply(): DescribeMatchmakingRuleSetsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMatchmakingRuleSetsInput]
  }
  
  @scala.inline
  implicit class DescribeMatchmakingRuleSetsInputMutableBuilder[Self <: DescribeMatchmakingRuleSetsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: RuleSetLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNames(value: MatchmakingRuleSetNameList): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: MatchmakingRuleSetName*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
