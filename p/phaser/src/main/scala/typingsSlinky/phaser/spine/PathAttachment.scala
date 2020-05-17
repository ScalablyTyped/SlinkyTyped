package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathAttachment extends VertexAttachment {
  var closed: Boolean = js.native
  var color: Color = js.native
  var constantSpeed: Boolean = js.native
  var lengths: js.Array[Double] = js.native
}

object PathAttachment {
  @scala.inline
  def apply(
    bones: js.Array[Double],
    closed: Boolean,
    color: Color,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    constantSpeed: Boolean,
    copy: () => Attachment,
    copyTo: VertexAttachment => Unit,
    deformAttachment: VertexAttachment,
    id: Double,
    lengths: js.Array[Double],
    name: String,
    vertices: ArrayLike[Double],
    worldVerticesLength: Double
  ): PathAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), constantSpeed = constantSpeed.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttachment]
  }
  @scala.inline
  implicit class PathAttachmentOps[Self <: PathAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstantSpeed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLengths(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

