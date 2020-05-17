package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshLODLevel extends js.Object {
  /** Defines the distance where this level should start being displayed */
  var distance: Double = js.native
  /** Defines the mesh to use to render this level */
  var mesh: Nullable[Mesh] = js.native
}

object MeshLODLevel {
  @scala.inline
  def apply(distance: Double): MeshLODLevel = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshLODLevel]
  }
  @scala.inline
  implicit class MeshLODLevelOps[Self <: MeshLODLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMesh(value: Nullable[Mesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeshNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mesh")(null)
        ret
    }
  }
  
}

