package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugShowBoundingVolume extends js.Object {
  var center: js.UndefOr[Cartesian3] = js.native
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[js.Any] = js.native
  var material: js.UndefOr[typingsSlinky.cesium.mod.Material] = js.native
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  var radii: js.UndefOr[Cartesian3] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object DebugShowBoundingVolume {
  @scala.inline
  def apply(): DebugShowBoundingVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugShowBoundingVolume]
  }
  @scala.inline
  implicit class DebugShowBoundingVolumeOps[Self <: DebugShowBoundingVolume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Cartesian3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugShowBoundingVolume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowBoundingVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugShowBoundingVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowBoundingVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterial(value: typingsSlinky.cesium.mod.Material): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(js.undefined)
        ret
    }
    @scala.inline
    def withModelMatrix(value: Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelMatrix")(js.undefined)
        ret
    }
    @scala.inline
    def withRadii(value: Cartesian3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadii: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radii")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

