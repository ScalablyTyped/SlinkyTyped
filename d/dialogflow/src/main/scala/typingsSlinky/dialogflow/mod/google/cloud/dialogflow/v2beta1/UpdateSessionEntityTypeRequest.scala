package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateSessionEntityTypeRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest")
@js.native
/**
  * Constructs a new UpdateSessionEntityTypeRequest.
  * @param [properties] Properties to set
  */
class UpdateSessionEntityTypeRequest () extends IUpdateSessionEntityTypeRequest {
  def this(properties: IUpdateSessionEntityTypeRequest) = this()
  
  /**
    * Converts this UpdateSessionEntityTypeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object UpdateSessionEntityTypeRequest {
  
  /**
    * Creates a new UpdateSessionEntityTypeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateSessionEntityTypeRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.create")
  @js.native
  def create(): UpdateSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.create")
  @js.native
  def create(properties: IUpdateSessionEntityTypeRequest): UpdateSessionEntityTypeRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): UpdateSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): UpdateSessionEntityTypeRequest = js.native
  /**
    * Decodes an UpdateSessionEntityTypeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.decode")
  @js.native
  def decode(reader: Reader): UpdateSessionEntityTypeRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): UpdateSessionEntityTypeRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): UpdateSessionEntityTypeRequest = js.native
  /**
    * Decodes an UpdateSessionEntityTypeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateSessionEntityTypeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): UpdateSessionEntityTypeRequest = js.native
  
  /**
    * Encodes the specified UpdateSessionEntityTypeRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.verify|verify} messages.
    * @param message UpdateSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.encode")
  @js.native
  def encode(message: IUpdateSessionEntityTypeRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.encode")
  @js.native
  def encode(message: IUpdateSessionEntityTypeRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified UpdateSessionEntityTypeRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.verify|verify} messages.
    * @param message UpdateSessionEntityTypeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateSessionEntityTypeRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateSessionEntityTypeRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates an UpdateSessionEntityTypeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateSessionEntityTypeRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): UpdateSessionEntityTypeRequest = js.native
  
  /**
    * Creates a plain object from an UpdateSessionEntityTypeRequest message. Also converts values to other types if specified.
    * @param message UpdateSessionEntityTypeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.toObject")
  @js.native
  def toObject(message: UpdateSessionEntityTypeRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.toObject")
  @js.native
  def toObject(message: UpdateSessionEntityTypeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an UpdateSessionEntityTypeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
