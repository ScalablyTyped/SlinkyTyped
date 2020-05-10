package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`map-layer`
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class DynamicMapLayerOps[Self <: DynamicMapLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGdbVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gdbVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapLayerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapLayerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `map-layer`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

