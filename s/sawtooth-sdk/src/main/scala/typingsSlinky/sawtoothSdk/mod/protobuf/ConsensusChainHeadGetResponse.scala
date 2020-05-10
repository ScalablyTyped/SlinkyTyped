package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusChainHeadGetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse")
@js.native
/**
  * Constructs a new ConsensusChainHeadGetResponse.
  * @param [properties] Properties to set
  */
class ConsensusChainHeadGetResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse {
  def this(properties: IConsensusChainHeadGetResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse")
@js.native
object ConsensusChainHeadGetResponse extends js.Object {
  /**
    * Creates a new ConsensusChainHeadGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusChainHeadGetResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  def create(properties: IConsensusChainHeadGetResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  /**
    * Decodes a ConsensusChainHeadGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusChainHeadGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  /**
    * Decodes a ConsensusChainHeadGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusChainHeadGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  /**
    * Encodes the specified ConsensusChainHeadGetResponse message. Does not implicitly {@link ConsensusChainHeadGetResponse.verify|verify} messages.
    * @param message ConsensusChainHeadGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusChainHeadGetResponse): Writer = js.native
  def encode(message: IConsensusChainHeadGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusChainHeadGetResponse message, length delimited. Does not implicitly {@link ConsensusChainHeadGetResponse.verify|verify} messages.
    * @param message ConsensusChainHeadGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusChainHeadGetResponse): Writer = js.native
  def encodeDelimited(message: IConsensusChainHeadGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusChainHeadGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusChainHeadGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  /**
    * Creates a plain object from a ConsensusChainHeadGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusChainHeadGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusChainHeadGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.BAD_REQUEST with Double = js.native
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.NOT_READY with Double = js.native
    /* 5 */ val NO_CHAIN_HEAD: typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.NO_CHAIN_HEAD with Double = js.native
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.OK with Double = js.native
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.SERVICE_ERROR with Double = js.native
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status with Double
      ] = js.native
  }
  
}

