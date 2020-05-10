package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLightmapMode extends js.Object {
  var lightmapMode: Boolean = js.native
  var needNormals: Boolean = js.native
  var needRebuild: Boolean = js.native
  var shadowEnabled: Boolean = js.native
  var specularEnabled: Boolean = js.native
}

object AnonLightmapMode {
  @scala.inline
  def apply(
    lightmapMode: Boolean,
    needNormals: Boolean,
    needRebuild: Boolean,
    shadowEnabled: Boolean,
    specularEnabled: Boolean
  ): AnonLightmapMode = {
    val __obj = js.Dynamic.literal(lightmapMode = lightmapMode.asInstanceOf[js.Any], needNormals = needNormals.asInstanceOf[js.Any], needRebuild = needRebuild.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any], specularEnabled = specularEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLightmapMode]
  }
  @scala.inline
  implicit class AnonLightmapModeOps[Self <: AnonLightmapMode] (val x: Self) extends AnyVal {
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

