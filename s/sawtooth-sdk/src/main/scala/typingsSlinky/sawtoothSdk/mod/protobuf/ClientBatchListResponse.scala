package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBatchListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientBatchListResponse")
@js.native
/**
  * Constructs a new ClientBatchListResponse.
  * @param [properties] Properties to set
  */
class ClientBatchListResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse {
  def this(properties: IClientBatchListResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientBatchListResponse")
@js.native
object ClientBatchListResponse extends js.Object {
  /**
    * Creates a new ClientBatchListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchListResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  def create(properties: IClientBatchListResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  /**
    * Decodes a ClientBatchListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  /**
    * Decodes a ClientBatchListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  /**
    * Encodes the specified ClientBatchListResponse message. Does not implicitly {@link ClientBatchListResponse.verify|verify} messages.
    * @param message ClientBatchListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBatchListResponse): Writer = js.native
  def encode(message: IClientBatchListResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientBatchListResponse message, length delimited. Does not implicitly {@link ClientBatchListResponse.verify|verify} messages.
    * @param message ClientBatchListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBatchListResponse): Writer = js.native
  def encodeDelimited(message: IClientBatchListResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientBatchListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchListResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  /**
    * Creates a plain object from a ClientBatchListResponse message. Also converts values to other types if specified.
    * @param message ClientBatchListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientBatchListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INTERNAL_ERROR with Double = js.native
    /* 8 */ val INVALID_ID: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INVALID_ID with Double = js.native
    /* 6 */ val INVALID_PAGING: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INVALID_PAGING with Double = js.native
    /* 7 */ val INVALID_SORT: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INVALID_SORT with Double = js.native
    /* 3 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.NOT_READY with Double = js.native
    /* 5 */ val NO_RESOURCE: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.NO_RESOURCE with Double = js.native
    /* 4 */ val NO_ROOT: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.NO_ROOT with Double = js.native
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.ClientBatchListResponse.Status with Double] = js.native
  }
  
}

