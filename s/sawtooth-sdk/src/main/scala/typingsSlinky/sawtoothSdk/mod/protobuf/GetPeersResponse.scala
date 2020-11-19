package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IGetPeersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GetPeersResponse")
@js.native
/**
  * Constructs a new GetPeersResponse.
  * @param [properties] Properties to set
  */
class GetPeersResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.GetPeersResponse {
  def this(properties: IGetPeersResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.GetPeersResponse")
@js.native
object GetPeersResponse extends js.Object {
  
  /**
    * Creates a new GetPeersResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetPeersResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  def create(properties: IGetPeersResponse): typingsSlinky.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  
  /**
    * Decodes a GetPeersResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetPeersResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  
  /**
    * Decodes a GetPeersResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetPeersResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  
  /**
    * Encodes the specified GetPeersResponse message. Does not implicitly {@link GetPeersResponse.verify|verify} messages.
    * @param message GetPeersResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetPeersResponse): Writer = js.native
  def encode(message: IGetPeersResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetPeersResponse message, length delimited. Does not implicitly {@link GetPeersResponse.verify|verify} messages.
    * @param message GetPeersResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetPeersResponse): Writer = js.native
  def encodeDelimited(message: IGetPeersResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetPeersResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetPeersResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  
  /**
    * Creates a plain object from a GetPeersResponse message. Also converts values to other types if specified.
    * @param message GetPeersResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.GetPeersResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.GetPeersResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetPeersResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
