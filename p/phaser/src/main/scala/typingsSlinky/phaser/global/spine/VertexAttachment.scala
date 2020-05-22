package typingsSlinky.phaser.global.spine

import typingsSlinky.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.VertexAttachment")
@js.native
abstract class VertexAttachment protected ()
  extends typingsSlinky.phaser.spine.VertexAttachment {
  def this(name: String) = this()
  /* CompleteClass */
  override var bones: js.Array[Double] = js.native
  /* CompleteClass */
  override var deformAttachment: typingsSlinky.phaser.spine.VertexAttachment = js.native
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

/* static members */
@JSGlobal("spine.VertexAttachment")
@js.native
object VertexAttachment extends js.Object {
  var nextID: js.Any = js.native
}

