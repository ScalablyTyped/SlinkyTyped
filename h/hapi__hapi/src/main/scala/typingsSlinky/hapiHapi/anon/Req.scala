package typingsSlinky.hapiHapi.anon

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Req extends js.Object {
  var req: IncomingMessage = js.native
  var res: ServerResponse = js.native
}

object Req {
  @scala.inline
  def apply(req: IncomingMessage, res: ServerResponse): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
  @scala.inline
  implicit class ReqOps[Self <: Req] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReq(value: IncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: ServerResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

