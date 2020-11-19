package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITpEventAddResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpEventAddResponse")
@js.native
/**
  * Constructs a new TpEventAddResponse.
  * @param [properties] Properties to set
  */
class TpEventAddResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse {
  def this(properties: ITpEventAddResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.TpEventAddResponse")
@js.native
object TpEventAddResponse extends js.Object {
  
  /**
    * Creates a new TpEventAddResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpEventAddResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse = js.native
  def create(properties: ITpEventAddResponse): typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse = js.native
  
  /**
    * Decodes a TpEventAddResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpEventAddResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse = js.native
  
  /**
    * Decodes a TpEventAddResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpEventAddResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse = js.native
  
  /**
    * Encodes the specified TpEventAddResponse message. Does not implicitly {@link TpEventAddResponse.verify|verify} messages.
    * @param message TpEventAddResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpEventAddResponse): Writer = js.native
  def encode(message: ITpEventAddResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpEventAddResponse message, length delimited. Does not implicitly {@link TpEventAddResponse.verify|verify} messages.
    * @param message TpEventAddResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpEventAddResponse): Writer = js.native
  def encodeDelimited(message: ITpEventAddResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpEventAddResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpEventAddResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse = js.native
  
  /**
    * Creates a plain object from a TpEventAddResponse message. Also converts values to other types if specified.
    * @param message TpEventAddResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpEventAddResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse.Status with Double] = js.native
    
    /* 2 */ val ERROR: typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse.Status.ERROR with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.TpEventAddResponse.Status.STATUS_UNSET with Double = js.native
  }
}
