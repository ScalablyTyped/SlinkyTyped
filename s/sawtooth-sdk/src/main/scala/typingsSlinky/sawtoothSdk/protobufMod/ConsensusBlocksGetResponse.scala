package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse")
@js.native
/**
  * Constructs a new ConsensusBlocksGetResponse.
  * @param [properties] Properties to set
  */
class ConsensusBlocksGetResponse () extends IConsensusBlocksGetResponse {
  def this(properties: IConsensusBlocksGetResponse) = this()
  
  /** ConsensusBlocksGetResponse blocks. */
  @JSName("blocks")
  var blocks_ConsensusBlocksGetResponse: js.Array[IConsensusBlock] = js.native
  
  /** ConsensusBlocksGetResponse status. */
  @JSName("status")
  var status_ConsensusBlocksGetResponse: Status = js.native
  
  /**
    * Converts this ConsensusBlocksGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse")
@js.native
object ConsensusBlocksGetResponse extends js.Object {
  
  /**
    * Creates a new ConsensusBlocksGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBlocksGetResponse instance
    */
  def create(): ConsensusBlocksGetResponse = js.native
  def create(properties: IConsensusBlocksGetResponse): ConsensusBlocksGetResponse = js.native
  
  /**
    * Decodes a ConsensusBlocksGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBlocksGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusBlocksGetResponse = js.native
  def decode(reader: Reader, length: Double): ConsensusBlocksGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusBlocksGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusBlocksGetResponse = js.native
  
  /**
    * Decodes a ConsensusBlocksGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBlocksGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusBlocksGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusBlocksGetResponse = js.native
  
  /**
    * Encodes the specified ConsensusBlocksGetResponse message. Does not implicitly {@link ConsensusBlocksGetResponse.verify|verify} messages.
    * @param message ConsensusBlocksGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusBlocksGetResponse): Writer = js.native
  def encode(message: IConsensusBlocksGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusBlocksGetResponse message, length delimited. Does not implicitly {@link ConsensusBlocksGetResponse.verify|verify} messages.
    * @param message ConsensusBlocksGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusBlocksGetResponse): Writer = js.native
  def encodeDelimited(message: IConsensusBlocksGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusBlocksGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBlocksGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusBlocksGetResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusBlocksGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusBlocksGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusBlocksGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusBlocksGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusBlocksGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  @js.native
  sealed trait Status extends js.Object
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ @js.native
    object BAD_REQUEST extends TopLevel[BAD_REQUEST with Double]
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ @js.native
    object NOT_READY extends TopLevel[NOT_READY with Double]
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ @js.native
    object SERVICE_ERROR extends TopLevel[SERVICE_ERROR with Double]
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
    
    @js.native
    sealed trait UNKNOWN_BLOCK extends Status
    /* 5 */ @js.native
    object UNKNOWN_BLOCK extends TopLevel[UNKNOWN_BLOCK with Double]
  }
}
