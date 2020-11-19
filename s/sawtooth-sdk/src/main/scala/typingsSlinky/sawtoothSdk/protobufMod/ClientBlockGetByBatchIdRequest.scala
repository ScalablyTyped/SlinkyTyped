package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByBatchIdRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByBatchIdRequest () extends IClientBlockGetByBatchIdRequest {
  def this(properties: IClientBlockGetByBatchIdRequest) = this()
  
  /** ClientBlockGetByBatchIdRequest batchId. */
  @JSName("batchId")
  var batchId_ClientBlockGetByBatchIdRequest: String = js.native
  
  /**
    * Converts this ClientBlockGetByBatchIdRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest")
@js.native
object ClientBlockGetByBatchIdRequest extends js.Object {
  
  /**
    * Creates a new ClientBlockGetByBatchIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByBatchIdRequest instance
    */
  def create(): ClientBlockGetByBatchIdRequest = js.native
  def create(properties: IClientBlockGetByBatchIdRequest): ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByBatchIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientBlockGetByBatchIdRequest = js.native
  def decode(reader: Reader, length: Double): ClientBlockGetByBatchIdRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): ClientBlockGetByBatchIdRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByBatchIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientBlockGetByBatchIdRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Encodes the specified ClientBlockGetByBatchIdRequest message. Does not implicitly {@link ClientBlockGetByBatchIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBlockGetByBatchIdRequest): Writer = js.native
  def encode(message: IClientBlockGetByBatchIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockGetByBatchIdRequest message, length delimited. Does not implicitly {@link ClientBlockGetByBatchIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBlockGetByBatchIdRequest): Writer = js.native
  def encodeDelimited(message: IClientBlockGetByBatchIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockGetByBatchIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByBatchIdRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockGetByBatchIdRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByBatchIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientBlockGetByBatchIdRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ClientBlockGetByBatchIdRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockGetByBatchIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
