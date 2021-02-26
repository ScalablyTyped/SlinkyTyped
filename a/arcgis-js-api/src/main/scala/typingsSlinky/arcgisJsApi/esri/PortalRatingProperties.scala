package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalRatingProperties extends StObject {
  
  /**
    * Date the rating was added to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalRating.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.native
  
  /**
    * A rating between 1.0 and 5.0 for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalRating.html#rating)
    */
  var rating: js.UndefOr[Double] = js.native
}
object PortalRatingProperties {
  
  @scala.inline
  def apply(): PortalRatingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalRatingProperties]
  }
  
  @scala.inline
  implicit class PortalRatingPropertiesMutableBuilder[Self <: PortalRatingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: DateProperties): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
  }
}
