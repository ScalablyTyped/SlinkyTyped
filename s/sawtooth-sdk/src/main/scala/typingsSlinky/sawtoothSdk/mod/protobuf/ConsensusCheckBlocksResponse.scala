package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusCheckBlocksResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusCheckBlocksResponse")
@js.native
/**
  * Constructs a new ConsensusCheckBlocksResponse.
  * @param [properties] Properties to set
  */
class ConsensusCheckBlocksResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse {
  def this(properties: IConsensusCheckBlocksResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusCheckBlocksResponse")
@js.native
object ConsensusCheckBlocksResponse extends js.Object {
  /**
    * Creates a new ConsensusCheckBlocksResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCheckBlocksResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  def create(properties: IConsensusCheckBlocksResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  /**
    * Decodes a ConsensusCheckBlocksResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCheckBlocksResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  /**
    * Decodes a ConsensusCheckBlocksResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCheckBlocksResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  /**
    * Encodes the specified ConsensusCheckBlocksResponse message. Does not implicitly {@link ConsensusCheckBlocksResponse.verify|verify} messages.
    * @param message ConsensusCheckBlocksResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusCheckBlocksResponse): Writer = js.native
  def encode(message: IConsensusCheckBlocksResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusCheckBlocksResponse message, length delimited. Does not implicitly {@link ConsensusCheckBlocksResponse.verify|verify} messages.
    * @param message ConsensusCheckBlocksResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusCheckBlocksResponse): Writer = js.native
  def encodeDelimited(message: IConsensusCheckBlocksResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusCheckBlocksResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCheckBlocksResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  /**
    * Creates a plain object from a ConsensusCheckBlocksResponse message. Also converts values to other types if specified.
    * @param message ConsensusCheckBlocksResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusCheckBlocksResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.BAD_REQUEST with Double = js.native
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.NOT_READY with Double = js.native
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.OK with Double = js.native
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.SERVICE_ERROR with Double = js.native
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.STATUS_UNSET with Double = js.native
    /* 5 */ val UNKNOWN_BLOCK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.UNKNOWN_BLOCK with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status with Double
      ] = js.native
  }
  
}

