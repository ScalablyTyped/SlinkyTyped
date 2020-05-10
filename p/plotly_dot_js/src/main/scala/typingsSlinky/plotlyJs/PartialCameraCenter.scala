package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.mod.Point
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Camera> */
@js.native
trait PartialCameraCenter extends js.Object {
  var center: js.UndefOr[Partial[Point]] = js.native
  var eye: js.UndefOr[Partial[Point]] = js.native
  var up: js.UndefOr[Partial[Point]] = js.native
}

object PartialCameraCenter {
  @scala.inline
  def apply(): PartialCameraCenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCameraCenter]
  }
  @scala.inline
  implicit class PartialCameraCenterOps[Self <: PartialCameraCenter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Partial[Point]): Self = {
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
    def withEye(value: Partial[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eye")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEye: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eye")(js.undefined)
        ret
    }
    @scala.inline
    def withUp(value: Partial[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.undefined)
        ret
    }
  }
  
}

