package typingsSlinky.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerRuleConditionHostHeader extends StObject {
  
  /**
    * List of header value patterns to match. Maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request they will be searched in order until a match is found. Only one pattern needs to match for the condition to be satisfied. To require that all of the strings are a match, create one condition block per string.
    */
  var values: js.Array[String] = js.native
}
object ListenerRuleConditionHostHeader {
  
  @scala.inline
  def apply(values: js.Array[String]): ListenerRuleConditionHostHeader = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionHostHeader]
  }
  
  @scala.inline
  implicit class ListenerRuleConditionHostHeaderMutableBuilder[Self <: ListenerRuleConditionHostHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
