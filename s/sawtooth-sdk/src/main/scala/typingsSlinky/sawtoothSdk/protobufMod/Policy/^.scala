package typingsSlinky.sawtoothSdk.protobufMod.Policy

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Policy")
@js.native
object ^ extends js.Object {
  
  /**
    * Creates a new Policy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Policy instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  def create(properties: IPolicy): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  
  /**
    * Decodes a Policy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  
  /**
    * Decodes a Policy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  
  /**
    * Encodes the specified Policy message. Does not implicitly {@link Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPolicy): Writer = js.native
  def encode(message: IPolicy, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Policy message, length delimited. Does not implicitly {@link Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPolicy): Writer = js.native
  def encodeDelimited(message: IPolicy, writer: Writer): Writer = js.native
  
  /**
    * Creates a Policy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Policy
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  
  /**
    * Creates a plain object from a Policy message. Also converts values to other types if specified.
    * @param message Policy
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Policy): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Policy, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Policy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
