package typingsSlinky.awsSdkEventstreamMarshaller.splitMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageParts extends js.Object {
  var body: js.typedarray.Uint8Array
  var headers: js.typedarray.DataView
}

object MessageParts {
  @scala.inline
  def apply(body: js.typedarray.Uint8Array, headers: js.typedarray.DataView): MessageParts = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageParts]
  }
}

