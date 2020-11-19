package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientEventsGetRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientEventsGetRequest")
@js.native
/**
  * Constructs a new ClientEventsGetRequest.
  * @param [properties] Properties to set
  */
class ClientEventsGetRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetRequest {
  def this(properties: IClientEventsGetRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientEventsGetRequest")
@js.native
object ClientEventsGetRequest extends js.Object {
  
  /**
    * Creates a new ClientEventsGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsGetRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  def create(properties: IClientEventsGetRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  
  /**
    * Decodes a ClientEventsGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  
  /**
    * Decodes a ClientEventsGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  
  /**
    * Encodes the specified ClientEventsGetRequest message. Does not implicitly {@link ClientEventsGetRequest.verify|verify} messages.
    * @param message ClientEventsGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientEventsGetRequest): Writer = js.native
  def encode(message: IClientEventsGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientEventsGetRequest message, length delimited. Does not implicitly {@link ClientEventsGetRequest.verify|verify} messages.
    * @param message ClientEventsGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientEventsGetRequest): Writer = js.native
  def encodeDelimited(message: IClientEventsGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientEventsGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsGetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  
  /**
    * Creates a plain object from a ClientEventsGetRequest message. Also converts values to other types if specified.
    * @param message ClientEventsGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientEventsGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
