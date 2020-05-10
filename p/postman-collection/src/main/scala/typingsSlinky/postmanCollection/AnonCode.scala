package typingsSlinky.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCode extends js.Object {
  var code: Double = js.native
  var detail: String = js.native
  var name: String = js.native
  var standardName: String = js.native
}

object AnonCode {
  @scala.inline
  def apply(code: Double, detail: String, name: String, standardName: String): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], standardName = standardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
  @scala.inline
  implicit class AnonCodeOps[Self <: AnonCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandardName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

