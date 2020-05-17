package typingsSlinky.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.IOneofDescriptorProto
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an OneofDescriptorProto. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.OneofDescriptorProto")
@js.native
/**
  * Constructs a new OneofDescriptorProto.
  * @param [properties] Properties to set
  */
class OneofDescriptorProto ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.OneofDescriptorProto {
  def this(properties: IOneofDescriptorProto) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.OneofDescriptorProto")
@js.native
object OneofDescriptorProto extends js.Object {
  /**
    * Creates a new OneofDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OneofDescriptorProto instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.OneofDescriptorProto = js.native
  def create(properties: IOneofDescriptorProto): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.OneofDescriptorProto = js.native
  /**
    * Decodes an OneofDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OneofDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.OneofDescriptorProto = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.OneofDescriptorProto = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.OneofDescriptorProto = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.OneofDescriptorProto = js.native
  /**
    * Decodes an OneofDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OneofDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.OneofDescriptorProto = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.OneofDescriptorProto = js.native
  /**
    * Encodes the specified OneofDescriptorProto message. Does not implicitly {@link google.protobuf.OneofDescriptorProto.verify|verify} messages.
    * @param message OneofDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IOneofDescriptorProto): Writer = js.native
  def encode(message: IOneofDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Encodes the specified OneofDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.OneofDescriptorProto.verify|verify} messages.
    * @param message OneofDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IOneofDescriptorProto): Writer = js.native
  def encodeDelimited(message: IOneofDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Creates an OneofDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OneofDescriptorProto
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.OneofDescriptorProto = js.native
  /**
    * Creates a plain object from an OneofDescriptorProto message. Also converts values to other types if specified.
    * @param message OneofDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.OneofDescriptorProto): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.OneofDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies an OneofDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

