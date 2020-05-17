package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ISeekRequest
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SeekRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.SeekRequest")
@js.native
/**
  * Constructs a new SeekRequest.
  * @param [properties] Properties to set
  */
class SeekRequest ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.SeekRequest {
  def this(properties: ISeekRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.SeekRequest")
@js.native
object SeekRequest extends js.Object {
  /**
    * Creates a new SeekRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SeekRequest instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.SeekRequest = js.native
  def create(properties: ISeekRequest): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.SeekRequest = js.native
  /**
    * Decodes a SeekRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SeekRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.SeekRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.SeekRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.SeekRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.SeekRequest = js.native
  /**
    * Decodes a SeekRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SeekRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.SeekRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.SeekRequest = js.native
  /**
    * Encodes the specified SeekRequest message. Does not implicitly {@link google.pubsub.v1.SeekRequest.verify|verify} messages.
    * @param message SeekRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISeekRequest): Writer = js.native
  def encode(message: ISeekRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SeekRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.SeekRequest.verify|verify} messages.
    * @param message SeekRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISeekRequest): Writer = js.native
  def encodeDelimited(message: ISeekRequest, writer: Writer): Writer = js.native
  /**
    * Creates a SeekRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SeekRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.SeekRequest = js.native
  /**
    * Creates a plain object from a SeekRequest message. Also converts values to other types if specified.
    * @param message SeekRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.SeekRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.SeekRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SeekRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

