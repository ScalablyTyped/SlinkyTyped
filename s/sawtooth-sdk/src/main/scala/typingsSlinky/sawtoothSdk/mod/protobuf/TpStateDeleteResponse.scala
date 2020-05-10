package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITpStateDeleteResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.TpStateDeleteResponse")
@js.native
/**
  * Constructs a new TpStateDeleteResponse.
  * @param [properties] Properties to set
  */
class TpStateDeleteResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse {
  def this(properties: ITpStateDeleteResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.TpStateDeleteResponse")
@js.native
object TpStateDeleteResponse extends js.Object {
  /**
    * Creates a new TpStateDeleteResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateDeleteResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse = js.native
  def create(properties: ITpStateDeleteResponse): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse = js.native
  /**
    * Decodes a TpStateDeleteResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateDeleteResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse = js.native
  /**
    * Decodes a TpStateDeleteResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateDeleteResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse = js.native
  /**
    * Encodes the specified TpStateDeleteResponse message. Does not implicitly {@link TpStateDeleteResponse.verify|verify} messages.
    * @param message TpStateDeleteResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpStateDeleteResponse): Writer = js.native
  def encode(message: ITpStateDeleteResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TpStateDeleteResponse message, length delimited. Does not implicitly {@link TpStateDeleteResponse.verify|verify} messages.
    * @param message TpStateDeleteResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpStateDeleteResponse): Writer = js.native
  def encodeDelimited(message: ITpStateDeleteResponse, writer: Writer): Writer = js.native
  /**
    * Creates a TpStateDeleteResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateDeleteResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse = js.native
  /**
    * Creates a plain object from a TpStateDeleteResponse message. Also converts values to other types if specified.
    * @param message TpStateDeleteResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpStateDeleteResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val AUTHORIZATION_ERROR: typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status.AUTHORIZATION_ERROR with Double = js.native
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status with Double] = js.native
  }
  
}

