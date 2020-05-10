package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.Block")
@js.native
/**
  * Constructs a new Block.
  * @param [properties] Properties to set
  */
class Block ()
  extends typingsSlinky.sawtoothSdk.protobufMod.Block {
  def this(properties: IBlock) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.Block")
@js.native
object Block extends js.Object {
  /**
    * Creates a new Block instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Block instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.Block = js.native
  def create(properties: IBlock): typingsSlinky.sawtoothSdk.protobufMod.Block = js.native
  /**
    * Decodes a Block message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Block
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Block = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Block = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Block = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Block = js.native
  /**
    * Decodes a Block message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Block
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Block = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Block = js.native
  /**
    * Encodes the specified Block message. Does not implicitly {@link Block.verify|verify} messages.
    * @param message Block message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBlock): Writer = js.native
  def encode(message: IBlock, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Block message, length delimited. Does not implicitly {@link Block.verify|verify} messages.
    * @param message Block message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBlock): Writer = js.native
  def encodeDelimited(message: IBlock, writer: Writer): Writer = js.native
  /**
    * Creates a Block message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Block
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.Block = js.native
  /**
    * Creates a plain object from a Block message. Also converts values to other types if specified.
    * @param message Block
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Block): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Block, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Block message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

