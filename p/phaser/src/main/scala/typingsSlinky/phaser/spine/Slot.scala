package typingsSlinky.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slot extends StObject {
  
  var attachment: js.Any = js.native
  
  var attachmentTime: js.Any = js.native
  
  var bone: Bone = js.native
  
  var color: Color = js.native
  
  var darkColor: Color = js.native
  
  var data: SlotData = js.native
  
  var deform: js.Array[Double] = js.native
  
  def getAttachment(): Attachment = js.native
  
  def getAttachmentTime(): Double = js.native
  
  def setAttachment(attachment: Attachment): Unit = js.native
  
  def setAttachmentTime(time: Double): Unit = js.native
  
  def setToSetupPose(): Unit = js.native
}
object Slot {
  
  @scala.inline
  def apply(
    attachment: js.Any,
    attachmentTime: js.Any,
    bone: Bone,
    color: Color,
    darkColor: Color,
    data: SlotData,
    deform: js.Array[Double],
    getAttachment: () => Attachment,
    getAttachmentTime: () => Double,
    setAttachment: Attachment => Unit,
    setAttachmentTime: Double => Unit,
    setToSetupPose: () => Unit
  ): Slot = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], attachmentTime = attachmentTime.asInstanceOf[js.Any], bone = bone.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deform = deform.asInstanceOf[js.Any], getAttachment = js.Any.fromFunction0(getAttachment), getAttachmentTime = js.Any.fromFunction0(getAttachmentTime), setAttachment = js.Any.fromFunction1(setAttachment), setAttachmentTime = js.Any.fromFunction1(setAttachmentTime), setToSetupPose = js.Any.fromFunction0(setToSetupPose))
    __obj.asInstanceOf[Slot]
  }
  
  @scala.inline
  implicit class SlotMutableBuilder[Self <: Slot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: js.Any): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentTime(value: js.Any): Self = StObject.set(x, "attachmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBone(value: Bone): Self = StObject.set(x, "bone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkColor(value: Color): Self = StObject.set(x, "darkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: SlotData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeform(value: js.Array[Double]): Self = StObject.set(x, "deform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeformVarargs(value: Double*): Self = StObject.set(x, "deform", js.Array(value :_*))
    
    @scala.inline
    def setGetAttachment(value: () => Attachment): Self = StObject.set(x, "getAttachment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttachmentTime(value: () => Double): Self = StObject.set(x, "getAttachmentTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAttachment(value: Attachment => Unit): Self = StObject.set(x, "setAttachment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttachmentTime(value: Double => Unit): Self = StObject.set(x, "setAttachmentTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetToSetupPose(value: () => Unit): Self = StObject.set(x, "setToSetupPose", js.Any.fromFunction0(value))
  }
}
