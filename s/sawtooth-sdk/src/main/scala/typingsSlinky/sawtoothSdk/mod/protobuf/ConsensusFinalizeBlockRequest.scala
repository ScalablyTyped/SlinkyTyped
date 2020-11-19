package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusFinalizeBlockRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest")
@js.native
/**
  * Constructs a new ConsensusFinalizeBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusFinalizeBlockRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest {
  def this(properties: IConsensusFinalizeBlockRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockRequest")
@js.native
object ConsensusFinalizeBlockRequest extends js.Object {
  
  /**
    * Creates a new ConsensusFinalizeBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusFinalizeBlockRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  def create(properties: IConsensusFinalizeBlockRequest): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  
  /**
    * Decodes a ConsensusFinalizeBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusFinalizeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  
  /**
    * Decodes a ConsensusFinalizeBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusFinalizeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  
  /**
    * Encodes the specified ConsensusFinalizeBlockRequest message. Does not implicitly {@link ConsensusFinalizeBlockRequest.verify|verify} messages.
    * @param message ConsensusFinalizeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusFinalizeBlockRequest): Writer = js.native
  def encode(message: IConsensusFinalizeBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusFinalizeBlockRequest message, length delimited. Does not implicitly {@link ConsensusFinalizeBlockRequest.verify|verify} messages.
    * @param message ConsensusFinalizeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusFinalizeBlockRequest): Writer = js.native
  def encodeDelimited(message: IConsensusFinalizeBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusFinalizeBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusFinalizeBlockRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusFinalizeBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusFinalizeBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusFinalizeBlockRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusFinalizeBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
