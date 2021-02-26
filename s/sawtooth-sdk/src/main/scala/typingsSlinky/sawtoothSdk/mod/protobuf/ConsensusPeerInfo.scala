package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusPeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo")
@js.native
/**
  * Constructs a new ConsensusPeerInfo.
  * @param [properties] Properties to set
  */
class ConsensusPeerInfo ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusPeerInfo {
  def this(properties: IConsensusPeerInfo) = this()
}
/* static members */
object ConsensusPeerInfo {
  
  /**
    * Creates a new ConsensusPeerInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusPeerInfo instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.create")
  @js.native
  def create(properties: IConsensusPeerInfo): typingsSlinky.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  /**
    * Decodes a ConsensusPeerInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusPeerInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  /**
    * Decodes a ConsensusPeerInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusPeerInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  
  /**
    * Encodes the specified ConsensusPeerInfo message. Does not implicitly {@link ConsensusPeerInfo.verify|verify} messages.
    * @param message ConsensusPeerInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.encode")
  @js.native
  def encode(message: IConsensusPeerInfo): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.encode")
  @js.native
  def encode(message: IConsensusPeerInfo, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusPeerInfo message, length delimited. Does not implicitly {@link ConsensusPeerInfo.verify|verify} messages.
    * @param message ConsensusPeerInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusPeerInfo): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusPeerInfo, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusPeerInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusPeerInfo
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  
  /**
    * Creates a plain object from a ConsensusPeerInfo message. Also converts values to other types if specified.
    * @param message ConsensusPeerInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusPeerInfo): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusPeerInfo, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusPeerInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
