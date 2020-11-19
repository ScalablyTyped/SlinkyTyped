package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse")
@js.native
/**
  * Constructs a new TpStateGetResponse.
  * @param [properties] Properties to set
  */
class TpStateGetResponse () extends ITpStateGetResponse {
  def this(properties: ITpStateGetResponse) = this()
  
  /** TpStateGetResponse entries. */
  @JSName("entries")
  var entries_TpStateGetResponse: js.Array[ITpStateEntry] = js.native
  
  /** TpStateGetResponse status. */
  @JSName("status")
  var status_TpStateGetResponse: Status = js.native
  
  /**
    * Converts this TpStateGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse")
@js.native
object TpStateGetResponse extends js.Object {
  
  /**
    * Creates a new TpStateGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateGetResponse instance
    */
  def create(): TpStateGetResponse = js.native
  def create(properties: ITpStateGetResponse): TpStateGetResponse = js.native
  
  /**
    * Decodes a TpStateGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TpStateGetResponse = js.native
  def decode(reader: Reader, length: Double): TpStateGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): TpStateGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): TpStateGetResponse = js.native
  
  /**
    * Decodes a TpStateGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TpStateGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): TpStateGetResponse = js.native
  
  /**
    * Encodes the specified TpStateGetResponse message. Does not implicitly {@link TpStateGetResponse.verify|verify} messages.
    * @param message TpStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpStateGetResponse): Writer = js.native
  def encode(message: ITpStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpStateGetResponse message, length delimited. Does not implicitly {@link TpStateGetResponse.verify|verify} messages.
    * @param message TpStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpStateGetResponse): Writer = js.native
  def encodeDelimited(message: ITpStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpStateGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): TpStateGetResponse = js.native
  
  /**
    * Creates a plain object from a TpStateGetResponse message. Also converts values to other types if specified.
    * @param message TpStateGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TpStateGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: TpStateGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpStateGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  @js.native
  sealed trait Status extends js.Object
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait AUTHORIZATION_ERROR extends Status
    /* 2 */ @js.native
    object AUTHORIZATION_ERROR extends TopLevel[AUTHORIZATION_ERROR with Double]
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
  }
}
