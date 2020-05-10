package typingsSlinky.objFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceVertex extends js.Object {
  var textureCoordsIndex: Double = js.native
  var vertexIndex: Double = js.native
  var vertexNormalIndex: Double = js.native
}

object FaceVertex {
  @scala.inline
  def apply(textureCoordsIndex: Double, vertexIndex: Double, vertexNormalIndex: Double): FaceVertex = {
    val __obj = js.Dynamic.literal(textureCoordsIndex = textureCoordsIndex.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any], vertexNormalIndex = vertexNormalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceVertex]
  }
  @scala.inline
  implicit class FaceVertexOps[Self <: FaceVertex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextureCoordsIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureCoordsIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexNormalIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexNormalIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

