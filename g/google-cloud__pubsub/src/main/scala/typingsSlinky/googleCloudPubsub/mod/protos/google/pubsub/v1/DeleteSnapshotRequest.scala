package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IDeleteSnapshotRequest
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeleteSnapshotRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSnapshotRequest")
@js.native
/**
  * Constructs a new DeleteSnapshotRequest.
  * @param [properties] Properties to set
  */
class DeleteSnapshotRequest ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest {
  def this(properties: IDeleteSnapshotRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSnapshotRequest")
@js.native
object DeleteSnapshotRequest extends js.Object {
  /**
    * Creates a new DeleteSnapshotRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteSnapshotRequest instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = js.native
  def create(properties: IDeleteSnapshotRequest): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = js.native
  /**
    * Decodes a DeleteSnapshotRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = js.native
  /**
    * Decodes a DeleteSnapshotRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = js.native
  /**
    * Encodes the specified DeleteSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.DeleteSnapshotRequest.verify|verify} messages.
    * @param message DeleteSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeleteSnapshotRequest): Writer = js.native
  def encode(message: IDeleteSnapshotRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeleteSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DeleteSnapshotRequest.verify|verify} messages.
    * @param message DeleteSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeleteSnapshotRequest): Writer = js.native
  def encodeDelimited(message: IDeleteSnapshotRequest, writer: Writer): Writer = js.native
  /**
    * Creates a DeleteSnapshotRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteSnapshotRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest = js.native
  /**
    * Creates a plain object from a DeleteSnapshotRequest message. Also converts values to other types if specified.
    * @param message DeleteSnapshotRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSnapshotRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeleteSnapshotRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

