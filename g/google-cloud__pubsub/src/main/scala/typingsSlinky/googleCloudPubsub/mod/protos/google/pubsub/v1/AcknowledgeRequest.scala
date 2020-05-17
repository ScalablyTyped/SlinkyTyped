package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IAcknowledgeRequest
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an AcknowledgeRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest")
@js.native
/**
  * Constructs a new AcknowledgeRequest.
  * @param [properties] Properties to set
  */
class AcknowledgeRequest ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest {
  def this(properties: IAcknowledgeRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest")
@js.native
object AcknowledgeRequest extends js.Object {
  /**
    * Creates a new AcknowledgeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AcknowledgeRequest instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  def create(properties: IAcknowledgeRequest): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  /**
    * Decodes an AcknowledgeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns AcknowledgeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  /**
    * Decodes an AcknowledgeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AcknowledgeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  /**
    * Encodes the specified AcknowledgeRequest message. Does not implicitly {@link google.pubsub.v1.AcknowledgeRequest.verify|verify} messages.
    * @param message AcknowledgeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IAcknowledgeRequest): Writer = js.native
  def encode(message: IAcknowledgeRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified AcknowledgeRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.AcknowledgeRequest.verify|verify} messages.
    * @param message AcknowledgeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IAcknowledgeRequest): Writer = js.native
  def encodeDelimited(message: IAcknowledgeRequest, writer: Writer): Writer = js.native
  /**
    * Creates an AcknowledgeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns AcknowledgeRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  /**
    * Creates a plain object from an AcknowledgeRequest message. Also converts values to other types if specified.
    * @param message AcknowledgeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies an AcknowledgeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

