package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITpStateGetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse")
@js.native
/**
  * Constructs a new TpStateGetResponse.
  * @param [properties] Properties to set
  */
class TpStateGetResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse {
  def this(properties: ITpStateGetResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse")
@js.native
object TpStateGetResponse extends js.Object {
  /**
    * Creates a new TpStateGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateGetResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  def create(properties: ITpStateGetResponse): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  /**
    * Decodes a TpStateGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  /**
    * Decodes a TpStateGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  /**
    * Encodes the specified TpStateGetResponse message. Does not implicitly {@link TpStateGetResponse.verify|verify} messages.
    * @param message TpStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpStateGetResponse): Writer = js.native
  def encode(message: ITpStateGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TpStateGetResponse message, length delimited. Does not implicitly {@link TpStateGetResponse.verify|verify} messages.
    * @param message TpStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpStateGetResponse): Writer = js.native
  def encodeDelimited(message: ITpStateGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a TpStateGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  /**
    * Creates a plain object from a TpStateGetResponse message. Also converts values to other types if specified.
    * @param message TpStateGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpStateGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val AUTHORIZATION_ERROR: typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse.Status.AUTHORIZATION_ERROR with Double = js.native
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.TpStateGetResponse.Status with Double] = js.native
  }
  
}

