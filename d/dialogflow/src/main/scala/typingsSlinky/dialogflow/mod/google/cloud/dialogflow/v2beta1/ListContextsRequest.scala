package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListContextsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest")
@js.native
/**
  * Constructs a new ListContextsRequest.
  * @param [properties] Properties to set
  */
class ListContextsRequest () extends IListContextsRequest {
  def this(properties: IListContextsRequest) = this()
  
  /** ListContextsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListContextsRequest: Double = js.native
  
  /** ListContextsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListContextsRequest: String = js.native
  
  /** ListContextsRequest parent. */
  @JSName("parent")
  var parent_ListContextsRequest: String = js.native
  
  /**
    * Converts this ListContextsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListContextsRequest {
  
  /**
    * Creates a new ListContextsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListContextsRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.create")
  @js.native
  def create(): ListContextsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.create")
  @js.native
  def create(properties: IListContextsRequest): ListContextsRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ListContextsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ListContextsRequest = js.native
  /**
    * Decodes a ListContextsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListContextsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.decode")
  @js.native
  def decode(reader: Reader): ListContextsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListContextsRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ListContextsRequest = js.native
  /**
    * Decodes a ListContextsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListContextsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListContextsRequest = js.native
  
  /**
    * Encodes the specified ListContextsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListContextsRequest.verify|verify} messages.
    * @param message ListContextsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.encode")
  @js.native
  def encode(message: IListContextsRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.encode")
  @js.native
  def encode(message: IListContextsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListContextsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListContextsRequest.verify|verify} messages.
    * @param message ListContextsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListContextsRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListContextsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListContextsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListContextsRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListContextsRequest = js.native
  
  /**
    * Creates a plain object from a ListContextsRequest message. Also converts values to other types if specified.
    * @param message ListContextsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.toObject")
  @js.native
  def toObject(message: ListContextsRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.toObject")
  @js.native
  def toObject(message: ListContextsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListContextsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
