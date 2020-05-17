package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.linesMeshMod.LinesMesh
import typingsSlinky.babylonjs.mathColorMod.Color4
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  var colors: js.UndefOr[Nullable[js.Array[js.Array[Color4]]]] = js.native
  var instance: js.UndefOr[Nullable[LinesMesh]] = js.native
  var lines: js.Array[js.Array[Vector3]] = js.native
  var updatable: js.UndefOr[Boolean] = js.native
  var useVertexAlpha: js.UndefOr[Boolean] = js.native
}

object Instance {
  @scala.inline
  def apply(lines: js.Array[js.Array[Vector3]]): Instance = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLines(value: js.Array[js.Array[Vector3]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: Nullable[js.Array[js.Array[Color4]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withColorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(null)
        ret
    }
    @scala.inline
    def withInstance(value: Nullable[LinesMesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(null)
        ret
    }
    @scala.inline
    def withUpdatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatable")(js.undefined)
        ret
    }
    @scala.inline
    def withUseVertexAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useVertexAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseVertexAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useVertexAlpha")(js.undefined)
        ret
    }
  }
  
}

