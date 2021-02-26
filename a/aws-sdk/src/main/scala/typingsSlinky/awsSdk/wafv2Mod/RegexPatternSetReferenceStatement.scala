package typingsSlinky.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexPatternSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the RegexPatternSet that this statement references.
    */
  var ARN: ResourceArn = js.native
  
  /**
    * The part of a web request that you want AWS WAF to inspect. For more information, see FieldToMatch. 
    */
  var FieldToMatch: typingsSlinky.awsSdk.wafv2Mod.FieldToMatch = js.native
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all transformations on the content of the request component identified by FieldToMatch, starting from the lowest priority setting, before inspecting the content for a match.
    */
  var TextTransformations: typingsSlinky.awsSdk.wafv2Mod.TextTransformations = js.native
}
object RegexPatternSetReferenceStatement {
  
  @scala.inline
  def apply(ARN: ResourceArn, FieldToMatch: FieldToMatch, TextTransformations: TextTransformations): RegexPatternSetReferenceStatement = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], FieldToMatch = FieldToMatch.asInstanceOf[js.Any], TextTransformations = TextTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSetReferenceStatement]
  }
  
  @scala.inline
  implicit class RegexPatternSetReferenceStatementMutableBuilder[Self <: RegexPatternSetReferenceStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatch(value: FieldToMatch): Self = StObject.set(x, "FieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformations(value: TextTransformations): Self = StObject.set(x, "TextTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(value: TextTransformation*): Self = StObject.set(x, "TextTransformations", js.Array(value :_*))
  }
}
