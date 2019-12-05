package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.renderWebglReplayGroupMod.WebGLReplayGroup
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/ReplayGroup", JSImport.Namespace)
@js.native
object renderWebglReplayGroupMod extends js.Object {
  @js.native
  trait WebGLReplayGroup
    extends typingsSlinky.ol.renderReplayGroupMod.default {
    def finish(context: typingsSlinky.ol.webglContextMod.default): Unit = js.native
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      context: typingsSlinky.ol.webglContextMod.default,
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      size: Size,
      pixelRatio: Double,
      opacity: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      callback: js.Function1[
          /* p0 */ typingsSlinky.ol.featureMod.default | typingsSlinky.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ]
    ): js.UndefOr[T] = js.native
    def getDeleteResourcesFunction(context: typingsSlinky.ol.webglContextMod.default): js.Function0[Unit] = js.native
    def hasFeatureAtCoordinate(
      coordinate: Coordinate,
      context: typingsSlinky.ol.webglContextMod.default,
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      size: Size,
      pixelRatio: Double,
      opacity: Double,
      skippedFeaturesHash: StringDictionary[Boolean]
    ): Boolean = js.native
    def replay(
      context: typingsSlinky.ol.webglContextMod.default,
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      size: Size,
      pixelRatio: Double,
      opacity: Double,
      skippedFeaturesHash: StringDictionary[Boolean]
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends WebGLReplayGroup {
    def this(tolerance: Double, maxExtent: Extent) = this()
    def this(tolerance: Double, maxExtent: Extent, opt_renderBuffer: Double) = this()
  }
  
}

