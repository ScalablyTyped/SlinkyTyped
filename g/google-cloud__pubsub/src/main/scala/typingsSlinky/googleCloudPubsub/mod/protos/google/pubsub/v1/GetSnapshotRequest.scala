package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IGetSnapshotRequest
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetSnapshotRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest")
@js.native
/**
  * Constructs a new GetSnapshotRequest.
  * @param [properties] Properties to set
  */
class GetSnapshotRequest ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest {
  def this(properties: IGetSnapshotRequest) = this()
}
object GetSnapshotRequest {
  
  /**
    * Creates a new GetSnapshotRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetSnapshotRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.create")
  @js.native
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.create")
  @js.native
  def create(properties: IGetSnapshotRequest): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  /**
    * Decodes a GetSnapshotRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  /**
    * Decodes a GetSnapshotRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  
  /**
    * Encodes the specified GetSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.GetSnapshotRequest.verify|verify} messages.
    * @param message GetSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.encode")
  @js.native
  def encode(message: IGetSnapshotRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.encode")
  @js.native
  def encode(message: IGetSnapshotRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.GetSnapshotRequest.verify|verify} messages.
    * @param message GetSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetSnapshotRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetSnapshotRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetSnapshotRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetSnapshotRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  
  /**
    * Creates a plain object from a GetSnapshotRequest message. Also converts values to other types if specified.
    * @param message GetSnapshotRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetSnapshotRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
