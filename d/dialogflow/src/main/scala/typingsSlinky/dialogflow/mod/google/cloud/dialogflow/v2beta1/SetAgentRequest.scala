package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SetAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest")
@js.native
/**
  * Constructs a new SetAgentRequest.
  * @param [properties] Properties to set
  */
class SetAgentRequest () extends ISetAgentRequest {
  def this(properties: ISetAgentRequest) = this()
  
  /**
    * Converts this SetAgentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SetAgentRequest {
  
  /**
    * Creates a new SetAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SetAgentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.create")
  @js.native
  def create(): SetAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.create")
  @js.native
  def create(properties: ISetAgentRequest): SetAgentRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): SetAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): SetAgentRequest = js.native
  /**
    * Decodes a SetAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SetAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.decode")
  @js.native
  def decode(reader: Reader): SetAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): SetAgentRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): SetAgentRequest = js.native
  /**
    * Decodes a SetAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SetAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SetAgentRequest = js.native
  
  /**
    * Encodes the specified SetAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SetAgentRequest.verify|verify} messages.
    * @param message SetAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.encode")
  @js.native
  def encode(message: ISetAgentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.encode")
  @js.native
  def encode(message: ISetAgentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SetAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SetAgentRequest.verify|verify} messages.
    * @param message SetAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISetAgentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISetAgentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a SetAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SetAgentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SetAgentRequest = js.native
  
  /**
    * Creates a plain object from a SetAgentRequest message. Also converts values to other types if specified.
    * @param message SetAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.toObject")
  @js.native
  def toObject(message: SetAgentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.toObject")
  @js.native
  def toObject(message: SetAgentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SetAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SetAgentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
