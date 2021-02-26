package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingDetectIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest")
@js.native
/**
  * Constructs a new StreamingDetectIntentRequest.
  * @param [properties] Properties to set
  */
class StreamingDetectIntentRequest () extends IStreamingDetectIntentRequest {
  def this(properties: IStreamingDetectIntentRequest) = this()
  
  /** StreamingDetectIntentRequest inputAudio. */
  @JSName("inputAudio")
  var inputAudio_StreamingDetectIntentRequest: js.typedarray.Uint8Array | String = js.native
  
  /** StreamingDetectIntentRequest session. */
  @JSName("session")
  var session_StreamingDetectIntentRequest: String = js.native
  
  /** StreamingDetectIntentRequest singleUtterance. */
  @JSName("singleUtterance")
  var singleUtterance_StreamingDetectIntentRequest: Boolean = js.native
  
  /**
    * Converts this StreamingDetectIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object StreamingDetectIntentRequest {
  
  /**
    * Creates a new StreamingDetectIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingDetectIntentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.create")
  @js.native
  def create(): StreamingDetectIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.create")
  @js.native
  def create(properties: IStreamingDetectIntentRequest): StreamingDetectIntentRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): StreamingDetectIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): StreamingDetectIntentRequest = js.native
  /**
    * Decodes a StreamingDetectIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingDetectIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.decode")
  @js.native
  def decode(reader: Reader): StreamingDetectIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): StreamingDetectIntentRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): StreamingDetectIntentRequest = js.native
  /**
    * Decodes a StreamingDetectIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingDetectIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): StreamingDetectIntentRequest = js.native
  
  /**
    * Encodes the specified StreamingDetectIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.verify|verify} messages.
    * @param message StreamingDetectIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.encode")
  @js.native
  def encode(message: IStreamingDetectIntentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.encode")
  @js.native
  def encode(message: IStreamingDetectIntentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StreamingDetectIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.verify|verify} messages.
    * @param message StreamingDetectIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStreamingDetectIntentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStreamingDetectIntentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a StreamingDetectIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingDetectIntentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): StreamingDetectIntentRequest = js.native
  
  /**
    * Creates a plain object from a StreamingDetectIntentRequest message. Also converts values to other types if specified.
    * @param message StreamingDetectIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.toObject")
  @js.native
  def toObject(message: StreamingDetectIntentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.toObject")
  @js.native
  def toObject(message: StreamingDetectIntentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StreamingDetectIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
