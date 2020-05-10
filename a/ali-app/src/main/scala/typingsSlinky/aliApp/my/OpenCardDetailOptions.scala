package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenCardDetailOptions
  extends BaseOptions[js.Any, js.Any] {
  var passId: String = js.native
}

object OpenCardDetailOptions {
  @scala.inline
  def apply(passId: String): OpenCardDetailOptions = {
    val __obj = js.Dynamic.literal(passId = passId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardDetailOptions]
  }
  @scala.inline
  implicit class OpenCardDetailOptionsOps[Self <: OpenCardDetailOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

