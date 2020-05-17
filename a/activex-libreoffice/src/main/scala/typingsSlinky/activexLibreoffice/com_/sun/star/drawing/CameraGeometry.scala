package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a three-dimensional camera. */
@js.native
trait CameraGeometry extends js.Object {
  /** is the camera view direction */
  var vpn: Direction3D = js.native
  /** is the camera position */
  var vrp: Position3D = js.native
  /** is the camera up direction */
  var vup: Direction3D = js.native
}

object CameraGeometry {
  @scala.inline
  def apply(vpn: Direction3D, vrp: Position3D, vup: Direction3D): CameraGeometry = {
    val __obj = js.Dynamic.literal(vpn = vpn.asInstanceOf[js.Any], vrp = vrp.asInstanceOf[js.Any], vup = vup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraGeometry]
  }
  @scala.inline
  implicit class CameraGeometryOps[Self <: CameraGeometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpn(value: Direction3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVrp(value: Position3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVup(value: Direction3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

