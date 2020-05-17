package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IPullResponse
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a PullResponse. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse")
@js.native
/**
  * Constructs a new PullResponse.
  * @param [properties] Properties to set
  */
class PullResponse ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse {
  def this(properties: IPullResponse) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse")
@js.native
object PullResponse extends js.Object {
  /**
    * Creates a new PullResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PullResponse instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  def create(properties: IPullResponse): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  /**
    * Decodes a PullResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  /**
    * Decodes a PullResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  /**
    * Encodes the specified PullResponse message. Does not implicitly {@link google.pubsub.v1.PullResponse.verify|verify} messages.
    * @param message PullResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPullResponse): Writer = js.native
  def encode(message: IPullResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified PullResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.PullResponse.verify|verify} messages.
    * @param message PullResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPullResponse): Writer = js.native
  def encodeDelimited(message: IPullResponse, writer: Writer): Writer = js.native
  /**
    * Creates a PullResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PullResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  /**
    * Creates a plain object from a PullResponse message. Also converts values to other types if specified.
    * @param message PullResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a PullResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

