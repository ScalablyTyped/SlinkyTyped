package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusStateGetRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusStateGetRequest")
@js.native
/**
  * Constructs a new ConsensusStateGetRequest.
  * @param [properties] Properties to set
  */
class ConsensusStateGetRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetRequest {
  def this(properties: IConsensusStateGetRequest) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusStateGetRequest")
@js.native
object ConsensusStateGetRequest extends js.Object {
  /**
    * Creates a new ConsensusStateGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusStateGetRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetRequest = js.native
  def create(properties: IConsensusStateGetRequest): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetRequest = js.native
  /**
    * Decodes a ConsensusStateGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetRequest = js.native
  /**
    * Decodes a ConsensusStateGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetRequest = js.native
  /**
    * Encodes the specified ConsensusStateGetRequest message. Does not implicitly {@link ConsensusStateGetRequest.verify|verify} messages.
    * @param message ConsensusStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusStateGetRequest): Writer = js.native
  def encode(message: IConsensusStateGetRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusStateGetRequest message, length delimited. Does not implicitly {@link ConsensusStateGetRequest.verify|verify} messages.
    * @param message ConsensusStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusStateGetRequest): Writer = js.native
  def encodeDelimited(message: IConsensusStateGetRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusStateGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusStateGetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetRequest = js.native
  /**
    * Creates a plain object from a ConsensusStateGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusStateGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusStateGetRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusStateGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

