package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IGossipBlockResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse")
@js.native
/**
  * Constructs a new GossipBlockResponse.
  * @param [properties] Properties to set
  */
class GossipBlockResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.GossipBlockResponse {
  def this(properties: IGossipBlockResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse")
@js.native
object GossipBlockResponse extends js.Object {
  
  /**
    * Creates a new GossipBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBlockResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  def create(properties: IGossipBlockResponse): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  
  /**
    * Decodes a GossipBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  
  /**
    * Decodes a GossipBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  
  /**
    * Encodes the specified GossipBlockResponse message. Does not implicitly {@link GossipBlockResponse.verify|verify} messages.
    * @param message GossipBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGossipBlockResponse): Writer = js.native
  def encode(message: IGossipBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipBlockResponse message, length delimited. Does not implicitly {@link GossipBlockResponse.verify|verify} messages.
    * @param message GossipBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGossipBlockResponse): Writer = js.native
  def encodeDelimited(message: IGossipBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBlockResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  
  /**
    * Creates a plain object from a GossipBlockResponse message. Also converts values to other types if specified.
    * @param message GossipBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.GossipBlockResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.GossipBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
