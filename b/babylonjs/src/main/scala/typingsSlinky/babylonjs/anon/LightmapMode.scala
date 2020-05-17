package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightmapMode extends js.Object {
  var lightmapMode: Boolean = js.native
  var needNormals: Boolean = js.native
  var needRebuild: Boolean = js.native
  var shadowEnabled: Boolean = js.native
  var specularEnabled: Boolean = js.native
}

object LightmapMode {
  @scala.inline
  def apply(
    lightmapMode: Boolean,
    needNormals: Boolean,
    needRebuild: Boolean,
    shadowEnabled: Boolean,
    specularEnabled: Boolean
  ): LightmapMode = {
    val __obj = js.Dynamic.literal(lightmapMode = lightmapMode.asInstanceOf[js.Any], needNormals = needNormals.asInstanceOf[js.Any], needRebuild = needRebuild.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any], specularEnabled = specularEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightmapMode]
  }
  @scala.inline
  implicit class LightmapModeOps[Self <: LightmapMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLightmapMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightmapMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedNormals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedRebuild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needRebuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecularEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

