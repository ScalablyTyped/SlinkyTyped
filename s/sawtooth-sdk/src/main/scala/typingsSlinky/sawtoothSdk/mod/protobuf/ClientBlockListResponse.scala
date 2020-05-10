package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientBlockListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientBlockListResponse")
@js.native
/**
  * Constructs a new ClientBlockListResponse.
  * @param [properties] Properties to set
  */
class ClientBlockListResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse {
  def this(properties: IClientBlockListResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientBlockListResponse")
@js.native
object ClientBlockListResponse extends js.Object {
  /**
    * Creates a new ClientBlockListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockListResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  def create(properties: IClientBlockListResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  /**
    * Decodes a ClientBlockListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  /**
    * Decodes a ClientBlockListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  /**
    * Encodes the specified ClientBlockListResponse message. Does not implicitly {@link ClientBlockListResponse.verify|verify} messages.
    * @param message ClientBlockListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBlockListResponse): Writer = js.native
  def encode(message: IClientBlockListResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientBlockListResponse message, length delimited. Does not implicitly {@link ClientBlockListResponse.verify|verify} messages.
    * @param message ClientBlockListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBlockListResponse): Writer = js.native
  def encodeDelimited(message: IClientBlockListResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientBlockListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockListResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  /**
    * Creates a plain object from a ClientBlockListResponse message. Also converts values to other types if specified.
    * @param message ClientBlockListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientBlockListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.INTERNAL_ERROR with Double = js.native
    /* 8 */ val INVALID_ID: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.INVALID_ID with Double = js.native
    /* 6 */ val INVALID_PAGING: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.INVALID_PAGING with Double = js.native
    /* 7 */ val INVALID_SORT: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.INVALID_SORT with Double = js.native
    /* 3 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.NOT_READY with Double = js.native
    /* 5 */ val NO_RESOURCE: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.NO_RESOURCE with Double = js.native
    /* 4 */ val NO_ROOT: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.NO_ROOT with Double = js.native
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.ClientBlockListResponse.Status with Double] = js.native
  }
  
}

