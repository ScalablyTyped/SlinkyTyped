package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawOrderTimeline extends Timeline {
  var drawOrders: js.Array[js.Array[Double]] = js.native
  var frames: ArrayLike[Double] = js.native
  def getFrameCount(): Double = js.native
  def setFrame(frameIndex: Double, time: Double, drawOrder: js.Array[Double]): Unit = js.native
}

object DrawOrderTimeline {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    drawOrders: js.Array[js.Array[Double]],
    frames: ArrayLike[Double],
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setFrame: (Double, Double, js.Array[Double]) => Unit
  ): DrawOrderTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), drawOrders = drawOrders.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setFrame = js.Any.fromFunction3(setFrame))
    __obj.asInstanceOf[DrawOrderTimeline]
  }
  @scala.inline
  implicit class DrawOrderTimelineOps[Self <: DrawOrderTimeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawOrders(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawOrders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrames(value: ArrayLike[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFrameCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrameCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFrame(value: (Double, Double, js.Array[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrame")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

