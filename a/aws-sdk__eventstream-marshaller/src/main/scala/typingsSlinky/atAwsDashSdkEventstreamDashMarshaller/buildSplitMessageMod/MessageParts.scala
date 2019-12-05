package typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.buildSplitMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageParts extends js.Object {
  var body: scala.scalajs.js.typedarray.Uint8Array
  var headers: scala.scalajs.js.typedarray.DataView
}

object MessageParts {
  @scala.inline
  def apply(body: scala.scalajs.js.typedarray.Uint8Array, headers: scala.scalajs.js.typedarray.DataView): MessageParts = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageParts]
  }
}

