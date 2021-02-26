package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITpProcessResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpProcessResponse")
@js.native
/**
  * Constructs a new TpProcessResponse.
  * @param [properties] Properties to set
  */
class TpProcessResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse {
  def this(properties: ITpProcessResponse) = this()
}
/* static members */
object TpProcessResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse.Status with Double] = js.native
    
    /* 3 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 2 */ val INVALID_TRANSACTION: typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse.Status.INVALID_TRANSACTION with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new TpProcessResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpProcessResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.create")
  @js.native
  def create(properties: ITpProcessResponse): typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  /**
    * Decodes a TpProcessResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpProcessResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  /**
    * Decodes a TpProcessResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpProcessResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  
  /**
    * Encodes the specified TpProcessResponse message. Does not implicitly {@link TpProcessResponse.verify|verify} messages.
    * @param message TpProcessResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.encode")
  @js.native
  def encode(message: ITpProcessResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.encode")
  @js.native
  def encode(message: ITpProcessResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpProcessResponse message, length delimited. Does not implicitly {@link TpProcessResponse.verify|verify} messages.
    * @param message TpProcessResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpProcessResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpProcessResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpProcessResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpProcessResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  
  /**
    * Creates a plain object from a TpProcessResponse message. Also converts values to other types if specified.
    * @param message TpProcessResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpProcessResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpProcessResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
