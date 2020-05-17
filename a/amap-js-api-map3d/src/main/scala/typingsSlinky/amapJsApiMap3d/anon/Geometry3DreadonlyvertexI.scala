package typingsSlinky.amapJsApiMap3d.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api-map3d.AMap.Geometry3D & { readonly vertexIndices  :std.Array<number>,  readonly directions  :std.Array<number>,  readonly textureIndices  :std.Array<number>} */
@js.native
trait Geometry3DreadonlyvertexI extends js.Object {
  val directions: js.Array[Double] = js.native
  val textureIndices: js.Array[Double] = js.native
  val vertexColors: js.Array[Double] = js.native
  val vertexIndices: js.Array[Double] = js.native
  val vertexUVs: js.Array[Double] = js.native
  val vertices: js.Array[Double] = js.native
}

object Geometry3DreadonlyvertexI {
  @scala.inline
  def apply(
    directions: js.Array[Double],
    textureIndices: js.Array[Double],
    vertexColors: js.Array[Double],
    vertexIndices: js.Array[Double],
    vertexUVs: js.Array[Double],
    vertices: js.Array[Double]
  ): Geometry3DreadonlyvertexI = {
    val __obj = js.Dynamic.literal(directions = directions.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexIndices = vertexIndices.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry3DreadonlyvertexI]
  }
  @scala.inline
  implicit class Geometry3DreadonlyvertexIOps[Self <: Geometry3DreadonlyvertexI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirections(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexColors(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexIndices")(value.asInstanceOf[js.Any])
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

