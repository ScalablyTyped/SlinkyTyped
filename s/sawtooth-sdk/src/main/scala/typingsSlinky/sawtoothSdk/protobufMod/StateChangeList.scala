package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "StateChangeList")
@js.native
/**
  * Constructs a new StateChangeList.
  * @param [properties] Properties to set
  */
class StateChangeList () extends IStateChangeList {
  def this(properties: IStateChangeList) = this()
  
  /** StateChangeList stateChanges. */
  @JSName("stateChanges")
  var stateChanges_StateChangeList: js.Array[IStateChange] = js.native
  
  /**
    * Converts this StateChangeList to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object StateChangeList {
  
  /**
    * Creates a new StateChangeList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StateChangeList instance
    */
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.create")
  @js.native
  def create(): StateChangeList = js.native
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.create")
  @js.native
  def create(properties: IStateChangeList): StateChangeList = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): StateChangeList = js.native
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): StateChangeList = js.native
  /**
    * Decodes a StateChangeList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StateChangeList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.decode")
  @js.native
  def decode(reader: Reader): StateChangeList = js.native
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.decode")
  @js.native
  def decode(reader: Reader, length: Double): StateChangeList = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): StateChangeList = js.native
  /**
    * Decodes a StateChangeList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StateChangeList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): StateChangeList = js.native
  
  /**
    * Encodes the specified StateChangeList message. Does not implicitly {@link StateChangeList.verify|verify} messages.
    * @param message StateChangeList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.encode")
  @js.native
  def encode(message: IStateChangeList): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.encode")
  @js.native
  def encode(message: IStateChangeList, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StateChangeList message, length delimited. Does not implicitly {@link StateChangeList.verify|verify} messages.
    * @param message StateChangeList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStateChangeList): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStateChangeList, writer: Writer): Writer = js.native
  
  /**
    * Creates a StateChangeList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StateChangeList
    */
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): StateChangeList = js.native
  
  /**
    * Creates a plain object from a StateChangeList message. Also converts values to other types if specified.
    * @param message StateChangeList
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.toObject")
  @js.native
  def toObject(message: StateChangeList): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.toObject")
  @js.native
  def toObject(message: StateChangeList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StateChangeList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
