package typingsSlinky.cryptojs.CryptoJS.algo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISHA3Cfg extends js.Object {
  var outputLength: js.UndefOr[Double] = js.native
}

object ISHA3Cfg {
  @scala.inline
  def apply(): ISHA3Cfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISHA3Cfg]
  }
  @scala.inline
  implicit class ISHA3CfgOps[Self <: ISHA3Cfg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputLength")(js.undefined)
        ret
    }
  }
  
}

