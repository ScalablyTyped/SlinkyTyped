package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITpStateEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpStateEntry")
@js.native
/**
  * Constructs a new TpStateEntry.
  * @param [properties] Properties to set
  */
class TpStateEntry ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TpStateEntry {
  def this(properties: ITpStateEntry) = this()
}
/* static members */
object TpStateEntry {
  
  /**
    * Creates a new TpStateEntry instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateEntry instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TpStateEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.create")
  @js.native
  def create(properties: ITpStateEntry): typingsSlinky.sawtoothSdk.protobufMod.TpStateEntry = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateEntry = js.native
  /**
    * Decodes a TpStateEntry message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateEntry = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateEntry = js.native
  /**
    * Decodes a TpStateEntry message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateEntry = js.native
  
  /**
    * Encodes the specified TpStateEntry message. Does not implicitly {@link TpStateEntry.verify|verify} messages.
    * @param message TpStateEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.encode")
  @js.native
  def encode(message: ITpStateEntry): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.encode")
  @js.native
  def encode(message: ITpStateEntry, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpStateEntry message, length delimited. Does not implicitly {@link TpStateEntry.verify|verify} messages.
    * @param message TpStateEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateEntry): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateEntry, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpStateEntry message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateEntry
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TpStateEntry = js.native
  
  /**
    * Creates a plain object from a TpStateEntry message. Also converts values to other types if specified.
    * @param message TpStateEntry
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateEntry): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateEntry, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpStateEntry message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateEntry.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
