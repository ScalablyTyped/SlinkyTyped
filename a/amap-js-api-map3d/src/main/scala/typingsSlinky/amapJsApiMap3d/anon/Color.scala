package typingsSlinky.amapJsApiMap3d.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var color: js.UndefOr[String | js.Array[Double]] = js.native
  var height: js.UndefOr[Double | js.Array[Double]] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Color {
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

