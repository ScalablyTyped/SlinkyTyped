package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest")
@js.native
/**
  * Constructs a new ConsensusBroadcastRequest.
  * @param [properties] Properties to set
  */
class ConsensusBroadcastRequest () extends IConsensusBroadcastRequest {
  def this(properties: IConsensusBroadcastRequest) = this()
  
  /**
    * Converts this ConsensusBroadcastRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusBroadcastRequest {
  
  /**
    * Creates a new ConsensusBroadcastRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBroadcastRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.create")
  @js.native
  def create(): ConsensusBroadcastRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.create")
  @js.native
  def create(properties: IConsensusBroadcastRequest): ConsensusBroadcastRequest = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusBroadcastRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusBroadcastRequest = js.native
  /**
    * Decodes a ConsensusBroadcastRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBroadcastRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.decode")
  @js.native
  def decode(reader: Reader): ConsensusBroadcastRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusBroadcastRequest = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusBroadcastRequest = js.native
  /**
    * Decodes a ConsensusBroadcastRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBroadcastRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusBroadcastRequest = js.native
  
  /**
    * Encodes the specified ConsensusBroadcastRequest message. Does not implicitly {@link ConsensusBroadcastRequest.verify|verify} messages.
    * @param message ConsensusBroadcastRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.encode")
  @js.native
  def encode(message: IConsensusBroadcastRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.encode")
  @js.native
  def encode(message: IConsensusBroadcastRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusBroadcastRequest message, length delimited. Does not implicitly {@link ConsensusBroadcastRequest.verify|verify} messages.
    * @param message ConsensusBroadcastRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusBroadcastRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusBroadcastRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusBroadcastRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBroadcastRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusBroadcastRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusBroadcastRequest message. Also converts values to other types if specified.
    * @param message ConsensusBroadcastRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.toObject")
  @js.native
  def toObject(message: ConsensusBroadcastRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.toObject")
  @js.native
  def toObject(message: ConsensusBroadcastRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusBroadcastRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
