package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusNotifyAck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyAck")
@js.native
/**
  * Constructs a new ConsensusNotifyAck.
  * @param [properties] Properties to set
  */
class ConsensusNotifyAck ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyAck {
  def this(properties: IConsensusNotifyAck) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyAck")
@js.native
object ConsensusNotifyAck extends js.Object {
  
  /**
    * Creates a new ConsensusNotifyAck instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyAck instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyAck = js.native
  def create(properties: IConsensusNotifyAck): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyAck = js.native
  
  /**
    * Decodes a ConsensusNotifyAck message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyAck
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyAck = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyAck = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyAck = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyAck = js.native
  
  /**
    * Decodes a ConsensusNotifyAck message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyAck
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyAck = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyAck = js.native
  
  /**
    * Encodes the specified ConsensusNotifyAck message. Does not implicitly {@link ConsensusNotifyAck.verify|verify} messages.
    * @param message ConsensusNotifyAck message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusNotifyAck): Writer = js.native
  def encode(message: IConsensusNotifyAck, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusNotifyAck message, length delimited. Does not implicitly {@link ConsensusNotifyAck.verify|verify} messages.
    * @param message ConsensusNotifyAck message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusNotifyAck): Writer = js.native
  def encodeDelimited(message: IConsensusNotifyAck, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusNotifyAck message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyAck
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyAck = js.native
  
  /**
    * Creates a plain object from a ConsensusNotifyAck message. Also converts values to other types if specified.
    * @param message ConsensusNotifyAck
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyAck): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyAck, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusNotifyAck message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
