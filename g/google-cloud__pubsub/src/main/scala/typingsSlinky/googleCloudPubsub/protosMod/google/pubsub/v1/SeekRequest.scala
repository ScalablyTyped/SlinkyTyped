package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.googleCloudPubsubStrings.snapshot
import typingsSlinky.googleCloudPubsub.googleCloudPubsubStrings.time
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SeekRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest")
@js.native
/**
  * Constructs a new SeekRequest.
  * @param [properties] Properties to set
  */
class SeekRequest () extends ISeekRequest {
  def this(properties: ISeekRequest) = this()
  
  /** SeekRequest snapshot. */
  @JSName("snapshot")
  var snapshot_SeekRequest: String = js.native
  
  /** SeekRequest subscription. */
  @JSName("subscription")
  var subscription_SeekRequest: String = js.native
  
  /** SeekRequest target. */
  var target: js.UndefOr[time | snapshot] = js.native
  
  /**
    * Converts this SeekRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SeekRequest {
  
  /**
    * Creates a new SeekRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SeekRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.create")
  @js.native
  def create(): SeekRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.create")
  @js.native
  def create(properties: ISeekRequest): SeekRequest = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): SeekRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): SeekRequest = js.native
  /**
    * Decodes a SeekRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SeekRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.decode")
  @js.native
  def decode(reader: Reader): SeekRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): SeekRequest = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): SeekRequest = js.native
  /**
    * Decodes a SeekRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SeekRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SeekRequest = js.native
  
  /**
    * Encodes the specified SeekRequest message. Does not implicitly {@link google.pubsub.v1.SeekRequest.verify|verify} messages.
    * @param message SeekRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.encode")
  @js.native
  def encode(message: ISeekRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.encode")
  @js.native
  def encode(message: ISeekRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SeekRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.SeekRequest.verify|verify} messages.
    * @param message SeekRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISeekRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISeekRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a SeekRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SeekRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SeekRequest = js.native
  
  /**
    * Creates a plain object from a SeekRequest message. Also converts values to other types if specified.
    * @param message SeekRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.toObject")
  @js.native
  def toObject(message: SeekRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.toObject")
  @js.native
  def toObject(message: SeekRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SeekRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
