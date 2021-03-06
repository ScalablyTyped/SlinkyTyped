package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse")
@js.native
/**
  * Constructs a new TpRegisterResponse.
  * @param [properties] Properties to set
  */
class TpRegisterResponse () extends ITpRegisterResponse {
  def this(properties: ITpRegisterResponse) = this()
  
  /** TpRegisterResponse status. */
  @JSName("status")
  var status_TpRegisterResponse: Status = js.native
  
  /**
    * Converts this TpRegisterResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpRegisterResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait ERROR extends Status
    /* 2 */ val ERROR: typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse.Status.ERROR with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.TpRegisterResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new TpRegisterResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpRegisterResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.create")
  @js.native
  def create(): TpRegisterResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.create")
  @js.native
  def create(properties: ITpRegisterResponse): TpRegisterResponse = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): TpRegisterResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): TpRegisterResponse = js.native
  /**
    * Decodes a TpRegisterResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.decode")
  @js.native
  def decode(reader: Reader): TpRegisterResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): TpRegisterResponse = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): TpRegisterResponse = js.native
  /**
    * Decodes a TpRegisterResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TpRegisterResponse = js.native
  
  /**
    * Encodes the specified TpRegisterResponse message. Does not implicitly {@link TpRegisterResponse.verify|verify} messages.
    * @param message TpRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.encode")
  @js.native
  def encode(message: ITpRegisterResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.encode")
  @js.native
  def encode(message: ITpRegisterResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpRegisterResponse message, length delimited. Does not implicitly {@link TpRegisterResponse.verify|verify} messages.
    * @param message TpRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpRegisterResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpRegisterResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpRegisterResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpRegisterResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TpRegisterResponse = js.native
  
  /**
    * Creates a plain object from a TpRegisterResponse message. Also converts values to other types if specified.
    * @param message TpRegisterResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.toObject")
  @js.native
  def toObject(message: TpRegisterResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.toObject")
  @js.native
  def toObject(message: TpRegisterResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpRegisterResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
