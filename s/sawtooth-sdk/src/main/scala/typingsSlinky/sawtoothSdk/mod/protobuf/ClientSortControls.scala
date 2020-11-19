package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientSortControls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientSortControls")
@js.native
/**
  * Constructs a new ClientSortControls.
  * @param [properties] Properties to set
  */
class ClientSortControls ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientSortControls {
  def this(properties: IClientSortControls) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientSortControls")
@js.native
object ClientSortControls extends js.Object {
  
  /**
    * Creates a new ClientSortControls instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientSortControls instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientSortControls = js.native
  def create(properties: IClientSortControls): typingsSlinky.sawtoothSdk.protobufMod.ClientSortControls = js.native
  
  /**
    * Decodes a ClientSortControls message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientSortControls
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientSortControls = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientSortControls = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientSortControls = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientSortControls = js.native
  
  /**
    * Decodes a ClientSortControls message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientSortControls
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientSortControls = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientSortControls = js.native
  
  /**
    * Encodes the specified ClientSortControls message. Does not implicitly {@link ClientSortControls.verify|verify} messages.
    * @param message ClientSortControls message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientSortControls): Writer = js.native
  def encode(message: IClientSortControls, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientSortControls message, length delimited. Does not implicitly {@link ClientSortControls.verify|verify} messages.
    * @param message ClientSortControls message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientSortControls): Writer = js.native
  def encodeDelimited(message: IClientSortControls, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientSortControls message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientSortControls
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientSortControls = js.native
  
  /**
    * Creates a plain object from a ClientSortControls message. Also converts values to other types if specified.
    * @param message ClientSortControls
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientSortControls): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientSortControls, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientSortControls message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
