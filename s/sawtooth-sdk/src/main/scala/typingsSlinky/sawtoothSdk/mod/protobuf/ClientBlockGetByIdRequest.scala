package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBlockGetByIdRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByIdRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByIdRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByIdRequest {
  def this(properties: IClientBlockGetByIdRequest) = this()
}
/* static members */
object ClientBlockGetByIdRequest {
  
  /**
    * Creates a new ClientBlockGetByIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByIdRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.create")
  @js.native
  def create(properties: IClientBlockGetByIdRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByIdRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByIdRequest = js.native
  /**
    * Decodes a ClientBlockGetByIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByIdRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByIdRequest = js.native
  /**
    * Decodes a ClientBlockGetByIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByIdRequest = js.native
  
  /**
    * Encodes the specified ClientBlockGetByIdRequest message. Does not implicitly {@link ClientBlockGetByIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockGetByIdRequest message, length delimited. Does not implicitly {@link ClientBlockGetByIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockGetByIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByIdRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByIdRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockGetByIdRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByIdRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockGetByIdRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockGetByIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByIdRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
