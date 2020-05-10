package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomStruct extends js.Object {
  /*The vertical offset from the top of the span to the baseline of the mathematics*/
  var Y: Double = js.native
  /*The height of the original mathematics element*/
  var mH: Double = js.native
  /*The width of the original mathematics element*/
  var mW: Double = js.native
  /*The height of the zoomed math*/
  var zH: Double = js.native
  /*The width of the zoomed math*/
  var zW: Double = js.native
}

object ZoomStruct {
  @scala.inline
  def apply(Y: Double, mH: Double, mW: Double, zH: Double, zW: Double): ZoomStruct = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], mH = mH.asInstanceOf[js.Any], mW = mW.asInstanceOf[js.Any], zH = zH.asInstanceOf[js.Any], zW = zW.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomStruct]
  }
  @scala.inline
  implicit class ZoomStructOps[Self <: ZoomStruct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zW")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

