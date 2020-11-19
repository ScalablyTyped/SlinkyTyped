package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBlockListRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest")
@js.native
/**
  * Constructs a new ClientBlockListRequest.
  * @param [properties] Properties to set
  */
class ClientBlockListRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListRequest {
  def this(properties: IClientBlockListRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest")
@js.native
object ClientBlockListRequest extends js.Object {
  
  /**
    * Creates a new ClientBlockListRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockListRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  def create(properties: IClientBlockListRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  
  /**
    * Decodes a ClientBlockListRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  
  /**
    * Decodes a ClientBlockListRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  
  /**
    * Encodes the specified ClientBlockListRequest message. Does not implicitly {@link ClientBlockListRequest.verify|verify} messages.
    * @param message ClientBlockListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBlockListRequest): Writer = js.native
  def encode(message: IClientBlockListRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockListRequest message, length delimited. Does not implicitly {@link ClientBlockListRequest.verify|verify} messages.
    * @param message ClientBlockListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBlockListRequest): Writer = js.native
  def encodeDelimited(message: IClientBlockListRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockListRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockListRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockListRequest message. Also converts values to other types if specified.
    * @param message ClientBlockListRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockListRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
