package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITransactionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.TransactionList")
@js.native
/**
  * Constructs a new TransactionList.
  * @param [properties] Properties to set
  */
class TransactionList ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TransactionList {
  def this(properties: ITransactionList) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.TransactionList")
@js.native
object TransactionList extends js.Object {
  /**
    * Creates a new TransactionList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TransactionList instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TransactionList = js.native
  def create(properties: ITransactionList): typingsSlinky.sawtoothSdk.protobufMod.TransactionList = js.native
  /**
    * Decodes a TransactionList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TransactionList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TransactionList = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TransactionList = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TransactionList = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TransactionList = js.native
  /**
    * Decodes a TransactionList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TransactionList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TransactionList = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TransactionList = js.native
  /**
    * Encodes the specified TransactionList message. Does not implicitly {@link TransactionList.verify|verify} messages.
    * @param message TransactionList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITransactionList): Writer = js.native
  def encode(message: ITransactionList, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TransactionList message, length delimited. Does not implicitly {@link TransactionList.verify|verify} messages.
    * @param message TransactionList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITransactionList): Writer = js.native
  def encodeDelimited(message: ITransactionList, writer: Writer): Writer = js.native
  /**
    * Creates a TransactionList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TransactionList
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TransactionList = js.native
  /**
    * Creates a plain object from a TransactionList message. Also converts values to other types if specified.
    * @param message TransactionList
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TransactionList): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TransactionList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TransactionList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

