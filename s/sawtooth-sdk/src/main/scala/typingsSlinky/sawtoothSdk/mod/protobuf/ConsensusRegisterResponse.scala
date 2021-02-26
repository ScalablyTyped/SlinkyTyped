package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusRegisterResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse")
@js.native
/**
  * Constructs a new ConsensusRegisterResponse.
  * @param [properties] Properties to set
  */
class ConsensusRegisterResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse {
  def this(properties: IConsensusRegisterResponse) = this()
}
/* static members */
object ConsensusRegisterResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status with Double
      ] = js.native
    
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ConsensusRegisterResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusRegisterResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.create")
  @js.native
  def create(properties: IConsensusRegisterResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse = js.native
  /**
    * Decodes a ConsensusRegisterResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse = js.native
  /**
    * Decodes a ConsensusRegisterResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse = js.native
  
  /**
    * Encodes the specified ConsensusRegisterResponse message. Does not implicitly {@link ConsensusRegisterResponse.verify|verify} messages.
    * @param message ConsensusRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.encode")
  @js.native
  def encode(message: IConsensusRegisterResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.encode")
  @js.native
  def encode(message: IConsensusRegisterResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusRegisterResponse message, length delimited. Does not implicitly {@link ConsensusRegisterResponse.verify|verify} messages.
    * @param message ConsensusRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusRegisterResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusRegisterResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusRegisterResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusRegisterResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusRegisterResponse message. Also converts values to other types if specified.
    * @param message ConsensusRegisterResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusRegisterResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusRegisterResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
