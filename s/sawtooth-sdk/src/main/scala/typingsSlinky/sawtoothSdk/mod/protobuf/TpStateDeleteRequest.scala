package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITpStateDeleteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest")
@js.native
/**
  * Constructs a new TpStateDeleteRequest.
  * @param [properties] Properties to set
  */
class TpStateDeleteRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteRequest {
  def this(properties: ITpStateDeleteRequest) = this()
}
/* static members */
object TpStateDeleteRequest {
  
  /**
    * Creates a new TpStateDeleteRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateDeleteRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.create")
  @js.native
  def create(properties: ITpStateDeleteRequest): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  /**
    * Decodes a TpStateDeleteRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateDeleteRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  /**
    * Decodes a TpStateDeleteRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateDeleteRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  
  /**
    * Encodes the specified TpStateDeleteRequest message. Does not implicitly {@link TpStateDeleteRequest.verify|verify} messages.
    * @param message TpStateDeleteRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.encode")
  @js.native
  def encode(message: ITpStateDeleteRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.encode")
  @js.native
  def encode(message: ITpStateDeleteRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpStateDeleteRequest message, length delimited. Does not implicitly {@link TpStateDeleteRequest.verify|verify} messages.
    * @param message TpStateDeleteRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateDeleteRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateDeleteRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpStateDeleteRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateDeleteRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  
  /**
    * Creates a plain object from a TpStateDeleteRequest message. Also converts values to other types if specified.
    * @param message TpStateDeleteRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpStateDeleteRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
