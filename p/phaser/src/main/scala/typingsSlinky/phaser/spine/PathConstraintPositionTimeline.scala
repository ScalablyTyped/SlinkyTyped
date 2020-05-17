package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathConstraintPositionTimeline extends CurveTimeline {
  var frames: ArrayLike[Double] = js.native
  var pathConstraintIndex: Double = js.native
  def setFrame(frameIndex: Double, time: Double, value: Double): Unit = js.native
}

object PathConstraintPositionTimeline {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    curves: js.Any,
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    pathConstraintIndex: Double,
    setCurve: (Double, Double, Double, Double, Double) => Unit,
    setFrame: (Double, Double, Double) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit
  ): PathConstraintPositionTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), curves = curves.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), pathConstraintIndex = pathConstraintIndex.asInstanceOf[js.Any], setCurve = js.Any.fromFunction5(setCurve), setFrame = js.Any.fromFunction3(setFrame), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped))
    __obj.asInstanceOf[PathConstraintPositionTimeline]
  }
  @scala.inline
  implicit class PathConstraintPositionTimelineOps[Self <: PathConstraintPositionTimeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrames(value: ArrayLike[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathConstraintIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathConstraintIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFrame(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrame")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

