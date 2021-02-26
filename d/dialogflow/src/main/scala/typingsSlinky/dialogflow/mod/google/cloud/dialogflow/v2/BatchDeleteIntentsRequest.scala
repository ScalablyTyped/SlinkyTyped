package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchDeleteIntentsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest")
@js.native
/**
  * Constructs a new BatchDeleteIntentsRequest.
  * @param [properties] Properties to set
  */
class BatchDeleteIntentsRequest () extends IBatchDeleteIntentsRequest {
  def this(properties: IBatchDeleteIntentsRequest) = this()
  
  /** BatchDeleteIntentsRequest intents. */
  @JSName("intents")
  var intents_BatchDeleteIntentsRequest: js.Array[IIntent] = js.native
  
  /** BatchDeleteIntentsRequest parent. */
  @JSName("parent")
  var parent_BatchDeleteIntentsRequest: String = js.native
  
  /**
    * Converts this BatchDeleteIntentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object BatchDeleteIntentsRequest {
  
  /**
    * Creates a new BatchDeleteIntentsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchDeleteIntentsRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.create")
  @js.native
  def create(): BatchDeleteIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.create")
  @js.native
  def create(properties: IBatchDeleteIntentsRequest): BatchDeleteIntentsRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): BatchDeleteIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): BatchDeleteIntentsRequest = js.native
  /**
    * Decodes a BatchDeleteIntentsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchDeleteIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.decode")
  @js.native
  def decode(reader: Reader): BatchDeleteIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): BatchDeleteIntentsRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): BatchDeleteIntentsRequest = js.native
  /**
    * Decodes a BatchDeleteIntentsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchDeleteIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): BatchDeleteIntentsRequest = js.native
  
  /**
    * Encodes the specified BatchDeleteIntentsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.verify|verify} messages.
    * @param message BatchDeleteIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.encode")
  @js.native
  def encode(message: IBatchDeleteIntentsRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.encode")
  @js.native
  def encode(message: IBatchDeleteIntentsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified BatchDeleteIntentsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.verify|verify} messages.
    * @param message BatchDeleteIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchDeleteIntentsRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchDeleteIntentsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a BatchDeleteIntentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchDeleteIntentsRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): BatchDeleteIntentsRequest = js.native
  
  /**
    * Creates a plain object from a BatchDeleteIntentsRequest message. Also converts values to other types if specified.
    * @param message BatchDeleteIntentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.toObject")
  @js.native
  def toObject(message: BatchDeleteIntentsRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.toObject")
  @js.native
  def toObject(message: BatchDeleteIntentsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a BatchDeleteIntentsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
