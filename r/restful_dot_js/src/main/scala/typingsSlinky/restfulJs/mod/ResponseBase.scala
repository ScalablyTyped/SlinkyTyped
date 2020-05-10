package typingsSlinky.restfulJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseBase extends js.Object {
  def config(): js.Any = js.native
  def headers(): Headers = js.native
  def status(): Double = js.native
}

object ResponseBase {
  @scala.inline
  def apply(config: () => js.Any, headers: () => Headers, status: () => Double): ResponseBase = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction0(config), headers = js.Any.fromFunction0(headers), status = js.Any.fromFunction0(status))
    __obj.asInstanceOf[ResponseBase]
  }
  @scala.inline
  implicit class ResponseBaseOps[Self <: ResponseBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaders(value: () => Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStatus(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

