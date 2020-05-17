package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeformTimeline extends CurveTimeline {
  var attachment: VertexAttachment = js.native
  var frameVertices: js.Array[ArrayLike[Double]] = js.native
  var frames: ArrayLike[Double] = js.native
  var slotIndex: Double = js.native
  def setFrame(frameIndex: Double, time: Double, vertices: ArrayLike[Double]): Unit = js.native
}

object DeformTimeline {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    attachment: VertexAttachment,
    curves: js.Any,
    frameVertices: js.Array[ArrayLike[Double]],
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setCurve: (Double, Double, Double, Double, Double) => Unit,
    setFrame: (Double, Double, ArrayLike[Double]) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit,
    slotIndex: Double
  ): DeformTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), attachment = attachment.asInstanceOf[js.Any], curves = curves.asInstanceOf[js.Any], frameVertices = frameVertices.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setCurve = js.Any.fromFunction5(setCurve), setFrame = js.Any.fromFunction3(setFrame), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped), slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeformTimeline]
  }
  @scala.inline
  implicit class DeformTimelineOps[Self <: DeformTimeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: VertexAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameVertices(value: js.Array[ArrayLike[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameVertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrames(value: ArrayLike[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFrame(value: (Double, Double, ArrayLike[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrame")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSlotIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

