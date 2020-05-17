package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointAttachment extends VertexAttachment {
  var color: Color = js.native
  var rotation: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def computeWorldPosition(bone: Bone, point: Vector2): Vector2 = js.native
  def computeWorldRotation(bone: Bone): Double = js.native
}

object PointAttachment {
  @scala.inline
  def apply(
    bones: js.Array[Double],
    color: Color,
    computeWorldPosition: (Bone, Vector2) => Vector2,
    computeWorldRotation: Bone => Double,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    copy: () => Attachment,
    copyTo: VertexAttachment => Unit,
    deformAttachment: VertexAttachment,
    id: Double,
    name: String,
    rotation: Double,
    vertices: ArrayLike[Double],
    worldVerticesLength: Double,
    x: Double,
    y: Double
  ): PointAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldPosition = js.Any.fromFunction2(computeWorldPosition), computeWorldRotation = js.Any.fromFunction1(computeWorldRotation), computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointAttachment]
  }
  @scala.inline
  implicit class PointAttachmentOps[Self <: PointAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeWorldPosition(value: (Bone, Vector2) => Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeWorldPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withComputeWorldRotation(value: Bone => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeWorldRotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

