package typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientStatusGetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse")
@js.native
object ^ extends js.Object {
  
  /**
    * Creates a new ClientStatusGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStatusGetResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  def create(properties: IClientStatusGetResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  
  /**
    * Decodes a ClientStatusGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStatusGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  
  /**
    * Decodes a ClientStatusGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStatusGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  
  /**
    * Encodes the specified ClientStatusGetResponse message. Does not implicitly {@link ClientStatusGetResponse.verify|verify} messages.
    * @param message ClientStatusGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientStatusGetResponse): Writer = js.native
  def encode(message: IClientStatusGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientStatusGetResponse message, length delimited. Does not implicitly {@link ClientStatusGetResponse.verify|verify} messages.
    * @param message ClientStatusGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientStatusGetResponse): Writer = js.native
  def encodeDelimited(message: IClientStatusGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientStatusGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStatusGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientStatusGetResponse message. Also converts values to other types if specified.
    * @param message ClientStatusGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientStatusGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
