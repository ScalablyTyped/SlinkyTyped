package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusStateGetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusStateGetResponse")
@js.native
/**
  * Constructs a new ConsensusStateGetResponse.
  * @param [properties] Properties to set
  */
class ConsensusStateGetResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse {
  def this(properties: IConsensusStateGetResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusStateGetResponse")
@js.native
object ConsensusStateGetResponse extends js.Object {
  /**
    * Creates a new ConsensusStateGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusStateGetResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse = js.native
  def create(properties: IConsensusStateGetResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse = js.native
  /**
    * Decodes a ConsensusStateGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse = js.native
  /**
    * Decodes a ConsensusStateGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse = js.native
  /**
    * Encodes the specified ConsensusStateGetResponse message. Does not implicitly {@link ConsensusStateGetResponse.verify|verify} messages.
    * @param message ConsensusStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusStateGetResponse): Writer = js.native
  def encode(message: IConsensusStateGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusStateGetResponse message, length delimited. Does not implicitly {@link ConsensusStateGetResponse.verify|verify} messages.
    * @param message ConsensusStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusStateGetResponse): Writer = js.native
  def encodeDelimited(message: IConsensusStateGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusStateGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusStateGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse = js.native
  /**
    * Creates a plain object from a ConsensusStateGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusStateGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusStateGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status.BAD_REQUEST with Double = js.native
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status.NOT_READY with Double = js.native
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status.OK with Double = js.native
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status.SERVICE_ERROR with Double = js.native
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status.STATUS_UNSET with Double = js.native
    /* 5 */ val UNKNOWN_BLOCK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status.UNKNOWN_BLOCK with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status with Double
      ] = js.native
  }
  
}

