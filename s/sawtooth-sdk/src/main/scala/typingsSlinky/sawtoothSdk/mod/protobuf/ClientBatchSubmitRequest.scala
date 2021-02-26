package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBatchSubmitRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest")
@js.native
/**
  * Constructs a new ClientBatchSubmitRequest.
  * @param [properties] Properties to set
  */
class ClientBatchSubmitRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitRequest {
  def this(properties: IClientBatchSubmitRequest) = this()
}
/* static members */
object ClientBatchSubmitRequest {
  
  /**
    * Creates a new ClientBatchSubmitRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchSubmitRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.create")
  @js.native
  def create(properties: IClientBatchSubmitRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitRequest = js.native
  /**
    * Decodes a ClientBatchSubmitRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchSubmitRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitRequest = js.native
  /**
    * Decodes a ClientBatchSubmitRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchSubmitRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitRequest = js.native
  
  /**
    * Encodes the specified ClientBatchSubmitRequest message. Does not implicitly {@link ClientBatchSubmitRequest.verify|verify} messages.
    * @param message ClientBatchSubmitRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.encode")
  @js.native
  def encode(message: IClientBatchSubmitRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.encode")
  @js.native
  def encode(message: IClientBatchSubmitRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchSubmitRequest message, length delimited. Does not implicitly {@link ClientBatchSubmitRequest.verify|verify} messages.
    * @param message ClientBatchSubmitRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchSubmitRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchSubmitRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchSubmitRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchSubmitRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitRequest = js.native
  
  /**
    * Creates a plain object from a ClientBatchSubmitRequest message. Also converts values to other types if specified.
    * @param message ClientBatchSubmitRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchSubmitRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchSubmitRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchSubmitRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
