package typingsSlinky.leafletDraw.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrecisionOptions extends js.Object {
  var ac: js.UndefOr[Double] = js.native
  var ft: js.UndefOr[Double] = js.native
  var ha: js.UndefOr[Double] = js.native
  var km: js.UndefOr[Double] = js.native
  var m: js.UndefOr[Double] = js.native
  var mi: js.UndefOr[Double] = js.native
  var nm: js.UndefOr[Double] = js.native
  var yd: js.UndefOr[Double] = js.native
}

object PrecisionOptions {
  @scala.inline
  def apply(): PrecisionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrecisionOptions]
  }
  @scala.inline
  implicit class PrecisionOptionsOps[Self <: PrecisionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ac")(js.undefined)
        ret
    }
    @scala.inline
    def withFt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ft")(js.undefined)
        ret
    }
    @scala.inline
    def withHa(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ha")(js.undefined)
        ret
    }
    @scala.inline
    def withKm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("km")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("km")(js.undefined)
        ret
    }
    @scala.inline
    def withM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(js.undefined)
        ret
    }
    @scala.inline
    def withMi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mi")(js.undefined)
        ret
    }
    @scala.inline
    def withNm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nm")(js.undefined)
        ret
    }
    @scala.inline
    def withYd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yd")(js.undefined)
        ret
    }
  }
  
}

