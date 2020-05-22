package typingsSlinky.pixiSpine.global.PIXI.spine.core

import typingsSlinky.pixiSpine.PIXI.spine.core.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.MeshAttachment")
@js.native
class MeshAttachment protected ()
  extends typingsSlinky.pixiSpine.PIXI.spine.core.MeshAttachment {
  def this(name: String) = this()
  /* CompleteClass */
  override var bones: js.Array[Double] = js.native
  /* CompleteClass */
  override var color: typingsSlinky.pixiSpine.PIXI.spine.core.Color = js.native
  /* CompleteClass */
  override var deformAttachment: typingsSlinky.pixiSpine.PIXI.spine.core.VertexAttachment = js.native
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
  override var region: typingsSlinky.pixiSpine.PIXI.spine.core.TextureRegion = js.native
  /* CompleteClass */
  override var regionUVs: js.typedarray.Float32Array = js.native
  /* CompleteClass */
  override var tempColor: typingsSlinky.pixiSpine.PIXI.spine.core.Color = js.native
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
    slot: typingsSlinky.pixiSpine.PIXI.spine.core.Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  /* CompleteClass */
  override def computeWorldVerticesOld(slot: typingsSlinky.pixiSpine.PIXI.spine.core.Slot, worldVertices: ArrayLike[Double]): Unit = js.native
  /* CompleteClass */
  override def copy(): typingsSlinky.pixiSpine.PIXI.spine.core.Attachment = js.native
  /* CompleteClass */
  override def copyTo(attachment: typingsSlinky.pixiSpine.PIXI.spine.core.VertexAttachment): Unit = js.native
  /* CompleteClass */
  override def getParentMesh(): typingsSlinky.pixiSpine.PIXI.spine.core.MeshAttachment = js.native
  /* CompleteClass */
  override def newLinkedMesh(): typingsSlinky.pixiSpine.PIXI.spine.core.MeshAttachment = js.native
  /* CompleteClass */
  override def setParentMesh(parentMesh: typingsSlinky.pixiSpine.PIXI.spine.core.MeshAttachment): Unit = js.native
}

