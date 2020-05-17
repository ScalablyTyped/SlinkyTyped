package typingsSlinky.awsSdkEc2ErrorUnmarshaller.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestId extends js.Object {
  var requestId: String = js.native
}

object RequestId {
  @scala.inline
  def apply(requestId: String): RequestId = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestId]
  }
  @scala.inline
  implicit class RequestIdOps[Self <: RequestId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

