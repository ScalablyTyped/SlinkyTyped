package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashLayer extends js.Object {
  var color: js.Any = js.native
  var frameCount: Double = js.native
  var frames: js.Array[FlashFrame] = js.native
  var height: Double = js.native
  var layerType: String = js.native
  var locked: Boolean = js.native
  var name: String = js.native
  var outline: Boolean = js.native
  var parentLayer: FlashLayer = js.native
  var visible: Boolean = js.native
}

object FlashLayer {
  @scala.inline
  def apply(
    color: js.Any,
    frameCount: Double,
    frames: js.Array[FlashFrame],
    height: Double,
    layerType: String,
    locked: Boolean,
    name: String,
    outline: Boolean,
    parentLayer: FlashLayer,
    visible: Boolean
  ): FlashLayer = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], parentLayer = parentLayer.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashLayer]
  }
  @scala.inline
  implicit class FlashLayerOps[Self <: FlashLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrames(value: js.Array[FlashFrame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentLayer(value: FlashLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

