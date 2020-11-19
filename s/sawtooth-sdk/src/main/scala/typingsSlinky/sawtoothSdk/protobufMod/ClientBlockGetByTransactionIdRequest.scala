package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByTransactionIdRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByTransactionIdRequest () extends IClientBlockGetByTransactionIdRequest {
  def this(properties: IClientBlockGetByTransactionIdRequest) = this()
  
  /**
    * Converts this ClientBlockGetByTransactionIdRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ClientBlockGetByTransactionIdRequest transactionId. */
  @JSName("transactionId")
  var transactionId_ClientBlockGetByTransactionIdRequest: String = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest")
@js.native
object ClientBlockGetByTransactionIdRequest extends js.Object {
  
  /**
    * Creates a new ClientBlockGetByTransactionIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByTransactionIdRequest instance
    */
  def create(): ClientBlockGetByTransactionIdRequest = js.native
  def create(properties: IClientBlockGetByTransactionIdRequest): ClientBlockGetByTransactionIdRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByTransactionIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByTransactionIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientBlockGetByTransactionIdRequest = js.native
  def decode(reader: Reader, length: Double): ClientBlockGetByTransactionIdRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): ClientBlockGetByTransactionIdRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ClientBlockGetByTransactionIdRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByTransactionIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByTransactionIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientBlockGetByTransactionIdRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ClientBlockGetByTransactionIdRequest = js.native
  
  /**
    * Encodes the specified ClientBlockGetByTransactionIdRequest message. Does not implicitly {@link ClientBlockGetByTransactionIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByTransactionIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBlockGetByTransactionIdRequest): Writer = js.native
  def encode(message: IClientBlockGetByTransactionIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockGetByTransactionIdRequest message, length delimited. Does not implicitly {@link ClientBlockGetByTransactionIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByTransactionIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBlockGetByTransactionIdRequest): Writer = js.native
  def encodeDelimited(message: IClientBlockGetByTransactionIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockGetByTransactionIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByTransactionIdRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientBlockGetByTransactionIdRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockGetByTransactionIdRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByTransactionIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientBlockGetByTransactionIdRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ClientBlockGetByTransactionIdRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockGetByTransactionIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
