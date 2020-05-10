package typingsSlinky.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionTerminateOptions extends js.Object {
  var body: js.UndefOr[String] = js.native
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  var reason_phrase: js.UndefOr[String] = js.native
  var status_code: js.UndefOr[Double] = js.native
}

object SessionTerminateOptions {
  @scala.inline
  def apply(): SessionTerminateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionTerminateOptions]
  }
  @scala.inline
  implicit class SessionTerminateOptionsOps[Self <: SessionTerminateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withReason_phrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason_phrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason_phrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason_phrase")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus_code(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_code")(js.undefined)
        ret
    }
  }
  
}

