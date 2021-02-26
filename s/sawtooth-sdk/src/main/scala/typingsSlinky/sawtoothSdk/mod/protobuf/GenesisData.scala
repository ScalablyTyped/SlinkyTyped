package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IGenesisData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GenesisData")
@js.native
/**
  * Constructs a new GenesisData.
  * @param [properties] Properties to set
  */
class GenesisData ()
  extends typingsSlinky.sawtoothSdk.protobufMod.GenesisData {
  def this(properties: IGenesisData) = this()
}
/* static members */
object GenesisData {
  
  /**
    * Creates a new GenesisData instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GenesisData instance
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.GenesisData = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.create")
  @js.native
  def create(properties: IGenesisData): typingsSlinky.sawtoothSdk.protobufMod.GenesisData = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.GenesisData = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.GenesisData = js.native
  /**
    * Decodes a GenesisData message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GenesisData
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.GenesisData = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.GenesisData = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.GenesisData = js.native
  /**
    * Decodes a GenesisData message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GenesisData
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.GenesisData = js.native
  
  /**
    * Encodes the specified GenesisData message. Does not implicitly {@link GenesisData.verify|verify} messages.
    * @param message GenesisData message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.encode")
  @js.native
  def encode(message: IGenesisData): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.encode")
  @js.native
  def encode(message: IGenesisData, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GenesisData message, length delimited. Does not implicitly {@link GenesisData.verify|verify} messages.
    * @param message GenesisData message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGenesisData): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGenesisData, writer: Writer): Writer = js.native
  
  /**
    * Creates a GenesisData message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GenesisData
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.GenesisData = js.native
  
  /**
    * Creates a plain object from a GenesisData message. Also converts values to other types if specified.
    * @param message GenesisData
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.GenesisData): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.GenesisData, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GenesisData message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
