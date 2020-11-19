package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientPagingResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse")
@js.native
/**
  * Constructs a new ClientPagingResponse.
  * @param [properties] Properties to set
  */
class ClientPagingResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientPagingResponse {
  def this(properties: IClientPagingResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse")
@js.native
object ClientPagingResponse extends js.Object {
  
  /**
    * Creates a new ClientPagingResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientPagingResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  def create(properties: IClientPagingResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  
  /**
    * Decodes a ClientPagingResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientPagingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  
  /**
    * Decodes a ClientPagingResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientPagingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  
  /**
    * Encodes the specified ClientPagingResponse message. Does not implicitly {@link ClientPagingResponse.verify|verify} messages.
    * @param message ClientPagingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientPagingResponse): Writer = js.native
  def encode(message: IClientPagingResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientPagingResponse message, length delimited. Does not implicitly {@link ClientPagingResponse.verify|verify} messages.
    * @param message ClientPagingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientPagingResponse): Writer = js.native
  def encodeDelimited(message: IClientPagingResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientPagingResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientPagingResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  
  /**
    * Creates a plain object from a ClientPagingResponse message. Also converts values to other types if specified.
    * @param message ClientPagingResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientPagingResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientPagingResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientPagingResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
