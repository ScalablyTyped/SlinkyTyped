package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AUDKRW extends js.Object {
  var AUD: js.Array[String] = js.native
  var KRW: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object AUDKRW {
  @scala.inline
  def apply(AUD: js.Array[String], KRW: js.Array[String], USD: js.Array[String]): AUDKRW = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDKRW]
  }
  @scala.inline
  implicit class AUDKRWOps[Self <: AUDKRW] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAUD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKRW(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KRW")(value.asInstanceOf[js.Any])
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

