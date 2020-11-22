package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandRunBeforeTestRunHooks
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunBeforeTestRunHooks. */
@JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks")
@js.native
/**
  * Constructs a new CommandRunBeforeTestRunHooks.
  * @param [properties] Properties to set
  */
class CommandRunBeforeTestRunHooks ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks {
  def this(properties: ICommandRunBeforeTestRunHooks) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks")
@js.native
object CommandRunBeforeTestRunHooks extends js.Object {
  
  /**
    * Creates a new CommandRunBeforeTestRunHooks instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunBeforeTestRunHooks instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  def create(properties: ICommandRunBeforeTestRunHooks): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  
  /**
    * Decodes a CommandRunBeforeTestRunHooks message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunBeforeTestRunHooks
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  
  /**
    * Decodes a CommandRunBeforeTestRunHooks message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunBeforeTestRunHooks
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  
  /**
    * Encodes the specified CommandRunBeforeTestRunHooks message. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestRunHooks.verify|verify} messages.
    * @param message CommandRunBeforeTestRunHooks message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICommandRunBeforeTestRunHooks): Writer = js.native
  def encode(message: ICommandRunBeforeTestRunHooks, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandRunBeforeTestRunHooks message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestRunHooks.verify|verify} messages.
    * @param message CommandRunBeforeTestRunHooks message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICommandRunBeforeTestRunHooks): Writer = js.native
  def encodeDelimited(message: ICommandRunBeforeTestRunHooks, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandRunBeforeTestRunHooks message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunBeforeTestRunHooks
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  
  /**
    * Creates a plain object from a CommandRunBeforeTestRunHooks message. Also converts values to other types if specified.
    * @param message CommandRunBeforeTestRunHooks
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandRunBeforeTestRunHooks message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
