package typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod

import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryHeaderValue extends MessageHeaderValue {
  var `type`: binary
  var value: scala.scalajs.js.typedarray.Uint8Array
}

object BinaryHeaderValue {
  @scala.inline
  def apply(`type`: binary, value: scala.scalajs.js.typedarray.Uint8Array): BinaryHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryHeaderValue]
  }
}

