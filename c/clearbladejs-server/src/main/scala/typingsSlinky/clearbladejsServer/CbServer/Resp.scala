package typingsSlinky.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resp extends js.Object {
  def error(msg: js.Any): scala.Nothing = js.native
  def success(msg: js.Any): scala.Nothing = js.native
}

object Resp {
  @scala.inline
  def apply(error: js.Any => scala.Nothing, success: js.Any => scala.Nothing): Resp = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Resp]
  }
  @scala.inline
  implicit class RespOps[Self <: Resp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Any => scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuccess(value: js.Any => scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

