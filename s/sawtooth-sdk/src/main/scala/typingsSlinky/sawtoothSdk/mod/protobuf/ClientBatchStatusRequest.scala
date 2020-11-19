package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBatchStatusRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest")
@js.native
/**
  * Constructs a new ClientBatchStatusRequest.
  * @param [properties] Properties to set
  */
class ClientBatchStatusRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatusRequest {
  def this(properties: IClientBatchStatusRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest")
@js.native
object ClientBatchStatusRequest extends js.Object {
  
  /**
    * Creates a new ClientBatchStatusRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchStatusRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  def create(properties: IClientBatchStatusRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  
  /**
    * Decodes a ClientBatchStatusRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchStatusRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  
  /**
    * Decodes a ClientBatchStatusRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchStatusRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  
  /**
    * Encodes the specified ClientBatchStatusRequest message. Does not implicitly {@link ClientBatchStatusRequest.verify|verify} messages.
    * @param message ClientBatchStatusRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBatchStatusRequest): Writer = js.native
  def encode(message: IClientBatchStatusRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchStatusRequest message, length delimited. Does not implicitly {@link ClientBatchStatusRequest.verify|verify} messages.
    * @param message ClientBatchStatusRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBatchStatusRequest): Writer = js.native
  def encodeDelimited(message: IClientBatchStatusRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchStatusRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchStatusRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  
  /**
    * Creates a plain object from a ClientBatchStatusRequest message. Also converts values to other types if specified.
    * @param message ClientBatchStatusRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatusRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatusRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchStatusRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
