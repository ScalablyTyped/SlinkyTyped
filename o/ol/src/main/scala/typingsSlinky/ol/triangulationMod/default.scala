package typingsSlinky.ol.triangulationMod

import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/reproj/Triangulation", JSImport.Default)
@js.native
class default protected () extends Triangulation {
  def this(
    sourceProj: typingsSlinky.ol.projectionMod.default,
    targetProj: typingsSlinky.ol.projectionMod.default,
    targetExtent: Extent,
    maxSourceExtent: Extent,
    errorThreshold: Double,
    opt_destinationResolution: Double
  ) = this()
}
