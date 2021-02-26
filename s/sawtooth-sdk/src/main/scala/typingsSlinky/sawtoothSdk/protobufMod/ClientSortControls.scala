package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientSortControls")
@js.native
/**
  * Constructs a new ClientSortControls.
  * @param [properties] Properties to set
  */
class ClientSortControls () extends IClientSortControls {
  def this(properties: IClientSortControls) = this()
  
  /** ClientSortControls keys. */
  @JSName("keys")
  var keys_ClientSortControls: js.Array[String] = js.native
  
  /** ClientSortControls reverse. */
  @JSName("reverse")
  var reverse_ClientSortControls: Boolean = js.native
  
  /**
    * Converts this ClientSortControls to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientSortControls {
  
  /**
    * Creates a new ClientSortControls instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientSortControls instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.create")
  @js.native
  def create(): ClientSortControls = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.create")
  @js.native
  def create(properties: IClientSortControls): ClientSortControls = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ClientSortControls = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ClientSortControls = js.native
  /**
    * Decodes a ClientSortControls message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientSortControls
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.decode")
  @js.native
  def decode(reader: Reader): ClientSortControls = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientSortControls = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ClientSortControls = js.native
  /**
    * Decodes a ClientSortControls message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientSortControls
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientSortControls = js.native
  
  /**
    * Encodes the specified ClientSortControls message. Does not implicitly {@link ClientSortControls.verify|verify} messages.
    * @param message ClientSortControls message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.encode")
  @js.native
  def encode(message: IClientSortControls): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.encode")
  @js.native
  def encode(message: IClientSortControls, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientSortControls message, length delimited. Does not implicitly {@link ClientSortControls.verify|verify} messages.
    * @param message ClientSortControls message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientSortControls): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientSortControls, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientSortControls message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientSortControls
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientSortControls = js.native
  
  /**
    * Creates a plain object from a ClientSortControls message. Also converts values to other types if specified.
    * @param message ClientSortControls
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.toObject")
  @js.native
  def toObject(message: ClientSortControls): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.toObject")
  @js.native
  def toObject(message: ClientSortControls, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientSortControls message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
