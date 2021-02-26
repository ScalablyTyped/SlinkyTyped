package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchExpression extends StObject {
  
  /**
    * A list of filter objects.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * A list of nested filter objects.
    */
  var NestedFilters: js.UndefOr[NestedFiltersList] = js.native
  
  /**
    * A Boolean operator used to evaluate the search expression. If you want every conditional statement in all lists to be satisfied for the entire search expression to be true, specify And. If only a single conditional statement needs to be true for the entire search expression to be true, specify Or. The default value is And.
    */
  var Operator: js.UndefOr[BooleanOperator] = js.native
  
  /**
    * A list of search expression objects.
    */
  var SubExpressions: js.UndefOr[SearchExpressionList] = js.native
}
object SearchExpression {
  
  @scala.inline
  def apply(): SearchExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchExpression]
  }
  
  @scala.inline
  implicit class SearchExpressionMutableBuilder[Self <: SearchExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setNestedFilters(value: NestedFiltersList): Self = StObject.set(x, "NestedFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedFiltersUndefined: Self = StObject.set(x, "NestedFilters", js.undefined)
    
    @scala.inline
    def setNestedFiltersVarargs(value: NestedFilters*): Self = StObject.set(x, "NestedFilters", js.Array(value :_*))
    
    @scala.inline
    def setOperator(value: BooleanOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "Operator", js.undefined)
    
    @scala.inline
    def setSubExpressions(value: SearchExpressionList): Self = StObject.set(x, "SubExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubExpressionsUndefined: Self = StObject.set(x, "SubExpressions", js.undefined)
    
    @scala.inline
    def setSubExpressionsVarargs(value: SearchExpression*): Self = StObject.set(x, "SubExpressions", js.Array(value :_*))
  }
}
