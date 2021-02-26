package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GetPeersRequest")
@js.native
/**
  * Constructs a new GetPeersRequest.
  * @param [properties] Properties to set
  */
class GetPeersRequest () extends IGetPeersRequest {
  def this(properties: IGetPeersRequest) = this()
  
  /**
    * Converts this GetPeersRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object GetPeersRequest {
  
  /**
    * Creates a new GetPeersRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetPeersRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.create")
  @js.native
  def create(): GetPeersRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.create")
  @js.native
  def create(properties: IGetPeersRequest): GetPeersRequest = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): GetPeersRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): GetPeersRequest = js.native
  /**
    * Decodes a GetPeersRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetPeersRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.decode")
  @js.native
  def decode(reader: Reader): GetPeersRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): GetPeersRequest = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): GetPeersRequest = js.native
  /**
    * Decodes a GetPeersRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetPeersRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GetPeersRequest = js.native
  
  /**
    * Encodes the specified GetPeersRequest message. Does not implicitly {@link GetPeersRequest.verify|verify} messages.
    * @param message GetPeersRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.encode")
  @js.native
  def encode(message: IGetPeersRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.encode")
  @js.native
  def encode(message: IGetPeersRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetPeersRequest message, length delimited. Does not implicitly {@link GetPeersRequest.verify|verify} messages.
    * @param message GetPeersRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetPeersRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetPeersRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetPeersRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetPeersRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GetPeersRequest = js.native
  
  /**
    * Creates a plain object from a GetPeersRequest message. Also converts values to other types if specified.
    * @param message GetPeersRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.toObject")
  @js.native
  def toObject(message: GetPeersRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.toObject")
  @js.native
  def toObject(message: GetPeersRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetPeersRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "GetPeersRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
