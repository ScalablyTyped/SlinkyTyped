package typingsSlinky.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentTimeline extends Timeline {
  
  var attachmentNames: js.Array[String] = js.native
  
  var frames: ArrayLike[Double] = js.native
  
  def getFrameCount(): Double = js.native
  
  def setAttachment(skeleton: Skeleton, slot: Slot, attachmentName: String): Unit = js.native
  
  def setFrame(frameIndex: Double, time: Double, attachmentName: String): Unit = js.native
  
  var slotIndex: Double = js.native
}
object AttachmentTimeline {
  
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    attachmentNames: js.Array[String],
    frames: ArrayLike[Double],
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setAttachment: (Skeleton, Slot, String) => Unit,
    setFrame: (Double, Double, String) => Unit,
    slotIndex: Double
  ): AttachmentTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), attachmentNames = attachmentNames.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setAttachment = js.Any.fromFunction3(setAttachment), setFrame = js.Any.fromFunction3(setFrame), slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentTimeline]
  }
  
  @scala.inline
  implicit class AttachmentTimelineMutableBuilder[Self <: AttachmentTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentNames(value: js.Array[String]): Self = StObject.set(x, "attachmentNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentNamesVarargs(value: String*): Self = StObject.set(x, "attachmentNames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFrameCount(value: () => Double): Self = StObject.set(x, "getFrameCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAttachment(value: (Skeleton, Slot, String) => Unit): Self = StObject.set(x, "setAttachment", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetFrame(value: (Double, Double, String) => Unit): Self = StObject.set(x, "setFrame", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSlotIndex(value: Double): Self = StObject.set(x, "slotIndex", value.asInstanceOf[js.Any])
  }
}
