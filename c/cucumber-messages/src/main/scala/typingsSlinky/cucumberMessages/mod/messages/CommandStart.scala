package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandStart
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandStart. */
@JSImport("cucumber-messages", "messages.CommandStart")
@js.native
/**
  * Constructs a new CommandStart.
  * @param [properties] Properties to set
  */
class CommandStart ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart {
  def this(properties: ICommandStart) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.CommandStart")
@js.native
object CommandStart extends js.Object {
  
  /**
    * Creates a new CommandStart instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandStart instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  def create(properties: ICommandStart): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  
  /**
    * Decodes a CommandStart message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandStart
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  
  /**
    * Decodes a CommandStart message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandStart
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  
  /**
    * Encodes the specified CommandStart message. Does not implicitly {@link io.cucumber.messages.CommandStart.verify|verify} messages.
    * @param message CommandStart message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICommandStart): Writer = js.native
  def encode(message: ICommandStart, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandStart message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandStart.verify|verify} messages.
    * @param message CommandStart message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICommandStart): Writer = js.native
  def encodeDelimited(message: ICommandStart, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandStart message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandStart
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  
  /**
    * Creates a plain object from a CommandStart message. Also converts values to other types if specified.
    * @param message CommandStart
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandStart message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
