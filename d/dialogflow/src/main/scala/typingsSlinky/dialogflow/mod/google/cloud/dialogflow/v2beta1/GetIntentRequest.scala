package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest")
@js.native
/**
  * Constructs a new GetIntentRequest.
  * @param [properties] Properties to set
  */
class GetIntentRequest () extends IGetIntentRequest {
  def this(properties: IGetIntentRequest) = this()
  
  /** GetIntentRequest intentView. */
  @JSName("intentView")
  var intentView_GetIntentRequest: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String) = js.native
  
  /** GetIntentRequest languageCode. */
  @JSName("languageCode")
  var languageCode_GetIntentRequest: String = js.native
  
  /** GetIntentRequest name. */
  @JSName("name")
  var name_GetIntentRequest: String = js.native
  
  /**
    * Converts this GetIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object GetIntentRequest {
  
  /**
    * Creates a new GetIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetIntentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.create")
  @js.native
  def create(): GetIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.create")
  @js.native
  def create(properties: IGetIntentRequest): GetIntentRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): GetIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): GetIntentRequest = js.native
  /**
    * Decodes a GetIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.decode")
  @js.native
  def decode(reader: Reader): GetIntentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): GetIntentRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): GetIntentRequest = js.native
  /**
    * Decodes a GetIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GetIntentRequest = js.native
  
  /**
    * Encodes the specified GetIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetIntentRequest.verify|verify} messages.
    * @param message GetIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.encode")
  @js.native
  def encode(message: IGetIntentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.encode")
  @js.native
  def encode(message: IGetIntentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetIntentRequest.verify|verify} messages.
    * @param message GetIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetIntentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetIntentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetIntentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GetIntentRequest = js.native
  
  /**
    * Creates a plain object from a GetIntentRequest message. Also converts values to other types if specified.
    * @param message GetIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.toObject")
  @js.native
  def toObject(message: GetIntentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.toObject")
  @js.native
  def toObject(message: GetIntentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
