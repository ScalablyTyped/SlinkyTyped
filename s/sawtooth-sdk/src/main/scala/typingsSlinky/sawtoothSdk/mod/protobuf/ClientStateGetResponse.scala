package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IClientStateGetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse")
@js.native
/**
  * Constructs a new ClientStateGetResponse.
  * @param [properties] Properties to set
  */
class ClientStateGetResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse {
  def this(properties: IClientStateGetResponse) = this()
}
/* static members */
object ClientStateGetResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse.Status with Double] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 6 */ val INVALID_ADDRESS: typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.INVALID_ADDRESS with Double = js.native
    
    /* 7 */ val INVALID_ROOT: typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.INVALID_ROOT with Double = js.native
    
    /* 3 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.NOT_READY with Double = js.native
    
    /* 5 */ val NO_RESOURCE: typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.NO_RESOURCE with Double = js.native
    
    /* 4 */ val NO_ROOT: typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.NO_ROOT with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientStateGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateGetResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.create")
  @js.native
  def create(properties: IClientStateGetResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  /**
    * Decodes a ClientStateGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  /**
    * Decodes a ClientStateGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  
  /**
    * Encodes the specified ClientStateGetResponse message. Does not implicitly {@link ClientStateGetResponse.verify|verify} messages.
    * @param message ClientStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.encode")
  @js.native
  def encode(message: IClientStateGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.encode")
  @js.native
  def encode(message: IClientStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientStateGetResponse message, length delimited. Does not implicitly {@link ClientStateGetResponse.verify|verify} messages.
    * @param message ClientStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientStateGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientStateGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateGetResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientStateGetResponse message. Also converts values to other types if specified.
    * @param message ClientStateGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientStateGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientStateGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
