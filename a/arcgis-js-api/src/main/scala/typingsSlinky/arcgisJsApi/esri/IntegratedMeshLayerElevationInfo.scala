package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegratedMeshLayerElevationInfo extends Object {
  
  /**
    * Defines how the mesh is placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    */
  var mode: String = js.native
  
  /**
    * An elevation offset, which is added to the vertical position of the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * The unit for `offset` values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    */
  var unit: js.UndefOr[feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards] = js.native
}
object IntegratedMeshLayerElevationInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): IntegratedMeshLayerElevationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[IntegratedMeshLayerElevationInfo]
  }
  
  @scala.inline
  implicit class IntegratedMeshLayerElevationInfoOps[Self <: IntegratedMeshLayerElevationInfo] (val x: Self) extends AnyVal {
    
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setUnit(value: feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
