package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusSendToResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusSendToResponse")
@js.native
/**
  * Constructs a new ConsensusSendToResponse.
  * @param [properties] Properties to set
  */
class ConsensusSendToResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse {
  def this(properties: IConsensusSendToResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusSendToResponse")
@js.native
object ConsensusSendToResponse extends js.Object {
  
  /**
    * Creates a new ConsensusSendToResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSendToResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse = js.native
  def create(properties: IConsensusSendToResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse = js.native
  
  /**
    * Decodes a ConsensusSendToResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSendToResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse = js.native
  
  /**
    * Decodes a ConsensusSendToResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSendToResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse = js.native
  
  /**
    * Encodes the specified ConsensusSendToResponse message. Does not implicitly {@link ConsensusSendToResponse.verify|verify} messages.
    * @param message ConsensusSendToResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusSendToResponse): Writer = js.native
  def encode(message: IConsensusSendToResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusSendToResponse message, length delimited. Does not implicitly {@link ConsensusSendToResponse.verify|verify} messages.
    * @param message ConsensusSendToResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusSendToResponse): Writer = js.native
  def encodeDelimited(message: IConsensusSendToResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusSendToResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSendToResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusSendToResponse message. Also converts values to other types if specified.
    * @param message ConsensusSendToResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusSendToResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status with Double] = js.native
    
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status.STATUS_UNSET with Double = js.native
    
    /* 5 */ val UNKNOWN_PEER: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status.UNKNOWN_PEER with Double = js.native
  }
}
