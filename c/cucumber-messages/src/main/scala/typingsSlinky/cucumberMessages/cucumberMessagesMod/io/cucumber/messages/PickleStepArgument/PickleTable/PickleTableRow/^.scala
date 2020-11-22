package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.IPickleTableRow
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow")
@js.native
object ^ extends js.Object {
  
  /**
    * Creates a new PickleTableRow instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleTableRow instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
  def create(properties: IPickleTableRow): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
  
  /**
    * Decodes a PickleTableRow message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleTableRow
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
  
  /**
    * Decodes a PickleTableRow message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleTableRow
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
  
  /**
    * Encodes the specified PickleTableRow message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.verify|verify} messages.
    * @param message PickleTableRow message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPickleTableRow): Writer = js.native
  def encode(message: IPickleTableRow, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PickleTableRow message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.verify|verify} messages.
    * @param message PickleTableRow message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPickleTableRow): Writer = js.native
  def encodeDelimited(message: IPickleTableRow, writer: Writer): Writer = js.native
  
  /**
    * Creates a PickleTableRow message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleTableRow
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
  
  /**
    * Creates a plain object from a PickleTableRow message. Also converts values to other types if specified.
    * @param message PickleTableRow
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PickleTableRow message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
