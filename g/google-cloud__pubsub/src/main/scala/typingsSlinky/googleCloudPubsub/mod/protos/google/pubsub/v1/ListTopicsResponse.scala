package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicsResponse
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListTopicsResponse. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsResponse")
@js.native
/**
  * Constructs a new ListTopicsResponse.
  * @param [properties] Properties to set
  */
class ListTopicsResponse ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsResponse {
  def this(properties: IListTopicsResponse) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsResponse")
@js.native
object ListTopicsResponse extends js.Object {
  /**
    * Creates a new ListTopicsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicsResponse instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsResponse = js.native
  def create(properties: IListTopicsResponse): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsResponse = js.native
  /**
    * Decodes a ListTopicsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsResponse = js.native
  /**
    * Decodes a ListTopicsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsResponse = js.native
  /**
    * Encodes the specified ListTopicsResponse message. Does not implicitly {@link google.pubsub.v1.ListTopicsResponse.verify|verify} messages.
    * @param message ListTopicsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListTopicsResponse): Writer = js.native
  def encode(message: IListTopicsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListTopicsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicsResponse.verify|verify} messages.
    * @param message ListTopicsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListTopicsResponse): Writer = js.native
  def encodeDelimited(message: IListTopicsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ListTopicsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsResponse = js.native
  /**
    * Creates a plain object from a ListTopicsResponse message. Also converts values to other types if specified.
    * @param message ListTopicsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListTopicsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

