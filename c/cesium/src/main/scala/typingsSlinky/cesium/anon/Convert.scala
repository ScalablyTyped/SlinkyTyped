package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Convert extends js.Object {
  var convert: js.UndefOr[Boolean] = js.native
  var destination: js.UndefOr[Cartesian3 | typingsSlinky.cesium.mod.Rectangle] = js.native
  var endTransform: js.UndefOr[Matrix4] = js.native
  var orientation: js.UndefOr[Direction | Heading] = js.native
}

object Convert {
  @scala.inline
  def apply(): Convert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Convert]
  }
  @scala.inline
  implicit class ConvertOps[Self <: Convert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: Cartesian3 | typingsSlinky.cesium.mod.Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTransform(value: Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Direction | Heading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
  }
  
}

