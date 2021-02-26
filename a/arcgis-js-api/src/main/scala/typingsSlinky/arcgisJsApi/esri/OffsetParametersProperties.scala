package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bevelled
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mitered
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rounded
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetParametersProperties extends StObject {
  
  /**
    * The `bevelRatio` is multiplied by the offset distance and the result determines how far a mitered offset intersection can be located before it is beveled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#bevelRatio)
    */
  var bevelRatio: js.UndefOr[Double] = js.native
  
  /**
    * The array of geometries to be offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.native
  
  /**
    * Specifies the planar distance for constructing an offset based on the input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetDistance)
    */
  var offsetDistance: js.UndefOr[Double] = js.native
  
  /**
    * Options that determine how the ends intersect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetHow)
    */
  var offsetHow: js.UndefOr[bevelled | mitered | rounded] = js.native
  
  /**
    * The offset distance unit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetUnit)
    */
  var offsetUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.native
}
object OffsetParametersProperties {
  
  @scala.inline
  def apply(): OffsetParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetParametersProperties]
  }
  
  @scala.inline
  implicit class OffsetParametersPropertiesMutableBuilder[Self <: OffsetParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBevelRatio(value: Double): Self = StObject.set(x, "bevelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBevelRatioUndefined: Self = StObject.set(x, "bevelRatio", js.undefined)
    
    @scala.inline
    def setGeometries(value: js.Array[GeometryProperties]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    @scala.inline
    def setGeometriesVarargs(value: GeometryProperties*): Self = StObject.set(x, "geometries", js.Array(value :_*))
    
    @scala.inline
    def setOffsetDistance(value: Double): Self = StObject.set(x, "offsetDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetDistanceUndefined: Self = StObject.set(x, "offsetDistance", js.undefined)
    
    @scala.inline
    def setOffsetHow(value: bevelled | mitered | rounded): Self = StObject.set(x, "offsetHow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetHowUndefined: Self = StObject.set(x, "offsetHow", js.undefined)
    
    @scala.inline
    def setOffsetUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = StObject.set(x, "offsetUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUnitUndefined: Self = StObject.set(x, "offsetUnit", js.undefined)
  }
}
