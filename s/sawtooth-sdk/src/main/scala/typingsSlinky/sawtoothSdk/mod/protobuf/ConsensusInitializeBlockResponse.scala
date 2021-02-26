package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusInitializeBlockResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse")
@js.native
/**
  * Constructs a new ConsensusInitializeBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusInitializeBlockResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse {
  def this(properties: IConsensusInitializeBlockResponse) = this()
}
/* static members */
object ConsensusInitializeBlockResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status with Double
      ] = js.native
    
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 5 */ val INVALID_STATE: typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.INVALID_STATE with Double = js.native
    
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.STATUS_UNSET with Double = js.native
    
    /* 6 */ val UNKNOWN_BLOCK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
  
  /**
    * Creates a new ConsensusInitializeBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusInitializeBlockResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.create")
  @js.native
  def create(properties: IConsensusInitializeBlockResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse = js.native
  /**
    * Decodes a ConsensusInitializeBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusInitializeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse = js.native
  /**
    * Decodes a ConsensusInitializeBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusInitializeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusInitializeBlockResponse message. Does not implicitly {@link ConsensusInitializeBlockResponse.verify|verify} messages.
    * @param message ConsensusInitializeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.encode")
  @js.native
  def encode(message: IConsensusInitializeBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.encode")
  @js.native
  def encode(message: IConsensusInitializeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusInitializeBlockResponse message, length delimited. Does not implicitly {@link ConsensusInitializeBlockResponse.verify|verify} messages.
    * @param message ConsensusInitializeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusInitializeBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusInitializeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusInitializeBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusInitializeBlockResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusInitializeBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusInitializeBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusInitializeBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusInitializeBlockResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
