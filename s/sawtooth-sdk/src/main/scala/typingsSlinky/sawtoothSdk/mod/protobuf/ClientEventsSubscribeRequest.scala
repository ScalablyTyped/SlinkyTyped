package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientEventsSubscribeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientEventsSubscribeRequest")
@js.native
/**
  * Constructs a new ClientEventsSubscribeRequest.
  * @param [properties] Properties to set
  */
class ClientEventsSubscribeRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest {
  def this(properties: IClientEventsSubscribeRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientEventsSubscribeRequest")
@js.native
object ClientEventsSubscribeRequest extends js.Object {
  
  /**
    * Creates a new ClientEventsSubscribeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsSubscribeRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = js.native
  def create(properties: IClientEventsSubscribeRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = js.native
  
  /**
    * Decodes a ClientEventsSubscribeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsSubscribeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = js.native
  
  /**
    * Decodes a ClientEventsSubscribeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsSubscribeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = js.native
  
  /**
    * Encodes the specified ClientEventsSubscribeRequest message. Does not implicitly {@link ClientEventsSubscribeRequest.verify|verify} messages.
    * @param message ClientEventsSubscribeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientEventsSubscribeRequest): Writer = js.native
  def encode(message: IClientEventsSubscribeRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientEventsSubscribeRequest message, length delimited. Does not implicitly {@link ClientEventsSubscribeRequest.verify|verify} messages.
    * @param message ClientEventsSubscribeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientEventsSubscribeRequest): Writer = js.native
  def encodeDelimited(message: IClientEventsSubscribeRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientEventsSubscribeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsSubscribeRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = js.native
  
  /**
    * Creates a plain object from a ClientEventsSubscribeRequest message. Also converts values to other types if specified.
    * @param message ClientEventsSubscribeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientEventsSubscribeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
