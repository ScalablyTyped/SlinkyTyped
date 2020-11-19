package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusSettingsGetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetResponse")
@js.native
/**
  * Constructs a new ConsensusSettingsGetResponse.
  * @param [properties] Properties to set
  */
class ConsensusSettingsGetResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse {
  def this(properties: IConsensusSettingsGetResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetResponse")
@js.native
object ConsensusSettingsGetResponse extends js.Object {
  
  /**
    * Creates a new ConsensusSettingsGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSettingsGetResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  def create(properties: IConsensusSettingsGetResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  
  /**
    * Decodes a ConsensusSettingsGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSettingsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  
  /**
    * Decodes a ConsensusSettingsGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSettingsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  
  /**
    * Encodes the specified ConsensusSettingsGetResponse message. Does not implicitly {@link ConsensusSettingsGetResponse.verify|verify} messages.
    * @param message ConsensusSettingsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusSettingsGetResponse): Writer = js.native
  def encode(message: IConsensusSettingsGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusSettingsGetResponse message, length delimited. Does not implicitly {@link ConsensusSettingsGetResponse.verify|verify} messages.
    * @param message ConsensusSettingsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusSettingsGetResponse): Writer = js.native
  def encodeDelimited(message: IConsensusSettingsGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusSettingsGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSettingsGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusSettingsGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusSettingsGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusSettingsGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status with Double
      ] = js.native
    
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.STATUS_UNSET with Double = js.native
    
    /* 5 */ val UNKNOWN_BLOCK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
}
