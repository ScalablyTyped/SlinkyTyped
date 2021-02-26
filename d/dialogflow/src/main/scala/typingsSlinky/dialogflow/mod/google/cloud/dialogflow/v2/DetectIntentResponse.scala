package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DetectIntentResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse")
@js.native
/**
  * Constructs a new DetectIntentResponse.
  * @param [properties] Properties to set
  */
class DetectIntentResponse () extends IDetectIntentResponse {
  def this(properties: IDetectIntentResponse) = this()
  
  /** DetectIntentResponse outputAudio. */
  @JSName("outputAudio")
  var outputAudio_DetectIntentResponse: js.typedarray.Uint8Array | String = js.native
  
  /** DetectIntentResponse responseId. */
  @JSName("responseId")
  var responseId_DetectIntentResponse: String = js.native
  
  /**
    * Converts this DetectIntentResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DetectIntentResponse {
  
  /**
    * Creates a new DetectIntentResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DetectIntentResponse instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.create")
  @js.native
  def create(): DetectIntentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.create")
  @js.native
  def create(properties: IDetectIntentResponse): DetectIntentResponse = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): DetectIntentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): DetectIntentResponse = js.native
  /**
    * Decodes a DetectIntentResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.decode")
  @js.native
  def decode(reader: Reader): DetectIntentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): DetectIntentResponse = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): DetectIntentResponse = js.native
  /**
    * Decodes a DetectIntentResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DetectIntentResponse = js.native
  
  /**
    * Encodes the specified DetectIntentResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.DetectIntentResponse.verify|verify} messages.
    * @param message DetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.encode")
  @js.native
  def encode(message: IDetectIntentResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.encode")
  @js.native
  def encode(message: IDetectIntentResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DetectIntentResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.DetectIntentResponse.verify|verify} messages.
    * @param message DetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDetectIntentResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDetectIntentResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a DetectIntentResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DetectIntentResponse
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DetectIntentResponse = js.native
  
  /**
    * Creates a plain object from a DetectIntentResponse message. Also converts values to other types if specified.
    * @param message DetectIntentResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.toObject")
  @js.native
  def toObject(message: DetectIntentResponse): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.toObject")
  @js.native
  def toObject(message: DetectIntentResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DetectIntentResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
