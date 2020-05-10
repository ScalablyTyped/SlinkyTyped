package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IBlockHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.BlockHeader")
@js.native
/**
  * Constructs a new BlockHeader.
  * @param [properties] Properties to set
  */
class BlockHeader ()
  extends typingsSlinky.sawtoothSdk.protobufMod.BlockHeader {
  def this(properties: IBlockHeader) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.BlockHeader")
@js.native
object BlockHeader extends js.Object {
  /**
    * Creates a new BlockHeader instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BlockHeader instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  def create(properties: IBlockHeader): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  /**
    * Decodes a BlockHeader message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BlockHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  /**
    * Decodes a BlockHeader message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BlockHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  /**
    * Encodes the specified BlockHeader message. Does not implicitly {@link BlockHeader.verify|verify} messages.
    * @param message BlockHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBlockHeader): Writer = js.native
  def encode(message: IBlockHeader, writer: Writer): Writer = js.native
  /**
    * Encodes the specified BlockHeader message, length delimited. Does not implicitly {@link BlockHeader.verify|verify} messages.
    * @param message BlockHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBlockHeader): Writer = js.native
  def encodeDelimited(message: IBlockHeader, writer: Writer): Writer = js.native
  /**
    * Creates a BlockHeader message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BlockHeader
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  /**
    * Creates a plain object from a BlockHeader message. Also converts values to other types if specified.
    * @param message BlockHeader
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.BlockHeader): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.BlockHeader, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BlockHeader message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

