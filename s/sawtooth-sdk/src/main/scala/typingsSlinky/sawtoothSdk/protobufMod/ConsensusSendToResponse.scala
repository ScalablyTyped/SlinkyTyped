package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse")
@js.native
/**
  * Constructs a new ConsensusSendToResponse.
  * @param [properties] Properties to set
  */
class ConsensusSendToResponse () extends IConsensusSendToResponse {
  def this(properties: IConsensusSendToResponse) = this()
  
  /** ConsensusSendToResponse status. */
  @JSName("status")
  var status_ConsensusSendToResponse: Status = js.native
  
  /**
    * Converts this ConsensusSendToResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusSendToResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ val BAD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status.BAD_REQUEST with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ val SERVICE_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status.SERVICE_ERROR with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status.STATUS_UNSET with Double = js.native
    
    @js.native
    sealed trait UNKNOWN_PEER extends Status
    /* 5 */ val UNKNOWN_PEER: typingsSlinky.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status.UNKNOWN_PEER with Double = js.native
  }
  
  /**
    * Creates a new ConsensusSendToResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSendToResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.create")
  @js.native
  def create(): ConsensusSendToResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.create")
  @js.native
  def create(properties: IConsensusSendToResponse): ConsensusSendToResponse = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusSendToResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusSendToResponse = js.native
  /**
    * Decodes a ConsensusSendToResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSendToResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.decode")
  @js.native
  def decode(reader: Reader): ConsensusSendToResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusSendToResponse = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusSendToResponse = js.native
  /**
    * Decodes a ConsensusSendToResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSendToResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusSendToResponse = js.native
  
  /**
    * Encodes the specified ConsensusSendToResponse message. Does not implicitly {@link ConsensusSendToResponse.verify|verify} messages.
    * @param message ConsensusSendToResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.encode")
  @js.native
  def encode(message: IConsensusSendToResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.encode")
  @js.native
  def encode(message: IConsensusSendToResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusSendToResponse message, length delimited. Does not implicitly {@link ConsensusSendToResponse.verify|verify} messages.
    * @param message ConsensusSendToResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSendToResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSendToResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusSendToResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSendToResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusSendToResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusSendToResponse message. Also converts values to other types if specified.
    * @param message ConsensusSendToResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.toObject")
  @js.native
  def toObject(message: ConsensusSendToResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.toObject")
  @js.native
  def toObject(message: ConsensusSendToResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusSendToResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSendToResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
