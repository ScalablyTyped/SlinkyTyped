package typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBatchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new ClientBatchStatus instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchStatus instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  def create(properties: IClientBatchStatus): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  /**
    * Decodes a ClientBatchStatus message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchStatus
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  /**
    * Decodes a ClientBatchStatus message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchStatus
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  /**
    * Encodes the specified ClientBatchStatus message. Does not implicitly {@link ClientBatchStatus.verify|verify} messages.
    * @param message ClientBatchStatus message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBatchStatus): Writer = js.native
  def encode(message: IClientBatchStatus, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientBatchStatus message, length delimited. Does not implicitly {@link ClientBatchStatus.verify|verify} messages.
    * @param message ClientBatchStatus message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBatchStatus): Writer = js.native
  def encodeDelimited(message: IClientBatchStatus, writer: Writer): Writer = js.native
  /**
    * Creates a ClientBatchStatus message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchStatus
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  /**
    * Creates a plain object from a ClientBatchStatus message. Also converts values to other types if specified.
    * @param message ClientBatchStatus
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientBatchStatus message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

