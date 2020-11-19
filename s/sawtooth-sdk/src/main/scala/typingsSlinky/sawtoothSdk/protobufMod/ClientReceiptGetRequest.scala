package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest")
@js.native
/**
  * Constructs a new ClientReceiptGetRequest.
  * @param [properties] Properties to set
  */
class ClientReceiptGetRequest () extends IClientReceiptGetRequest {
  def this(properties: IClientReceiptGetRequest) = this()
  
  /**
    * Converts this ClientReceiptGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ClientReceiptGetRequest transactionIds. */
  @JSName("transactionIds")
  var transactionIds_ClientReceiptGetRequest: js.Array[String] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest")
@js.native
object ClientReceiptGetRequest extends js.Object {
  
  /**
    * Creates a new ClientReceiptGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientReceiptGetRequest instance
    */
  def create(): ClientReceiptGetRequest = js.native
  def create(properties: IClientReceiptGetRequest): ClientReceiptGetRequest = js.native
  
  /**
    * Decodes a ClientReceiptGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientReceiptGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientReceiptGetRequest = js.native
  def decode(reader: Reader, length: Double): ClientReceiptGetRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): ClientReceiptGetRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ClientReceiptGetRequest = js.native
  
  /**
    * Decodes a ClientReceiptGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientReceiptGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientReceiptGetRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ClientReceiptGetRequest = js.native
  
  /**
    * Encodes the specified ClientReceiptGetRequest message. Does not implicitly {@link ClientReceiptGetRequest.verify|verify} messages.
    * @param message ClientReceiptGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientReceiptGetRequest): Writer = js.native
  def encode(message: IClientReceiptGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientReceiptGetRequest message, length delimited. Does not implicitly {@link ClientReceiptGetRequest.verify|verify} messages.
    * @param message ClientReceiptGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientReceiptGetRequest): Writer = js.native
  def encodeDelimited(message: IClientReceiptGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientReceiptGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientReceiptGetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientReceiptGetRequest = js.native
  
  /**
    * Creates a plain object from a ClientReceiptGetRequest message. Also converts values to other types if specified.
    * @param message ClientReceiptGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientReceiptGetRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ClientReceiptGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientReceiptGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
