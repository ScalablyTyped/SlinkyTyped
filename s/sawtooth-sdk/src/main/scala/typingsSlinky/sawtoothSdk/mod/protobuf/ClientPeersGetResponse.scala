package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientPeersGetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse")
@js.native
/**
  * Constructs a new ClientPeersGetResponse.
  * @param [properties] Properties to set
  */
class ClientPeersGetResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse {
  def this(properties: IClientPeersGetResponse) = this()
}
/* static members */
object ClientPeersGetResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status with Double] = js.native
    
    /* 2 */ val ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status.ERROR with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientPeersGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientPeersGetResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.create")
  @js.native
  def create(properties: IClientPeersGetResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  /**
    * Decodes a ClientPeersGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientPeersGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  /**
    * Decodes a ClientPeersGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientPeersGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  
  /**
    * Encodes the specified ClientPeersGetResponse message. Does not implicitly {@link ClientPeersGetResponse.verify|verify} messages.
    * @param message ClientPeersGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.encode")
  @js.native
  def encode(message: IClientPeersGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.encode")
  @js.native
  def encode(message: IClientPeersGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientPeersGetResponse message, length delimited. Does not implicitly {@link ClientPeersGetResponse.verify|verify} messages.
    * @param message ClientPeersGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientPeersGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientPeersGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientPeersGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientPeersGetResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientPeersGetResponse message. Also converts values to other types if specified.
    * @param message ClientPeersGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientPeersGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientPeersGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
