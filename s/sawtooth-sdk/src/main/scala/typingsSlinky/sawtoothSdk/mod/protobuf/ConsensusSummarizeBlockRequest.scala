package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusSummarizeBlockRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockRequest")
@js.native
/**
  * Constructs a new ConsensusSummarizeBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusSummarizeBlockRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest {
  def this(properties: IConsensusSummarizeBlockRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockRequest")
@js.native
object ConsensusSummarizeBlockRequest extends js.Object {
  
  /**
    * Creates a new ConsensusSummarizeBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSummarizeBlockRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = js.native
  def create(properties: IConsensusSummarizeBlockRequest): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = js.native
  
  /**
    * Decodes a ConsensusSummarizeBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSummarizeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = js.native
  
  /**
    * Decodes a ConsensusSummarizeBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSummarizeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = js.native
  
  /**
    * Encodes the specified ConsensusSummarizeBlockRequest message. Does not implicitly {@link ConsensusSummarizeBlockRequest.verify|verify} messages.
    * @param message ConsensusSummarizeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusSummarizeBlockRequest): Writer = js.native
  def encode(message: IConsensusSummarizeBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusSummarizeBlockRequest message, length delimited. Does not implicitly {@link ConsensusSummarizeBlockRequest.verify|verify} messages.
    * @param message ConsensusSummarizeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusSummarizeBlockRequest): Writer = js.native
  def encodeDelimited(message: IConsensusSummarizeBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusSummarizeBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSummarizeBlockRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusSummarizeBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusSummarizeBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusSummarizeBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
