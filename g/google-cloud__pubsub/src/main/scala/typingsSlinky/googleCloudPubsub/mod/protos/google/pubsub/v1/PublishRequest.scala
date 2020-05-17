package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IPublishRequest
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a PublishRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest")
@js.native
/**
  * Constructs a new PublishRequest.
  * @param [properties] Properties to set
  */
class PublishRequest ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest {
  def this(properties: IPublishRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest")
@js.native
object PublishRequest extends js.Object {
  /**
    * Creates a new PublishRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PublishRequest instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  def create(properties: IPublishRequest): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  /**
    * Decodes a PublishRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PublishRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  /**
    * Decodes a PublishRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PublishRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  /**
    * Encodes the specified PublishRequest message. Does not implicitly {@link google.pubsub.v1.PublishRequest.verify|verify} messages.
    * @param message PublishRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPublishRequest): Writer = js.native
  def encode(message: IPublishRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified PublishRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.PublishRequest.verify|verify} messages.
    * @param message PublishRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPublishRequest): Writer = js.native
  def encodeDelimited(message: IPublishRequest, writer: Writer): Writer = js.native
  /**
    * Creates a PublishRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PublishRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  /**
    * Creates a plain object from a PublishRequest message. Also converts values to other types if specified.
    * @param message PublishRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a PublishRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

