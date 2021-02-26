package typingsSlinky.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRegexPatternSetRegularExpression extends StObject {
  
  /**
    * (Required) The string representing the regular expression, see the AWS WAF [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-regex-pattern-set-creating.html) for more information.
    */
  var regexString: String = js.native
}
object GetRegexPatternSetRegularExpression {
  
  @scala.inline
  def apply(regexString: String): GetRegexPatternSetRegularExpression = {
    val __obj = js.Dynamic.literal(regexString = regexString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegexPatternSetRegularExpression]
  }
  
  @scala.inline
  implicit class GetRegexPatternSetRegularExpressionMutableBuilder[Self <: GetRegexPatternSetRegularExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegexString(value: String): Self = StObject.set(x, "regexString", value.asInstanceOf[js.Any])
  }
}
