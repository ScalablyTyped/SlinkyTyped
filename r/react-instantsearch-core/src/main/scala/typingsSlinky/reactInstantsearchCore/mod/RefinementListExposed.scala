package typingsSlinky.reactInstantsearchCore.mod

import typingsSlinky.reactInstantsearchCore.reactInstantsearchCoreStrings.and
import typingsSlinky.reactInstantsearchCore.reactInstantsearchCoreStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefinementListExposed extends StObject {
  
  /** the name of the attribute in the record */
  var attribute: String = js.native
  
  /**
    * the values of the items selected by default. The searchState of this widget takes the form of a list of strings,
    * which correspond to the values of all selected refinements. However, when there are no refinements selected,
    * the value of the searchState is an empty string.
    */
  var defaultRefinement: js.UndefOr[js.Array[String]] = js.native
  
  /** the minimum number of displayed items */
  var limit: js.UndefOr[Double] = js.native
  
  /** How to apply the refinements. Possible values: ‘or’ or ‘and’. */
  var operator: js.UndefOr[or | and] = js.native
  
  /** allow search inside values */
  var searchable: js.UndefOr[Boolean] = js.native
  
  /** true if the component should display a button that will expand the number of items */
  var showMore: js.UndefOr[Boolean] = js.native
  
  /** the maximun number of displayed items. Only used when showMore is set to true */
  var showMoreLimit: js.UndefOr[Double] = js.native
  
  /** (...args: any[]) => any to modify the items being displayed, e.g. for filtering or sorting them. Takes an items as parameter and expects it back in return. */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object RefinementListExposed {
  
  @scala.inline
  def apply(attribute: String): RefinementListExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementListExposed]
  }
  
  @scala.inline
  implicit class RefinementListExposedMutableBuilder[Self <: RefinementListExposed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRefinement(value: js.Array[String]): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
    
    @scala.inline
    def setDefaultRefinementVarargs(value: String*): Self = StObject.set(x, "defaultRefinement", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOperator(value: or | and): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    @scala.inline
    def setShowMore(value: Boolean): Self = StObject.set(x, "showMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMoreLimit(value: Double): Self = StObject.set(x, "showMoreLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMoreLimitUndefined: Self = StObject.set(x, "showMoreLimit", js.undefined)
    
    @scala.inline
    def setShowMoreUndefined: Self = StObject.set(x, "showMore", js.undefined)
    
    @scala.inline
    def setTransformItems(value: /* repeated */ js.Any => _): Self = StObject.set(x, "transformItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
  }
}
