package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CascadesEnabled extends js.Object {
  var cascadesEnabled: js.UndefOr[Boolean] = js.native
  var darkness: js.UndefOr[Double] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var isPointLight: js.UndefOr[Boolean] = js.native
  var lightCamera: typingsSlinky.cesium.mod.Camera = js.native
  var maximumDistance: js.UndefOr[Double] = js.native
  var normalOffset: js.UndefOr[Boolean] = js.native
  var numberOfCascades: js.UndefOr[Double] = js.native
  var pointLightRadius: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var softShadows: js.UndefOr[Boolean] = js.native
}

object CascadesEnabled {
  @scala.inline
  def apply(lightCamera: typingsSlinky.cesium.mod.Camera): CascadesEnabled = {
    val __obj = js.Dynamic.literal(lightCamera = lightCamera.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascadesEnabled]
  }
  @scala.inline
  implicit class CascadesEnabledOps[Self <: CascadesEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLightCamera(value: typingsSlinky.cesium.mod.Camera): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCascadesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCascadesEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadesEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDarkness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDarkness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkness")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPointLight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPointLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPointLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPointLight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalOffset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfCascades(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfCascades")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfCascades: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfCascades")(js.undefined)
        ret
    }
    @scala.inline
    def withPointLightRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointLightRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointLightRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointLightRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftShadows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softShadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softShadows")(js.undefined)
        ret
    }
  }
  
}

