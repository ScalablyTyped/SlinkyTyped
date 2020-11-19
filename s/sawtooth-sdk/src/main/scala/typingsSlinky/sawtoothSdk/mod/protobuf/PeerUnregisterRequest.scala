package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IPeerUnregisterRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.PeerUnregisterRequest")
@js.native
/**
  * Constructs a new PeerUnregisterRequest.
  * @param [properties] Properties to set
  */
class PeerUnregisterRequest ()
  extends typingsSlinky.sawtoothSdk.protobufMod.PeerUnregisterRequest {
  def this(properties: IPeerUnregisterRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.PeerUnregisterRequest")
@js.native
object PeerUnregisterRequest extends js.Object {
  
  /**
    * Creates a new PeerUnregisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PeerUnregisterRequest instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.PeerUnregisterRequest = js.native
  def create(properties: IPeerUnregisterRequest): typingsSlinky.sawtoothSdk.protobufMod.PeerUnregisterRequest = js.native
  
  /**
    * Decodes a PeerUnregisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PeerUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.PeerUnregisterRequest = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.PeerUnregisterRequest = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.PeerUnregisterRequest = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.PeerUnregisterRequest = js.native
  
  /**
    * Decodes a PeerUnregisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PeerUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.PeerUnregisterRequest = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.PeerUnregisterRequest = js.native
  
  /**
    * Encodes the specified PeerUnregisterRequest message. Does not implicitly {@link PeerUnregisterRequest.verify|verify} messages.
    * @param message PeerUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPeerUnregisterRequest): Writer = js.native
  def encode(message: IPeerUnregisterRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PeerUnregisterRequest message, length delimited. Does not implicitly {@link PeerUnregisterRequest.verify|verify} messages.
    * @param message PeerUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPeerUnregisterRequest): Writer = js.native
  def encodeDelimited(message: IPeerUnregisterRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a PeerUnregisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PeerUnregisterRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.PeerUnregisterRequest = js.native
  
  /**
    * Creates a plain object from a PeerUnregisterRequest message. Also converts values to other types if specified.
    * @param message PeerUnregisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.PeerUnregisterRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.PeerUnregisterRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PeerUnregisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
