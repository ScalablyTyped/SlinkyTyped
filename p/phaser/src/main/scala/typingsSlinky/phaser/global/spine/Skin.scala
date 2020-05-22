package typingsSlinky.phaser.global.spine

import typingsSlinky.phaser.spine.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Skin")
@js.native
class Skin protected ()
  extends typingsSlinky.phaser.spine.Skin {
  def this(name: String) = this()
  /* CompleteClass */
  override var attachments: js.Array[Map[typingsSlinky.phaser.spine.Attachment]] = js.native
  /* CompleteClass */
  override var bones: js.Array[typingsSlinky.phaser.spine.BoneData] = js.native
  /* CompleteClass */
  override var constraints: js.Array[typingsSlinky.phaser.spine.ConstraintData] = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def addSkin(skin: typingsSlinky.phaser.spine.Skin): Unit = js.native
  /* CompleteClass */
  override def attachAll(skeleton: typingsSlinky.phaser.spine.Skeleton, oldSkin: typingsSlinky.phaser.spine.Skin): Unit = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def copySkin(skin: typingsSlinky.phaser.spine.Skin): Unit = js.native
  /* CompleteClass */
  override def getAttachment(slotIndex: Double, name: String): typingsSlinky.phaser.spine.Attachment = js.native
  /* CompleteClass */
  override def getAttachments(): js.Array[typingsSlinky.phaser.spine.SkinEntry] = js.native
  /* CompleteClass */
  override def getAttachmentsForSlot(slotIndex: Double, attachments: js.Array[typingsSlinky.phaser.spine.SkinEntry]): Unit = js.native
  /* CompleteClass */
  override def removeAttachment(slotIndex: Double, name: String): Unit = js.native
  /* CompleteClass */
  override def setAttachment(slotIndex: Double, name: String, attachment: typingsSlinky.phaser.spine.Attachment): Unit = js.native
}

