package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IGossipBlockRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest")
@js.native
/**
  * Constructs a new GossipBlockRequest.
  * @param [properties] Properties to set
  */
class GossipBlockRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.GossipBlockRequest {
  def this(properties: IGossipBlockRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest")
@js.native
object GossipBlockRequest extends js.Object {
  
  /**
    * Creates a new GossipBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBlockRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  def create(properties: IGossipBlockRequest): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  
  /**
    * Decodes a GossipBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  
  /**
    * Decodes a GossipBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  
  /**
    * Encodes the specified GossipBlockRequest message. Does not implicitly {@link GossipBlockRequest.verify|verify} messages.
    * @param message GossipBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGossipBlockRequest): Writer = js.native
  def encode(message: IGossipBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipBlockRequest message, length delimited. Does not implicitly {@link GossipBlockRequest.verify|verify} messages.
    * @param message GossipBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGossipBlockRequest): Writer = js.native
  def encodeDelimited(message: IGossipBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBlockRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  
  /**
    * Creates a plain object from a GossipBlockRequest message. Also converts values to other types if specified.
    * @param message GossipBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.GossipBlockRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.GossipBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
