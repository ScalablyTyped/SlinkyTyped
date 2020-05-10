package typingsSlinky.cesium

import typingsSlinky.cesium.mod.ClippingPlane
import typingsSlinky.cesium.mod.Color
import typingsSlinky.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEdgeColor extends js.Object {
  var edgeColor: js.UndefOr[Color] = js.native
  var edgeWidth: js.UndefOr[Double] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  var planes: js.UndefOr[ClippingPlane] = js.native
  var unionClippingRegions: js.UndefOr[Boolean] = js.native
}

object AnonEdgeColor {
  @scala.inline
  def apply(): AnonEdgeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEdgeColor]
  }
  @scala.inline
  implicit class AnonEdgeColorOps[Self <: AnonEdgeColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdgeColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeWidth")(js.undefined)
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
    def withPlanes(value: ClippingPlane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planes")(js.undefined)
        ret
    }
    @scala.inline
    def withUnionClippingRegions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unionClippingRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnionClippingRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unionClippingRegions")(js.undefined)
        ret
    }
  }
  
}

