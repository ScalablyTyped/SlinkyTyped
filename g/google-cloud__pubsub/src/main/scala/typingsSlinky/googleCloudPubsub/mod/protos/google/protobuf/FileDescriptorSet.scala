package typingsSlinky.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.IFileDescriptorSet
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FileDescriptorSet. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileDescriptorSet")
@js.native
/**
  * Constructs a new FileDescriptorSet.
  * @param [properties] Properties to set
  */
class FileDescriptorSet ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorSet {
  def this(properties: IFileDescriptorSet) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileDescriptorSet")
@js.native
object FileDescriptorSet extends js.Object {
  /**
    * Creates a new FileDescriptorSet instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileDescriptorSet instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorSet = js.native
  def create(properties: IFileDescriptorSet): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorSet = js.native
  /**
    * Decodes a FileDescriptorSet message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileDescriptorSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorSet = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorSet = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorSet = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorSet = js.native
  /**
    * Decodes a FileDescriptorSet message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileDescriptorSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorSet = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorSet = js.native
  /**
    * Encodes the specified FileDescriptorSet message. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
    * @param message FileDescriptorSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFileDescriptorSet): Writer = js.native
  def encode(message: IFileDescriptorSet, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FileDescriptorSet message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
    * @param message FileDescriptorSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFileDescriptorSet): Writer = js.native
  def encodeDelimited(message: IFileDescriptorSet, writer: Writer): Writer = js.native
  /**
    * Creates a FileDescriptorSet message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileDescriptorSet
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorSet = js.native
  /**
    * Creates a plain object from a FileDescriptorSet message. Also converts values to other types if specified.
    * @param message FileDescriptorSet
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorSet): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileDescriptorSet,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FileDescriptorSet message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

