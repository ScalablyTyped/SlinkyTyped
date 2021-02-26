package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusNotifyBlockValid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid")
@js.native
/**
  * Constructs a new ConsensusNotifyBlockValid.
  * @param [properties] Properties to set
  */
class ConsensusNotifyBlockValid ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockValid {
  def this(properties: IConsensusNotifyBlockValid) = this()
}
/* static members */
object ConsensusNotifyBlockValid {
  
  /**
    * Creates a new ConsensusNotifyBlockValid instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyBlockValid instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockValid = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.create")
  @js.native
  def create(properties: IConsensusNotifyBlockValid): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockValid = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockValid = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockValid = js.native
  /**
    * Decodes a ConsensusNotifyBlockValid message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyBlockValid
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockValid = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockValid = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockValid = js.native
  /**
    * Decodes a ConsensusNotifyBlockValid message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyBlockValid
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockValid = js.native
  
  /**
    * Encodes the specified ConsensusNotifyBlockValid message. Does not implicitly {@link ConsensusNotifyBlockValid.verify|verify} messages.
    * @param message ConsensusNotifyBlockValid message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.encode")
  @js.native
  def encode(message: IConsensusNotifyBlockValid): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.encode")
  @js.native
  def encode(message: IConsensusNotifyBlockValid, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusNotifyBlockValid message, length delimited. Does not implicitly {@link ConsensusNotifyBlockValid.verify|verify} messages.
    * @param message ConsensusNotifyBlockValid message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyBlockValid): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyBlockValid, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusNotifyBlockValid message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyBlockValid
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockValid = js.native
  
  /**
    * Creates a plain object from a ConsensusNotifyBlockValid message. Also converts values to other types if specified.
    * @param message ConsensusNotifyBlockValid
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockValid): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusNotifyBlockValid,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusNotifyBlockValid message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockValid.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
