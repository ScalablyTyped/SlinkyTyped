package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientEventsGetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse")
@js.native
/**
  * Constructs a new ClientEventsGetResponse.
  * @param [properties] Properties to set
  */
class ClientEventsGetResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse {
  def this(properties: IClientEventsGetResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse")
@js.native
object ClientEventsGetResponse extends js.Object {
  
  /**
    * Creates a new ClientEventsGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsGetResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  def create(properties: IClientEventsGetResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  
  /**
    * Decodes a ClientEventsGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  
  /**
    * Decodes a ClientEventsGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  
  /**
    * Encodes the specified ClientEventsGetResponse message. Does not implicitly {@link ClientEventsGetResponse.verify|verify} messages.
    * @param message ClientEventsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientEventsGetResponse): Writer = js.native
  def encode(message: IClientEventsGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientEventsGetResponse message, length delimited. Does not implicitly {@link ClientEventsGetResponse.verify|verify} messages.
    * @param message ClientEventsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientEventsGetResponse): Writer = js.native
  def encodeDelimited(message: IClientEventsGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientEventsGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientEventsGetResponse message. Also converts values to other types if specified.
    * @param message ClientEventsGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientEventsGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status with Double] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 3 */ val INVALID_FILTER: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.INVALID_FILTER with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.STATUS_UNSET with Double = js.native
    
    /* 4 */ val UNKNOWN_BLOCK: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
}
