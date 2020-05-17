package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IListSnapshotsResponse
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListSnapshotsResponse. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse")
@js.native
/**
  * Constructs a new ListSnapshotsResponse.
  * @param [properties] Properties to set
  */
class ListSnapshotsResponse ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse {
  def this(properties: IListSnapshotsResponse) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse")
@js.native
object ListSnapshotsResponse extends js.Object {
  /**
    * Creates a new ListSnapshotsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSnapshotsResponse instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  def create(properties: IListSnapshotsResponse): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  /**
    * Decodes a ListSnapshotsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSnapshotsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  /**
    * Decodes a ListSnapshotsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSnapshotsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  /**
    * Encodes the specified ListSnapshotsResponse message. Does not implicitly {@link google.pubsub.v1.ListSnapshotsResponse.verify|verify} messages.
    * @param message ListSnapshotsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListSnapshotsResponse): Writer = js.native
  def encode(message: IListSnapshotsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListSnapshotsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSnapshotsResponse.verify|verify} messages.
    * @param message ListSnapshotsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListSnapshotsResponse): Writer = js.native
  def encodeDelimited(message: IListSnapshotsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ListSnapshotsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSnapshotsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  /**
    * Creates a plain object from a ListSnapshotsResponse message. Also converts values to other types if specified.
    * @param message ListSnapshotsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListSnapshotsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

