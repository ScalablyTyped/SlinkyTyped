package typingsSlinky.awsSdkEventstreamMarshaller.messageMod

import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.binary
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.boolean
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.byte
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.integer
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.long
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.short
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.string
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.timestamp
import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.uuid
import typingsSlinky.awsSdkEventstreamMarshaller.int64Mod.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.BooleanHeaderValue
  - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.ByteHeaderValue
  - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.ShortHeaderValue
  - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.IntegerHeaderValue
  - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.LongHeaderValue
  - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.BinaryHeaderValue
  - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.StringHeaderValue
  - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.TimestampHeaderValue
  - typingsSlinky.awsSdkEventstreamMarshaller.messageMod.UuidHeaderValue
*/
trait MessageHeaderValue extends js.Object

object MessageHeaderValue {
  @scala.inline
  def BinaryHeaderValue(`type`: binary, value: js.typedarray.Uint8Array): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def StringHeaderValue(`type`: string, value: String): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def LongHeaderValue(`type`: long, value: Int64): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def BooleanHeaderValue(`type`: boolean, value: Boolean): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def TimestampHeaderValue(`type`: timestamp, value: js.Date): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def ByteHeaderValue(`type`: byte, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def ShortHeaderValue(`type`: short, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def UuidHeaderValue(`type`: uuid, value: String): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def IntegerHeaderValue(`type`: integer, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
}

