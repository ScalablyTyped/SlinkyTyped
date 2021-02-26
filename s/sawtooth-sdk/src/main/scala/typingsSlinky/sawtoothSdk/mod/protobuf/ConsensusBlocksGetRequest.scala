package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusBlocksGetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest")
@js.native
/**
  * Constructs a new ConsensusBlocksGetRequest.
  * @param [properties] Properties to set
  */
class ConsensusBlocksGetRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest {
  def this(properties: IConsensusBlocksGetRequest) = this()
}
/* static members */
object ConsensusBlocksGetRequest {
  
  /**
    * Creates a new ConsensusBlocksGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBlocksGetRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.create")
  @js.native
  def create(properties: IConsensusBlocksGetRequest): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  /**
    * Decodes a ConsensusBlocksGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBlocksGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  /**
    * Decodes a ConsensusBlocksGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBlocksGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  
  /**
    * Encodes the specified ConsensusBlocksGetRequest message. Does not implicitly {@link ConsensusBlocksGetRequest.verify|verify} messages.
    * @param message ConsensusBlocksGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.encode")
  @js.native
  def encode(message: IConsensusBlocksGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.encode")
  @js.native
  def encode(message: IConsensusBlocksGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusBlocksGetRequest message, length delimited. Does not implicitly {@link ConsensusBlocksGetRequest.verify|verify} messages.
    * @param message ConsensusBlocksGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusBlocksGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusBlocksGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusBlocksGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBlocksGetRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusBlocksGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusBlocksGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusBlocksGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
