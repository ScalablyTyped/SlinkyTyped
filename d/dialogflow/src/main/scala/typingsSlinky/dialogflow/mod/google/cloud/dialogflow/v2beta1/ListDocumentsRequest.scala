package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListDocumentsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest")
@js.native
/**
  * Constructs a new ListDocumentsRequest.
  * @param [properties] Properties to set
  */
class ListDocumentsRequest () extends IListDocumentsRequest {
  def this(properties: IListDocumentsRequest) = this()
  
  /** ListDocumentsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListDocumentsRequest: Double = js.native
  
  /** ListDocumentsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListDocumentsRequest: String = js.native
  
  /** ListDocumentsRequest parent. */
  @JSName("parent")
  var parent_ListDocumentsRequest: String = js.native
  
  /**
    * Converts this ListDocumentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListDocumentsRequest {
  
  /**
    * Creates a new ListDocumentsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListDocumentsRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.create")
  @js.native
  def create(): ListDocumentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.create")
  @js.native
  def create(properties: IListDocumentsRequest): ListDocumentsRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ListDocumentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ListDocumentsRequest = js.native
  /**
    * Decodes a ListDocumentsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListDocumentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.decode")
  @js.native
  def decode(reader: Reader): ListDocumentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListDocumentsRequest = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ListDocumentsRequest = js.native
  /**
    * Decodes a ListDocumentsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListDocumentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListDocumentsRequest = js.native
  
  /**
    * Encodes the specified ListDocumentsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListDocumentsRequest.verify|verify} messages.
    * @param message ListDocumentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.encode")
  @js.native
  def encode(message: IListDocumentsRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.encode")
  @js.native
  def encode(message: IListDocumentsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListDocumentsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListDocumentsRequest.verify|verify} messages.
    * @param message ListDocumentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListDocumentsRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListDocumentsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListDocumentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListDocumentsRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListDocumentsRequest = js.native
  
  /**
    * Creates a plain object from a ListDocumentsRequest message. Also converts values to other types if specified.
    * @param message ListDocumentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.toObject")
  @js.native
  def toObject(message: ListDocumentsRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.toObject")
  @js.native
  def toObject(message: ListDocumentsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListDocumentsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
