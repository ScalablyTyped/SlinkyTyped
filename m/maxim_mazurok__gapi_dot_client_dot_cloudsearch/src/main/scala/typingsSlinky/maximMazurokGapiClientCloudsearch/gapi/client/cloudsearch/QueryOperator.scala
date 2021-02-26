package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryOperator extends StObject {
  
  /** Display name of the operator */
  var displayName: js.UndefOr[String] = js.native
  
  /** Potential list of values for the opeatror field. This field is only filled when we can safely enumerate all the possible values of this operator. */
  var enumValues: js.UndefOr[js.Array[String]] = js.native
  
  /** Indicates the operator name that can be used to isolate the property using the greater-than operator. */
  var greaterThanOperatorName: js.UndefOr[String] = js.native
  
  /** Can this operator be used to get facets. */
  var isFacetable: js.UndefOr[Boolean] = js.native
  
  /** Indicates if multiple values can be set for this property. */
  var isRepeatable: js.UndefOr[Boolean] = js.native
  
  /** Will the property associated with this facet be returned as part of search results. */
  var isReturnable: js.UndefOr[Boolean] = js.native
  
  /** Can this operator be used to sort results. */
  var isSortable: js.UndefOr[Boolean] = js.native
  
  /** Can get suggestions for this field. */
  var isSuggestable: js.UndefOr[Boolean] = js.native
  
  /** Indicates the operator name that can be used to isolate the property using the less-than operator. */
  var lessThanOperatorName: js.UndefOr[String] = js.native
  
  /** Name of the object corresponding to the operator. This field is only filled for schema-specific operators, and is unset for common operators. */
  var objectType: js.UndefOr[String] = js.native
  
  /** The name of the operator. */
  var operatorName: js.UndefOr[String] = js.native
  
  /** Type of the operator. */
  var `type`: js.UndefOr[String] = js.native
}
object QueryOperator {
  
  @scala.inline
  def apply(): QueryOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOperator]
  }
  
  @scala.inline
  implicit class QueryOperatorMutableBuilder[Self <: QueryOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnumValues(value: js.Array[String]): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumValuesUndefined: Self = StObject.set(x, "enumValues", js.undefined)
    
    @scala.inline
    def setEnumValuesVarargs(value: String*): Self = StObject.set(x, "enumValues", js.Array(value :_*))
    
    @scala.inline
    def setGreaterThanOperatorName(value: String): Self = StObject.set(x, "greaterThanOperatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreaterThanOperatorNameUndefined: Self = StObject.set(x, "greaterThanOperatorName", js.undefined)
    
    @scala.inline
    def setIsFacetable(value: Boolean): Self = StObject.set(x, "isFacetable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFacetableUndefined: Self = StObject.set(x, "isFacetable", js.undefined)
    
    @scala.inline
    def setIsRepeatable(value: Boolean): Self = StObject.set(x, "isRepeatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRepeatableUndefined: Self = StObject.set(x, "isRepeatable", js.undefined)
    
    @scala.inline
    def setIsReturnable(value: Boolean): Self = StObject.set(x, "isReturnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReturnableUndefined: Self = StObject.set(x, "isReturnable", js.undefined)
    
    @scala.inline
    def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    @scala.inline
    def setIsSuggestable(value: Boolean): Self = StObject.set(x, "isSuggestable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuggestableUndefined: Self = StObject.set(x, "isSuggestable", js.undefined)
    
    @scala.inline
    def setLessThanOperatorName(value: String): Self = StObject.set(x, "lessThanOperatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLessThanOperatorNameUndefined: Self = StObject.set(x, "lessThanOperatorName", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    @scala.inline
    def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
