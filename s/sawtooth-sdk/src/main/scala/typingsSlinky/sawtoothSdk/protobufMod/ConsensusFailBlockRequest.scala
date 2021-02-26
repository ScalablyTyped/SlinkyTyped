package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest")
@js.native
/**
  * Constructs a new ConsensusFailBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusFailBlockRequest () extends IConsensusFailBlockRequest {
  def this(properties: IConsensusFailBlockRequest) = this()
  
  /** ConsensusFailBlockRequest blockId. */
  @JSName("blockId")
  var blockId_ConsensusFailBlockRequest: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this ConsensusFailBlockRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusFailBlockRequest {
  
  /**
    * Creates a new ConsensusFailBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusFailBlockRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.create")
  @js.native
  def create(): ConsensusFailBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.create")
  @js.native
  def create(properties: IConsensusFailBlockRequest): ConsensusFailBlockRequest = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusFailBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusFailBlockRequest = js.native
  /**
    * Decodes a ConsensusFailBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusFailBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.decode")
  @js.native
  def decode(reader: Reader): ConsensusFailBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusFailBlockRequest = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusFailBlockRequest = js.native
  /**
    * Decodes a ConsensusFailBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusFailBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusFailBlockRequest = js.native
  
  /**
    * Encodes the specified ConsensusFailBlockRequest message. Does not implicitly {@link ConsensusFailBlockRequest.verify|verify} messages.
    * @param message ConsensusFailBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.encode")
  @js.native
  def encode(message: IConsensusFailBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.encode")
  @js.native
  def encode(message: IConsensusFailBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusFailBlockRequest message, length delimited. Does not implicitly {@link ConsensusFailBlockRequest.verify|verify} messages.
    * @param message ConsensusFailBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusFailBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusFailBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusFailBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusFailBlockRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusFailBlockRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusFailBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusFailBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.toObject")
  @js.native
  def toObject(message: ConsensusFailBlockRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.toObject")
  @js.native
  def toObject(message: ConsensusFailBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusFailBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
