package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentTimeline extends Timeline {
  var attachmentNames: js.Array[String] = js.native
  var frames: ArrayLike[Double] = js.native
  var slotIndex: Double = js.native
  def getFrameCount(): Double = js.native
  def setFrame(frameIndex: Double, time: Double, attachmentName: String): Unit = js.native
}

object AttachmentTimeline {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    attachmentNames: js.Array[String],
    frames: ArrayLike[Double],
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setFrame: (Double, Double, String) => Unit,
    slotIndex: Double
  ): AttachmentTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), attachmentNames = attachmentNames.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setFrame = js.Any.fromFunction3(setFrame), slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentTimeline]
  }
  @scala.inline
  implicit class AttachmentTimelineOps[Self <: AttachmentTimeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentNames")(value.asInstanceOf[js.Any])
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
    def withSetFrame(value: (Double, Double, String) => Unit): Self = {
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

