package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceGeometry extends js.Object {
  var textureCoordinateCount: Double
  var textureCoordinates: js.Array[TextureCoordinate]
  var triangleCount: Double
  var triangleIndices: js.Array[Double]
  var vertexCount: Double
  var vertices: js.Array[Vector3]
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTextureCoordinateCount(value: Double): Self = this.set("textureCoordinateCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextureCoordinates(value: js.Array[TextureCoordinate]): Self = this.set("textureCoordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriangleCount(value: Double): Self = this.set("triangleCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriangleIndices(value: js.Array[Double]): Self = this.set("triangleIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexCount(value: Double): Self = this.set("vertexCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertices(value: js.Array[Vector3]): Self = this.set("vertices", value.asInstanceOf[js.Any])
  }
  
}

