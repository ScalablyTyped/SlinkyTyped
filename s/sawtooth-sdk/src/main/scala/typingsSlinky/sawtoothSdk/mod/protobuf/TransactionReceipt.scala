package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITransactionReceipt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TransactionReceipt")
@js.native
/**
  * Constructs a new TransactionReceipt.
  * @param [properties] Properties to set
  */
class TransactionReceipt ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TransactionReceipt {
  def this(properties: ITransactionReceipt) = this()
}
/* static members */
object TransactionReceipt {
  
  /**
    * Creates a new TransactionReceipt instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TransactionReceipt instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.create")
  @js.native
  def create(properties: ITransactionReceipt): typingsSlinky.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  /**
    * Decodes a TransactionReceipt message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TransactionReceipt
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  /**
    * Decodes a TransactionReceipt message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TransactionReceipt
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  
  /**
    * Encodes the specified TransactionReceipt message. Does not implicitly {@link TransactionReceipt.verify|verify} messages.
    * @param message TransactionReceipt message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.encode")
  @js.native
  def encode(message: ITransactionReceipt): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.encode")
  @js.native
  def encode(message: ITransactionReceipt, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TransactionReceipt message, length delimited. Does not implicitly {@link TransactionReceipt.verify|verify} messages.
    * @param message TransactionReceipt message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITransactionReceipt): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITransactionReceipt, writer: Writer): Writer = js.native
  
  /**
    * Creates a TransactionReceipt message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TransactionReceipt
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  
  /**
    * Creates a plain object from a TransactionReceipt message. Also converts values to other types if specified.
    * @param message TransactionReceipt
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TransactionReceipt): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TransactionReceipt, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TransactionReceipt message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
