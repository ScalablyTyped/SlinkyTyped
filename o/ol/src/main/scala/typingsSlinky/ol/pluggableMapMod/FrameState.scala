package typingsSlinky.ol.pluggableMapMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.layerLayerMod.State
import typingsSlinky.ol.olMod.Transform
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameState extends js.Object {
  var animate: Boolean = js.native
  var coordinateToPixelTransform: Transform = js.native
  var declutterItems: js.Array[DeclutterItems] = js.native
  var extent: Extent = js.native
  var index: Double = js.native
  var layerIndex: Double = js.native
  var layerStatesArray: js.Array[State] = js.native
  var pixelRatio: Double = js.native
  var pixelToCoordinateTransform: Transform = js.native
  var postRenderFunctions: js.Array[PostRenderFunction] = js.native
  var size: Size = js.native
  var tileQueue: typingsSlinky.ol.tileQueueMod.default = js.native
  var time: Double = js.native
  var usedTiles: StringDictionary[StringDictionary[Boolean]] = js.native
  var viewHints: js.Array[Double] = js.native
  var viewState: typingsSlinky.ol.viewMod.State = js.native
  var wantedTiles: StringDictionary[StringDictionary[Boolean]] = js.native
}

object FrameState {
  @scala.inline
  def apply(
    animate: Boolean,
    coordinateToPixelTransform: Transform,
    declutterItems: js.Array[DeclutterItems],
    extent: Extent,
    index: Double,
    layerIndex: Double,
    layerStatesArray: js.Array[State],
    pixelRatio: Double,
    pixelToCoordinateTransform: Transform,
    postRenderFunctions: js.Array[PostRenderFunction],
    size: Size,
    tileQueue: typingsSlinky.ol.tileQueueMod.default,
    time: Double,
    usedTiles: StringDictionary[StringDictionary[Boolean]],
    viewHints: js.Array[Double],
    viewState: typingsSlinky.ol.viewMod.State,
    wantedTiles: StringDictionary[StringDictionary[Boolean]]
  ): FrameState = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], coordinateToPixelTransform = coordinateToPixelTransform.asInstanceOf[js.Any], declutterItems = declutterItems.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], layerIndex = layerIndex.asInstanceOf[js.Any], layerStatesArray = layerStatesArray.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], pixelToCoordinateTransform = pixelToCoordinateTransform.asInstanceOf[js.Any], postRenderFunctions = postRenderFunctions.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tileQueue = tileQueue.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], usedTiles = usedTiles.asInstanceOf[js.Any], viewHints = viewHints.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any], wantedTiles = wantedTiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameState]
  }
  @scala.inline
  implicit class FrameStateOps[Self <: FrameState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoordinateToPixelTransform(value: Transform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateToPixelTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclutterItems(value: js.Array[DeclutterItems]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declutterItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtent(value: Extent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerStatesArray(value: js.Array[State]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerStatesArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelToCoordinateTransform(value: Transform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelToCoordinateTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostRenderFunctions(value: js.Array[PostRenderFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postRenderFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileQueue(value: typingsSlinky.ol.tileQueueMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedTiles(value: StringDictionary[StringDictionary[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedTiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewHints(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewState(value: typingsSlinky.ol.viewMod.State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWantedTiles(value: StringDictionary[StringDictionary[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wantedTiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

