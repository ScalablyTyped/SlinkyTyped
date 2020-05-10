package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ConsensusFailBlockResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockResponse")
@js.native
/**
  * Constructs a new ConsensusFailBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusFailBlockResponse () extends IConsensusFailBlockResponse {
  def this(properties: IConsensusFailBlockResponse) = this()
  /** ConsensusFailBlockResponse status. */
  @JSName("status")
  var status_ConsensusFailBlockResponse: Status = js.native
  /**
    * Converts this ConsensusFailBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockResponse")
@js.native
object ConsensusFailBlockResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new ConsensusFailBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusFailBlockResponse instance
    */
  def create(): ConsensusFailBlockResponse = js.native
  def create(properties: IConsensusFailBlockResponse): ConsensusFailBlockResponse = js.native
  /**
    * Decodes a ConsensusFailBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusFailBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusFailBlockResponse = js.native
  def decode(reader: Reader, length: Double): ConsensusFailBlockResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusFailBlockResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusFailBlockResponse = js.native
  /**
    * Decodes a ConsensusFailBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusFailBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusFailBlockResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusFailBlockResponse = js.native
  /**
    * Encodes the specified ConsensusFailBlockResponse message. Does not implicitly {@link ConsensusFailBlockResponse.verify|verify} messages.
    * @param message ConsensusFailBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusFailBlockResponse): Writer = js.native
  def encode(message: IConsensusFailBlockResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusFailBlockResponse message, length delimited. Does not implicitly {@link ConsensusFailBlockResponse.verify|verify} messages.
    * @param message ConsensusFailBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusFailBlockResponse): Writer = js.native
  def encodeDelimited(message: IConsensusFailBlockResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusFailBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusFailBlockResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusFailBlockResponse = js.native
  /**
    * Creates a plain object from a ConsensusFailBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusFailBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusFailBlockResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusFailBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusFailBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait BAD_REQUEST extends Status
    
    @js.native
    sealed trait NOT_READY extends Status
    
    @js.native
    sealed trait OK extends Status
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    
    @js.native
    sealed trait UNKNOWN_BLOCK extends Status
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    /* 2 */ @js.native
    object BAD_REQUEST extends TopLevel[BAD_REQUEST with Double]
    
    /* 4 */ @js.native
    object NOT_READY extends TopLevel[NOT_READY with Double]
    
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    /* 3 */ @js.native
    object SERVICE_ERROR extends TopLevel[SERVICE_ERROR with Double]
    
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
    
    /* 5 */ @js.native
    object UNKNOWN_BLOCK extends TopLevel[UNKNOWN_BLOCK with Double]
    
  }
  
}

