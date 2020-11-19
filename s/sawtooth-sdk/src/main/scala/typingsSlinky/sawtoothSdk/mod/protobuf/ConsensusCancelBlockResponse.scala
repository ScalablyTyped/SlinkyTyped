package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusCancelBlockResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockResponse")
@js.native
/**
  * Constructs a new ConsensusCancelBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusCancelBlockResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse {
  def this(properties: IConsensusCancelBlockResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockResponse")
@js.native
object ConsensusCancelBlockResponse extends js.Object {
  
  /**
    * Creates a new ConsensusCancelBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCancelBlockResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = js.native
  def create(properties: IConsensusCancelBlockResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = js.native
  
  /**
    * Decodes a ConsensusCancelBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCancelBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = js.native
  
  /**
    * Decodes a ConsensusCancelBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCancelBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusCancelBlockResponse message. Does not implicitly {@link ConsensusCancelBlockResponse.verify|verify} messages.
    * @param message ConsensusCancelBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusCancelBlockResponse): Writer = js.native
  def encode(message: IConsensusCancelBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusCancelBlockResponse message, length delimited. Does not implicitly {@link ConsensusCancelBlockResponse.verify|verify} messages.
    * @param message ConsensusCancelBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusCancelBlockResponse): Writer = js.native
  def encodeDelimited(message: IConsensusCancelBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusCancelBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCancelBlockResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusCancelBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusCancelBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusCancelBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status with Double
      ] = js.native
    
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 5 */ val INVALID_STATE: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.INVALID_STATE with Double = js.native
    
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.STATUS_UNSET with Double = js.native
  }
}
