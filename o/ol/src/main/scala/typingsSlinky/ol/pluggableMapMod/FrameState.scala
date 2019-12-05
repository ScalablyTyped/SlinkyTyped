package typingsSlinky.ol.pluggableMapMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.layerLayerMod.State
import typingsSlinky.ol.sizeMod.Size
import typingsSlinky.ol.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameState extends js.Object {
  var animate: Boolean
  var coordinateToPixelTransform: Transform
  var extent: Extent
  var focus: Coordinate
  var index: Double
  var layerStates: StringDictionary[State]
  var layerStatesArray: js.Array[State]
  var pixelRatio: Double
  var pixelToCoordinateTransform: Transform
  var postRenderFunctions: js.Array[PostRenderFunction]
  var size: Size
  var skippedFeatureUids: StringDictionary[Boolean]
  var tileQueue: typingsSlinky.ol.tileQueueMod.default
  var time: Double
  var usedTiles: StringDictionary[StringDictionary[typingsSlinky.ol.tileRangeMod.default]]
  var viewHints: js.Array[Double]
  var viewState: typingsSlinky.ol.viewMod.State
  var wantedTiles: StringDictionary[StringDictionary[Boolean]]
}

object FrameState {
  @scala.inline
  def apply(
    animate: Boolean,
    coordinateToPixelTransform: Transform,
    extent: Extent,
    focus: Coordinate,
    index: Double,
    layerStates: StringDictionary[State],
    layerStatesArray: js.Array[State],
    pixelRatio: Double,
    pixelToCoordinateTransform: Transform,
    postRenderFunctions: js.Array[PostRenderFunction],
    size: Size,
    skippedFeatureUids: StringDictionary[Boolean],
    tileQueue: typingsSlinky.ol.tileQueueMod.default,
    time: Double,
    usedTiles: StringDictionary[StringDictionary[typingsSlinky.ol.tileRangeMod.default]],
    viewHints: js.Array[Double],
    viewState: typingsSlinky.ol.viewMod.State,
    wantedTiles: StringDictionary[StringDictionary[Boolean]]
  ): FrameState = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], coordinateToPixelTransform = coordinateToPixelTransform.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], layerStates = layerStates.asInstanceOf[js.Any], layerStatesArray = layerStatesArray.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], pixelToCoordinateTransform = pixelToCoordinateTransform.asInstanceOf[js.Any], postRenderFunctions = postRenderFunctions.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], skippedFeatureUids = skippedFeatureUids.asInstanceOf[js.Any], tileQueue = tileQueue.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], usedTiles = usedTiles.asInstanceOf[js.Any], viewHints = viewHints.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any], wantedTiles = wantedTiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FrameState]
  }
}

