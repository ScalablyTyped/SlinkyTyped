package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.GeometryInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugShowShadowVolume extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.native
  var appearance: js.UndefOr[typingsSlinky.cesium.mod.Appearance] = js.native
  var asynchronous: js.UndefOr[Boolean] = js.native
  var classificationType: js.UndefOr[typingsSlinky.cesium.mod.ClassificationType] = js.native
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  var debugShowShadowVolume: js.UndefOr[Boolean] = js.native
  var geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.native
  var interleave: js.UndefOr[Boolean] = js.native
  var releaseGeometryInstances: js.UndefOr[Boolean] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object DebugShowShadowVolume {
  @scala.inline
  def apply(): DebugShowShadowVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugShowShadowVolume]
  }
  @scala.inline
  implicit class DebugShowShadowVolumeOps[Self <: DebugShowShadowVolume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPicking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPicking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPicking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPicking")(js.undefined)
        ret
    }
    @scala.inline
    def withAppearance(value: typingsSlinky.cesium.mod.Appearance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(js.undefined)
        ret
    }
    @scala.inline
    def withAsynchronous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asynchronous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsynchronous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asynchronous")(js.undefined)
        ret
    }
    @scala.inline
    def withClassificationType(value: typingsSlinky.cesium.mod.ClassificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassificationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationType")(js.undefined)
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
    def withDebugShowShadowVolume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowShadowVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugShowShadowVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowShadowVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryInstances(value: js.Array[GeometryInstance] | GeometryInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withInterleave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interleave")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseGeometryInstances(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseGeometryInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseGeometryInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseGeometryInstances")(js.undefined)
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

