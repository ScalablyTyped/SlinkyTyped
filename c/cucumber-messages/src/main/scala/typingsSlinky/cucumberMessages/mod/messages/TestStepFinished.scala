package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestStepFinished
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestStepFinished. */
@JSImport("cucumber-messages", "messages.TestStepFinished")
@js.native
/**
  * Constructs a new TestStepFinished.
  * @param [properties] Properties to set
  */
class TestStepFinished ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepFinished {
  def this(properties: ITestStepFinished) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.TestStepFinished")
@js.native
object TestStepFinished extends js.Object {
  
  /**
    * Creates a new TestStepFinished instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestStepFinished instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepFinished = js.native
  def create(properties: ITestStepFinished): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepFinished = js.native
  
  /**
    * Decodes a TestStepFinished message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestStepFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepFinished = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepFinished = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepFinished = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepFinished = js.native
  
  /**
    * Decodes a TestStepFinished message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestStepFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepFinished = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepFinished = js.native
  
  /**
    * Encodes the specified TestStepFinished message. Does not implicitly {@link io.cucumber.messages.TestStepFinished.verify|verify} messages.
    * @param message TestStepFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestStepFinished): Writer = js.native
  def encode(message: ITestStepFinished, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestStepFinished message, length delimited. Does not implicitly {@link io.cucumber.messages.TestStepFinished.verify|verify} messages.
    * @param message TestStepFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestStepFinished): Writer = js.native
  def encodeDelimited(message: ITestStepFinished, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestStepFinished message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestStepFinished
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepFinished = js.native
  
  /**
    * Creates a plain object from a TestStepFinished message. Also converts values to other types if specified.
    * @param message TestStepFinished
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepFinished): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepFinished,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestStepFinished message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
