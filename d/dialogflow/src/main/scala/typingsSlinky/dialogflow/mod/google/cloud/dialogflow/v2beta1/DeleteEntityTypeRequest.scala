package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest")
@js.native
/**
  * Constructs a new DeleteEntityTypeRequest.
  * @param [properties] Properties to set
  */
class DeleteEntityTypeRequest () extends IDeleteEntityTypeRequest {
  def this(properties: IDeleteEntityTypeRequest) = this()
  
  /** DeleteEntityTypeRequest name. */
  @JSName("name")
  var name_DeleteEntityTypeRequest: String = js.native
  
  /**
    * Converts this DeleteEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DeleteEntityTypeRequest {
  
  /**
    * Creates a new DeleteEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteEntityTypeRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.create")
  @js.native
  def create(): DeleteEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.create")
  @js.native
  def create(properties: IDeleteEntityTypeRequest): DeleteEntityTypeRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): DeleteEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): DeleteEntityTypeRequest = js.native
  /**
    * Decodes a DeleteEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.decode")
  @js.native
  def decode(reader: Reader): DeleteEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): DeleteEntityTypeRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): DeleteEntityTypeRequest = js.native
  /**
    * Decodes a DeleteEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DeleteEntityTypeRequest = js.native
  
  /**
    * Encodes the specified DeleteEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.verify|verify} messages.
    * @param message DeleteEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.encode")
  @js.native
  def encode(message: IDeleteEntityTypeRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.encode")
  @js.native
  def encode(message: IDeleteEntityTypeRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DeleteEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.verify|verify} messages.
    * @param message DeleteEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteEntityTypeRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteEntityTypeRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DeleteEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteEntityTypeRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DeleteEntityTypeRequest = js.native
  
  /**
    * Creates a plain object from a DeleteEntityTypeRequest message. Also converts values to other types if specified.
    * @param message DeleteEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.toObject")
  @js.native
  def toObject(message: DeleteEntityTypeRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.toObject")
  @js.native
  def toObject(message: DeleteEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DeleteEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
