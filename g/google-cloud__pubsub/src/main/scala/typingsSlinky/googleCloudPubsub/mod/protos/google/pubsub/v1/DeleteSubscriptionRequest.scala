package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IDeleteSubscriptionRequest
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeleteSubscriptionRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest")
@js.native
/**
  * Constructs a new DeleteSubscriptionRequest.
  * @param [properties] Properties to set
  */
class DeleteSubscriptionRequest ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest {
  def this(properties: IDeleteSubscriptionRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest")
@js.native
object DeleteSubscriptionRequest extends js.Object {
  /**
    * Creates a new DeleteSubscriptionRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteSubscriptionRequest instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  def create(properties: IDeleteSubscriptionRequest): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  /**
    * Decodes a DeleteSubscriptionRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  /**
    * Decodes a DeleteSubscriptionRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  /**
    * Encodes the specified DeleteSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.DeleteSubscriptionRequest.verify|verify} messages.
    * @param message DeleteSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeleteSubscriptionRequest): Writer = js.native
  def encode(message: IDeleteSubscriptionRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeleteSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DeleteSubscriptionRequest.verify|verify} messages.
    * @param message DeleteSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeleteSubscriptionRequest): Writer = js.native
  def encodeDelimited(message: IDeleteSubscriptionRequest, writer: Writer): Writer = js.native
  /**
    * Creates a DeleteSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteSubscriptionRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  /**
    * Creates a plain object from a DeleteSubscriptionRequest message. Also converts values to other types if specified.
    * @param message DeleteSubscriptionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeleteSubscriptionRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

