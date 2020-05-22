package typingsSlinky.phaser.global.spine

import typingsSlinky.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.MeshAttachment")
@js.native
class MeshAttachment protected ()
  extends typingsSlinky.phaser.spine.MeshAttachment {
  def this(name: String) = this()
  /* CompleteClass */
  override var bones: js.Array[Double] = js.native
  /* CompleteClass */
  override var color: typingsSlinky.phaser.spine.Color = js.native
  /* CompleteClass */
  override var deformAttachment: typingsSlinky.phaser.spine.VertexAttachment = js.native
  /* CompleteClass */
  override var edges: js.Array[Double] = js.native
  /* CompleteClass */
  override var height: Double = js.native
  /* CompleteClass */
  override var hullLength: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var parentMesh: js.Any = js.native
  /* CompleteClass */
  override var path: String = js.native
  /* CompleteClass */
  override var region: typingsSlinky.phaser.spine.TextureRegion = js.native
  /* CompleteClass */
  override var regionUVs: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var tempColor: typingsSlinky.phaser.spine.Color = js.native
  /* CompleteClass */
  override var triangles: js.Array[Double] = js.native
  /* CompleteClass */
  override var uvs: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var vertices: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var width: Double = js.native
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
  /* CompleteClass */
  override def getParentMesh(): typingsSlinky.phaser.spine.MeshAttachment = js.native
  /* CompleteClass */
  override def newLinkedMesh(): typingsSlinky.phaser.spine.MeshAttachment = js.native
  /* CompleteClass */
  override def setParentMesh(parentMesh: typingsSlinky.phaser.spine.MeshAttachment): Unit = js.native
  /* CompleteClass */
  override def updateUVs(): Unit = js.native
}

