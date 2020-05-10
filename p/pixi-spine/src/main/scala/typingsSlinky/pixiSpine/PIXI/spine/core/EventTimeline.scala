package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.EventTimeline")
@js.native
class EventTimeline protected () extends Timeline {
  def this(frameCount: Double) = this()
  var events: js.Array[Event] = js.native
  var frames: ArrayLike[Double] = js.native
  def getFrameCount(): Double = js.native
  def setFrame(frameIndex: Double, event: Event): Unit = js.native
}

