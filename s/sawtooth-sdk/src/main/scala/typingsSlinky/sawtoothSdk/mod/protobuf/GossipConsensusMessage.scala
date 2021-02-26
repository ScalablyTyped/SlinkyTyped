package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IGossipConsensusMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage")
@js.native
/**
  * Constructs a new GossipConsensusMessage.
  * @param [properties] Properties to set
  */
class GossipConsensusMessage ()
  extends typingsSlinky.sawtoothSdk.protobufMod.GossipConsensusMessage {
  def this(properties: IGossipConsensusMessage) = this()
}
/* static members */
object GossipConsensusMessage {
  
  /**
    * Creates a new GossipConsensusMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipConsensusMessage instance
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.create")
  @js.native
  def create(properties: IGossipConsensusMessage): typingsSlinky.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  /**
    * Decodes a GossipConsensusMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipConsensusMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  /**
    * Decodes a GossipConsensusMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipConsensusMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  
  /**
    * Encodes the specified GossipConsensusMessage message. Does not implicitly {@link GossipConsensusMessage.verify|verify} messages.
    * @param message GossipConsensusMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.encode")
  @js.native
  def encode(message: IGossipConsensusMessage): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.encode")
  @js.native
  def encode(message: IGossipConsensusMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipConsensusMessage message, length delimited. Does not implicitly {@link GossipConsensusMessage.verify|verify} messages.
    * @param message GossipConsensusMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipConsensusMessage): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipConsensusMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipConsensusMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipConsensusMessage
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  
  /**
    * Creates a plain object from a GossipConsensusMessage message. Also converts values to other types if specified.
    * @param message GossipConsensusMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.GossipConsensusMessage): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.GossipConsensusMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipConsensusMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
