package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITpRegisterResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse")
@js.native
/**
  * Constructs a new TpRegisterResponse.
  * @param [properties] Properties to set
  */
class TpRegisterResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse {
  def this(properties: ITpRegisterResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse")
@js.native
object TpRegisterResponse extends js.Object {
  
  /**
    * Creates a new TpRegisterResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpRegisterResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  def create(properties: ITpRegisterResponse): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  
  /**
    * Decodes a TpRegisterResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  
  /**
    * Decodes a TpRegisterResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  
  /**
    * Encodes the specified TpRegisterResponse message. Does not implicitly {@link TpRegisterResponse.verify|verify} messages.
    * @param message TpRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpRegisterResponse): Writer = js.native
  def encode(message: ITpRegisterResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpRegisterResponse message, length delimited. Does not implicitly {@link TpRegisterResponse.verify|verify} messages.
    * @param message TpRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpRegisterResponse): Writer = js.native
  def encodeDelimited(message: ITpRegisterResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpRegisterResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpRegisterResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  
  /**
    * Creates a plain object from a TpRegisterResponse message. Also converts values to other types if specified.
    * @param message TpRegisterResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpRegisterResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse.Status with Double] = js.native
    
    /* 2 */ val ERROR: typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse.Status.ERROR with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse.Status.STATUS_UNSET with Double = js.native
  }
}
