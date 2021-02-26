package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.forward
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.reverse
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalItemFetchRelatedItemsParams extends Object {
  
  /**
    * The direction of the relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  var direction: forward | reverse = js.native
  
  /**
    * The type of relationship between the two items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  var relationshipType: String = js.native
}
object PortalItemFetchRelatedItemsParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    direction: forward | reverse,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    relationshipType: String
  ): PortalItemFetchRelatedItemsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), relationshipType = relationshipType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalItemFetchRelatedItemsParams]
  }
  
  @scala.inline
  implicit class PortalItemFetchRelatedItemsParamsMutableBuilder[Self <: PortalItemFetchRelatedItemsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: forward | reverse): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipType(value: String): Self = StObject.set(x, "relationshipType", value.asInstanceOf[js.Any])
  }
}
