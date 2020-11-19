package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientPeersGetResponse")
@js.native
/**
  * Constructs a new ClientPeersGetResponse.
  * @param [properties] Properties to set
  */
class ClientPeersGetResponse () extends IClientPeersGetResponse {
  def this(properties: IClientPeersGetResponse) = this()
  
  /** ClientPeersGetResponse peers. */
  @JSName("peers")
  var peers_ClientPeersGetResponse: js.Array[String] = js.native
  
  /** ClientPeersGetResponse status. */
  @JSName("status")
  var status_ClientPeersGetResponse: Status = js.native
  
  /**
    * Converts this ClientPeersGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientPeersGetResponse")
@js.native
object ClientPeersGetResponse extends js.Object {
  
  /**
    * Creates a new ClientPeersGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientPeersGetResponse instance
    */
  def create(): ClientPeersGetResponse = js.native
  def create(properties: IClientPeersGetResponse): ClientPeersGetResponse = js.native
  
  /**
    * Decodes a ClientPeersGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientPeersGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientPeersGetResponse = js.native
  def decode(reader: Reader, length: Double): ClientPeersGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): ClientPeersGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ClientPeersGetResponse = js.native
  
  /**
    * Decodes a ClientPeersGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientPeersGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientPeersGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ClientPeersGetResponse = js.native
  
  /**
    * Encodes the specified ClientPeersGetResponse message. Does not implicitly {@link ClientPeersGetResponse.verify|verify} messages.
    * @param message ClientPeersGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientPeersGetResponse): Writer = js.native
  def encode(message: IClientPeersGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientPeersGetResponse message, length delimited. Does not implicitly {@link ClientPeersGetResponse.verify|verify} messages.
    * @param message ClientPeersGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientPeersGetResponse): Writer = js.native
  def encodeDelimited(message: IClientPeersGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientPeersGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientPeersGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientPeersGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientPeersGetResponse message. Also converts values to other types if specified.
    * @param message ClientPeersGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientPeersGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ClientPeersGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientPeersGetResponse message.
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
    sealed trait ERROR extends Status
    /* 2 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
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
