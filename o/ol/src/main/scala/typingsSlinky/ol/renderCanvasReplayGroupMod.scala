package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.renderCanvasMod.DeclutterGroup
import typingsSlinky.ol.renderCanvasReplayGroupMod.CanvasReplayGroup
import typingsSlinky.ol.renderReplayTypeMod.ReplayType
import typingsSlinky.ol.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/ReplayGroup", JSImport.Namespace)
@js.native
object renderCanvasReplayGroupMod extends js.Object {
  @js.native
  trait CanvasReplayGroup
    extends typingsSlinky.ol.renderReplayGroupMod.default {
    def clip(context: CanvasRenderingContext2D, transform: Transform): Unit = js.native
    def finish(): Unit = js.native
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      resolution: Double,
      rotation: Double,
      hitTolerance: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      callback: js.Function1[
          /* p0 */ typingsSlinky.ol.featureMod.default | typingsSlinky.ol.renderFeatureMod.default, 
          T
        ],
      declutterReplays: StringDictionary[DeclutterGroup]
    ): js.UndefOr[T] = js.native
    def getClipCoords(transform: Transform): js.Array[Double] = js.native
    def getReplays(): StringDictionary[typingsSlinky.ol.olStrings.CanvasReplayGroup with js.Any] = js.native
    def hasReplays(replays: js.Array[ReplayType]): Boolean = js.native
    def replay(
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      snapToPixel: Boolean
    ): Unit = js.native
    def replay(
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      snapToPixel: Boolean,
      opt_replayTypes: js.Array[ReplayType]
    ): Unit = js.native
    def replay(
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      snapToPixel: Boolean,
      opt_replayTypes: js.Array[ReplayType],
      opt_declutterReplays: StringDictionary[DeclutterGroup]
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasReplayGroup {
    def this(
      tolerance: Double,
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      declutterTree: js.Any
    ) = this()
    def this(
      tolerance: Double,
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      declutterTree: js.Any,
      opt_renderBuffer: Double
    ) = this()
  }
  
  def getCircleArray(radius: Double): js.Array[js.Array[js.UndefOr[Boolean]]] = js.native
  def replayDeclutter(
    declutterReplays: StringDictionary[js.Array[_]],
    context: CanvasRenderingContext2D,
    rotation: Double,
    snapToPixel: Boolean
  ): Unit = js.native
}

