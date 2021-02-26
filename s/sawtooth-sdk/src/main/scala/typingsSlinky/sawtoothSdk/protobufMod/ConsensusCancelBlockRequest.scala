package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest")
@js.native
/**
  * Constructs a new ConsensusCancelBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusCancelBlockRequest () extends IConsensusCancelBlockRequest {
  def this(properties: IConsensusCancelBlockRequest) = this()
  
  /**
    * Converts this ConsensusCancelBlockRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusCancelBlockRequest {
  
  /**
    * Creates a new ConsensusCancelBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCancelBlockRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.create")
  @js.native
  def create(): ConsensusCancelBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.create")
  @js.native
  def create(properties: IConsensusCancelBlockRequest): ConsensusCancelBlockRequest = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusCancelBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusCancelBlockRequest = js.native
  /**
    * Decodes a ConsensusCancelBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCancelBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.decode")
  @js.native
  def decode(reader: Reader): ConsensusCancelBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusCancelBlockRequest = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusCancelBlockRequest = js.native
  /**
    * Decodes a ConsensusCancelBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCancelBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusCancelBlockRequest = js.native
  
  /**
    * Encodes the specified ConsensusCancelBlockRequest message. Does not implicitly {@link ConsensusCancelBlockRequest.verify|verify} messages.
    * @param message ConsensusCancelBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.encode")
  @js.native
  def encode(message: IConsensusCancelBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.encode")
  @js.native
  def encode(message: IConsensusCancelBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusCancelBlockRequest message, length delimited. Does not implicitly {@link ConsensusCancelBlockRequest.verify|verify} messages.
    * @param message ConsensusCancelBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusCancelBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusCancelBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusCancelBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCancelBlockRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusCancelBlockRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusCancelBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusCancelBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.toObject")
  @js.native
  def toObject(message: ConsensusCancelBlockRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.toObject")
  @js.native
  def toObject(message: ConsensusCancelBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusCancelBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
