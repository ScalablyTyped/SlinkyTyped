package typingsSlinky.anyproxy.mod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeDealHttpsRequestDetail extends js.Object {
  var _req: IncomingMessage = js.native
  var host: String = js.native
}

object BeforeDealHttpsRequestDetail {
  @scala.inline
  def apply(_req: IncomingMessage, host: String): BeforeDealHttpsRequestDetail = {
    val __obj = js.Dynamic.literal(_req = _req.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeDealHttpsRequestDetail]
  }
  @scala.inline
  implicit class BeforeDealHttpsRequestDetailOps[Self <: BeforeDealHttpsRequestDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_req(value: IncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

