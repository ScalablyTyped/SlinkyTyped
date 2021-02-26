package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IListSnapshotsResponse
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ListSnapshotsResponse {
  
  /**
    * Creates a new ListSnapshotsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSnapshotsResponse instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.create")
  @js.native
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.create")
  @js.native
  def create(properties: IListSnapshotsResponse): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  /**
    * Decodes a ListSnapshotsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSnapshotsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  /**
    * Decodes a ListSnapshotsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSnapshotsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  
  /**
    * Encodes the specified ListSnapshotsResponse message. Does not implicitly {@link google.pubsub.v1.ListSnapshotsResponse.verify|verify} messages.
    * @param message ListSnapshotsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.encode")
  @js.native
  def encode(message: IListSnapshotsResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.encode")
  @js.native
  def encode(message: IListSnapshotsResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListSnapshotsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSnapshotsResponse.verify|verify} messages.
    * @param message ListSnapshotsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListSnapshotsResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListSnapshotsResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListSnapshotsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSnapshotsResponse
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  
  /**
    * Creates a plain object from a ListSnapshotsResponse message. Also converts values to other types if specified.
    * @param message ListSnapshotsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListSnapshotsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
