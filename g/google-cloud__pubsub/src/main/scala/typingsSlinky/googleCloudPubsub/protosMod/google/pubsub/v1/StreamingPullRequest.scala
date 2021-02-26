package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.long.mod.Long
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingPullRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest")
@js.native
/**
  * Constructs a new StreamingPullRequest.
  * @param [properties] Properties to set
  */
class StreamingPullRequest () extends IStreamingPullRequest {
  def this(properties: IStreamingPullRequest) = this()
  
  /** StreamingPullRequest ackIds. */
  @JSName("ackIds")
  var ackIds_StreamingPullRequest: js.Array[String] = js.native
  
  /** StreamingPullRequest clientId. */
  @JSName("clientId")
  var clientId_StreamingPullRequest: String = js.native
  
  /** StreamingPullRequest maxOutstandingBytes. */
  @JSName("maxOutstandingBytes")
  var maxOutstandingBytes_StreamingPullRequest: Double | Long | String = js.native
  
  /** StreamingPullRequest maxOutstandingMessages. */
  @JSName("maxOutstandingMessages")
  var maxOutstandingMessages_StreamingPullRequest: Double | Long | String = js.native
  
  /** StreamingPullRequest modifyDeadlineAckIds. */
  @JSName("modifyDeadlineAckIds")
  var modifyDeadlineAckIds_StreamingPullRequest: js.Array[String] = js.native
  
  /** StreamingPullRequest modifyDeadlineSeconds. */
  @JSName("modifyDeadlineSeconds")
  var modifyDeadlineSeconds_StreamingPullRequest: js.Array[Double] = js.native
  
  /** StreamingPullRequest streamAckDeadlineSeconds. */
  @JSName("streamAckDeadlineSeconds")
  var streamAckDeadlineSeconds_StreamingPullRequest: Double = js.native
  
  /** StreamingPullRequest subscription. */
  @JSName("subscription")
  var subscription_StreamingPullRequest: String = js.native
  
  /**
    * Converts this StreamingPullRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object StreamingPullRequest {
  
  /**
    * Creates a new StreamingPullRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingPullRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.create")
  @js.native
  def create(): StreamingPullRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.create")
  @js.native
  def create(properties: IStreamingPullRequest): StreamingPullRequest = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): StreamingPullRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): StreamingPullRequest = js.native
  /**
    * Decodes a StreamingPullRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingPullRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.decode")
  @js.native
  def decode(reader: Reader): StreamingPullRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): StreamingPullRequest = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): StreamingPullRequest = js.native
  /**
    * Decodes a StreamingPullRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingPullRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): StreamingPullRequest = js.native
  
  /**
    * Encodes the specified StreamingPullRequest message. Does not implicitly {@link google.pubsub.v1.StreamingPullRequest.verify|verify} messages.
    * @param message StreamingPullRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.encode")
  @js.native
  def encode(message: IStreamingPullRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.encode")
  @js.native
  def encode(message: IStreamingPullRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StreamingPullRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.StreamingPullRequest.verify|verify} messages.
    * @param message StreamingPullRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStreamingPullRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStreamingPullRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a StreamingPullRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingPullRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): StreamingPullRequest = js.native
  
  /**
    * Creates a plain object from a StreamingPullRequest message. Also converts values to other types if specified.
    * @param message StreamingPullRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.toObject")
  @js.native
  def toObject(message: StreamingPullRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.toObject")
  @js.native
  def toObject(message: StreamingPullRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StreamingPullRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
