package typingsSlinky.isTrademarked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrademarkedData extends js.Object {
  var description: String = js.native
  var reg: js.Date = js.native
  var serviceCode: String = js.native
  var sn: String = js.native
  var wordmark: String = js.native
}

object TrademarkedData {
  @scala.inline
  def apply(description: String, reg: js.Date, serviceCode: String, sn: String, wordmark: String): TrademarkedData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], reg = reg.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any], wordmark = wordmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrademarkedData]
  }
  @scala.inline
  implicit class TrademarkedDataOps[Self <: TrademarkedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReg(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordmark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordmark")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

