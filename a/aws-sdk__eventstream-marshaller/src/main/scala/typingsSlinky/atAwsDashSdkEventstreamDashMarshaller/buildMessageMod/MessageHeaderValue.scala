package typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod

import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.binary
import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.boolean
import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.byte
import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.integer
import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.long
import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.short
import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.string
import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.timestamp
import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.uuid
import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.buildInt64Mod.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.BooleanHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.ByteHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.ShortHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.IntegerHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.LongHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.BinaryHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.StringHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.TimestampHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.UuidHeaderValue
*/
trait MessageHeaderValue extends js.Object

object MessageHeaderValue {
  @scala.inline
  def TimestampHeaderValue(`type`: timestamp, value: js.Date): MessageHeaderValue = {
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
  def ShortHeaderValue(`type`: short, value: Double): MessageHeaderValue = {
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
  def IntegerHeaderValue(`type`: integer, value: Double): MessageHeaderValue = {
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
  def BinaryHeaderValue(`type`: binary, value: scala.scalajs.js.typedarray.Uint8Array): MessageHeaderValue = {
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
  def StringHeaderValue(`type`: string, value: String): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
}

