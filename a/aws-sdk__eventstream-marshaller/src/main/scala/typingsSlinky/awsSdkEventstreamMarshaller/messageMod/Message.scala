package typingsSlinky.awsSdkEventstreamMarshaller.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var body: scala.scalajs.js.typedarray.Uint8Array
  var headers: MessageHeaders
}

object Message {
  @scala.inline
  def apply(body: scala.scalajs.js.typedarray.Uint8Array, headers: MessageHeaders): Message = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Message]
  }
}

