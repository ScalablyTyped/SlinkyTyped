package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientTransactionListResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse")
@js.native
/**
  * Constructs a new ClientTransactionListResponse.
  * @param [properties] Properties to set
  */
class ClientTransactionListResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse {
  def this(properties: IClientTransactionListResponse) = this()
}
/* static members */
object ClientTransactionListResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status with Double
      ] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 8 */ val INVALID_ID: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.INVALID_ID with Double = js.native
    
    /* 6 */ val INVALID_PAGING: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.INVALID_PAGING with Double = js.native
    
    /* 7 */ val INVALID_SORT: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.INVALID_SORT with Double = js.native
    
    /* 3 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.NOT_READY with Double = js.native
    
    /* 5 */ val NO_RESOURCE: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.NO_RESOURCE with Double = js.native
    
    /* 4 */ val NO_ROOT: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.NO_ROOT with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientTransactionListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionListResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.create")
  @js.native
  def create(properties: IClientTransactionListResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse = js.native
  /**
    * Decodes a ClientTransactionListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse = js.native
  /**
    * Decodes a ClientTransactionListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse = js.native
  
  /**
    * Encodes the specified ClientTransactionListResponse message. Does not implicitly {@link ClientTransactionListResponse.verify|verify} messages.
    * @param message ClientTransactionListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.encode")
  @js.native
  def encode(message: IClientTransactionListResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.encode")
  @js.native
  def encode(message: IClientTransactionListResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientTransactionListResponse message, length delimited. Does not implicitly {@link ClientTransactionListResponse.verify|verify} messages.
    * @param message ClientTransactionListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionListResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionListResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientTransactionListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionListResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse = js.native
  
  /**
    * Creates a plain object from a ClientTransactionListResponse message. Also converts values to other types if specified.
    * @param message ClientTransactionListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientTransactionListResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientTransactionListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
