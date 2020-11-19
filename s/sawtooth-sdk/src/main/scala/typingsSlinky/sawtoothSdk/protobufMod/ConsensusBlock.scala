package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusBlock")
@js.native
/**
  * Constructs a new ConsensusBlock.
  * @param [properties] Properties to set
  */
class ConsensusBlock () extends IConsensusBlock {
  def this(properties: IConsensusBlock) = this()
  
  /** ConsensusBlock blockId. */
  @JSName("blockId")
  var blockId_ConsensusBlock: js.typedarray.Uint8Array = js.native
  
  /** ConsensusBlock blockNum. */
  @JSName("blockNum")
  var blockNum_ConsensusBlock: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /** ConsensusBlock payload. */
  @JSName("payload")
  var payload_ConsensusBlock: js.typedarray.Uint8Array = js.native
  
  /** ConsensusBlock previousId. */
  @JSName("previousId")
  var previousId_ConsensusBlock: js.typedarray.Uint8Array = js.native
  
  /** ConsensusBlock signerId. */
  @JSName("signerId")
  var signerId_ConsensusBlock: js.typedarray.Uint8Array = js.native
  
  /** ConsensusBlock summary. */
  @JSName("summary")
  var summary_ConsensusBlock: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this ConsensusBlock to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusBlock")
@js.native
object ConsensusBlock extends js.Object {
  
  /**
    * Creates a new ConsensusBlock instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBlock instance
    */
  def create(): ConsensusBlock = js.native
  def create(properties: IConsensusBlock): ConsensusBlock = js.native
  
  /**
    * Decodes a ConsensusBlock message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBlock
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusBlock = js.native
  def decode(reader: Reader, length: Double): ConsensusBlock = js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusBlock = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusBlock = js.native
  
  /**
    * Decodes a ConsensusBlock message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBlock
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusBlock = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusBlock = js.native
  
  /**
    * Encodes the specified ConsensusBlock message. Does not implicitly {@link ConsensusBlock.verify|verify} messages.
    * @param message ConsensusBlock message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusBlock): Writer = js.native
  def encode(message: IConsensusBlock, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusBlock message, length delimited. Does not implicitly {@link ConsensusBlock.verify|verify} messages.
    * @param message ConsensusBlock message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusBlock): Writer = js.native
  def encodeDelimited(message: IConsensusBlock, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusBlock message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBlock
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusBlock = js.native
  
  /**
    * Creates a plain object from a ConsensusBlock message. Also converts values to other types if specified.
    * @param message ConsensusBlock
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusBlock): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusBlock, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusBlock message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
