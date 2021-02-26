package typingsSlinky.hapiHapi.anon

import typingsSlinky.hapiHapi.hapiHapiStrings.`allow-from`
import typingsSlinky.hapiHapi.hapiHapiStrings.deny
import typingsSlinky.hapiHapi.hapiHapiStrings.sameorigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends StObject {
  
  /**
    * an object for specifying the 'allow-from' rule,
    */
  var rule: deny | sameorigin | `allow-from` = js.native
  
  /**
    * when rule is 'allow-from' this is used to form the rest of the header, otherwise this field is ignored. If rule is 'allow-from' but source is unset, the rule will be automatically changed
    * to 'sameorigin'.
    */
  var source: String = js.native
}
object Rule {
  
  @scala.inline
  def apply(rule: deny | sameorigin | `allow-from`, source: String): Rule = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: deny | sameorigin | `allow-from`): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
