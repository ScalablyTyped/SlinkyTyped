package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`map-layer`
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicMapLayer extends Object {
  
  /**
    * An optional property for specifying the GDB version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var gdbVersion: String = js.native
  
  /**
    * The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id) of the service sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var mapLayerId: Double = js.native
  
  /**
    * This value is always `map-layer` and is inferred when the `mapLayerId` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var `type`: `map-layer` = js.native
}
object DynamicMapLayer {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    gdbVersion: String,
    hasOwnProperty: PropertyKey => Boolean,
    mapLayerId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `map-layer`
  ): DynamicMapLayer = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], gdbVersion = gdbVersion.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mapLayerId = mapLayerId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicMapLayer]
  }
  
  @scala.inline
  implicit class DynamicMapLayerMutableBuilder[Self <: DynamicMapLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapLayerId(value: Double): Self = StObject.set(x, "mapLayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `map-layer`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
