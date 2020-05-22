package typingsSlinky.pixiSpine.global.PIXI.spine.core

import typingsSlinky.pixiSpine.PIXI.spine.core.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Skin")
@js.native
class Skin protected ()
  extends typingsSlinky.pixiSpine.PIXI.spine.core.Skin {
  def this(name: String) = this()
  /* CompleteClass */
  override var attachments: js.Array[Map[typingsSlinky.pixiSpine.PIXI.spine.core.Attachment]] = js.native
  /* CompleteClass */
  override var bones: js.Array[typingsSlinky.pixiSpine.PIXI.spine.core.BoneData] = js.native
  /* CompleteClass */
  override var constraints: js.Array[typingsSlinky.pixiSpine.PIXI.spine.core.ConstraintData] = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def addSkin(skin: typingsSlinky.pixiSpine.PIXI.spine.core.Skin): Unit = js.native
  /* CompleteClass */
  override def attachAll(
    skeleton: typingsSlinky.pixiSpine.PIXI.spine.core.Skeleton,
    oldSkin: typingsSlinky.pixiSpine.PIXI.spine.core.Skin
  ): Unit = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def copySkin(skin: typingsSlinky.pixiSpine.PIXI.spine.core.Skin): Unit = js.native
  /* CompleteClass */
  override def getAttachment(slotIndex: Double, name: String): typingsSlinky.pixiSpine.PIXI.spine.core.Attachment = js.native
  /* CompleteClass */
  override def getAttachments(): js.Array[typingsSlinky.pixiSpine.PIXI.spine.core.SkinEntry] = js.native
  /* CompleteClass */
  override def getAttachmentsForSlot(slotIndex: Double, attachments: js.Array[typingsSlinky.pixiSpine.PIXI.spine.core.SkinEntry]): Unit = js.native
  /* CompleteClass */
  override def removeAttachment(slotIndex: Double, name: String): Unit = js.native
  /* CompleteClass */
  override def setAttachment(slotIndex: Double, name: String, attachment: typingsSlinky.pixiSpine.PIXI.spine.core.Attachment): Unit = js.native
}

