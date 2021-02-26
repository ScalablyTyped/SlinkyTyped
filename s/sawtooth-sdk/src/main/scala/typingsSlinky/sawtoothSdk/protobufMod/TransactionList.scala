package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TransactionList")
@js.native
/**
  * Constructs a new TransactionList.
  * @param [properties] Properties to set
  */
class TransactionList () extends ITransactionList {
  def this(properties: ITransactionList) = this()
  
  /**
    * Converts this TransactionList to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** TransactionList transactions. */
  @JSName("transactions")
  var transactions_TransactionList: js.Array[ITransaction] = js.native
}
/* static members */
object TransactionList {
  
  /**
    * Creates a new TransactionList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TransactionList instance
    */
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.create")
  @js.native
  def create(): TransactionList = js.native
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.create")
  @js.native
  def create(properties: ITransactionList): TransactionList = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): TransactionList = js.native
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): TransactionList = js.native
  /**
    * Decodes a TransactionList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TransactionList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.decode")
  @js.native
  def decode(reader: Reader): TransactionList = js.native
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.decode")
  @js.native
  def decode(reader: Reader, length: Double): TransactionList = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): TransactionList = js.native
  /**
    * Decodes a TransactionList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TransactionList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TransactionList = js.native
  
  /**
    * Encodes the specified TransactionList message. Does not implicitly {@link TransactionList.verify|verify} messages.
    * @param message TransactionList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.encode")
  @js.native
  def encode(message: ITransactionList): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.encode")
  @js.native
  def encode(message: ITransactionList, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TransactionList message, length delimited. Does not implicitly {@link TransactionList.verify|verify} messages.
    * @param message TransactionList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITransactionList): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITransactionList, writer: Writer): Writer = js.native
  
  /**
    * Creates a TransactionList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TransactionList
    */
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TransactionList = js.native
  
  /**
    * Creates a plain object from a TransactionList message. Also converts values to other types if specified.
    * @param message TransactionList
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.toObject")
  @js.native
  def toObject(message: TransactionList): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.toObject")
  @js.native
  def toObject(message: TransactionList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TransactionList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "TransactionList.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
