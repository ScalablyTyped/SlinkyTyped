package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusIgnoreBlockRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest")
@js.native
/**
  * Constructs a new ConsensusIgnoreBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusIgnoreBlockRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusIgnoreBlockRequest {
  def this(properties: IConsensusIgnoreBlockRequest) = this()
}
/* static members */
object ConsensusIgnoreBlockRequest {
  
  /**
    * Creates a new ConsensusIgnoreBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusIgnoreBlockRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusIgnoreBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.create")
  @js.native
  def create(properties: IConsensusIgnoreBlockRequest): typingsSlinky.sawtoothSdk.protobufMod.ConsensusIgnoreBlockRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusIgnoreBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusIgnoreBlockRequest = js.native
  /**
    * Decodes a ConsensusIgnoreBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusIgnoreBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusIgnoreBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusIgnoreBlockRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusIgnoreBlockRequest = js.native
  /**
    * Decodes a ConsensusIgnoreBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusIgnoreBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusIgnoreBlockRequest = js.native
  
  /**
    * Encodes the specified ConsensusIgnoreBlockRequest message. Does not implicitly {@link ConsensusIgnoreBlockRequest.verify|verify} messages.
    * @param message ConsensusIgnoreBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.encode")
  @js.native
  def encode(message: IConsensusIgnoreBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.encode")
  @js.native
  def encode(message: IConsensusIgnoreBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusIgnoreBlockRequest message, length delimited. Does not implicitly {@link ConsensusIgnoreBlockRequest.verify|verify} messages.
    * @param message ConsensusIgnoreBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusIgnoreBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusIgnoreBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusIgnoreBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusIgnoreBlockRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusIgnoreBlockRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusIgnoreBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusIgnoreBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusIgnoreBlockRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusIgnoreBlockRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusIgnoreBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
