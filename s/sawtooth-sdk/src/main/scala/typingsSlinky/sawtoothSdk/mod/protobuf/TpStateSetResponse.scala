package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITpStateSetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpStateSetResponse")
@js.native
/**
  * Constructs a new TpStateSetResponse.
  * @param [properties] Properties to set
  */
class TpStateSetResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse {
  def this(properties: ITpStateSetResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.TpStateSetResponse")
@js.native
object TpStateSetResponse extends js.Object {
  
  /**
    * Creates a new TpStateSetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateSetResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse = js.native
  def create(properties: ITpStateSetResponse): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse = js.native
  
  /**
    * Decodes a TpStateSetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateSetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse = js.native
  
  /**
    * Decodes a TpStateSetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateSetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse = js.native
  
  /**
    * Encodes the specified TpStateSetResponse message. Does not implicitly {@link TpStateSetResponse.verify|verify} messages.
    * @param message TpStateSetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpStateSetResponse): Writer = js.native
  def encode(message: ITpStateSetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpStateSetResponse message, length delimited. Does not implicitly {@link TpStateSetResponse.verify|verify} messages.
    * @param message TpStateSetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpStateSetResponse): Writer = js.native
  def encodeDelimited(message: ITpStateSetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpStateSetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateSetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse = js.native
  
  /**
    * Creates a plain object from a TpStateSetResponse message. Also converts values to other types if specified.
    * @param message TpStateSetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpStateSetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse.Status with Double] = js.native
    
    /* 2 */ val AUTHORIZATION_ERROR: typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse.Status.AUTHORIZATION_ERROR with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.TpStateSetResponse.Status.STATUS_UNSET with Double = js.native
  }
}
