package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListTopicSnapshotsResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse")
@js.native
/**
  * Constructs a new ListTopicSnapshotsResponse.
  * @param [properties] Properties to set
  */
class ListTopicSnapshotsResponse () extends IListTopicSnapshotsResponse {
  def this(properties: IListTopicSnapshotsResponse) = this()
  
  /** ListTopicSnapshotsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListTopicSnapshotsResponse: String = js.native
  
  /** ListTopicSnapshotsResponse snapshots. */
  @JSName("snapshots")
  var snapshots_ListTopicSnapshotsResponse: js.Array[String] = js.native
  
  /**
    * Converts this ListTopicSnapshotsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListTopicSnapshotsResponse {
  
  /**
    * Creates a new ListTopicSnapshotsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicSnapshotsResponse instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.create")
  @js.native
  def create(): ListTopicSnapshotsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.create")
  @js.native
  def create(properties: IListTopicSnapshotsResponse): ListTopicSnapshotsResponse = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ListTopicSnapshotsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ListTopicSnapshotsResponse = js.native
  /**
    * Decodes a ListTopicSnapshotsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicSnapshotsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.decode")
  @js.native
  def decode(reader: Reader): ListTopicSnapshotsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListTopicSnapshotsResponse = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ListTopicSnapshotsResponse = js.native
  /**
    * Decodes a ListTopicSnapshotsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicSnapshotsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListTopicSnapshotsResponse = js.native
  
  /**
    * Encodes the specified ListTopicSnapshotsResponse message. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsResponse.verify|verify} messages.
    * @param message ListTopicSnapshotsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.encode")
  @js.native
  def encode(message: IListTopicSnapshotsResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.encode")
  @js.native
  def encode(message: IListTopicSnapshotsResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListTopicSnapshotsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsResponse.verify|verify} messages.
    * @param message ListTopicSnapshotsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicSnapshotsResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicSnapshotsResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListTopicSnapshotsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicSnapshotsResponse
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListTopicSnapshotsResponse = js.native
  
  /**
    * Creates a plain object from a ListTopicSnapshotsResponse message. Also converts values to other types if specified.
    * @param message ListTopicSnapshotsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.toObject")
  @js.native
  def toObject(message: ListTopicSnapshotsResponse): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.toObject")
  @js.native
  def toObject(message: ListTopicSnapshotsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListTopicSnapshotsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
