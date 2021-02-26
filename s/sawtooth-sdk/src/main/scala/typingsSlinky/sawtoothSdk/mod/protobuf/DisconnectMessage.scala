package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IDisconnectMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.DisconnectMessage")
@js.native
/**
  * Constructs a new DisconnectMessage.
  * @param [properties] Properties to set
  */
class DisconnectMessage ()
  extends typingsSlinky.sawtoothSdk.protobufMod.DisconnectMessage {
  def this(properties: IDisconnectMessage) = this()
}
/* static members */
object DisconnectMessage {
  
  /**
    * Creates a new DisconnectMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DisconnectMessage instance
    */
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.DisconnectMessage = js.native
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.create")
  @js.native
  def create(properties: IDisconnectMessage): typingsSlinky.sawtoothSdk.protobufMod.DisconnectMessage = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.DisconnectMessage = js.native
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.DisconnectMessage = js.native
  /**
    * Decodes a DisconnectMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DisconnectMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.DisconnectMessage = js.native
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.DisconnectMessage = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.DisconnectMessage = js.native
  /**
    * Decodes a DisconnectMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DisconnectMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.DisconnectMessage = js.native
  
  /**
    * Encodes the specified DisconnectMessage message. Does not implicitly {@link DisconnectMessage.verify|verify} messages.
    * @param message DisconnectMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.encode")
  @js.native
  def encode(message: IDisconnectMessage): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.encode")
  @js.native
  def encode(message: IDisconnectMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DisconnectMessage message, length delimited. Does not implicitly {@link DisconnectMessage.verify|verify} messages.
    * @param message DisconnectMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDisconnectMessage): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDisconnectMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a DisconnectMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DisconnectMessage
    */
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.DisconnectMessage = js.native
  
  /**
    * Creates a plain object from a DisconnectMessage message. Also converts values to other types if specified.
    * @param message DisconnectMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.DisconnectMessage): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.DisconnectMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DisconnectMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.DisconnectMessage.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
