package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Role")
@js.native
/**
  * Constructs a new Role.
  * @param [properties] Properties to set
  */
class Role () extends IRole {
  def this(properties: IRole) = this()
  
  /** Role name. */
  @JSName("name")
  var name_Role: String = js.native
  
  /** Role policyName. */
  @JSName("policyName")
  var policyName_Role: String = js.native
  
  /**
    * Converts this Role to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object Role {
  
  /**
    * Creates a new Role instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Role instance
    */
  @JSImport("sawtooth-sdk/protobuf", "Role.create")
  @js.native
  def create(): Role = js.native
  @JSImport("sawtooth-sdk/protobuf", "Role.create")
  @js.native
  def create(properties: IRole): Role = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "Role.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): Role = js.native
  @JSImport("sawtooth-sdk/protobuf", "Role.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Role = js.native
  /**
    * Decodes a Role message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Role
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "Role.decode")
  @js.native
  def decode(reader: Reader): Role = js.native
  @JSImport("sawtooth-sdk/protobuf", "Role.decode")
  @js.native
  def decode(reader: Reader, length: Double): Role = js.native
  
  @JSImport("sawtooth-sdk/protobuf", "Role.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): Role = js.native
  /**
    * Decodes a Role message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Role
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "Role.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Role = js.native
  
  /**
    * Encodes the specified Role message. Does not implicitly {@link Role.verify|verify} messages.
    * @param message Role message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "Role.encode")
  @js.native
  def encode(message: IRole): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "Role.encode")
  @js.native
  def encode(message: IRole, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Role message, length delimited. Does not implicitly {@link Role.verify|verify} messages.
    * @param message Role message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "Role.encodeDelimited")
  @js.native
  def encodeDelimited(message: IRole): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "Role.encodeDelimited")
  @js.native
  def encodeDelimited(message: IRole, writer: Writer): Writer = js.native
  
  /**
    * Creates a Role message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Role
    */
  @JSImport("sawtooth-sdk/protobuf", "Role.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Role = js.native
  
  /**
    * Creates a plain object from a Role message. Also converts values to other types if specified.
    * @param message Role
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "Role.toObject")
  @js.native
  def toObject(message: Role): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "Role.toObject")
  @js.native
  def toObject(message: Role, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Role message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "Role.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
