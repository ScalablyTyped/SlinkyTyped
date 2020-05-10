package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceGeometry extends js.Object {
  var textureCoordinateCount: Double = js.native
  var textureCoordinates: js.Array[TextureCoordinate] = js.native
  var triangleCount: Double = js.native
  var triangleIndices: js.Array[Double] = js.native
  var vertexCount: Double = js.native
  var vertices: js.Array[Vector3] = js.native
}

object FaceGeometry {
  @scala.inline
  def apply(
    textureCoordinateCount: Double,
    textureCoordinates: js.Array[TextureCoordinate],
    triangleCount: Double,
    triangleIndices: js.Array[Double],
    vertexCount: Double,
    vertices: js.Array[Vector3]
  ): FaceGeometry = {
    val __obj = js.Dynamic.literal(textureCoordinateCount = textureCoordinateCount.asInstanceOf[js.Any], textureCoordinates = textureCoordinates.asInstanceOf[js.Any], triangleCount = triangleCount.asInstanceOf[js.Any], triangleIndices = triangleIndices.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceGeometry]
  }
  @scala.inline
  implicit class FaceGeometryOps[Self <: FaceGeometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextureCoordinateCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureCoordinateCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureCoordinates(value: js.Array[TextureCoordinate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureCoordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangleCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangleIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

