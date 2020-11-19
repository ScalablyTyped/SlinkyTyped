package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse")
@js.native
/**
  * Constructs a new ConsensusCancelBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusCancelBlockResponse () extends IConsensusCancelBlockResponse {
  def this(properties: IConsensusCancelBlockResponse) = this()
  
  /** ConsensusCancelBlockResponse status. */
  @JSName("status")
  var status_ConsensusCancelBlockResponse: Status = js.native
  
  /**
    * Converts this ConsensusCancelBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse")
@js.native
object ConsensusCancelBlockResponse extends js.Object {
  
  /**
    * Creates a new ConsensusCancelBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCancelBlockResponse instance
    */
  def create(): ConsensusCancelBlockResponse = js.native
  def create(properties: IConsensusCancelBlockResponse): ConsensusCancelBlockResponse = js.native
  
  /**
    * Decodes a ConsensusCancelBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCancelBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusCancelBlockResponse = js.native
  def decode(reader: Reader, length: Double): ConsensusCancelBlockResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusCancelBlockResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusCancelBlockResponse = js.native
  
  /**
    * Decodes a ConsensusCancelBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCancelBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusCancelBlockResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusCancelBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusCancelBlockResponse message. Does not implicitly {@link ConsensusCancelBlockResponse.verify|verify} messages.
    * @param message ConsensusCancelBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusCancelBlockResponse): Writer = js.native
  def encode(message: IConsensusCancelBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusCancelBlockResponse message, length delimited. Does not implicitly {@link ConsensusCancelBlockResponse.verify|verify} messages.
    * @param message ConsensusCancelBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusCancelBlockResponse): Writer = js.native
  def encodeDelimited(message: IConsensusCancelBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusCancelBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCancelBlockResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusCancelBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusCancelBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusCancelBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusCancelBlockResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusCancelBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusCancelBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  @js.native
  sealed trait Status extends js.Object
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ @js.native
    object BAD_REQUEST extends TopLevel[BAD_REQUEST with Double]
    
    @js.native
    sealed trait INVALID_STATE extends Status
    /* 5 */ @js.native
    object INVALID_STATE extends TopLevel[INVALID_STATE with Double]
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ @js.native
    object NOT_READY extends TopLevel[NOT_READY with Double]
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ @js.native
    object SERVICE_ERROR extends TopLevel[SERVICE_ERROR with Double]
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
  }
}
