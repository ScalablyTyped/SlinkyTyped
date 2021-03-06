package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBlockGetByTransactionIdRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByTransactionIdRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByTransactionIdRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByTransactionIdRequest {
  def this(properties: IClientBlockGetByTransactionIdRequest) = this()
}
/* static members */
object ClientBlockGetByTransactionIdRequest {
  
  /**
    * Creates a new ClientBlockGetByTransactionIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByTransactionIdRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.create")
  @js.native
  def create(properties: IClientBlockGetByTransactionIdRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByTransactionIdRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByTransactionIdRequest = js.native
  /**
    * Decodes a ClientBlockGetByTransactionIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByTransactionIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByTransactionIdRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByTransactionIdRequest = js.native
  /**
    * Decodes a ClientBlockGetByTransactionIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByTransactionIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByTransactionIdRequest = js.native
  
  /**
    * Encodes the specified ClientBlockGetByTransactionIdRequest message. Does not implicitly {@link ClientBlockGetByTransactionIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByTransactionIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByTransactionIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByTransactionIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockGetByTransactionIdRequest message, length delimited. Does not implicitly {@link ClientBlockGetByTransactionIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByTransactionIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByTransactionIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByTransactionIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockGetByTransactionIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByTransactionIdRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByTransactionIdRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockGetByTransactionIdRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByTransactionIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByTransactionIdRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByTransactionIdRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockGetByTransactionIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByTransactionIdRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
