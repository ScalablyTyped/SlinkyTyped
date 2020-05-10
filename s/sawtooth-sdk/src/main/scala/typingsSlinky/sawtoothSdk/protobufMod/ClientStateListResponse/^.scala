package typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientStateListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new ClientStateListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateListResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  def create(properties: IClientStateListResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  /**
    * Decodes a ClientStateListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  /**
    * Decodes a ClientStateListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  /**
    * Encodes the specified ClientStateListResponse message. Does not implicitly {@link ClientStateListResponse.verify|verify} messages.
    * @param message ClientStateListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientStateListResponse): Writer = js.native
  def encode(message: IClientStateListResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientStateListResponse message, length delimited. Does not implicitly {@link ClientStateListResponse.verify|verify} messages.
    * @param message ClientStateListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientStateListResponse): Writer = js.native
  def encodeDelimited(message: IClientStateListResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientStateListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateListResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  /**
    * Creates a plain object from a ClientStateListResponse message. Also converts values to other types if specified.
    * @param message ClientStateListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientStateListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

