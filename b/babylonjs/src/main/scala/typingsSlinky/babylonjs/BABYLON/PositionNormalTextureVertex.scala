package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionNormalTextureVertex extends js.Object {
  /** the normal of the vertex (defaut: 0,1,0) */
  var normal: Vector3 = js.native
  /** the position of the vertex (defaut: 0,0,0) */
  var position: Vector3 = js.native
  /** the uv of the vertex (default: 0,0) */
  var uv: Vector2 = js.native
}

object PositionNormalTextureVertex {
  @scala.inline
  def apply(normal: Vector3, position: Vector3, uv: Vector2): PositionNormalTextureVertex = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionNormalTextureVertex]
  }
  @scala.inline
  implicit class PositionNormalTextureVertexOps[Self <: PositionNormalTextureVertex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormal(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUv(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uv")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

