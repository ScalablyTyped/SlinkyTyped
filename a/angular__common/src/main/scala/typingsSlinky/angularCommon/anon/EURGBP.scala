package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EURGBP extends js.Object {
  var EUR: js.Array[js.UndefOr[String]] = js.native
  var GBP: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object EURGBP {
  @scala.inline
  def apply(
    EUR: js.Array[js.UndefOr[String]],
    GBP: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    USD: js.Array[String]
  ): EURGBP = {
    val __obj = js.Dynamic.literal(EUR = EUR.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[EURGBP]
  }
  @scala.inline
  implicit class EURGBPOps[Self <: EURGBP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEUR(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EUR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGBP(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GBP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

