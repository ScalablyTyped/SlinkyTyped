package typingsSlinky.phaser.global.spine

import typingsSlinky.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.ClippingAttachment")
@js.native
class ClippingAttachment protected ()
  extends typingsSlinky.phaser.spine.ClippingAttachment {
  def this(name: String) = this()
  /* CompleteClass */
  override var bones: js.Array[Double] = js.native
  /* CompleteClass */
  override var color: typingsSlinky.phaser.spine.Color = js.native
  /* CompleteClass */
  override var deformAttachment: typingsSlinky.phaser.spine.VertexAttachment = js.native
  /* CompleteClass */
  override var endSlot: typingsSlinky.phaser.spine.SlotData = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var vertices: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var worldVerticesLength: Double = js.native
  /* CompleteClass */
  override def computeWorldVertices(
    slot: typingsSlinky.phaser.spine.Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  /* CompleteClass */
  override def copy(): typingsSlinky.phaser.spine.Attachment = js.native
  /* CompleteClass */
  override def copyTo(attachment: typingsSlinky.phaser.spine.VertexAttachment): Unit = js.native
}

