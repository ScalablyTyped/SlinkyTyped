package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientEventsGetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse")
@js.native
/**
  * Constructs a new ClientEventsGetResponse.
  * @param [properties] Properties to set
  */
class ClientEventsGetResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse {
  def this(properties: IClientEventsGetResponse) = this()
}
/* static members */
object ClientEventsGetResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status with Double] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 3 */ val INVALID_FILTER: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.INVALID_FILTER with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.STATUS_UNSET with Double = js.native
    
    /* 4 */ val UNKNOWN_BLOCK: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
  
  /**
    * Creates a new ClientEventsGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsGetResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.create")
  @js.native
  def create(properties: IClientEventsGetResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  /**
    * Decodes a ClientEventsGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  /**
    * Decodes a ClientEventsGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  
  /**
    * Encodes the specified ClientEventsGetResponse message. Does not implicitly {@link ClientEventsGetResponse.verify|verify} messages.
    * @param message ClientEventsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.encode")
  @js.native
  def encode(message: IClientEventsGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.encode")
  @js.native
  def encode(message: IClientEventsGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientEventsGetResponse message, length delimited. Does not implicitly {@link ClientEventsGetResponse.verify|verify} messages.
    * @param message ClientEventsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientEventsGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientEventsGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientEventsGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsGetResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientEventsGetResponse message. Also converts values to other types if specified.
    * @param message ClientEventsGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientEventsGetResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientEventsGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
