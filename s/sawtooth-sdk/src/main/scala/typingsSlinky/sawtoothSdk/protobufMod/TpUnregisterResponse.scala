package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.TpUnregisterResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse")
@js.native
/**
  * Constructs a new TpUnregisterResponse.
  * @param [properties] Properties to set
  */
class TpUnregisterResponse () extends ITpUnregisterResponse {
  def this(properties: ITpUnregisterResponse) = this()
  
  /** TpUnregisterResponse status. */
  @JSName("status")
  var status_TpUnregisterResponse: Status = js.native
  
  /**
    * Converts this TpUnregisterResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpUnregisterResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait ERROR extends Status
    /* 2 */ val ERROR: typingsSlinky.sawtoothSdk.protobufMod.TpUnregisterResponse.Status.ERROR with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.TpUnregisterResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.TpUnregisterResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new TpUnregisterResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpUnregisterResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.create")
  @js.native
  def create(): TpUnregisterResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.create")
  @js.native
  def create(properties: ITpUnregisterResponse): TpUnregisterResponse = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): TpUnregisterResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): TpUnregisterResponse = js.native
  /**
    * Decodes a TpUnregisterResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpUnregisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.decode")
  @js.native
  def decode(reader: Reader): TpUnregisterResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): TpUnregisterResponse = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): TpUnregisterResponse = js.native
  /**
    * Decodes a TpUnregisterResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpUnregisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TpUnregisterResponse = js.native
  
  /**
    * Encodes the specified TpUnregisterResponse message. Does not implicitly {@link TpUnregisterResponse.verify|verify} messages.
    * @param message TpUnregisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.encode")
  @js.native
  def encode(message: ITpUnregisterResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.encode")
  @js.native
  def encode(message: ITpUnregisterResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpUnregisterResponse message, length delimited. Does not implicitly {@link TpUnregisterResponse.verify|verify} messages.
    * @param message TpUnregisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpUnregisterResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpUnregisterResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpUnregisterResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpUnregisterResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TpUnregisterResponse = js.native
  
  /**
    * Creates a plain object from a TpUnregisterResponse message. Also converts values to other types if specified.
    * @param message TpUnregisterResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.toObject")
  @js.native
  def toObject(message: TpUnregisterResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.toObject")
  @js.native
  def toObject(message: TpUnregisterResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpUnregisterResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
