package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusInitializeBlockRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockRequest")
@js.native
/**
  * Constructs a new ConsensusInitializeBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusInitializeBlockRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockRequest {
  def this(properties: IConsensusInitializeBlockRequest) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockRequest")
@js.native
object ConsensusInitializeBlockRequest extends js.Object {
  /**
    * Creates a new ConsensusInitializeBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusInitializeBlockRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockRequest = js.native
  def create(properties: IConsensusInitializeBlockRequest): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockRequest = js.native
  /**
    * Decodes a ConsensusInitializeBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusInitializeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockRequest = js.native
  /**
    * Decodes a ConsensusInitializeBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusInitializeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockRequest = js.native
  /**
    * Encodes the specified ConsensusInitializeBlockRequest message. Does not implicitly {@link ConsensusInitializeBlockRequest.verify|verify} messages.
    * @param message ConsensusInitializeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusInitializeBlockRequest): Writer = js.native
  def encode(message: IConsensusInitializeBlockRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusInitializeBlockRequest message, length delimited. Does not implicitly {@link ConsensusInitializeBlockRequest.verify|verify} messages.
    * @param message ConsensusInitializeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusInitializeBlockRequest): Writer = js.native
  def encodeDelimited(message: IConsensusInitializeBlockRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusInitializeBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusInitializeBlockRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockRequest = js.native
  /**
    * Creates a plain object from a ConsensusInitializeBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusInitializeBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusInitializeBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

