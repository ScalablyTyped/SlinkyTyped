package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusBroadcastResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusBroadcastResponse")
@js.native
/**
  * Constructs a new ConsensusBroadcastResponse.
  * @param [properties] Properties to set
  */
class ConsensusBroadcastResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse {
  def this(properties: IConsensusBroadcastResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusBroadcastResponse")
@js.native
object ConsensusBroadcastResponse extends js.Object {
  
  /**
    * Creates a new ConsensusBroadcastResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBroadcastResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  def create(properties: IConsensusBroadcastResponse): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  
  /**
    * Decodes a ConsensusBroadcastResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBroadcastResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  
  /**
    * Decodes a ConsensusBroadcastResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBroadcastResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  
  /**
    * Encodes the specified ConsensusBroadcastResponse message. Does not implicitly {@link ConsensusBroadcastResponse.verify|verify} messages.
    * @param message ConsensusBroadcastResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusBroadcastResponse): Writer = js.native
  def encode(message: IConsensusBroadcastResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusBroadcastResponse message, length delimited. Does not implicitly {@link ConsensusBroadcastResponse.verify|verify} messages.
    * @param message ConsensusBroadcastResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusBroadcastResponse): Writer = js.native
  def encodeDelimited(message: IConsensusBroadcastResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusBroadcastResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBroadcastResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusBroadcastResponse message. Also converts values to other types if specified.
    * @param message ConsensusBroadcastResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusBroadcastResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status with Double
      ] = js.native
    
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status.STATUS_UNSET with Double = js.native
  }
}
