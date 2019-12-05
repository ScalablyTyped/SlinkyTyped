package typingsSlinky.ol

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.renderWebglLineStringReplayMod.WebGLLineStringReplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/LineStringReplay", JSImport.Namespace)
@js.native
object renderWebglLineStringReplayMod extends js.Object {
  @js.native
  trait WebGLLineStringReplay
    extends typingsSlinky.ol.renderWebglReplayMod.default {
    def drawPolygonCoordinates(flatCoordinates: js.Array[Double], holeFlatCoordinates: js.Array[js.Array[Double]], stride: Double): Unit = js.native
    def getCurrentIndex(): Double = js.native
    def setPolygonStyle(feature: typingsSlinky.ol.featureMod.default): Unit = js.native
    def setPolygonStyle(feature: typingsSlinky.ol.featureMod.default, opt_index: Double): Unit = js.native
    def setPolygonStyle(feature: typingsSlinky.ol.renderFeatureMod.default): Unit = js.native
    def setPolygonStyle(feature: typingsSlinky.ol.renderFeatureMod.default, opt_index: Double): Unit = js.native
  }
  
  @js.native
  class default protected () extends WebGLLineStringReplay {
    def this(tolerance: Double, maxExtent: Extent) = this()
  }
  
}

