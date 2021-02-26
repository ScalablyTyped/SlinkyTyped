package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMatchmakingConfigurationsInput extends StObject {
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This parameter is limited to 10.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  
  /**
    * A unique identifier for a matchmaking configuration(s) to retrieve. You can use either the configuration name or ARN value. To request all existing configurations, leave this parameter empty.
    */
  var Names: js.UndefOr[MatchmakingConfigurationNameList] = js.native
  
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A unique identifier for a matchmaking rule set. You can use either the rule set name or ARN value. Use this parameter to retrieve all matchmaking configurations that use this rule set.
    */
  var RuleSetName: js.UndefOr[MatchmakingRuleSetName] = js.native
}
object DescribeMatchmakingConfigurationsInput {
  
  @scala.inline
  def apply(): DescribeMatchmakingConfigurationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMatchmakingConfigurationsInput]
  }
  
  @scala.inline
  implicit class DescribeMatchmakingConfigurationsInputMutableBuilder[Self <: DescribeMatchmakingConfigurationsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: PositiveInteger): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNames(value: MatchmakingConfigurationNameList): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: MatchmakingConfigurationName*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRuleSetName(value: MatchmakingRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetNameUndefined: Self = StObject.set(x, "RuleSetName", js.undefined)
  }
}
