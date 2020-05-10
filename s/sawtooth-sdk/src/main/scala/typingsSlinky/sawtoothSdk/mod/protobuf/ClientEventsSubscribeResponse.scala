package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientEventsSubscribeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientEventsSubscribeResponse")
@js.native
/**
  * Constructs a new ClientEventsSubscribeResponse.
  * @param [properties] Properties to set
  */
class ClientEventsSubscribeResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse {
  def this(properties: IClientEventsSubscribeResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientEventsSubscribeResponse")
@js.native
object ClientEventsSubscribeResponse extends js.Object {
  /**
    * Creates a new ClientEventsSubscribeResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsSubscribeResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse = js.native
  def create(properties: IClientEventsSubscribeResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse = js.native
  /**
    * Decodes a ClientEventsSubscribeResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsSubscribeResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse = js.native
  /**
    * Decodes a ClientEventsSubscribeResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsSubscribeResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse = js.native
  /**
    * Encodes the specified ClientEventsSubscribeResponse message. Does not implicitly {@link ClientEventsSubscribeResponse.verify|verify} messages.
    * @param message ClientEventsSubscribeResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientEventsSubscribeResponse): Writer = js.native
  def encode(message: IClientEventsSubscribeResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientEventsSubscribeResponse message, length delimited. Does not implicitly {@link ClientEventsSubscribeResponse.verify|verify} messages.
    * @param message ClientEventsSubscribeResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientEventsSubscribeResponse): Writer = js.native
  def encodeDelimited(message: IClientEventsSubscribeResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientEventsSubscribeResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsSubscribeResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse = js.native
  /**
    * Creates a plain object from a ClientEventsSubscribeResponse message. Also converts values to other types if specified.
    * @param message ClientEventsSubscribeResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientEventsSubscribeResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val INVALID_FILTER: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse.Status.INVALID_FILTER with Double = js.native
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse.Status.STATUS_UNSET with Double = js.native
    /* 3 */ val UNKNOWN_BLOCK: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse.Status.UNKNOWN_BLOCK with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse.Status with Double
      ] = js.native
  }
  
}

