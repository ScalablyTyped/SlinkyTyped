package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage")
@js.native
/**
  * Constructs a new ConsensusNotifyPeerMessage.
  * @param [properties] Properties to set
  */
class ConsensusNotifyPeerMessage () extends IConsensusNotifyPeerMessage {
  def this(properties: IConsensusNotifyPeerMessage) = this()
  
  /** ConsensusNotifyPeerMessage senderId. */
  @JSName("senderId")
  var senderId_ConsensusNotifyPeerMessage: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this ConsensusNotifyPeerMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusNotifyPeerMessage {
  
  /**
    * Creates a new ConsensusNotifyPeerMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyPeerMessage instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.create")
  @js.native
  def create(): ConsensusNotifyPeerMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.create")
  @js.native
  def create(properties: IConsensusNotifyPeerMessage): ConsensusNotifyPeerMessage = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusNotifyPeerMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusNotifyPeerMessage = js.native
  /**
    * Decodes a ConsensusNotifyPeerMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.decode")
  @js.native
  def decode(reader: Reader): ConsensusNotifyPeerMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusNotifyPeerMessage = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusNotifyPeerMessage = js.native
  /**
    * Decodes a ConsensusNotifyPeerMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusNotifyPeerMessage = js.native
  
  /**
    * Encodes the specified ConsensusNotifyPeerMessage message. Does not implicitly {@link ConsensusNotifyPeerMessage.verify|verify} messages.
    * @param message ConsensusNotifyPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.encode")
  @js.native
  def encode(message: IConsensusNotifyPeerMessage): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.encode")
  @js.native
  def encode(message: IConsensusNotifyPeerMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusNotifyPeerMessage message, length delimited. Does not implicitly {@link ConsensusNotifyPeerMessage.verify|verify} messages.
    * @param message ConsensusNotifyPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyPeerMessage): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyPeerMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusNotifyPeerMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyPeerMessage
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusNotifyPeerMessage = js.native
  
  /**
    * Creates a plain object from a ConsensusNotifyPeerMessage message. Also converts values to other types if specified.
    * @param message ConsensusNotifyPeerMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.toObject")
  @js.native
  def toObject(message: ConsensusNotifyPeerMessage): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.toObject")
  @js.native
  def toObject(message: ConsensusNotifyPeerMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusNotifyPeerMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
