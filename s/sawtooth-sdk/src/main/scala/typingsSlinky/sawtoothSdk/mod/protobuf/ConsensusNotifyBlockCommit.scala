package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusNotifyBlockCommit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit")
@js.native
/**
  * Constructs a new ConsensusNotifyBlockCommit.
  * @param [properties] Properties to set
  */
class ConsensusNotifyBlockCommit ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockCommit {
  def this(properties: IConsensusNotifyBlockCommit) = this()
}
/* static members */
object ConsensusNotifyBlockCommit {
  
  /**
    * Creates a new ConsensusNotifyBlockCommit instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyBlockCommit instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockCommit = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.create")
  @js.native
  def create(properties: IConsensusNotifyBlockCommit): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockCommit = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockCommit = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockCommit = js.native
  /**
    * Decodes a ConsensusNotifyBlockCommit message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyBlockCommit
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockCommit = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockCommit = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockCommit = js.native
  /**
    * Decodes a ConsensusNotifyBlockCommit message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyBlockCommit
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockCommit = js.native
  
  /**
    * Encodes the specified ConsensusNotifyBlockCommit message. Does not implicitly {@link ConsensusNotifyBlockCommit.verify|verify} messages.
    * @param message ConsensusNotifyBlockCommit message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.encode")
  @js.native
  def encode(message: IConsensusNotifyBlockCommit): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.encode")
  @js.native
  def encode(message: IConsensusNotifyBlockCommit, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusNotifyBlockCommit message, length delimited. Does not implicitly {@link ConsensusNotifyBlockCommit.verify|verify} messages.
    * @param message ConsensusNotifyBlockCommit message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyBlockCommit): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyBlockCommit, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusNotifyBlockCommit message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyBlockCommit
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockCommit = js.native
  
  /**
    * Creates a plain object from a ConsensusNotifyBlockCommit message. Also converts values to other types if specified.
    * @param message ConsensusNotifyBlockCommit
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockCommit): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockCommit,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusNotifyBlockCommit message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockCommit.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
