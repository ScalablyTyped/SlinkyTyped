package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientTransactionGetRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest")
@js.native
/**
  * Constructs a new ClientTransactionGetRequest.
  * @param [properties] Properties to set
  */
class ClientTransactionGetRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionGetRequest {
  def this(properties: IClientTransactionGetRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest")
@js.native
object ClientTransactionGetRequest extends js.Object {
  
  /**
    * Creates a new ClientTransactionGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionGetRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  def create(properties: IClientTransactionGetRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  
  /**
    * Decodes a ClientTransactionGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  
  /**
    * Decodes a ClientTransactionGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  
  /**
    * Encodes the specified ClientTransactionGetRequest message. Does not implicitly {@link ClientTransactionGetRequest.verify|verify} messages.
    * @param message ClientTransactionGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientTransactionGetRequest): Writer = js.native
  def encode(message: IClientTransactionGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientTransactionGetRequest message, length delimited. Does not implicitly {@link ClientTransactionGetRequest.verify|verify} messages.
    * @param message ClientTransactionGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientTransactionGetRequest): Writer = js.native
  def encodeDelimited(message: IClientTransactionGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientTransactionGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionGetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  
  /**
    * Creates a plain object from a ClientTransactionGetRequest message. Also converts values to other types if specified.
    * @param message ClientTransactionGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionGetRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionGetRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientTransactionGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
