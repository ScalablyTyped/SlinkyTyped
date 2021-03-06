package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITpStateGetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest")
@js.native
/**
  * Constructs a new TpStateGetRequest.
  * @param [properties] Properties to set
  */
class TpStateGetRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TpStateGetRequest {
  def this(properties: ITpStateGetRequest) = this()
}
/* static members */
object TpStateGetRequest {
  
  /**
    * Creates a new TpStateGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateGetRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.create")
  @js.native
  def create(properties: ITpStateGetRequest): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  /**
    * Decodes a TpStateGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  /**
    * Decodes a TpStateGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  
  /**
    * Encodes the specified TpStateGetRequest message. Does not implicitly {@link TpStateGetRequest.verify|verify} messages.
    * @param message TpStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.encode")
  @js.native
  def encode(message: ITpStateGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.encode")
  @js.native
  def encode(message: ITpStateGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpStateGetRequest message, length delimited. Does not implicitly {@link TpStateGetRequest.verify|verify} messages.
    * @param message TpStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpStateGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateGetRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  
  /**
    * Creates a plain object from a TpStateGetRequest message. Also converts values to other types if specified.
    * @param message TpStateGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpStateGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
