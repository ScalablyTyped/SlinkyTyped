package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse")
@js.native
/**
  * Constructs a new ClientReceiptGetResponse.
  * @param [properties] Properties to set
  */
class ClientReceiptGetResponse () extends IClientReceiptGetResponse {
  def this(properties: IClientReceiptGetResponse) = this()
  
  /** ClientReceiptGetResponse receipts. */
  @JSName("receipts")
  var receipts_ClientReceiptGetResponse: js.Array[ITransactionReceipt] = js.native
  
  /** ClientReceiptGetResponse status. */
  @JSName("status")
  var status_ClientReceiptGetResponse: Status = js.native
  
  /**
    * Converts this ClientReceiptGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientReceiptGetResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    /* 2 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.INTERNAL_ERROR with Double = js.native
    
    @js.native
    sealed trait INVALID_ID extends Status
    /* 8 */ val INVALID_ID: typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.INVALID_ID with Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    /* 5 */ val NO_RESOURCE: typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.NO_RESOURCE with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientReceiptGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientReceiptGetResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.create")
  @js.native
  def create(): ClientReceiptGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.create")
  @js.native
  def create(properties: IClientReceiptGetResponse): ClientReceiptGetResponse = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ClientReceiptGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ClientReceiptGetResponse = js.native
  /**
    * Decodes a ClientReceiptGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientReceiptGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.decode")
  @js.native
  def decode(reader: Reader): ClientReceiptGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientReceiptGetResponse = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ClientReceiptGetResponse = js.native
  /**
    * Decodes a ClientReceiptGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientReceiptGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientReceiptGetResponse = js.native
  
  /**
    * Encodes the specified ClientReceiptGetResponse message. Does not implicitly {@link ClientReceiptGetResponse.verify|verify} messages.
    * @param message ClientReceiptGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.encode")
  @js.native
  def encode(message: IClientReceiptGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.encode")
  @js.native
  def encode(message: IClientReceiptGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientReceiptGetResponse message, length delimited. Does not implicitly {@link ClientReceiptGetResponse.verify|verify} messages.
    * @param message ClientReceiptGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientReceiptGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientReceiptGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientReceiptGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientReceiptGetResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientReceiptGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientReceiptGetResponse message. Also converts values to other types if specified.
    * @param message ClientReceiptGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.toObject")
  @js.native
  def toObject(message: ClientReceiptGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.toObject")
  @js.native
  def toObject(message: ClientReceiptGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientReceiptGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
