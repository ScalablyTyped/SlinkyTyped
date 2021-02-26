package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusSettingsGetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest")
@js.native
/**
  * Constructs a new ConsensusSettingsGetRequest.
  * @param [properties] Properties to set
  */
class ConsensusSettingsGetRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest {
  def this(properties: IConsensusSettingsGetRequest) = this()
}
/* static members */
object ConsensusSettingsGetRequest {
  
  /**
    * Creates a new ConsensusSettingsGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSettingsGetRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.create")
  @js.native
  def create(properties: IConsensusSettingsGetRequest): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  /**
    * Decodes a ConsensusSettingsGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSettingsGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  /**
    * Decodes a ConsensusSettingsGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSettingsGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  
  /**
    * Encodes the specified ConsensusSettingsGetRequest message. Does not implicitly {@link ConsensusSettingsGetRequest.verify|verify} messages.
    * @param message ConsensusSettingsGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.encode")
  @js.native
  def encode(message: IConsensusSettingsGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.encode")
  @js.native
  def encode(message: IConsensusSettingsGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusSettingsGetRequest message, length delimited. Does not implicitly {@link ConsensusSettingsGetRequest.verify|verify} messages.
    * @param message ConsensusSettingsGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSettingsGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSettingsGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusSettingsGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSettingsGetRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusSettingsGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusSettingsGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusSettingsGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
