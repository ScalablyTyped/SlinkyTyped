package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaWafExpressionSet extends StObject {
  
  /**
    * A list of alternate IDs. The format should be: - E.g. XSS-stable Generic
    * suffix like &quot;stable&quot; is particularly useful if a policy likes
    * to avail newer set of expressions without having to change the policy. A
    * given alias name can&#39;t be used for more than one entity set.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of available expressions.
    */
  var expressions: js.UndefOr[js.Array[SchemaWafExpressionSetExpression]] = js.native
  
  /**
    * Google specified expression set ID. The format should be: - E.g.
    * XSS-20170329
    */
  var id: js.UndefOr[String] = js.native
}
object SchemaWafExpressionSet {
  
  @scala.inline
  def apply(): SchemaWafExpressionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWafExpressionSet]
  }
  
  @scala.inline
  implicit class SchemaWafExpressionSetMutableBuilder[Self <: SchemaWafExpressionSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setExpressions(value: js.Array[SchemaWafExpressionSetExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    @scala.inline
    def setExpressionsVarargs(value: SchemaWafExpressionSetExpression*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
