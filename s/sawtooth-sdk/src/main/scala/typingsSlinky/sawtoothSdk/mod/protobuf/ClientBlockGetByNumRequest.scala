package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBlockGetByNumRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByNumRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByNumRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByNumRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByNumRequest {
  def this(properties: IClientBlockGetByNumRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByNumRequest")
@js.native
object ClientBlockGetByNumRequest extends js.Object {
  
  /**
    * Creates a new ClientBlockGetByNumRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByNumRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByNumRequest = js.native
  def create(properties: IClientBlockGetByNumRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByNumRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByNumRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByNumRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByNumRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByNumRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByNumRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByNumRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByNumRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByNumRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByNumRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByNumRequest = js.native
  
  /**
    * Encodes the specified ClientBlockGetByNumRequest message. Does not implicitly {@link ClientBlockGetByNumRequest.verify|verify} messages.
    * @param message ClientBlockGetByNumRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBlockGetByNumRequest): Writer = js.native
  def encode(message: IClientBlockGetByNumRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockGetByNumRequest message, length delimited. Does not implicitly {@link ClientBlockGetByNumRequest.verify|verify} messages.
    * @param message ClientBlockGetByNumRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBlockGetByNumRequest): Writer = js.native
  def encodeDelimited(message: IClientBlockGetByNumRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockGetByNumRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByNumRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByNumRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockGetByNumRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByNumRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByNumRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByNumRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockGetByNumRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
