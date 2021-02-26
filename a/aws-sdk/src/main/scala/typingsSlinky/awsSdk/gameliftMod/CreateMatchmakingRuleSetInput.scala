package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMatchmakingRuleSetInput extends StObject {
  
  /**
    * A unique identifier for a matchmaking rule set. A matchmaking configuration identifies the rule set it uses by this name value. Note that the rule set name is different from the optional name field in the rule set body.
    */
  var Name: MatchmakingIdStringModel = js.native
  
  /**
    * A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most elements support a description field.
    */
  var RuleSetBody: typingsSlinky.awsSdk.gameliftMod.RuleSetBody = js.native
  
  /**
    * A list of labels to assign to the new matchmaking rule set resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateMatchmakingRuleSetInput {
  
  @scala.inline
  def apply(Name: MatchmakingIdStringModel, RuleSetBody: RuleSetBody): CreateMatchmakingRuleSetInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RuleSetBody = RuleSetBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMatchmakingRuleSetInput]
  }
  
  @scala.inline
  implicit class CreateMatchmakingRuleSetInputMutableBuilder[Self <: CreateMatchmakingRuleSetInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: MatchmakingIdStringModel): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetBody(value: RuleSetBody): Self = StObject.set(x, "RuleSetBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
