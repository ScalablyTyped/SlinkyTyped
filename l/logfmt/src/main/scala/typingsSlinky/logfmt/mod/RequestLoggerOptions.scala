package typingsSlinky.logfmt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestLoggerOptions extends js.Object {
  var elapsed: js.UndefOr[String] = js.native
  var immediate: js.UndefOr[Boolean] = js.native
}

object RequestLoggerOptions {
  @scala.inline
  def apply(): RequestLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLoggerOptions]
  }
  @scala.inline
  implicit class RequestLoggerOptionsOps[Self <: RequestLoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElapsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(js.undefined)
        ret
    }
  }
  
}

