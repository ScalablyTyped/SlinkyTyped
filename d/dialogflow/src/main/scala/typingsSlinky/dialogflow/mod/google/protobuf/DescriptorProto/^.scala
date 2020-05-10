package typingsSlinky.dialogflow.mod.google.protobuf.DescriptorProto

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.dialogflow.mod.google.protobuf.IDescriptorProto
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.protobuf.DescriptorProto")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new DescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DescriptorProto instance
    */
  def create(): typingsSlinky.dialogflow.mod.google.protobuf.DescriptorProto = js.native
  def create(properties: IDescriptorProto): typingsSlinky.dialogflow.mod.google.protobuf.DescriptorProto = js.native
  /**
    * Decodes a DescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.dialogflow.mod.google.protobuf.DescriptorProto = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.dialogflow.mod.google.protobuf.DescriptorProto = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.dialogflow.mod.google.protobuf.DescriptorProto = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.dialogflow.mod.google.protobuf.DescriptorProto = js.native
  /**
    * Decodes a DescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.dialogflow.mod.google.protobuf.DescriptorProto = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.dialogflow.mod.google.protobuf.DescriptorProto = js.native
  /**
    * Encodes the specified DescriptorProto message. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
    * @param message DescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDescriptorProto): Writer = js.native
  def encode(message: IDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
    * @param message DescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDescriptorProto): Writer = js.native
  def encodeDelimited(message: IDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Creates a DescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DescriptorProto
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.dialogflow.mod.google.protobuf.DescriptorProto = js.native
  /**
    * Creates a plain object from a DescriptorProto message. Also converts values to other types if specified.
    * @param message DescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.dialogflow.mod.google.protobuf.DescriptorProto): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.dialogflow.mod.google.protobuf.DescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

