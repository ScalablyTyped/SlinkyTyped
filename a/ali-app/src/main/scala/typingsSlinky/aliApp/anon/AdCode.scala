package typingsSlinky.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdCode extends js.Object {
  var adCode: String = js.native
  var city: String = js.native
}

object AdCode {
  @scala.inline
  def apply(adCode: String, city: String): AdCode = {
    val __obj = js.Dynamic.literal(adCode = adCode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdCode]
  }
  @scala.inline
  implicit class AdCodeOps[Self <: AdCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

