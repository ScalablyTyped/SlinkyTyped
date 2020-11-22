package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slot extends js.Object {
  
  var attachment: Attachment = js.native
  
  var attachmentState: Double = js.native
  
  var attachmentTime: js.Any = js.native
  
  var blendMode: Double = js.native
  
  var bone: Bone = js.native
  
  var clippingContainer: js.Any = js.native
  
  var color: Color = js.native
  
  var currentGraphics: js.Any = js.native
  
  var currentMesh: js.Any = js.native
  
  var currentMeshName: String = js.native
  
  var currentSprite: js.Any = js.native
  
  var currentSpriteName: String = js.native
  
  var darkColor: Color = js.native
  
  var data: SlotData = js.native
  
  var deform: js.Array[Double] = js.native
  
  def getAttachment(): Attachment = js.native
  
  def getAttachmentTime(): Double = js.native
  
  var hackAttachment: Attachment = js.native
  
  var hackRegion: TextureRegion = js.native
  
  var meshes: js.Any = js.native
  
  def setAttachment(attachment: Attachment): Unit = js.native
  
  def setAttachmentTime(time: Double): Unit = js.native
  
  def setToSetupPose(): Unit = js.native
  
  var sprites: js.Any = js.native
}
object Slot {
  
  @scala.inline
  def apply(
    attachment: Attachment,
    attachmentState: Double,
    attachmentTime: js.Any,
    blendMode: Double,
    bone: Bone,
    clippingContainer: js.Any,
    color: Color,
    currentGraphics: js.Any,
    currentMesh: js.Any,
    currentMeshName: String,
    currentSprite: js.Any,
    currentSpriteName: String,
    darkColor: Color,
    data: SlotData,
    deform: js.Array[Double],
    getAttachment: () => Attachment,
    getAttachmentTime: () => Double,
    hackAttachment: Attachment,
    hackRegion: TextureRegion,
    meshes: js.Any,
    setAttachment: Attachment => Unit,
    setAttachmentTime: Double => Unit,
    setToSetupPose: () => Unit,
    sprites: js.Any
  ): Slot = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], attachmentState = attachmentState.asInstanceOf[js.Any], attachmentTime = attachmentTime.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], bone = bone.asInstanceOf[js.Any], clippingContainer = clippingContainer.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], currentGraphics = currentGraphics.asInstanceOf[js.Any], currentMesh = currentMesh.asInstanceOf[js.Any], currentMeshName = currentMeshName.asInstanceOf[js.Any], currentSprite = currentSprite.asInstanceOf[js.Any], currentSpriteName = currentSpriteName.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deform = deform.asInstanceOf[js.Any], getAttachment = js.Any.fromFunction0(getAttachment), getAttachmentTime = js.Any.fromFunction0(getAttachmentTime), hackAttachment = hackAttachment.asInstanceOf[js.Any], hackRegion = hackRegion.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any], setAttachment = js.Any.fromFunction1(setAttachment), setAttachmentTime = js.Any.fromFunction1(setAttachmentTime), setToSetupPose = js.Any.fromFunction0(setToSetupPose), sprites = sprites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
  
  @scala.inline
  implicit class SlotOps[Self <: Slot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachment(value: Attachment): Self = this.set("attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentState(value: Double): Self = this.set("attachmentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentTime(value: js.Any): Self = this.set("attachmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendMode(value: Double): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBone(value: Bone): Self = this.set("bone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingContainer(value: js.Any): Self = this.set("clippingContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentGraphics(value: js.Any): Self = this.set("currentGraphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMesh(value: js.Any): Self = this.set("currentMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMeshName(value: String): Self = this.set("currentMeshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSprite(value: js.Any): Self = this.set("currentSprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSpriteName(value: String): Self = this.set("currentSpriteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkColor(value: Color): Self = this.set("darkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: SlotData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeformVarargs(value: Double*): Self = this.set("deform", js.Array(value :_*))
    
    @scala.inline
    def setDeform(value: js.Array[Double]): Self = this.set("deform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAttachment(value: () => Attachment): Self = this.set("getAttachment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttachmentTime(value: () => Double): Self = this.set("getAttachmentTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHackAttachment(value: Attachment): Self = this.set("hackAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHackRegion(value: TextureRegion): Self = this.set("hackRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshes(value: js.Any): Self = this.set("meshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAttachment(value: Attachment => Unit): Self = this.set("setAttachment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttachmentTime(value: Double => Unit): Self = this.set("setAttachmentTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetToSetupPose(value: () => Unit): Self = this.set("setToSetupPose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSprites(value: js.Any): Self = this.set("sprites", value.asInstanceOf[js.Any])
  }
}
