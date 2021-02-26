package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandRunAfterTestRunHooks
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunAfterTestRunHooks. */
@JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks")
@js.native
/**
  * Constructs a new CommandRunAfterTestRunHooks.
  * @param [properties] Properties to set
  */
class CommandRunAfterTestRunHooks ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestRunHooks {
  def this(properties: ICommandRunAfterTestRunHooks) = this()
}
object CommandRunAfterTestRunHooks {
  
  /**
    * Creates a new CommandRunAfterTestRunHooks instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunAfterTestRunHooks instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.create")
  @js.native
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestRunHooks = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.create")
  @js.native
  def create(properties: ICommandRunAfterTestRunHooks): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestRunHooks = js.native
  
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestRunHooks = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestRunHooks = js.native
  /**
    * Decodes a CommandRunAfterTestRunHooks message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunAfterTestRunHooks
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestRunHooks = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestRunHooks = js.native
  
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestRunHooks = js.native
  /**
    * Decodes a CommandRunAfterTestRunHooks message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunAfterTestRunHooks
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestRunHooks = js.native
  
  /**
    * Encodes the specified CommandRunAfterTestRunHooks message. Does not implicitly {@link io.cucumber.messages.CommandRunAfterTestRunHooks.verify|verify} messages.
    * @param message CommandRunAfterTestRunHooks message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.encode")
  @js.native
  def encode(message: ICommandRunAfterTestRunHooks): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.encode")
  @js.native
  def encode(message: ICommandRunAfterTestRunHooks, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandRunAfterTestRunHooks message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunAfterTestRunHooks.verify|verify} messages.
    * @param message CommandRunAfterTestRunHooks message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunAfterTestRunHooks): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunAfterTestRunHooks, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandRunAfterTestRunHooks message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunAfterTestRunHooks
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestRunHooks = js.native
  
  /**
    * Creates a plain object from a CommandRunAfterTestRunHooks message. Also converts values to other types if specified.
    * @param message CommandRunAfterTestRunHooks
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestRunHooks
  ): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestRunHooks,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandRunAfterTestRunHooks message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestRunHooks.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
