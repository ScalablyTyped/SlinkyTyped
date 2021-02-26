package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITpStateSetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest")
@js.native
/**
  * Constructs a new TpStateSetRequest.
  * @param [properties] Properties to set
  */
class TpStateSetRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TpStateSetRequest {
  def this(properties: ITpStateSetRequest) = this()
}
/* static members */
object TpStateSetRequest {
  
  /**
    * Creates a new TpStateSetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateSetRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.create")
  @js.native
  def create(properties: ITpStateSetRequest): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  /**
    * Decodes a TpStateSetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateSetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  /**
    * Decodes a TpStateSetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateSetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  
  /**
    * Encodes the specified TpStateSetRequest message. Does not implicitly {@link TpStateSetRequest.verify|verify} messages.
    * @param message TpStateSetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.encode")
  @js.native
  def encode(message: ITpStateSetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.encode")
  @js.native
  def encode(message: ITpStateSetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpStateSetRequest message, length delimited. Does not implicitly {@link TpStateSetRequest.verify|verify} messages.
    * @param message TpStateSetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateSetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateSetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpStateSetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateSetRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  
  /**
    * Creates a plain object from a TpStateSetRequest message. Also converts values to other types if specified.
    * @param message TpStateSetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateSetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateSetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpStateSetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
