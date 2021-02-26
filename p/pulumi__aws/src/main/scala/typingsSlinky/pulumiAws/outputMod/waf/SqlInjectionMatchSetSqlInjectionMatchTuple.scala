package typingsSlinky.pulumiAws.outputMod.waf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlInjectionMatchSetSqlInjectionMatchTuple extends StObject {
  
  /**
    * Specifies where in a web request to look for snippets of malicious SQL code.
    */
  var fieldToMatch: SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch = js.native
  
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * If you specify a transformation, AWS WAF performs the transformation on `fieldToMatch` before inspecting a request for a match.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_SqlInjectionMatchTuple.html#WAF-Type-SqlInjectionMatchTuple-TextTransformation)
    * for all supported values.
    */
  var textTransformation: String = js.native
}
object SqlInjectionMatchSetSqlInjectionMatchTuple {
  
  @scala.inline
  def apply(fieldToMatch: SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch, textTransformation: String): SqlInjectionMatchSetSqlInjectionMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSetSqlInjectionMatchTuple]
  }
  
  @scala.inline
  implicit class SqlInjectionMatchSetSqlInjectionMatchTupleMutableBuilder[Self <: SqlInjectionMatchSetSqlInjectionMatchTuple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatch(value: SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformation(value: String): Self = StObject.set(x, "textTransformation", value.asInstanceOf[js.Any])
  }
}
