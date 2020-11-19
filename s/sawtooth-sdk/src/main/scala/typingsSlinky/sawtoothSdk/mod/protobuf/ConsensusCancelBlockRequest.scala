package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusCancelBlockRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest")
@js.native
/**
  * Constructs a new ConsensusCancelBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusCancelBlockRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest {
  def this(properties: IConsensusCancelBlockRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest")
@js.native
object ConsensusCancelBlockRequest extends js.Object {
  
  /**
    * Creates a new ConsensusCancelBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCancelBlockRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  def create(properties: IConsensusCancelBlockRequest): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  
  /**
    * Decodes a ConsensusCancelBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCancelBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  
  /**
    * Decodes a ConsensusCancelBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCancelBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  
  /**
    * Encodes the specified ConsensusCancelBlockRequest message. Does not implicitly {@link ConsensusCancelBlockRequest.verify|verify} messages.
    * @param message ConsensusCancelBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusCancelBlockRequest): Writer = js.native
  def encode(message: IConsensusCancelBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusCancelBlockRequest message, length delimited. Does not implicitly {@link ConsensusCancelBlockRequest.verify|verify} messages.
    * @param message ConsensusCancelBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusCancelBlockRequest): Writer = js.native
  def encodeDelimited(message: IConsensusCancelBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusCancelBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCancelBlockRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusCancelBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusCancelBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusCancelBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
