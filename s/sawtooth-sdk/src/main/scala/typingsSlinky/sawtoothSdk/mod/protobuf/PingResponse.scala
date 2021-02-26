package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IPingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.PingResponse")
@js.native
/**
  * Constructs a new PingResponse.
  * @param [properties] Properties to set
  */
class PingResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.PingResponse {
  def this(properties: IPingResponse) = this()
}
/* static members */
object PingResponse {
  
  /**
    * Creates a new PingResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PingResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.PingResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.create")
  @js.native
  def create(properties: IPingResponse): typingsSlinky.sawtoothSdk.protobufMod.PingResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.PingResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.PingResponse = js.native
  /**
    * Decodes a PingResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.PingResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.PingResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.PingResponse = js.native
  /**
    * Decodes a PingResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.PingResponse = js.native
  
  /**
    * Encodes the specified PingResponse message. Does not implicitly {@link PingResponse.verify|verify} messages.
    * @param message PingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.encode")
  @js.native
  def encode(message: IPingResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.encode")
  @js.native
  def encode(message: IPingResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PingResponse message, length delimited. Does not implicitly {@link PingResponse.verify|verify} messages.
    * @param message PingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPingResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPingResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a PingResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PingResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.PingResponse = js.native
  
  /**
    * Creates a plain object from a PingResponse message. Also converts values to other types if specified.
    * @param message PingResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.PingResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.PingResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PingResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.PingResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
