package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected")
@js.native
/**
  * Constructs a new ConsensusNotifyPeerConnected.
  * @param [properties] Properties to set
  */
class ConsensusNotifyPeerConnected () extends IConsensusNotifyPeerConnected {
  def this(properties: IConsensusNotifyPeerConnected) = this()
  
  /**
    * Converts this ConsensusNotifyPeerConnected to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusNotifyPeerConnected {
  
  /**
    * Creates a new ConsensusNotifyPeerConnected instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyPeerConnected instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.create")
  @js.native
  def create(): ConsensusNotifyPeerConnected = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.create")
  @js.native
  def create(properties: IConsensusNotifyPeerConnected): ConsensusNotifyPeerConnected = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusNotifyPeerConnected = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusNotifyPeerConnected = js.native
  /**
    * Decodes a ConsensusNotifyPeerConnected message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyPeerConnected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.decode")
  @js.native
  def decode(reader: Reader): ConsensusNotifyPeerConnected = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusNotifyPeerConnected = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusNotifyPeerConnected = js.native
  /**
    * Decodes a ConsensusNotifyPeerConnected message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyPeerConnected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusNotifyPeerConnected = js.native
  
  /**
    * Encodes the specified ConsensusNotifyPeerConnected message. Does not implicitly {@link ConsensusNotifyPeerConnected.verify|verify} messages.
    * @param message ConsensusNotifyPeerConnected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.encode")
  @js.native
  def encode(message: IConsensusNotifyPeerConnected): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.encode")
  @js.native
  def encode(message: IConsensusNotifyPeerConnected, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusNotifyPeerConnected message, length delimited. Does not implicitly {@link ConsensusNotifyPeerConnected.verify|verify} messages.
    * @param message ConsensusNotifyPeerConnected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyPeerConnected): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyPeerConnected, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusNotifyPeerConnected message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyPeerConnected
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusNotifyPeerConnected = js.native
  
  /**
    * Creates a plain object from a ConsensusNotifyPeerConnected message. Also converts values to other types if specified.
    * @param message ConsensusNotifyPeerConnected
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.toObject")
  @js.native
  def toObject(message: ConsensusNotifyPeerConnected): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.toObject")
  @js.native
  def toObject(message: ConsensusNotifyPeerConnected, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusNotifyPeerConnected message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
