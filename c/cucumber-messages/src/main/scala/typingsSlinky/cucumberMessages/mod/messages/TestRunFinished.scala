package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestRunFinished
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestRunFinished. */
@JSImport("cucumber-messages", "messages.TestRunFinished")
@js.native
/**
  * Constructs a new TestRunFinished.
  * @param [properties] Properties to set
  */
class TestRunFinished ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunFinished {
  def this(properties: ITestRunFinished) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.TestRunFinished")
@js.native
object TestRunFinished extends js.Object {
  
  /**
    * Creates a new TestRunFinished instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestRunFinished instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunFinished = js.native
  def create(properties: ITestRunFinished): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunFinished = js.native
  
  /**
    * Decodes a TestRunFinished message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestRunFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunFinished = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunFinished = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunFinished = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunFinished = js.native
  
  /**
    * Decodes a TestRunFinished message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestRunFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunFinished = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunFinished = js.native
  
  /**
    * Encodes the specified TestRunFinished message. Does not implicitly {@link io.cucumber.messages.TestRunFinished.verify|verify} messages.
    * @param message TestRunFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestRunFinished): Writer = js.native
  def encode(message: ITestRunFinished, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestRunFinished message, length delimited. Does not implicitly {@link io.cucumber.messages.TestRunFinished.verify|verify} messages.
    * @param message TestRunFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestRunFinished): Writer = js.native
  def encodeDelimited(message: ITestRunFinished, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestRunFinished message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestRunFinished
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunFinished = js.native
  
  /**
    * Creates a plain object from a TestRunFinished message. Also converts values to other types if specified.
    * @param message TestRunFinished
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunFinished): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunFinished,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestRunFinished message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
