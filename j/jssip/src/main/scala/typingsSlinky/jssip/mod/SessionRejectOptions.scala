package typingsSlinky.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionRejectOptions extends js.Object {
  var extraHeaders: js.Array[String] = js.native
  var reason_phrase: String = js.native
  var status_code: Double = js.native
}

object SessionRejectOptions {
  @scala.inline
  def apply(extraHeaders: js.Array[String], reason_phrase: String, status_code: Double): SessionRejectOptions = {
    val __obj = js.Dynamic.literal(extraHeaders = extraHeaders.asInstanceOf[js.Any], reason_phrase = reason_phrase.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionRejectOptions]
  }
  @scala.inline
  implicit class SessionRejectOptionsOps[Self <: SessionRejectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason_phrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason_phrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus_code(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_code")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

