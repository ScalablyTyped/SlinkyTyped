package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListEntityTypesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest")
@js.native
/**
  * Constructs a new ListEntityTypesRequest.
  * @param [properties] Properties to set
  */
class ListEntityTypesRequest () extends IListEntityTypesRequest {
  def this(properties: IListEntityTypesRequest) = this()
  
  /** ListEntityTypesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_ListEntityTypesRequest: String = js.native
  
  /** ListEntityTypesRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListEntityTypesRequest: Double = js.native
  
  /** ListEntityTypesRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListEntityTypesRequest: String = js.native
  
  /** ListEntityTypesRequest parent. */
  @JSName("parent")
  var parent_ListEntityTypesRequest: String = js.native
  
  /**
    * Converts this ListEntityTypesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListEntityTypesRequest {
  
  /**
    * Creates a new ListEntityTypesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListEntityTypesRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.create")
  @js.native
  def create(): ListEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.create")
  @js.native
  def create(properties: IListEntityTypesRequest): ListEntityTypesRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ListEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ListEntityTypesRequest = js.native
  /**
    * Decodes a ListEntityTypesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.decode")
  @js.native
  def decode(reader: Reader): ListEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListEntityTypesRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ListEntityTypesRequest = js.native
  /**
    * Decodes a ListEntityTypesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListEntityTypesRequest = js.native
  
  /**
    * Encodes the specified ListEntityTypesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.verify|verify} messages.
    * @param message ListEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.encode")
  @js.native
  def encode(message: IListEntityTypesRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.encode")
  @js.native
  def encode(message: IListEntityTypesRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListEntityTypesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.verify|verify} messages.
    * @param message ListEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListEntityTypesRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListEntityTypesRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListEntityTypesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListEntityTypesRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListEntityTypesRequest = js.native
  
  /**
    * Creates a plain object from a ListEntityTypesRequest message. Also converts values to other types if specified.
    * @param message ListEntityTypesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.toObject")
  @js.native
  def toObject(message: ListEntityTypesRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.toObject")
  @js.native
  def toObject(message: ListEntityTypesRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListEntityTypesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
