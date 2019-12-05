package typingsSlinky.reDashResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enable extends js.Object {
  var enable: Anon_Bottom
  var grid: js.Array[Double]
  var lockAspectRatio: Boolean
  var lockAspectRatioExtraHeight: Double
  var lockAspectRatioExtraWidth: Double
  var resizeRatio: Double
  var scale: Double
  var snapGap: Double
  def onResize(): Unit
  def onResizeStart(): Unit
  def onResizeStop(): Unit
}

object Anon_Enable {
  @scala.inline
  def apply(
    enable: Anon_Bottom,
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
  ): Anon_Enable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], lockAspectRatio = lockAspectRatio.asInstanceOf[js.Any], lockAspectRatioExtraHeight = lockAspectRatioExtraHeight.asInstanceOf[js.Any], lockAspectRatioExtraWidth = lockAspectRatioExtraWidth.asInstanceOf[js.Any], onResize = js.Any.fromFunction0(onResize), onResizeStart = js.Any.fromFunction0(onResizeStart), onResizeStop = js.Any.fromFunction0(onResizeStop), resizeRatio = resizeRatio.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], snapGap = snapGap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Enable]
  }
}

