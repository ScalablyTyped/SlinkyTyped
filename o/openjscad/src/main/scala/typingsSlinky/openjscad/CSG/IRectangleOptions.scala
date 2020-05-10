package typingsSlinky.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRectangleOptions extends js.Object {
  var center: js.UndefOr[Vector2D] = js.native
  var corner1: js.UndefOr[Vector2D] = js.native
  var corner2: js.UndefOr[Vector2D] = js.native
  var radius: js.UndefOr[Vector2D] = js.native
}

object IRectangleOptions {
  @scala.inline
  def apply(): IRectangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRectangleOptions]
  }
  @scala.inline
  implicit class IRectangleOptionsOps[Self <: IRectangleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Vector2D): Self = {
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
    def withCorner1(value: Vector2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corner1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorner1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corner1")(js.undefined)
        ret
    }
    @scala.inline
    def withCorner2(value: Vector2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corner2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorner2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corner2")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Vector2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
  }
  
}

