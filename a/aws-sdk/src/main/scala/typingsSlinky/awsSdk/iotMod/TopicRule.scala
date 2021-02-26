package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRule extends StObject {
  
  /**
    * The actions associated with the rule.
    */
  var actions: js.UndefOr[ActionList] = js.native
  
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.native
  
  /**
    * The date and time the rule was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The description of the rule.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The action to perform when an error occurs.
    */
  var errorAction: js.UndefOr[Action] = js.native
  
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.native
  
  /**
    * The name of the rule.
    */
  var ruleName: js.UndefOr[RuleName] = js.native
  
  /**
    * The SQL statement used to query the topic. When using a SQL query with multiple lines, be sure to escape the newline characters.
    */
  var sql: js.UndefOr[SQL] = js.native
}
object TopicRule {
  
  @scala.inline
  def apply(): TopicRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRule]
  }
  
  @scala.inline
  implicit class TopicRuleMutableBuilder[Self <: TopicRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: ActionList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setAwsIotSqlVersion(value: AwsIotSqlVersion): Self = StObject.set(x, "awsIotSqlVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIotSqlVersionUndefined: Self = StObject.set(x, "awsIotSqlVersion", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setErrorAction(value: Action): Self = StObject.set(x, "errorAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorActionUndefined: Self = StObject.set(x, "errorAction", js.undefined)
    
    @scala.inline
    def setRuleDisabled(value: IsDisabled): Self = StObject.set(x, "ruleDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleDisabledUndefined: Self = StObject.set(x, "ruleDisabled", js.undefined)
    
    @scala.inline
    def setRuleName(value: RuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
    
    @scala.inline
    def setSql(value: SQL): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
  }
}
