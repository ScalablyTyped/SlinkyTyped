package typingsSlinky.sawtoothSdk.protobufMod.Setting

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ISetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "Setting")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new Setting instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Setting instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.Setting = js.native
  def create(properties: ISetting): typingsSlinky.sawtoothSdk.protobufMod.Setting = js.native
  /**
    * Decodes a Setting message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Setting
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Setting = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Setting = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Setting = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Setting = js.native
  /**
    * Decodes a Setting message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Setting
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Setting = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Setting = js.native
  /**
    * Encodes the specified Setting message. Does not implicitly {@link Setting.verify|verify} messages.
    * @param message Setting message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISetting): Writer = js.native
  def encode(message: ISetting, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Setting message, length delimited. Does not implicitly {@link Setting.verify|verify} messages.
    * @param message Setting message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISetting): Writer = js.native
  def encodeDelimited(message: ISetting, writer: Writer): Writer = js.native
  /**
    * Creates a Setting message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Setting
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.Setting = js.native
  /**
    * Creates a plain object from a Setting message. Also converts values to other types if specified.
    * @param message Setting
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Setting): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Setting, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Setting message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

