package typingsSlinky.amapJsApiMap3d.AMap.Geometry3D

import typingsSlinky.amapJsApiMap3d.amapJsApiMap3dStrings.points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Points
  extends typingsSlinky.amapJsApiMap3d.AMap.Geometry3D {
  val pointAreas: js.Array[Double] = js.native
  val pointSizes: js.Array[Double] = js.native
  val textureIndices: js.Array[Double] = js.native
  val `type`: points = js.native
}

object Points {
  @scala.inline
  def apply(
    pointAreas: js.Array[Double],
    pointSizes: js.Array[Double],
    textureIndices: js.Array[Double],
    `type`: points,
    vertexColors: js.Array[Double],
    vertexUVs: js.Array[Double],
    vertices: js.Array[Double]
  ): Points = {
    val __obj = js.Dynamic.literal(pointAreas = pointAreas.asInstanceOf[js.Any], pointSizes = pointSizes.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
  @scala.inline
  implicit class PointsOps[Self <: Points] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPointAreas(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointAreas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: points): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

