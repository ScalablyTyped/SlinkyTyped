package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IGossipBatchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse")
@js.native
/**
  * Constructs a new GossipBatchResponse.
  * @param [properties] Properties to set
  */
class GossipBatchResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.GossipBatchResponse {
  def this(properties: IGossipBatchResponse) = this()
}
/* static members */
object GossipBatchResponse {
  
  /**
    * Creates a new GossipBatchResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBatchResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.GossipBatchResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.create")
  @js.native
  def create(properties: IGossipBatchResponse): typingsSlinky.sawtoothSdk.protobufMod.GossipBatchResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.GossipBatchResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.GossipBatchResponse = js.native
  /**
    * Decodes a GossipBatchResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBatchResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.GossipBatchResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.GossipBatchResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.GossipBatchResponse = js.native
  /**
    * Decodes a GossipBatchResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBatchResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.GossipBatchResponse = js.native
  
  /**
    * Encodes the specified GossipBatchResponse message. Does not implicitly {@link GossipBatchResponse.verify|verify} messages.
    * @param message GossipBatchResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.encode")
  @js.native
  def encode(message: IGossipBatchResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.encode")
  @js.native
  def encode(message: IGossipBatchResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipBatchResponse message, length delimited. Does not implicitly {@link GossipBatchResponse.verify|verify} messages.
    * @param message GossipBatchResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipBatchResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipBatchResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipBatchResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBatchResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.GossipBatchResponse = js.native
  
  /**
    * Creates a plain object from a GossipBatchResponse message. Also converts values to other types if specified.
    * @param message GossipBatchResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.GossipBatchResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.GossipBatchResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipBatchResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
