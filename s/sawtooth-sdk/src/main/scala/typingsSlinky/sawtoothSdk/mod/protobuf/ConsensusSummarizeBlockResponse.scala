package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusSummarizeBlockResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse")
@js.native
/**
  * Constructs a new ConsensusSummarizeBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusSummarizeBlockResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse {
  def this(properties: IConsensusSummarizeBlockResponse) = this()
}
/* static members */
object ConsensusSummarizeBlockResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status with Double
      ] = js.native
    
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 6 */ val BLOCK_NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.BLOCK_NOT_READY with Double = js.native
    
    /* 5 */ val INVALID_STATE: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.INVALID_STATE with Double = js.native
    
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ConsensusSummarizeBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSummarizeBlockResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.create")
  @js.native
  def create(properties: IConsensusSummarizeBlockResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse = js.native
  /**
    * Decodes a ConsensusSummarizeBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSummarizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse = js.native
  /**
    * Decodes a ConsensusSummarizeBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSummarizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusSummarizeBlockResponse message. Does not implicitly {@link ConsensusSummarizeBlockResponse.verify|verify} messages.
    * @param message ConsensusSummarizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.encode")
  @js.native
  def encode(message: IConsensusSummarizeBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.encode")
  @js.native
  def encode(message: IConsensusSummarizeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusSummarizeBlockResponse message, length delimited. Does not implicitly {@link ConsensusSummarizeBlockResponse.verify|verify} messages.
    * @param message ConsensusSummarizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSummarizeBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSummarizeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusSummarizeBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSummarizeBlockResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusSummarizeBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusSummarizeBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusSummarizeBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
