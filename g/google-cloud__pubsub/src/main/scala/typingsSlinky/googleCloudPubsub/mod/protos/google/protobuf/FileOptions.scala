package typingsSlinky.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.IFileOptions
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FileOptions. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions")
@js.native
/**
  * Constructs a new FileOptions.
  * @param [properties] Properties to set
  */
class FileOptions ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions {
  def this(properties: IFileOptions) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions")
@js.native
object FileOptions extends js.Object {
  /**
    * Creates a new FileOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileOptions instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  def create(properties: IFileOptions): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  /**
    * Decodes a FileOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  /**
    * Decodes a FileOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  /**
    * Encodes the specified FileOptions message. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
    * @param message FileOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFileOptions): Writer = js.native
  def encode(message: IFileOptions, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FileOptions message, length delimited. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
    * @param message FileOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFileOptions): Writer = js.native
  def encodeDelimited(message: IFileOptions, writer: Writer): Writer = js.native
  /**
    * Creates a FileOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileOptions
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  /**
    * Creates a plain object from a FileOptions message. Also converts values to other types if specified.
    * @param message FileOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FileOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** OptimizeMode enum. */
  @js.native
  object OptimizeMode extends js.Object {
    /* 2 */ val CODE_SIZE: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions.OptimizeMode.CODE_SIZE with Double = js.native
    /* 3 */ val LITE_RUNTIME: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions.OptimizeMode.LITE_RUNTIME with Double = js.native
    /* 1 */ val SPEED: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions.OptimizeMode.SPEED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions.OptimizeMode with Double
      ] = js.native
  }
  
}

