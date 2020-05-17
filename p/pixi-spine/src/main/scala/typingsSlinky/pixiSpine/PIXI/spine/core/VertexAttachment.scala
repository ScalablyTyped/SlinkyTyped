package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VertexAttachment extends Attachment {
  var bones: js.Array[Double] = js.native
  var deformAttachment: VertexAttachment = js.native
  var id: Double = js.native
  var vertices: ArrayLike[Double] = js.native
  var worldVerticesLength: Double = js.native
  def computeWorldVertices(
    slot: Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  def computeWorldVerticesOld(slot: Slot, worldVertices: ArrayLike[Double]): Unit = js.native
  def copyTo(attachment: VertexAttachment): Unit = js.native
}

object VertexAttachment {
  @scala.inline
  def apply(
    bones: js.Array[Double],
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    computeWorldVerticesOld: (Slot, ArrayLike[Double]) => Unit,
    copy: () => Attachment,
    copyTo: VertexAttachment => Unit,
    deformAttachment: VertexAttachment,
    id: Double,
    name: String,
    vertices: ArrayLike[Double],
    worldVerticesLength: Double
  ): VertexAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), computeWorldVerticesOld = js.Any.fromFunction2(computeWorldVerticesOld), copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAttachment]
  }
  @scala.inline
  implicit class VertexAttachmentOps[Self <: VertexAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBones(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeWorldVertices(value: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeWorldVertices")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withComputeWorldVerticesOld(value: (Slot, ArrayLike[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeWorldVerticesOld")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCopyTo(value: VertexAttachment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeformAttachment(value: VertexAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deformAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: ArrayLike[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorldVerticesLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldVerticesLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

