package typingsSlinky.reactNativeCanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMMatrix2DInit extends js.Object {
  var a: js.UndefOr[Double] = js.native
  var b: js.UndefOr[Double] = js.native
  var c: js.UndefOr[Double] = js.native
  var d: js.UndefOr[Double] = js.native
  var e: js.UndefOr[Double] = js.native
  var f: js.UndefOr[Double] = js.native
  var m11: js.UndefOr[Double] = js.native
  var m12: js.UndefOr[Double] = js.native
  var m21: js.UndefOr[Double] = js.native
  var m22: js.UndefOr[Double] = js.native
  var m41: js.UndefOr[Double] = js.native
  var m42: js.UndefOr[Double] = js.native
}

object DOMMatrix2DInit {
  @scala.inline
  def apply(): DOMMatrix2DInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMMatrix2DInit]
  }
  @scala.inline
  implicit class DOMMatrix2DInitOps[Self <: DOMMatrix2DInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(js.undefined)
        ret
    }
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(js.undefined)
        ret
    }
    @scala.inline
    def withC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(js.undefined)
        ret
    }
    @scala.inline
    def withD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.undefined)
        ret
    }
    @scala.inline
    def withE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(js.undefined)
        ret
    }
    @scala.inline
    def withF(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(js.undefined)
        ret
    }
    @scala.inline
    def withM11(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m11")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM11: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m11")(js.undefined)
        ret
    }
    @scala.inline
    def withM12(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m12")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM12: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m12")(js.undefined)
        ret
    }
    @scala.inline
    def withM21(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m21")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM21: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m21")(js.undefined)
        ret
    }
    @scala.inline
    def withM22(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m22")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM22: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m22")(js.undefined)
        ret
    }
    @scala.inline
    def withM41(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m41")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM41: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m41")(js.undefined)
        ret
    }
    @scala.inline
    def withM42(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m42")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM42: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m42")(js.undefined)
        ret
    }
  }
  
}

