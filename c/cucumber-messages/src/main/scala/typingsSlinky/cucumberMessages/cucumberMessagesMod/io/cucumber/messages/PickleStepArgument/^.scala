package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IPickleStepArgument
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument")
@js.native
object ^ extends js.Object {
  
  /**
    * Creates a new PickleStepArgument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleStepArgument instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  def create(properties: IPickleStepArgument): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  
  /**
    * Decodes a PickleStepArgument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleStepArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  
  /**
    * Decodes a PickleStepArgument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleStepArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  
  /**
    * Encodes the specified PickleStepArgument message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.verify|verify} messages.
    * @param message PickleStepArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPickleStepArgument): Writer = js.native
  def encode(message: IPickleStepArgument, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PickleStepArgument message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.verify|verify} messages.
    * @param message PickleStepArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPickleStepArgument): Writer = js.native
  def encodeDelimited(message: IPickleStepArgument, writer: Writer): Writer = js.native
  
  /**
    * Creates a PickleStepArgument message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleStepArgument
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  
  /**
    * Creates a plain object from a PickleStepArgument message. Also converts values to other types if specified.
    * @param message PickleStepArgument
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PickleStepArgument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
