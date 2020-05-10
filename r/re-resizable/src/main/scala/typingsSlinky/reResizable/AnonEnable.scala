package typingsSlinky.reResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnable extends js.Object {
  var enable: AnonBottom = js.native
  var grid: js.Array[Double] = js.native
  var lockAspectRatio: Boolean = js.native
  var lockAspectRatioExtraHeight: Double = js.native
  var lockAspectRatioExtraWidth: Double = js.native
  var resizeRatio: Double = js.native
  var scale: Double = js.native
  var snapGap: Double = js.native
  def onResize(): Unit = js.native
  def onResizeStart(): Unit = js.native
  def onResizeStop(): Unit = js.native
}

object AnonEnable {
  @scala.inline
  def apply(
    enable: AnonBottom,
    grid: js.Array[Double],
    lockAspectRatio: Boolean,
    lockAspectRatioExtraHeight: Double,
    lockAspectRatioExtraWidth: Double,
    onResize: () => Unit,
    onResizeStart: () => Unit,
    onResizeStop: () => Unit,
    resizeRatio: Double,
    scale: Double,
    snapGap: Double
  ): AnonEnable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], lockAspectRatio = lockAspectRatio.asInstanceOf[js.Any], lockAspectRatioExtraHeight = lockAspectRatioExtraHeight.asInstanceOf[js.Any], lockAspectRatioExtraWidth = lockAspectRatioExtraWidth.asInstanceOf[js.Any], onResize = js.Any.fromFunction0(onResize), onResizeStart = js.Any.fromFunction0(onResizeStart), onResizeStop = js.Any.fromFunction0(onResizeStop), resizeRatio = resizeRatio.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], snapGap = snapGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnable]
  }
  @scala.inline
  implicit class AnonEnableOps[Self <: AnonEnable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrid(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockAspectRatioExtraHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatioExtraHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockAspectRatioExtraWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatioExtraWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnResize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnResizeStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnResizeStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResizeRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapGap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

