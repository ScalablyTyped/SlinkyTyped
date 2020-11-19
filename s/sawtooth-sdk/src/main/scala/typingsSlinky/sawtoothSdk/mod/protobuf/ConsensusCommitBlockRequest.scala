package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusCommitBlockRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockRequest")
@js.native
/**
  * Constructs a new ConsensusCommitBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusCommitBlockRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockRequest {
  def this(properties: IConsensusCommitBlockRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockRequest")
@js.native
object ConsensusCommitBlockRequest extends js.Object {
  
  /**
    * Creates a new ConsensusCommitBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCommitBlockRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockRequest = js.native
  def create(properties: IConsensusCommitBlockRequest): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockRequest = js.native
  
  /**
    * Decodes a ConsensusCommitBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCommitBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockRequest = js.native
  
  /**
    * Decodes a ConsensusCommitBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCommitBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockRequest = js.native
  
  /**
    * Encodes the specified ConsensusCommitBlockRequest message. Does not implicitly {@link ConsensusCommitBlockRequest.verify|verify} messages.
    * @param message ConsensusCommitBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusCommitBlockRequest): Writer = js.native
  def encode(message: IConsensusCommitBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusCommitBlockRequest message, length delimited. Does not implicitly {@link ConsensusCommitBlockRequest.verify|verify} messages.
    * @param message ConsensusCommitBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusCommitBlockRequest): Writer = js.native
  def encodeDelimited(message: IConsensusCommitBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusCommitBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCommitBlockRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusCommitBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusCommitBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusCommitBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
