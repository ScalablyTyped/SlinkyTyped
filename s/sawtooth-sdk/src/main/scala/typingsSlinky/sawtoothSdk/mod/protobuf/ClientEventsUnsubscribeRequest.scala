package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientEventsUnsubscribeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientEventsUnsubscribeRequest")
@js.native
/**
  * Constructs a new ClientEventsUnsubscribeRequest.
  * @param [properties] Properties to set
  */
class ClientEventsUnsubscribeRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeRequest {
  def this(properties: IClientEventsUnsubscribeRequest) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientEventsUnsubscribeRequest")
@js.native
object ClientEventsUnsubscribeRequest extends js.Object {
  /**
    * Creates a new ClientEventsUnsubscribeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsUnsubscribeRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeRequest = js.native
  def create(properties: IClientEventsUnsubscribeRequest): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeRequest = js.native
  /**
    * Decodes a ClientEventsUnsubscribeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsUnsubscribeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeRequest = js.native
  /**
    * Decodes a ClientEventsUnsubscribeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsUnsubscribeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeRequest = js.native
  /**
    * Encodes the specified ClientEventsUnsubscribeRequest message. Does not implicitly {@link ClientEventsUnsubscribeRequest.verify|verify} messages.
    * @param message ClientEventsUnsubscribeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientEventsUnsubscribeRequest): Writer = js.native
  def encode(message: IClientEventsUnsubscribeRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientEventsUnsubscribeRequest message, length delimited. Does not implicitly {@link ClientEventsUnsubscribeRequest.verify|verify} messages.
    * @param message ClientEventsUnsubscribeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientEventsUnsubscribeRequest): Writer = js.native
  def encodeDelimited(message: IClientEventsUnsubscribeRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ClientEventsUnsubscribeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsUnsubscribeRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeRequest = js.native
  /**
    * Creates a plain object from a ClientEventsUnsubscribeRequest message. Also converts values to other types if specified.
    * @param message ClientEventsUnsubscribeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientEventsUnsubscribeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

