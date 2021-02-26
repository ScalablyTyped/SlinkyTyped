package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListDocumentsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse")
@js.native
/**
  * Constructs a new ListDocumentsResponse.
  * @param [properties] Properties to set
  */
class ListDocumentsResponse () extends IListDocumentsResponse {
  def this(properties: IListDocumentsResponse) = this()
  
  /** ListDocumentsResponse documents. */
  @JSName("documents")
  var documents_ListDocumentsResponse: js.Array[IDocument] = js.native
  
  /** ListDocumentsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListDocumentsResponse: String = js.native
  
  /**
    * Converts this ListDocumentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListDocumentsResponse {
  
  /**
    * Creates a new ListDocumentsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListDocumentsResponse instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.create")
  @js.native
  def create(): ListDocumentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.create")
  @js.native
  def create(properties: IListDocumentsResponse): ListDocumentsResponse = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ListDocumentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ListDocumentsResponse = js.native
  /**
    * Decodes a ListDocumentsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListDocumentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.decode")
  @js.native
  def decode(reader: Reader): ListDocumentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListDocumentsResponse = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ListDocumentsResponse = js.native
  /**
    * Decodes a ListDocumentsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListDocumentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListDocumentsResponse = js.native
  
  /**
    * Encodes the specified ListDocumentsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListDocumentsResponse.verify|verify} messages.
    * @param message ListDocumentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.encode")
  @js.native
  def encode(message: IListDocumentsResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.encode")
  @js.native
  def encode(message: IListDocumentsResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListDocumentsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListDocumentsResponse.verify|verify} messages.
    * @param message ListDocumentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListDocumentsResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListDocumentsResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListDocumentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListDocumentsResponse
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListDocumentsResponse = js.native
  
  /**
    * Creates a plain object from a ListDocumentsResponse message. Also converts values to other types if specified.
    * @param message ListDocumentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.toObject")
  @js.native
  def toObject(message: ListDocumentsResponse): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.toObject")
  @js.native
  def toObject(message: ListDocumentsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListDocumentsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListDocumentsResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
