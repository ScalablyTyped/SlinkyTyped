package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
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
@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected")
@js.native
object ConsensusNotifyPeerConnected extends js.Object {
  
  /**
    * Creates a new ConsensusNotifyPeerConnected instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyPeerConnected instance
    */
  def create(): ConsensusNotifyPeerConnected = js.native
  def create(properties: IConsensusNotifyPeerConnected): ConsensusNotifyPeerConnected = js.native
  
  /**
    * Decodes a ConsensusNotifyPeerConnected message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyPeerConnected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusNotifyPeerConnected = js.native
  def decode(reader: Reader, length: Double): ConsensusNotifyPeerConnected = js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusNotifyPeerConnected = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusNotifyPeerConnected = js.native
  
  /**
    * Decodes a ConsensusNotifyPeerConnected message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyPeerConnected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusNotifyPeerConnected = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusNotifyPeerConnected = js.native
  
  /**
    * Encodes the specified ConsensusNotifyPeerConnected message. Does not implicitly {@link ConsensusNotifyPeerConnected.verify|verify} messages.
    * @param message ConsensusNotifyPeerConnected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusNotifyPeerConnected): Writer = js.native
  def encode(message: IConsensusNotifyPeerConnected, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusNotifyPeerConnected message, length delimited. Does not implicitly {@link ConsensusNotifyPeerConnected.verify|verify} messages.
    * @param message ConsensusNotifyPeerConnected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusNotifyPeerConnected): Writer = js.native
  def encodeDelimited(message: IConsensusNotifyPeerConnected, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusNotifyPeerConnected message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyPeerConnected
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusNotifyPeerConnected = js.native
  
  /**
    * Creates a plain object from a ConsensusNotifyPeerConnected message. Also converts values to other types if specified.
    * @param message ConsensusNotifyPeerConnected
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusNotifyPeerConnected): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusNotifyPeerConnected, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusNotifyPeerConnected message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
