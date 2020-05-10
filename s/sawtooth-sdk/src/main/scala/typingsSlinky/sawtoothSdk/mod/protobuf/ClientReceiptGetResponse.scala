package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientReceiptGetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse")
@js.native
/**
  * Constructs a new ClientReceiptGetResponse.
  * @param [properties] Properties to set
  */
class ClientReceiptGetResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse {
  def this(properties: IClientReceiptGetResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse")
@js.native
object ClientReceiptGetResponse extends js.Object {
  /**
    * Creates a new ClientReceiptGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientReceiptGetResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  def create(properties: IClientReceiptGetResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  /**
    * Decodes a ClientReceiptGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientReceiptGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  /**
    * Decodes a ClientReceiptGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientReceiptGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  /**
    * Encodes the specified ClientReceiptGetResponse message. Does not implicitly {@link ClientReceiptGetResponse.verify|verify} messages.
    * @param message ClientReceiptGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientReceiptGetResponse): Writer = js.native
  def encode(message: IClientReceiptGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientReceiptGetResponse message, length delimited. Does not implicitly {@link ClientReceiptGetResponse.verify|verify} messages.
    * @param message ClientReceiptGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientReceiptGetResponse): Writer = js.native
  def encodeDelimited(message: IClientReceiptGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientReceiptGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientReceiptGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  /**
    * Creates a plain object from a ClientReceiptGetResponse message. Also converts values to other types if specified.
    * @param message ClientReceiptGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientReceiptGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.INTERNAL_ERROR with Double = js.native
    /* 8 */ val INVALID_ID: typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.INVALID_ID with Double = js.native
    /* 5 */ val NO_RESOURCE: typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.NO_RESOURCE with Double = js.native
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status with Double
      ] = js.native
  }
  
}

