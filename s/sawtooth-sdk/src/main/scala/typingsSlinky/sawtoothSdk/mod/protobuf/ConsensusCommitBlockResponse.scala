package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusCommitBlockResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse")
@js.native
/**
  * Constructs a new ConsensusCommitBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusCommitBlockResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse {
  def this(properties: IConsensusCommitBlockResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse")
@js.native
object ConsensusCommitBlockResponse extends js.Object {
  
  /**
    * Creates a new ConsensusCommitBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCommitBlockResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  def create(properties: IConsensusCommitBlockResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  
  /**
    * Decodes a ConsensusCommitBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCommitBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  
  /**
    * Decodes a ConsensusCommitBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCommitBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusCommitBlockResponse message. Does not implicitly {@link ConsensusCommitBlockResponse.verify|verify} messages.
    * @param message ConsensusCommitBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusCommitBlockResponse): Writer = js.native
  def encode(message: IConsensusCommitBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusCommitBlockResponse message, length delimited. Does not implicitly {@link ConsensusCommitBlockResponse.verify|verify} messages.
    * @param message ConsensusCommitBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusCommitBlockResponse): Writer = js.native
  def encodeDelimited(message: IConsensusCommitBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusCommitBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCommitBlockResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusCommitBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusCommitBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusCommitBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status with Double
      ] = js.native
    
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.STATUS_UNSET with Double = js.native
    
    /* 5 */ val UNKNOWN_BLOCK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
}
