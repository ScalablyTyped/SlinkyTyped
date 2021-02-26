package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest")
@js.native
/**
  * Constructs a new CreateEntityTypeRequest.
  * @param [properties] Properties to set
  */
class CreateEntityTypeRequest () extends ICreateEntityTypeRequest {
  def this(properties: ICreateEntityTypeRequest) = this()
  
  /** CreateEntityTypeRequest languageCode. */
  @JSName("languageCode")
  var languageCode_CreateEntityTypeRequest: String = js.native
  
  /** CreateEntityTypeRequest parent. */
  @JSName("parent")
  var parent_CreateEntityTypeRequest: String = js.native
  
  /**
    * Converts this CreateEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CreateEntityTypeRequest {
  
  /**
    * Creates a new CreateEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateEntityTypeRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.create")
  @js.native
  def create(): CreateEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.create")
  @js.native
  def create(properties: ICreateEntityTypeRequest): CreateEntityTypeRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): CreateEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): CreateEntityTypeRequest = js.native
  /**
    * Decodes a CreateEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.decode")
  @js.native
  def decode(reader: Reader): CreateEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): CreateEntityTypeRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): CreateEntityTypeRequest = js.native
  /**
    * Decodes a CreateEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): CreateEntityTypeRequest = js.native
  
  /**
    * Encodes the specified CreateEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.CreateEntityTypeRequest.verify|verify} messages.
    * @param message CreateEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.encode")
  @js.native
  def encode(message: ICreateEntityTypeRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.encode")
  @js.native
  def encode(message: ICreateEntityTypeRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CreateEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.CreateEntityTypeRequest.verify|verify} messages.
    * @param message CreateEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICreateEntityTypeRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICreateEntityTypeRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a CreateEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateEntityTypeRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): CreateEntityTypeRequest = js.native
  
  /**
    * Creates a plain object from a CreateEntityTypeRequest message. Also converts values to other types if specified.
    * @param message CreateEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.toObject")
  @js.native
  def toObject(message: CreateEntityTypeRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.toObject")
  @js.native
  def toObject(message: CreateEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CreateEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.CreateEntityTypeRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
