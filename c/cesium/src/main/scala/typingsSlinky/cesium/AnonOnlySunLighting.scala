package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnlySunLighting extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.native
  var onlySunLighting: js.UndefOr[Boolean] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var textureUrl: js.UndefOr[String] = js.native
}

object AnonOnlySunLighting {
  @scala.inline
  def apply(): AnonOnlySunLighting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOnlySunLighting]
  }
  @scala.inline
  implicit class AnonOnlySunLightingOps[Self <: AnonOnlySunLighting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEllipsoid(value: Ellipsoid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlySunLighting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySunLighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlySunLighting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySunLighting")(js.undefined)
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
    def withTextureUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextureUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureUrl")(js.undefined)
        ret
    }
  }
  
}

