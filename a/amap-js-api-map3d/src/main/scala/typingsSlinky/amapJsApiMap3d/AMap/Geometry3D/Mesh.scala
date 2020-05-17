package typingsSlinky.amapJsApiMap3d.AMap.Geometry3D

import typingsSlinky.amapJsApiMap3d.amapJsApiMap3dStrings.mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mesh
  extends typingsSlinky.amapJsApiMap3d.AMap.Geometry3D {
  val faces: js.Array[Double] = js.native
  val textureIndices: js.Array[Double] = js.native
  val `type`: mesh = js.native
}

object Mesh {
  @scala.inline
  def apply(
    faces: js.Array[Double],
    textureIndices: js.Array[Double],
    `type`: mesh,
    vertexColors: js.Array[Double],
    vertexUVs: js.Array[Double],
    vertices: js.Array[Double]
  ): Mesh = {
    val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mesh]
  }
  @scala.inline
  implicit class MeshOps[Self <: Mesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaces(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: mesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

