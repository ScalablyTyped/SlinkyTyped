package typingsSlinky.amapJsApiMap3d

import typingsSlinky.amapJsApiMap3d.amapJsApiMap3dStrings.mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api-map3d.AMap.Geometry3D.Mesh & { readonly vertexNormals  :std.Array<number>} */
@js.native
trait MeshreadonlyvertexNormals extends js.Object {
  val faces: js.Array[Double] = js.native
  val textureIndices: js.Array[Double] = js.native
  val `type`: mesh = js.native
  val vertexColors: js.Array[Double] = js.native
  val vertexNormals: js.Array[Double] = js.native
  val vertexUVs: js.Array[Double] = js.native
  val vertices: js.Array[Double] = js.native
}

object MeshreadonlyvertexNormals {
  @scala.inline
  def apply(
    faces: js.Array[Double],
    textureIndices: js.Array[Double],
    `type`: mesh,
    vertexColors: js.Array[Double],
    vertexNormals: js.Array[Double],
    vertexUVs: js.Array[Double],
    vertices: js.Array[Double]
  ): MeshreadonlyvertexNormals = {
    val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshreadonlyvertexNormals]
  }
  @scala.inline
  implicit class MeshreadonlyvertexNormalsOps[Self <: MeshreadonlyvertexNormals] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withVertexColors(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexNormals(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexUVs(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexUVs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

