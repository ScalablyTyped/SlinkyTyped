package typingsSlinky.ol

import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/format/filter/Bbox", JSImport.Namespace)
@js.native
object bboxMod extends js.Object {
  
  @js.native
  class default protected ()
    extends typingsSlinky.ol.filterFilterMod.default {
    def this(geometryName: String, extent: Extent) = this()
    def this(geometryName: String, extent: Extent, opt_srsName: String) = this()
  }
  
  type Bbox = typingsSlinky.ol.filterFilterMod.default
}
