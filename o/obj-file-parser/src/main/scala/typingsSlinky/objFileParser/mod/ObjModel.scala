package typingsSlinky.objFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjModel extends js.Object {
  var faces: js.Array[Face] = js.native
  var name: String = js.native
  var textureCoords: js.Array[VertexTexture] = js.native
  var vertexNormals: js.Array[Vertex] = js.native
  var vertices: js.Array[Vertex] = js.native
}

object ObjModel {
  @scala.inline
  def apply(
    faces: js.Array[Face],
    name: String,
    textureCoords: js.Array[VertexTexture],
    vertexNormals: js.Array[Vertex],
    vertices: js.Array[Vertex]
  ): ObjModel = {
    val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textureCoords = textureCoords.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjModel]
  }
  @scala.inline
  implicit class ObjModelOps[Self <: ObjModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaces(value: js.Array[Face]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureCoords(value: js.Array[VertexTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexNormals(value: js.Array[Vertex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[Vertex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

