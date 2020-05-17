package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slot extends js.Object {
  var attachment: js.Any = js.native
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
  var hackAttachment: Attachment = js.native
  var hackRegion: TextureRegion = js.native
  var meshes: js.Any = js.native
  var sprites: js.Any = js.native
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
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], attachmentTime = attachmentTime.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], bone = bone.asInstanceOf[js.Any], clippingContainer = clippingContainer.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], currentGraphics = currentGraphics.asInstanceOf[js.Any], currentMesh = currentMesh.asInstanceOf[js.Any], currentMeshName = currentMeshName.asInstanceOf[js.Any], currentSprite = currentSprite.asInstanceOf[js.Any], currentSpriteName = currentSpriteName.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deform = deform.asInstanceOf[js.Any], getAttachment = js.Any.fromFunction0(getAttachment), getAttachmentTime = js.Any.fromFunction0(getAttachmentTime), hackAttachment = hackAttachment.asInstanceOf[js.Any], hackRegion = hackRegion.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any], setAttachment = js.Any.fromFunction1(setAttachment), setAttachmentTime = js.Any.fromFunction1(setAttachmentTime), setToSetupPose = js.Any.fromFunction0(setToSetupPose), sprites = sprites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
  @scala.inline
  implicit class SlotOps[Self <: Slot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachmentTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBone(value: Bone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClippingContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentGraphics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentGraphics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentMesh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentMeshName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMeshName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSprite(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSprite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSpriteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSpriteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDarkColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: SlotData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeform(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAttachment(value: () => Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttachment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttachmentTime(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttachmentTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHackAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHackRegion(value: TextureRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hackRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeshes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAttachment(value: Attachment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttachment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAttachmentTime(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttachmentTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetToSetupPose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToSetupPose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSprites(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprites")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

