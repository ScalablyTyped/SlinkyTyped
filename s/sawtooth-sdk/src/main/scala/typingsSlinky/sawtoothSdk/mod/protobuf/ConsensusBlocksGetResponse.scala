package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusBlocksGetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetResponse")
@js.native
/**
  * Constructs a new ConsensusBlocksGetResponse.
  * @param [properties] Properties to set
  */
class ConsensusBlocksGetResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse {
  def this(properties: IConsensusBlocksGetResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetResponse")
@js.native
object ConsensusBlocksGetResponse extends js.Object {
  
  /**
    * Creates a new ConsensusBlocksGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBlocksGetResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse = js.native
  def create(properties: IConsensusBlocksGetResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse = js.native
  
  /**
    * Decodes a ConsensusBlocksGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBlocksGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse = js.native
  
  /**
    * Decodes a ConsensusBlocksGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBlocksGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse = js.native
  
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
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusBlocksGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusBlocksGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusBlocksGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status with Double
      ] = js.native
    
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status.STATUS_UNSET with Double = js.native
    
    /* 5 */ val UNKNOWN_BLOCK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
}
