package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Skin extends js.Object {
  var attachments: js.Array[Map[Attachment]] = js.native
  var bones: js.Array[BoneData] = js.native
  var constraints: js.Array[ConstraintData] = js.native
  var name: String = js.native
  def addSkin(skin: Skin): Unit = js.native
  def attachAll(skeleton: Skeleton, oldSkin: Skin): Unit = js.native
  def clear(): Unit = js.native
  def copySkin(skin: Skin): Unit = js.native
  def getAttachment(slotIndex: Double, name: String): Attachment = js.native
  def getAttachments(): js.Array[SkinEntry] = js.native
  def getAttachmentsForSlot(slotIndex: Double, attachments: js.Array[SkinEntry]): Unit = js.native
  def removeAttachment(slotIndex: Double, name: String): Unit = js.native
  def setAttachment(slotIndex: Double, name: String, attachment: Attachment): Unit = js.native
}

object Skin {
  @scala.inline
  def apply(
    addSkin: Skin => Unit,
    attachAll: (Skeleton, Skin) => Unit,
    attachments: js.Array[Map[Attachment]],
    bones: js.Array[BoneData],
    clear: () => Unit,
    constraints: js.Array[ConstraintData],
    copySkin: Skin => Unit,
    getAttachment: (Double, String) => Attachment,
    getAttachments: () => js.Array[SkinEntry],
    getAttachmentsForSlot: (Double, js.Array[SkinEntry]) => Unit,
    name: String,
    removeAttachment: (Double, String) => Unit,
    setAttachment: (Double, String, Attachment) => Unit
  ): Skin = {
    val __obj = js.Dynamic.literal(addSkin = js.Any.fromFunction1(addSkin), attachAll = js.Any.fromFunction2(attachAll), attachments = attachments.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), constraints = constraints.asInstanceOf[js.Any], copySkin = js.Any.fromFunction1(copySkin), getAttachment = js.Any.fromFunction2(getAttachment), getAttachments = js.Any.fromFunction0(getAttachments), getAttachmentsForSlot = js.Any.fromFunction2(getAttachmentsForSlot), name = name.asInstanceOf[js.Any], removeAttachment = js.Any.fromFunction2(removeAttachment), setAttachment = js.Any.fromFunction3(setAttachment))
    __obj.asInstanceOf[Skin]
  }
  @scala.inline
  implicit class SkinOps[Self <: Skin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSkin(value: Skin => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSkin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttachAll(value: (Skeleton, Skin) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachAll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAttachments(value: js.Array[Map[Attachment]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBones(value: js.Array[BoneData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConstraints(value: js.Array[ConstraintData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopySkin(value: Skin => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copySkin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttachment(value: (Double, String) => Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttachment")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAttachments(value: () => js.Array[SkinEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttachments")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttachmentsForSlot(value: (Double, js.Array[SkinEntry]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttachmentsForSlot")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveAttachment(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttachment")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAttachment(value: (Double, String, Attachment) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttachment")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

