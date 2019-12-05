package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/Spatial", JSImport.Namespace)
@js.native
object formatFilterSpatialMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.ol.formatFilterFilterMod.default {
    def this(tagName: String, geometryName: String, geometry: typingsSlinky.ol.geomGeometryMod.default) = this()
    def this(
      tagName: String,
      geometryName: String,
      geometry: typingsSlinky.ol.geomGeometryMod.default,
      opt_srsName: String
    ) = this()
  }
  
  type Spatial = typingsSlinky.ol.formatFilterFilterMod.default
}

