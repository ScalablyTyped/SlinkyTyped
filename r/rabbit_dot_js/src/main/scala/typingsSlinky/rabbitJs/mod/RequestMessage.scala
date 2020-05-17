package typingsSlinky.rabbitJs.mod

import typingsSlinky.rabbitJs.anon.CorrelationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestMessage extends js.Object {
  var content: js.Any = js.native
  var properties: CorrelationId = js.native
}

object RequestMessage {
  @scala.inline
  def apply(content: js.Any, properties: CorrelationId): RequestMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMessage]
  }
  @scala.inline
  implicit class RequestMessageOps[Self <: RequestMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: CorrelationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

