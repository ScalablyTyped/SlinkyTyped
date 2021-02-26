package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Block")
@js.native
/**
  * Constructs a new Block.
  * @param [properties] Properties to set
  */
class Block () extends IBlock {
  def this(properties: IBlock) = this()
  
  /** Block batches. */
  @JSName("batches")
  var batches_Block: js.Array[IBatch] = js.native
  
  /** Block headerSignature. */
  @JSName("headerSignature")
  var headerSignature_Block: String = js.native
  
  /** Block header. */
  @JSName("header")
  var header_Block: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this Block to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object Block {
  
  /**
    * Creates a new Block instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Block instance
    */
  @JSImport("sawtooth-sdk/protobuf", "Block.create")
  @js.native
  def create(): Block = js.native
  @JSImport("sawtooth-sdk/protobuf", "Block.create")
  @js.native
  def create(properties: IBlock): Block = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "Block.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): Block = js.native
  @JSImport("sawtooth-sdk/protobuf", "Block.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Block = js.native
  /**
    * Decodes a Block message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Block
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "Block.decode")
  @js.native
  def decode(reader: Reader): Block = js.native
  @JSImport("sawtooth-sdk/protobuf", "Block.decode")
  @js.native
  def decode(reader: Reader, length: Double): Block = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "Block.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): Block = js.native
  /**
    * Decodes a Block message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Block
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "Block.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Block = js.native
  
  /**
    * Encodes the specified Block message. Does not implicitly {@link Block.verify|verify} messages.
    * @param message Block message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "Block.encode")
  @js.native
  def encode(message: IBlock): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "Block.encode")
  @js.native
  def encode(message: IBlock, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Block message, length delimited. Does not implicitly {@link Block.verify|verify} messages.
    * @param message Block message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "Block.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBlock): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "Block.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBlock, writer: Writer): Writer = js.native
  
  /**
    * Creates a Block message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Block
    */
  @JSImport("sawtooth-sdk/protobuf", "Block.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Block = js.native
  
  /**
    * Creates a plain object from a Block message. Also converts values to other types if specified.
    * @param message Block
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "Block.toObject")
  @js.native
  def toObject(message: Block): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "Block.toObject")
  @js.native
  def toObject(message: Block, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Block message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "Block.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
