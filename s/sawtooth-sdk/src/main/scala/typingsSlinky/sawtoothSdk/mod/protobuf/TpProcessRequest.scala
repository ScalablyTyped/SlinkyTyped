package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ITpProcessRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.TpProcessRequest")
@js.native
/**
  * Constructs a new TpProcessRequest.
  * @param [properties] Properties to set
  */
class TpProcessRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.TpProcessRequest {
  def this(properties: ITpProcessRequest) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.TpProcessRequest")
@js.native
object TpProcessRequest extends js.Object {
  /**
    * Creates a new TpProcessRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpProcessRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  def create(properties: ITpProcessRequest): typingsSlinky.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  /**
    * Decodes a TpProcessRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpProcessRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  /**
    * Decodes a TpProcessRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpProcessRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  /**
    * Encodes the specified TpProcessRequest message. Does not implicitly {@link TpProcessRequest.verify|verify} messages.
    * @param message TpProcessRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpProcessRequest): Writer = js.native
  def encode(message: ITpProcessRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TpProcessRequest message, length delimited. Does not implicitly {@link TpProcessRequest.verify|verify} messages.
    * @param message TpProcessRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpProcessRequest): Writer = js.native
  def encodeDelimited(message: ITpProcessRequest, writer: Writer): Writer = js.native
  /**
    * Creates a TpProcessRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpProcessRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  /**
    * Creates a plain object from a TpProcessRequest message. Also converts values to other types if specified.
    * @param message TpProcessRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpProcessRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.TpProcessRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpProcessRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

