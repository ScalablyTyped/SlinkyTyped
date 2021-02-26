package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusChainHeadGetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest")
@js.native
/**
  * Constructs a new ConsensusChainHeadGetRequest.
  * @param [properties] Properties to set
  */
class ConsensusChainHeadGetRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetRequest {
  def this(properties: IConsensusChainHeadGetRequest) = this()
}
/* static members */
object ConsensusChainHeadGetRequest {
  
  /**
    * Creates a new ConsensusChainHeadGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusChainHeadGetRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.create")
  @js.native
  def create(properties: IConsensusChainHeadGetRequest): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetRequest = js.native
  /**
    * Decodes a ConsensusChainHeadGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusChainHeadGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetRequest = js.native
  /**
    * Decodes a ConsensusChainHeadGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusChainHeadGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetRequest = js.native
  
  /**
    * Encodes the specified ConsensusChainHeadGetRequest message. Does not implicitly {@link ConsensusChainHeadGetRequest.verify|verify} messages.
    * @param message ConsensusChainHeadGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.encode")
  @js.native
  def encode(message: IConsensusChainHeadGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.encode")
  @js.native
  def encode(message: IConsensusChainHeadGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusChainHeadGetRequest message, length delimited. Does not implicitly {@link ConsensusChainHeadGetRequest.verify|verify} messages.
    * @param message ConsensusChainHeadGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusChainHeadGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusChainHeadGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusChainHeadGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusChainHeadGetRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusChainHeadGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusChainHeadGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusChainHeadGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
