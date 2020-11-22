package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceParametersProperties extends js.Object {
  
  /**
    * Specifies the units for measuring distance between [geometry1](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry1) and [geometry2](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry2).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#distanceUnit)
    */
  var distanceUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.native
  
  /**
    * When `true`, the geodesic distance between [geometry1](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry1) and [geometry2](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry2) is measured.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  
  /**
    * The geometry from which the distance is to be measured.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry1)
    */
  var geometry1: js.UndefOr[GeometryProperties] = js.native
  
  /**
    * The geometry to which the distance is to be measured.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry2)
    */
  var geometry2: js.UndefOr[GeometryProperties] = js.native
}
object DistanceParametersProperties {
  
  @scala.inline
  def apply(): DistanceParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceParametersProperties]
  }
  
  @scala.inline
  implicit class DistanceParametersPropertiesOps[Self <: DistanceParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistanceUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = this.set("distanceUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceUnit: Self = this.set("distanceUnit", js.undefined)
    
    @scala.inline
    def setGeodesic(value: Boolean): Self = this.set("geodesic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeodesic: Self = this.set("geodesic", js.undefined)
    
    @scala.inline
    def setGeometry1(value: GeometryProperties): Self = this.set("geometry1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometry1: Self = this.set("geometry1", js.undefined)
    
    @scala.inline
    def setGeometry2(value: GeometryProperties): Self = this.set("geometry2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometry2: Self = this.set("geometry2", js.undefined)
  }
}
