package typingsSlinky.awsSdkEventstreamMarshaller.messageMod

import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryHeaderValue extends MessageHeaderValue {
  var `type`: binary
  var value: js.typedarray.Uint8Array
}

object BinaryHeaderValue {
  @scala.inline
  def apply(`type`: binary, value: js.typedarray.Uint8Array): BinaryHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryHeaderValue]
  }
}

