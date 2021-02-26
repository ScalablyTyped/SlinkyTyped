package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IRoleList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.RoleList")
@js.native
/**
  * Constructs a new RoleList.
  * @param [properties] Properties to set
  */
class RoleList ()
  extends typingsSlinky.sawtoothSdk.protobufMod.RoleList {
  def this(properties: IRoleList) = this()
}
/* static members */
object RoleList {
  
  /**
    * Creates a new RoleList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RoleList instance
    */
  @JSImport("sawtooth-sdk", "protobuf.RoleList.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.RoleList = js.native
  @JSImport("sawtooth-sdk", "protobuf.RoleList.create")
  @js.native
  def create(properties: IRoleList): typingsSlinky.sawtoothSdk.protobufMod.RoleList = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.RoleList.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.RoleList = js.native
  @JSImport("sawtooth-sdk", "protobuf.RoleList.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.RoleList = js.native
  /**
    * Decodes a RoleList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RoleList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.RoleList.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.RoleList = js.native
  @JSImport("sawtooth-sdk", "protobuf.RoleList.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.RoleList = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.RoleList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.RoleList = js.native
  /**
    * Decodes a RoleList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RoleList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.RoleList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.RoleList = js.native
  
  /**
    * Encodes the specified RoleList message. Does not implicitly {@link RoleList.verify|verify} messages.
    * @param message RoleList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.RoleList.encode")
  @js.native
  def encode(message: IRoleList): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.RoleList.encode")
  @js.native
  def encode(message: IRoleList, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified RoleList message, length delimited. Does not implicitly {@link RoleList.verify|verify} messages.
    * @param message RoleList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.RoleList.encodeDelimited")
  @js.native
  def encodeDelimited(message: IRoleList): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.RoleList.encodeDelimited")
  @js.native
  def encodeDelimited(message: IRoleList, writer: Writer): Writer = js.native
  
  /**
    * Creates a RoleList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RoleList
    */
  @JSImport("sawtooth-sdk", "protobuf.RoleList.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.RoleList = js.native
  
  /**
    * Creates a plain object from a RoleList message. Also converts values to other types if specified.
    * @param message RoleList
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.RoleList.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.RoleList): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.RoleList.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.RoleList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a RoleList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.RoleList.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
