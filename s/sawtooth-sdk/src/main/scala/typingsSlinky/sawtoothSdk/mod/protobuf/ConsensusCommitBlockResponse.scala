package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusCommitBlockResponse
import org.scalablytyped.runtime.StObject
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
object ConsensusCommitBlockResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
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
  
  /**
    * Creates a new ConsensusCommitBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCommitBlockResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.create")
  @js.native
  def create(properties: IConsensusCommitBlockResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  /**
    * Decodes a ConsensusCommitBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCommitBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  /**
    * Decodes a ConsensusCommitBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCommitBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusCommitBlockResponse message. Does not implicitly {@link ConsensusCommitBlockResponse.verify|verify} messages.
    * @param message ConsensusCommitBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.encode")
  @js.native
  def encode(message: IConsensusCommitBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.encode")
  @js.native
  def encode(message: IConsensusCommitBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusCommitBlockResponse message, length delimited. Does not implicitly {@link ConsensusCommitBlockResponse.verify|verify} messages.
    * @param message ConsensusCommitBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusCommitBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusCommitBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusCommitBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCommitBlockResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusCommitBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusCommitBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusCommitBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
