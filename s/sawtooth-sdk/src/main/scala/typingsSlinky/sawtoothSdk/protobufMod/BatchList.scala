package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "BatchList")
@js.native
/**
  * Constructs a new BatchList.
  * @param [properties] Properties to set
  */
class BatchList () extends IBatchList {
  def this(properties: IBatchList) = this()
  
  /** BatchList batches. */
  @JSName("batches")
  var batches_BatchList: js.Array[IBatch] = js.native
  
  /**
    * Converts this BatchList to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object BatchList {
  
  /**
    * Creates a new BatchList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchList instance
    */
  @JSImport("sawtooth-sdk/protobuf", "BatchList.create")
  @js.native
  def create(): BatchList = js.native
  @JSImport("sawtooth-sdk/protobuf", "BatchList.create")
  @js.native
  def create(properties: IBatchList): BatchList = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "BatchList.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): BatchList = js.native
  @JSImport("sawtooth-sdk/protobuf", "BatchList.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): BatchList = js.native
  /**
    * Decodes a BatchList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "BatchList.decode")
  @js.native
  def decode(reader: Reader): BatchList = js.native
  @JSImport("sawtooth-sdk/protobuf", "BatchList.decode")
  @js.native
  def decode(reader: Reader, length: Double): BatchList = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "BatchList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): BatchList = js.native
  /**
    * Decodes a BatchList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "BatchList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): BatchList = js.native
  
  /**
    * Encodes the specified BatchList message. Does not implicitly {@link BatchList.verify|verify} messages.
    * @param message BatchList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "BatchList.encode")
  @js.native
  def encode(message: IBatchList): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "BatchList.encode")
  @js.native
  def encode(message: IBatchList, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified BatchList message, length delimited. Does not implicitly {@link BatchList.verify|verify} messages.
    * @param message BatchList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "BatchList.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchList): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "BatchList.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchList, writer: Writer): Writer = js.native
  
  /**
    * Creates a BatchList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchList
    */
  @JSImport("sawtooth-sdk/protobuf", "BatchList.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): BatchList = js.native
  
  /**
    * Creates a plain object from a BatchList message. Also converts values to other types if specified.
    * @param message BatchList
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "BatchList.toObject")
  @js.native
  def toObject(message: BatchList): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "BatchList.toObject")
  @js.native
  def toObject(message: BatchList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a BatchList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "BatchList.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
