package typingsSlinky.reactRequest.mod

import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyRequest extends js.Object {
  var requestKey: String = js.native
  var res: Response = js.native
}

object ProxyRequest {
  @scala.inline
  def apply(requestKey: String, res: Response): ProxyRequest = {
    val __obj = js.Dynamic.literal(requestKey = requestKey.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyRequest]
  }
  @scala.inline
  implicit class ProxyRequestOps[Self <: ProxyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: Response): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

