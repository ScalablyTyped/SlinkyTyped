package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientStatusGetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest")
@js.native
/**
  * Constructs a new ClientStatusGetRequest.
  * @param [properties] Properties to set
  */
class ClientStatusGetRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetRequest {
  def this(properties: IClientStatusGetRequest) = this()
}
/* static members */
object ClientStatusGetRequest {
  
  /**
    * Creates a new ClientStatusGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStatusGetRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.create")
  @js.native
  def create(properties: IClientStatusGetRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetRequest = js.native
  /**
    * Decodes a ClientStatusGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStatusGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetRequest = js.native
  /**
    * Decodes a ClientStatusGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStatusGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetRequest = js.native
  
  /**
    * Encodes the specified ClientStatusGetRequest message. Does not implicitly {@link ClientStatusGetRequest.verify|verify} messages.
    * @param message ClientStatusGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.encode")
  @js.native
  def encode(message: IClientStatusGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.encode")
  @js.native
  def encode(message: IClientStatusGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientStatusGetRequest message, length delimited. Does not implicitly {@link ClientStatusGetRequest.verify|verify} messages.
    * @param message ClientStatusGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientStatusGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientStatusGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientStatusGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStatusGetRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetRequest = js.native
  
  /**
    * Creates a plain object from a ClientStatusGetRequest message. Also converts values to other types if specified.
    * @param message ClientStatusGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientStatusGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStatusGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
