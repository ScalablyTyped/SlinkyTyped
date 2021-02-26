package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest")
@js.native
/**
  * Constructs a new UpdateEntityTypeRequest.
  * @param [properties] Properties to set
  */
class UpdateEntityTypeRequest () extends IUpdateEntityTypeRequest {
  def this(properties: IUpdateEntityTypeRequest) = this()
  
  /** UpdateEntityTypeRequest languageCode. */
  @JSName("languageCode")
  var languageCode_UpdateEntityTypeRequest: String = js.native
  
  /**
    * Converts this UpdateEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object UpdateEntityTypeRequest {
  
  /**
    * Creates a new UpdateEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateEntityTypeRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.create")
  @js.native
  def create(): UpdateEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.create")
  @js.native
  def create(properties: IUpdateEntityTypeRequest): UpdateEntityTypeRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): UpdateEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): UpdateEntityTypeRequest = js.native
  /**
    * Decodes an UpdateEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.decode")
  @js.native
  def decode(reader: Reader): UpdateEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): UpdateEntityTypeRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): UpdateEntityTypeRequest = js.native
  /**
    * Decodes an UpdateEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): UpdateEntityTypeRequest = js.native
  
  /**
    * Encodes the specified UpdateEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.verify|verify} messages.
    * @param message UpdateEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.encode")
  @js.native
  def encode(message: IUpdateEntityTypeRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.encode")
  @js.native
  def encode(message: IUpdateEntityTypeRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified UpdateEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.verify|verify} messages.
    * @param message UpdateEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateEntityTypeRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateEntityTypeRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates an UpdateEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateEntityTypeRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): UpdateEntityTypeRequest = js.native
  
  /**
    * Creates a plain object from an UpdateEntityTypeRequest message. Also converts values to other types if specified.
    * @param message UpdateEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.toObject")
  @js.native
  def toObject(message: UpdateEntityTypeRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.toObject")
  @js.native
  def toObject(message: UpdateEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an UpdateEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
