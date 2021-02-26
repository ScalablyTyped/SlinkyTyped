package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TrainAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest")
@js.native
/**
  * Constructs a new TrainAgentRequest.
  * @param [properties] Properties to set
  */
class TrainAgentRequest () extends ITrainAgentRequest {
  def this(properties: ITrainAgentRequest) = this()
  
  /** TrainAgentRequest parent. */
  @JSName("parent")
  var parent_TrainAgentRequest: String = js.native
  
  /**
    * Converts this TrainAgentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object TrainAgentRequest {
  
  /**
    * Creates a new TrainAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TrainAgentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.create")
  @js.native
  def create(): TrainAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.create")
  @js.native
  def create(properties: ITrainAgentRequest): TrainAgentRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): TrainAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): TrainAgentRequest = js.native
  /**
    * Decodes a TrainAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TrainAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.decode")
  @js.native
  def decode(reader: Reader): TrainAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): TrainAgentRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): TrainAgentRequest = js.native
  /**
    * Decodes a TrainAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TrainAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TrainAgentRequest = js.native
  
  /**
    * Encodes the specified TrainAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.TrainAgentRequest.verify|verify} messages.
    * @param message TrainAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.encode")
  @js.native
  def encode(message: ITrainAgentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.encode")
  @js.native
  def encode(message: ITrainAgentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TrainAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.TrainAgentRequest.verify|verify} messages.
    * @param message TrainAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITrainAgentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITrainAgentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TrainAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TrainAgentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TrainAgentRequest = js.native
  
  /**
    * Creates a plain object from a TrainAgentRequest message. Also converts values to other types if specified.
    * @param message TrainAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.toObject")
  @js.native
  def toObject(message: TrainAgentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.toObject")
  @js.native
  def toObject(message: TrainAgentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TrainAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.TrainAgentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
