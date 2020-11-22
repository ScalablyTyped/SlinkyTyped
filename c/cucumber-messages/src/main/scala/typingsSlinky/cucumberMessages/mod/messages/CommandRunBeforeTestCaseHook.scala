package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandRunBeforeTestCaseHook
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunBeforeTestCaseHook. */
@JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook")
@js.native
/**
  * Constructs a new CommandRunBeforeTestCaseHook.
  * @param [properties] Properties to set
  */
class CommandRunBeforeTestCaseHook ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook {
  def this(properties: ICommandRunBeforeTestCaseHook) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.CommandRunBeforeTestCaseHook")
@js.native
object CommandRunBeforeTestCaseHook extends js.Object {
  
  /**
    * Creates a new CommandRunBeforeTestCaseHook instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunBeforeTestCaseHook instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  def create(properties: ICommandRunBeforeTestCaseHook): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  
  /**
    * Decodes a CommandRunBeforeTestCaseHook message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunBeforeTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  
  /**
    * Decodes a CommandRunBeforeTestCaseHook message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunBeforeTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  
  /**
    * Encodes the specified CommandRunBeforeTestCaseHook message. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestCaseHook.verify|verify} messages.
    * @param message CommandRunBeforeTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICommandRunBeforeTestCaseHook): Writer = js.native
  def encode(message: ICommandRunBeforeTestCaseHook, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandRunBeforeTestCaseHook message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestCaseHook.verify|verify} messages.
    * @param message CommandRunBeforeTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICommandRunBeforeTestCaseHook): Writer = js.native
  def encodeDelimited(message: ICommandRunBeforeTestCaseHook, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandRunBeforeTestCaseHook message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunBeforeTestCaseHook
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook = js.native
  
  /**
    * Creates a plain object from a CommandRunBeforeTestCaseHook message. Also converts values to other types if specified.
    * @param message CommandRunBeforeTestCaseHook
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestCaseHook,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandRunBeforeTestCaseHook message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
