package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetValidationResultRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest")
@js.native
/**
  * Constructs a new GetValidationResultRequest.
  * @param [properties] Properties to set
  */
class GetValidationResultRequest () extends IGetValidationResultRequest {
  def this(properties: IGetValidationResultRequest) = this()
  
  /** GetValidationResultRequest languageCode. */
  @JSName("languageCode")
  var languageCode_GetValidationResultRequest: String = js.native
  
  /** GetValidationResultRequest parent. */
  @JSName("parent")
  var parent_GetValidationResultRequest: String = js.native
  
  /**
    * Converts this GetValidationResultRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object GetValidationResultRequest {
  
  /**
    * Creates a new GetValidationResultRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetValidationResultRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.create")
  @js.native
  def create(): GetValidationResultRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.create")
  @js.native
  def create(properties: IGetValidationResultRequest): GetValidationResultRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): GetValidationResultRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): GetValidationResultRequest = js.native
  /**
    * Decodes a GetValidationResultRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetValidationResultRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.decode")
  @js.native
  def decode(reader: Reader): GetValidationResultRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): GetValidationResultRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): GetValidationResultRequest = js.native
  /**
    * Decodes a GetValidationResultRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetValidationResultRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GetValidationResultRequest = js.native
  
  /**
    * Encodes the specified GetValidationResultRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetValidationResultRequest.verify|verify} messages.
    * @param message GetValidationResultRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.encode")
  @js.native
  def encode(message: IGetValidationResultRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.encode")
  @js.native
  def encode(message: IGetValidationResultRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetValidationResultRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetValidationResultRequest.verify|verify} messages.
    * @param message GetValidationResultRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetValidationResultRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetValidationResultRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetValidationResultRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetValidationResultRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GetValidationResultRequest = js.native
  
  /**
    * Creates a plain object from a GetValidationResultRequest message. Also converts values to other types if specified.
    * @param message GetValidationResultRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.toObject")
  @js.native
  def toObject(message: GetValidationResultRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.toObject")
  @js.native
  def toObject(message: GetValidationResultRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetValidationResultRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
