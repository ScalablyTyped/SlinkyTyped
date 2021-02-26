package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBlockGetByBatchIdRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByBatchIdRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByBatchIdRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest {
  def this(properties: IClientBlockGetByBatchIdRequest) = this()
}
/* static members */
object ClientBlockGetByBatchIdRequest {
  
  /**
    * Creates a new ClientBlockGetByBatchIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByBatchIdRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.create")
  @js.native
  def create(properties: IClientBlockGetByBatchIdRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  /**
    * Decodes a ClientBlockGetByBatchIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  /**
    * Decodes a ClientBlockGetByBatchIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Encodes the specified ClientBlockGetByBatchIdRequest message. Does not implicitly {@link ClientBlockGetByBatchIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByBatchIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByBatchIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockGetByBatchIdRequest message, length delimited. Does not implicitly {@link ClientBlockGetByBatchIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByBatchIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByBatchIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockGetByBatchIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByBatchIdRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockGetByBatchIdRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByBatchIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockGetByBatchIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
