package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.AttachmentTimeline")
@js.native
class AttachmentTimeline protected () extends Timeline {
  def this(frameCount: Double) = this()
  var attachmentNames: js.Array[String] = js.native
  var frames: ArrayLike[Double] = js.native
  var slotIndex: Double = js.native
  def getFrameCount(): Double = js.native
  def setFrame(frameIndex: Double, time: Double, attachmentName: String): Unit = js.native
}

