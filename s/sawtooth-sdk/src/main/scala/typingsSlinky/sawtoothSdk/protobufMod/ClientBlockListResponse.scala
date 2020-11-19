package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBlockListResponse")
@js.native
/**
  * Constructs a new ClientBlockListResponse.
  * @param [properties] Properties to set
  */
class ClientBlockListResponse () extends IClientBlockListResponse {
  def this(properties: IClientBlockListResponse) = this()
  
  /** ClientBlockListResponse blocks. */
  @JSName("blocks")
  var blocks_ClientBlockListResponse: js.Array[IBlock] = js.native
  
  /** ClientBlockListResponse headId. */
  @JSName("headId")
  var headId_ClientBlockListResponse: String = js.native
  
  /** ClientBlockListResponse status. */
  @JSName("status")
  var status_ClientBlockListResponse: Status = js.native
  
  /**
    * Converts this ClientBlockListResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientBlockListResponse")
@js.native
object ClientBlockListResponse extends js.Object {
  
  /**
    * Creates a new ClientBlockListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockListResponse instance
    */
  def create(): ClientBlockListResponse = js.native
  def create(properties: IClientBlockListResponse): ClientBlockListResponse = js.native
  
  /**
    * Decodes a ClientBlockListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientBlockListResponse = js.native
  def decode(reader: Reader, length: Double): ClientBlockListResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): ClientBlockListResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ClientBlockListResponse = js.native
  
  /**
    * Decodes a ClientBlockListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientBlockListResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ClientBlockListResponse = js.native
  
  /**
    * Encodes the specified ClientBlockListResponse message. Does not implicitly {@link ClientBlockListResponse.verify|verify} messages.
    * @param message ClientBlockListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBlockListResponse): Writer = js.native
  def encode(message: IClientBlockListResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockListResponse message, length delimited. Does not implicitly {@link ClientBlockListResponse.verify|verify} messages.
    * @param message ClientBlockListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBlockListResponse): Writer = js.native
  def encodeDelimited(message: IClientBlockListResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockListResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientBlockListResponse = js.native
  
  /**
    * Creates a plain object from a ClientBlockListResponse message. Also converts values to other types if specified.
    * @param message ClientBlockListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientBlockListResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ClientBlockListResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockListResponse message.
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
    sealed trait INTERNAL_ERROR extends Status
    /* 2 */ @js.native
    object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with Double]
    
    @js.native
    sealed trait INVALID_ID extends Status
    /* 8 */ @js.native
    object INVALID_ID extends TopLevel[INVALID_ID with Double]
    
    @js.native
    sealed trait INVALID_PAGING extends Status
    /* 6 */ @js.native
    object INVALID_PAGING extends TopLevel[INVALID_PAGING with Double]
    
    @js.native
    sealed trait INVALID_SORT extends Status
    /* 7 */ @js.native
    object INVALID_SORT extends TopLevel[INVALID_SORT with Double]
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 3 */ @js.native
    object NOT_READY extends TopLevel[NOT_READY with Double]
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    /* 5 */ @js.native
    object NO_RESOURCE extends TopLevel[NO_RESOURCE with Double]
    
    @js.native
    sealed trait NO_ROOT extends Status
    /* 4 */ @js.native
    object NO_ROOT extends TopLevel[NO_ROOT with Double]
    
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
