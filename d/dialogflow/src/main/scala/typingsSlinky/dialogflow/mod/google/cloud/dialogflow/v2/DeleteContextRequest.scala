package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteContextRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest")
@js.native
/**
  * Constructs a new DeleteContextRequest.
  * @param [properties] Properties to set
  */
class DeleteContextRequest () extends IDeleteContextRequest {
  def this(properties: IDeleteContextRequest) = this()
  
  /** DeleteContextRequest name. */
  @JSName("name")
  var name_DeleteContextRequest: String = js.native
  
  /**
    * Converts this DeleteContextRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DeleteContextRequest {
  
  /**
    * Creates a new DeleteContextRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteContextRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.create")
  @js.native
  def create(): DeleteContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.create")
  @js.native
  def create(properties: IDeleteContextRequest): DeleteContextRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): DeleteContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): DeleteContextRequest = js.native
  /**
    * Decodes a DeleteContextRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.decode")
  @js.native
  def decode(reader: Reader): DeleteContextRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): DeleteContextRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): DeleteContextRequest = js.native
  /**
    * Decodes a DeleteContextRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DeleteContextRequest = js.native
  
  /**
    * Encodes the specified DeleteContextRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteContextRequest.verify|verify} messages.
    * @param message DeleteContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.encode")
  @js.native
  def encode(message: IDeleteContextRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.encode")
  @js.native
  def encode(message: IDeleteContextRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DeleteContextRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteContextRequest.verify|verify} messages.
    * @param message DeleteContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteContextRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteContextRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DeleteContextRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteContextRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DeleteContextRequest = js.native
  
  /**
    * Creates a plain object from a DeleteContextRequest message. Also converts values to other types if specified.
    * @param message DeleteContextRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.toObject")
  @js.native
  def toObject(message: DeleteContextRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.toObject")
  @js.native
  def toObject(message: DeleteContextRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DeleteContextRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteContextRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
