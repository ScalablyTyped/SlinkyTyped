package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/format/filter/Spatial", JSImport.Namespace)
@js.native
object spatialMod extends js.Object {
  
  @js.native
  abstract class default protected ()
    extends typingsSlinky.ol.filterFilterMod.default {
    def this(tagName: String, geometryName: String, geometry: typingsSlinky.ol.geometryMod.default) = this()
    def this(
      tagName: String,
      geometryName: String,
      geometry: typingsSlinky.ol.geometryMod.default,
      opt_srsName: String
    ) = this()
  }
  
  type Spatial = typingsSlinky.ol.filterFilterMod.default
}
