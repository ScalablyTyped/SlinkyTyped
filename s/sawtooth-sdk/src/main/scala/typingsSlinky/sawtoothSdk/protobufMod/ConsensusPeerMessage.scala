package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage")
@js.native
/**
  * Constructs a new ConsensusPeerMessage.
  * @param [properties] Properties to set
  */
class ConsensusPeerMessage () extends IConsensusPeerMessage {
  def this(properties: IConsensusPeerMessage) = this()
  
  /** ConsensusPeerMessage content. */
  @JSName("content")
  var content_ConsensusPeerMessage: js.typedarray.Uint8Array = js.native
  
  /** ConsensusPeerMessage messageType. */
  @JSName("messageType")
  var messageType_ConsensusPeerMessage: String = js.native
  
  /** ConsensusPeerMessage name. */
  @JSName("name")
  var name_ConsensusPeerMessage: String = js.native
  
  /**
    * Converts this ConsensusPeerMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ConsensusPeerMessage version. */
  @JSName("version")
  var version_ConsensusPeerMessage: String = js.native
}
/* static members */
object ConsensusPeerMessage {
  
  /**
    * Creates a new ConsensusPeerMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusPeerMessage instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.create")
  @js.native
  def create(): ConsensusPeerMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.create")
  @js.native
  def create(properties: IConsensusPeerMessage): ConsensusPeerMessage = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusPeerMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusPeerMessage = js.native
  /**
    * Decodes a ConsensusPeerMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.decode")
  @js.native
  def decode(reader: Reader): ConsensusPeerMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusPeerMessage = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusPeerMessage = js.native
  /**
    * Decodes a ConsensusPeerMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusPeerMessage = js.native
  
  /**
    * Encodes the specified ConsensusPeerMessage message. Does not implicitly {@link ConsensusPeerMessage.verify|verify} messages.
    * @param message ConsensusPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.encode")
  @js.native
  def encode(message: IConsensusPeerMessage): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.encode")
  @js.native
  def encode(message: IConsensusPeerMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusPeerMessage message, length delimited. Does not implicitly {@link ConsensusPeerMessage.verify|verify} messages.
    * @param message ConsensusPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusPeerMessage): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusPeerMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusPeerMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusPeerMessage
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusPeerMessage = js.native
  
  /**
    * Creates a plain object from a ConsensusPeerMessage message. Also converts values to other types if specified.
    * @param message ConsensusPeerMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.toObject")
  @js.native
  def toObject(message: ConsensusPeerMessage): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.toObject")
  @js.native
  def toObject(message: ConsensusPeerMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusPeerMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
