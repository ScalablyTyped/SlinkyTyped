package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.dialogflow.dialogflowStrings.agentContent
import typingsSlinky.dialogflow.dialogflowStrings.agentUri
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RestoreAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest")
@js.native
/**
  * Constructs a new RestoreAgentRequest.
  * @param [properties] Properties to set
  */
class RestoreAgentRequest () extends IRestoreAgentRequest {
  def this(properties: IRestoreAgentRequest) = this()
  
  /** RestoreAgentRequest agent. */
  var agent: js.UndefOr[agentUri | agentContent] = js.native
  
  /** RestoreAgentRequest agentContent. */
  @JSName("agentContent")
  var agentContent_RestoreAgentRequest: js.typedarray.Uint8Array | String = js.native
  
  /** RestoreAgentRequest agentUri. */
  @JSName("agentUri")
  var agentUri_RestoreAgentRequest: String = js.native
  
  /** RestoreAgentRequest parent. */
  @JSName("parent")
  var parent_RestoreAgentRequest: String = js.native
  
  /**
    * Converts this RestoreAgentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object RestoreAgentRequest {
  
  /**
    * Creates a new RestoreAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RestoreAgentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.create")
  @js.native
  def create(): RestoreAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.create")
  @js.native
  def create(properties: IRestoreAgentRequest): RestoreAgentRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): RestoreAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): RestoreAgentRequest = js.native
  /**
    * Decodes a RestoreAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RestoreAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.decode")
  @js.native
  def decode(reader: Reader): RestoreAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): RestoreAgentRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): RestoreAgentRequest = js.native
  /**
    * Decodes a RestoreAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RestoreAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): RestoreAgentRequest = js.native
  
  /**
    * Encodes the specified RestoreAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.RestoreAgentRequest.verify|verify} messages.
    * @param message RestoreAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.encode")
  @js.native
  def encode(message: IRestoreAgentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.encode")
  @js.native
  def encode(message: IRestoreAgentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified RestoreAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.RestoreAgentRequest.verify|verify} messages.
    * @param message RestoreAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IRestoreAgentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IRestoreAgentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a RestoreAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RestoreAgentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): RestoreAgentRequest = js.native
  
  /**
    * Creates a plain object from a RestoreAgentRequest message. Also converts values to other types if specified.
    * @param message RestoreAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.toObject")
  @js.native
  def toObject(message: RestoreAgentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.toObject")
  @js.native
  def toObject(message: RestoreAgentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a RestoreAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
