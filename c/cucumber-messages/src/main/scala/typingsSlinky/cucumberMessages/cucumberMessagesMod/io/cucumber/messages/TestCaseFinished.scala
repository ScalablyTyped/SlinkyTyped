package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCaseFinished. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseFinished")
@js.native
/**
  * Constructs a new TestCaseFinished.
  * @param [properties] Properties to set
  */
class TestCaseFinished () extends ITestCaseFinished {
  def this(properties: ITestCaseFinished) = this()
  
  /** TestCaseFinished testCaseStartedId. */
  @JSName("testCaseStartedId")
  var testCaseStartedId_TestCaseFinished: String = js.native
  
  /**
    * Converts this TestCaseFinished to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseFinished")
@js.native
object TestCaseFinished extends js.Object {
  
  /**
    * Creates a new TestCaseFinished instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCaseFinished instance
    */
  def create(): TestCaseFinished = js.native
  def create(properties: ITestCaseFinished): TestCaseFinished = js.native
  
  /**
    * Decodes a TestCaseFinished message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCaseFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TestCaseFinished = js.native
  def decode(reader: Reader, length: Double): TestCaseFinished = js.native
  def decode(reader: js.typedarray.Uint8Array): TestCaseFinished = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): TestCaseFinished = js.native
  
  /**
    * Decodes a TestCaseFinished message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCaseFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TestCaseFinished = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): TestCaseFinished = js.native
  
  /**
    * Encodes the specified TestCaseFinished message. Does not implicitly {@link io.cucumber.messages.TestCaseFinished.verify|verify} messages.
    * @param message TestCaseFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestCaseFinished): Writer = js.native
  def encode(message: ITestCaseFinished, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestCaseFinished message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCaseFinished.verify|verify} messages.
    * @param message TestCaseFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestCaseFinished): Writer = js.native
  def encodeDelimited(message: ITestCaseFinished, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestCaseFinished message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCaseFinished
    */
  def fromObject(`object`: StringDictionary[js.Any]): TestCaseFinished = js.native
  
  /**
    * Creates a plain object from a TestCaseFinished message. Also converts values to other types if specified.
    * @param message TestCaseFinished
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TestCaseFinished): StringDictionary[js.Any] = js.native
  def toObject(message: TestCaseFinished, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestCaseFinished message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
