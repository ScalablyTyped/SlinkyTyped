package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBatchGetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest")
@js.native
/**
  * Constructs a new ClientBatchGetRequest.
  * @param [properties] Properties to set
  */
class ClientBatchGetRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetRequest {
  def this(properties: IClientBatchGetRequest) = this()
}
/* static members */
object ClientBatchGetRequest {
  
  /**
    * Creates a new ClientBatchGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchGetRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.create")
  @js.native
  def create(properties: IClientBatchGetRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetRequest = js.native
  /**
    * Decodes a ClientBatchGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetRequest = js.native
  /**
    * Decodes a ClientBatchGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetRequest = js.native
  
  /**
    * Encodes the specified ClientBatchGetRequest message. Does not implicitly {@link ClientBatchGetRequest.verify|verify} messages.
    * @param message ClientBatchGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.encode")
  @js.native
  def encode(message: IClientBatchGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.encode")
  @js.native
  def encode(message: IClientBatchGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchGetRequest message, length delimited. Does not implicitly {@link ClientBatchGetRequest.verify|verify} messages.
    * @param message ClientBatchGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchGetRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetRequest = js.native
  
  /**
    * Creates a plain object from a ClientBatchGetRequest message. Also converts values to other types if specified.
    * @param message ClientBatchGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
