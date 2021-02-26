package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITpRegisterRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest")
@js.native
/**
  * Constructs a new TpRegisterRequest.
  * @param [properties] Properties to set
  */
class TpRegisterRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TpRegisterRequest {
  def this(properties: ITpRegisterRequest) = this()
}
/* static members */
object TpRegisterRequest {
  
  /**
    * Creates a new TpRegisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpRegisterRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.create")
  @js.native
  def create(properties: ITpRegisterRequest): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterRequest = js.native
  /**
    * Decodes a TpRegisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterRequest = js.native
  /**
    * Decodes a TpRegisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterRequest = js.native
  
  /**
    * Encodes the specified TpRegisterRequest message. Does not implicitly {@link TpRegisterRequest.verify|verify} messages.
    * @param message TpRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.encode")
  @js.native
  def encode(message: ITpRegisterRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.encode")
  @js.native
  def encode(message: ITpRegisterRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpRegisterRequest message, length delimited. Does not implicitly {@link TpRegisterRequest.verify|verify} messages.
    * @param message TpRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpRegisterRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpRegisterRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpRegisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpRegisterRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TpRegisterRequest = js.native
  
  /**
    * Creates a plain object from a TpRegisterRequest message. Also converts values to other types if specified.
    * @param message TpRegisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpRegisterRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpRegisterRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpRegisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
