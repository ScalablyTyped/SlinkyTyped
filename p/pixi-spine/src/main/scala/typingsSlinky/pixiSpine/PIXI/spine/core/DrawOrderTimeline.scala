package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.DrawOrderTimeline")
@js.native
class DrawOrderTimeline protected () extends Timeline {
  def this(frameCount: Double) = this()
  var drawOrders: js.Array[js.Array[Double]] = js.native
  var frames: ArrayLike[Double] = js.native
  def getFrameCount(): Double = js.native
  def setFrame(frameIndex: Double, time: Double, drawOrder: js.Array[Double]): Unit = js.native
}

