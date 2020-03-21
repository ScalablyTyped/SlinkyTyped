package typingsSlinky.apolloProtobufjs.mod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.BytesValue message. */
trait IBytesValue extends js.Object {
  var value: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array] = js.undefined
}

object IBytesValue {
  @scala.inline
  def apply(value: scala.scalajs.js.typedarray.Uint8Array = null): IBytesValue = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBytesValue]
  }
}

