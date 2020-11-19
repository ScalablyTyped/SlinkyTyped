package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBatchGetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBatchGetResponse")
@js.native
/**
  * Constructs a new ClientBatchGetResponse.
  * @param [properties] Properties to set
  */
class ClientBatchGetResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse {
  def this(properties: IClientBatchGetResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientBatchGetResponse")
@js.native
object ClientBatchGetResponse extends js.Object {
  
  /**
    * Creates a new ClientBatchGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchGetResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  def create(properties: IClientBatchGetResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  
  /**
    * Decodes a ClientBatchGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  
  /**
    * Decodes a ClientBatchGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  
  /**
    * Encodes the specified ClientBatchGetResponse message. Does not implicitly {@link ClientBatchGetResponse.verify|verify} messages.
    * @param message ClientBatchGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBatchGetResponse): Writer = js.native
  def encode(message: IClientBatchGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchGetResponse message, length delimited. Does not implicitly {@link ClientBatchGetResponse.verify|verify} messages.
    * @param message ClientBatchGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBatchGetResponse): Writer = js.native
  def encodeDelimited(message: IClientBatchGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientBatchGetResponse message. Also converts values to other types if specified.
    * @param message ClientBatchGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status with Double] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 8 */ val INVALID_ID: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.INVALID_ID with Double = js.native
    
    /* 5 */ val NO_RESOURCE: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.NO_RESOURCE with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.STATUS_UNSET with Double = js.native
  }
}
