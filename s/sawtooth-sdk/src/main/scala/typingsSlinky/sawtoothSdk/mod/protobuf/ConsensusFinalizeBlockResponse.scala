package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusFinalizeBlockResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse")
@js.native
/**
  * Constructs a new ConsensusFinalizeBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusFinalizeBlockResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse {
  def this(properties: IConsensusFinalizeBlockResponse) = this()
}
/* static members */
object ConsensusFinalizeBlockResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status with Double
      ] = js.native
    
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 6 */ val BLOCK_NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.BLOCK_NOT_READY with Double = js.native
    
    /* 5 */ val INVALID_STATE: typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.INVALID_STATE with Double = js.native
    
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ConsensusFinalizeBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusFinalizeBlockResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.create")
  @js.native
  def create(properties: IConsensusFinalizeBlockResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  /**
    * Decodes a ConsensusFinalizeBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusFinalizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  /**
    * Decodes a ConsensusFinalizeBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusFinalizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusFinalizeBlockResponse message. Does not implicitly {@link ConsensusFinalizeBlockResponse.verify|verify} messages.
    * @param message ConsensusFinalizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.encode")
  @js.native
  def encode(message: IConsensusFinalizeBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.encode")
  @js.native
  def encode(message: IConsensusFinalizeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusFinalizeBlockResponse message, length delimited. Does not implicitly {@link ConsensusFinalizeBlockResponse.verify|verify} messages.
    * @param message ConsensusFinalizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusFinalizeBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusFinalizeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusFinalizeBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusFinalizeBlockResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusFinalizeBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusFinalizeBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusFinalizeBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
