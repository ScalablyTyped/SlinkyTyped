package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IBlockHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object BlockHeader {
  
  /**
    * Creates a new BlockHeader instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BlockHeader instance
    */
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.create")
  @js.native
  def create(properties: IBlockHeader): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  /**
    * Decodes a BlockHeader message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BlockHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  /**
    * Decodes a BlockHeader message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BlockHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  
  /**
    * Encodes the specified BlockHeader message. Does not implicitly {@link BlockHeader.verify|verify} messages.
    * @param message BlockHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.encode")
  @js.native
  def encode(message: IBlockHeader): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.encode")
  @js.native
  def encode(message: IBlockHeader, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified BlockHeader message, length delimited. Does not implicitly {@link BlockHeader.verify|verify} messages.
    * @param message BlockHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBlockHeader): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBlockHeader, writer: Writer): Writer = js.native
  
  /**
    * Creates a BlockHeader message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BlockHeader
    */
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.BlockHeader = js.native
  
  /**
    * Creates a plain object from a BlockHeader message. Also converts values to other types if specified.
    * @param message BlockHeader
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.BlockHeader): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.BlockHeader, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a BlockHeader message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.BlockHeader.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
