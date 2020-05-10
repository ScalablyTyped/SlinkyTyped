package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientEventsUnsubscribeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientEventsUnsubscribeResponse")
@js.native
/**
  * Constructs a new ClientEventsUnsubscribeResponse.
  * @param [properties] Properties to set
  */
class ClientEventsUnsubscribeResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse {
  def this(properties: IClientEventsUnsubscribeResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientEventsUnsubscribeResponse")
@js.native
object ClientEventsUnsubscribeResponse extends js.Object {
  /**
    * Creates a new ClientEventsUnsubscribeResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsUnsubscribeResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse = js.native
  def create(properties: IClientEventsUnsubscribeResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse = js.native
  /**
    * Decodes a ClientEventsUnsubscribeResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsUnsubscribeResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse = js.native
  /**
    * Decodes a ClientEventsUnsubscribeResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsUnsubscribeResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse = js.native
  /**
    * Encodes the specified ClientEventsUnsubscribeResponse message. Does not implicitly {@link ClientEventsUnsubscribeResponse.verify|verify} messages.
    * @param message ClientEventsUnsubscribeResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientEventsUnsubscribeResponse): Writer = js.native
  def encode(message: IClientEventsUnsubscribeResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientEventsUnsubscribeResponse message, length delimited. Does not implicitly {@link ClientEventsUnsubscribeResponse.verify|verify} messages.
    * @param message ClientEventsUnsubscribeResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientEventsUnsubscribeResponse): Writer = js.native
  def encodeDelimited(message: IClientEventsUnsubscribeResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientEventsUnsubscribeResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsUnsubscribeResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse = js.native
  /**
    * Creates a plain object from a ClientEventsUnsubscribeResponse message. Also converts values to other types if specified.
    * @param message ClientEventsUnsubscribeResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientEventsUnsubscribeResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse.Status.INTERNAL_ERROR with Double = js.native
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse.Status with Double
      ] = js.native
  }
  
}

