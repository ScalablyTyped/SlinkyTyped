package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest")
@js.native
/**
  * Constructs a new ClientTransactionGetRequest.
  * @param [properties] Properties to set
  */
class ClientTransactionGetRequest () extends IClientTransactionGetRequest {
  def this(properties: IClientTransactionGetRequest) = this()
  
  /**
    * Converts this ClientTransactionGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ClientTransactionGetRequest transactionId. */
  @JSName("transactionId")
  var transactionId_ClientTransactionGetRequest: String = js.native
}
/* static members */
object ClientTransactionGetRequest {
  
  /**
    * Creates a new ClientTransactionGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionGetRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.create")
  @js.native
  def create(): ClientTransactionGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.create")
  @js.native
  def create(properties: IClientTransactionGetRequest): ClientTransactionGetRequest = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ClientTransactionGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ClientTransactionGetRequest = js.native
  /**
    * Decodes a ClientTransactionGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.decode")
  @js.native
  def decode(reader: Reader): ClientTransactionGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientTransactionGetRequest = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ClientTransactionGetRequest = js.native
  /**
    * Decodes a ClientTransactionGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientTransactionGetRequest = js.native
  
  /**
    * Encodes the specified ClientTransactionGetRequest message. Does not implicitly {@link ClientTransactionGetRequest.verify|verify} messages.
    * @param message ClientTransactionGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.encode")
  @js.native
  def encode(message: IClientTransactionGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.encode")
  @js.native
  def encode(message: IClientTransactionGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientTransactionGetRequest message, length delimited. Does not implicitly {@link ClientTransactionGetRequest.verify|verify} messages.
    * @param message ClientTransactionGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientTransactionGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionGetRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientTransactionGetRequest = js.native
  
  /**
    * Creates a plain object from a ClientTransactionGetRequest message. Also converts values to other types if specified.
    * @param message ClientTransactionGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.toObject")
  @js.native
  def toObject(message: ClientTransactionGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.toObject")
  @js.native
  def toObject(message: ClientTransactionGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientTransactionGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
