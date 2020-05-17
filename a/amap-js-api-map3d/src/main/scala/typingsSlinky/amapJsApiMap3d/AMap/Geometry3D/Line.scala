package typingsSlinky.amapJsApiMap3d.AMap.Geometry3D

import typingsSlinky.amapJsApiMap3d.amapJsApiMap3dStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line
  extends typingsSlinky.amapJsApiMap3d.AMap.Geometry3D {
  val segments: js.Array[Double] = js.native
  val textureIndices: js.Array[Double] = js.native
  val `type`: line = js.native
}

object Line {
  @scala.inline
  def apply(
    segments: js.Array[Double],
    textureIndices: js.Array[Double],
    `type`: line,
    vertexColors: js.Array[Double],
    vertexUVs: js.Array[Double],
    vertices: js.Array[Double]
  ): Line = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  @scala.inline
  implicit class LineOps[Self <: Line] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegments(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

