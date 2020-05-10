package typingsSlinky.geodesy.latlonEllipsoidalReferenceframeMod

import typingsSlinky.geodesy.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceFrame extends js.Object {
  var ellipsoid: Ellipsoid = js.native
  var epoch: Double = js.native
  var name: String = js.native
}

object ReferenceFrame {
  @scala.inline
  def apply(ellipsoid: Ellipsoid, epoch: Double, name: String): ReferenceFrame = {
    val __obj = js.Dynamic.literal(ellipsoid = ellipsoid.asInstanceOf[js.Any], epoch = epoch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceFrame]
  }
  @scala.inline
  implicit class ReferenceFrameOps[Self <: ReferenceFrame] (val x: Self) extends AnyVal {
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
    def withEpoch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epoch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

