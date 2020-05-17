package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.GeometryInstance
import typingsSlinky.cesium.mod.Matrix4
import typingsSlinky.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Appearance extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.native
  var appearance: js.UndefOr[typingsSlinky.cesium.mod.Appearance] = js.native
  var asynchronous: js.UndefOr[Boolean] = js.native
  var compressVertices: js.UndefOr[Boolean] = js.native
  var cull: js.UndefOr[Boolean] = js.native
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  var geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.native
  var interleave: js.UndefOr[Boolean] = js.native
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  var releaseGeometryInstances: js.UndefOr[Boolean] = js.native
  var shadows: js.UndefOr[ShadowMode] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var vertexCacheOptimize: js.UndefOr[Boolean] = js.native
}

object Appearance {
  @scala.inline
  def apply(): Appearance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Appearance]
  }
  @scala.inline
  implicit class AppearanceOps[Self <: Appearance] (val x: Self) extends AnyVal {
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
    def withCompressVertices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressVertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressVertices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressVertices")(js.undefined)
        ret
    }
    @scala.inline
    def withCull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cull")(js.undefined)
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
    def withShadows(value: ShadowMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(js.undefined)
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
    @scala.inline
    def withVertexCacheOptimize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexCacheOptimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexCacheOptimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexCacheOptimize")(js.undefined)
        ret
    }
  }
  
}

