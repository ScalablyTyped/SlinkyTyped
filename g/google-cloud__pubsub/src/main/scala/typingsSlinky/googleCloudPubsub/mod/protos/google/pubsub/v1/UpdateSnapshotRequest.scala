package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IUpdateSnapshotRequest
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateSnapshotRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest")
@js.native
/**
  * Constructs a new UpdateSnapshotRequest.
  * @param [properties] Properties to set
  */
class UpdateSnapshotRequest ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSnapshotRequest {
  def this(properties: IUpdateSnapshotRequest) = this()
}
object UpdateSnapshotRequest {
  
  /**
    * Creates a new UpdateSnapshotRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateSnapshotRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.create")
  @js.native
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.create")
  @js.native
  def create(properties: IUpdateSnapshotRequest): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSnapshotRequest = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSnapshotRequest = js.native
  /**
    * Decodes an UpdateSnapshotRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSnapshotRequest = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSnapshotRequest = js.native
  /**
    * Decodes an UpdateSnapshotRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSnapshotRequest = js.native
  
  /**
    * Encodes the specified UpdateSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.UpdateSnapshotRequest.verify|verify} messages.
    * @param message UpdateSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.encode")
  @js.native
  def encode(message: IUpdateSnapshotRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.encode")
  @js.native
  def encode(message: IUpdateSnapshotRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified UpdateSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.UpdateSnapshotRequest.verify|verify} messages.
    * @param message UpdateSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateSnapshotRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateSnapshotRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates an UpdateSnapshotRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateSnapshotRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSnapshotRequest = js.native
  
  /**
    * Creates a plain object from an UpdateSnapshotRequest message. Also converts values to other types if specified.
    * @param message UpdateSnapshotRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSnapshotRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSnapshotRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an UpdateSnapshotRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSnapshotRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
