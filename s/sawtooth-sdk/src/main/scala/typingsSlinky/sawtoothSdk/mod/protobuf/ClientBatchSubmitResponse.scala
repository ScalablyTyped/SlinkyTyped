package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBatchSubmitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitResponse")
@js.native
/**
  * Constructs a new ClientBatchSubmitResponse.
  * @param [properties] Properties to set
  */
class ClientBatchSubmitResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse {
  def this(properties: IClientBatchSubmitResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitResponse")
@js.native
object ClientBatchSubmitResponse extends js.Object {
  
  /**
    * Creates a new ClientBatchSubmitResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchSubmitResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse = js.native
  def create(properties: IClientBatchSubmitResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse = js.native
  
  /**
    * Decodes a ClientBatchSubmitResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchSubmitResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse = js.native
  
  /**
    * Decodes a ClientBatchSubmitResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchSubmitResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse = js.native
  
  /**
    * Encodes the specified ClientBatchSubmitResponse message. Does not implicitly {@link ClientBatchSubmitResponse.verify|verify} messages.
    * @param message ClientBatchSubmitResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBatchSubmitResponse): Writer = js.native
  def encode(message: IClientBatchSubmitResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchSubmitResponse message, length delimited. Does not implicitly {@link ClientBatchSubmitResponse.verify|verify} messages.
    * @param message ClientBatchSubmitResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBatchSubmitResponse): Writer = js.native
  def encodeDelimited(message: IClientBatchSubmitResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchSubmitResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchSubmitResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse = js.native
  
  /**
    * Creates a plain object from a ClientBatchSubmitResponse message. Also converts values to other types if specified.
    * @param message ClientBatchSubmitResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchSubmitResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status with Double
      ] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 3 */ val INVALID_BATCH: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status.INVALID_BATCH with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status.OK with Double = js.native
    
    /* 4 */ val QUEUE_FULL: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status.QUEUE_FULL with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status.STATUS_UNSET with Double = js.native
  }
}
