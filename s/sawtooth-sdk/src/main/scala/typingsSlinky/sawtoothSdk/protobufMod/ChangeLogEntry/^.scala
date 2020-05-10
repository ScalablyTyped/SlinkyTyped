package typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IChangeLogEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new ChangeLogEntry instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ChangeLogEntry instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  def create(properties: IChangeLogEntry): typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  /**
    * Decodes a ChangeLogEntry message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ChangeLogEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  /**
    * Decodes a ChangeLogEntry message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ChangeLogEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  /**
    * Encodes the specified ChangeLogEntry message. Does not implicitly {@link ChangeLogEntry.verify|verify} messages.
    * @param message ChangeLogEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IChangeLogEntry): Writer = js.native
  def encode(message: IChangeLogEntry, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ChangeLogEntry message, length delimited. Does not implicitly {@link ChangeLogEntry.verify|verify} messages.
    * @param message ChangeLogEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IChangeLogEntry): Writer = js.native
  def encodeDelimited(message: IChangeLogEntry, writer: Writer): Writer = js.native
  /**
    * Creates a ChangeLogEntry message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ChangeLogEntry
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  /**
    * Creates a plain object from a ChangeLogEntry message. Also converts values to other types if specified.
    * @param message ChangeLogEntry
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ChangeLogEntry message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

