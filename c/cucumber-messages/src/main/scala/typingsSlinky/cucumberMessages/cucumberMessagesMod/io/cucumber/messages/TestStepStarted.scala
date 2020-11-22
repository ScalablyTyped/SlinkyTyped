package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestStepStarted. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepStarted")
@js.native
/**
  * Constructs a new TestStepStarted.
  * @param [properties] Properties to set
  */
class TestStepStarted () extends ITestStepStarted {
  def this(properties: ITestStepStarted) = this()
  
  /** TestStepStarted testCaseStartedId. */
  @JSName("testCaseStartedId")
  var testCaseStartedId_TestStepStarted: String = js.native
  
  /** TestStepStarted testStepId. */
  @JSName("testStepId")
  var testStepId_TestStepStarted: String = js.native
  
  /**
    * Converts this TestStepStarted to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepStarted")
@js.native
object TestStepStarted extends js.Object {
  
  /**
    * Creates a new TestStepStarted instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestStepStarted instance
    */
  def create(): TestStepStarted = js.native
  def create(properties: ITestStepStarted): TestStepStarted = js.native
  
  /**
    * Decodes a TestStepStarted message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestStepStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TestStepStarted = js.native
  def decode(reader: Reader, length: Double): TestStepStarted = js.native
  def decode(reader: js.typedarray.Uint8Array): TestStepStarted = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): TestStepStarted = js.native
  
  /**
    * Decodes a TestStepStarted message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestStepStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TestStepStarted = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): TestStepStarted = js.native
  
  /**
    * Encodes the specified TestStepStarted message. Does not implicitly {@link io.cucumber.messages.TestStepStarted.verify|verify} messages.
    * @param message TestStepStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestStepStarted): Writer = js.native
  def encode(message: ITestStepStarted, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestStepStarted message, length delimited. Does not implicitly {@link io.cucumber.messages.TestStepStarted.verify|verify} messages.
    * @param message TestStepStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestStepStarted): Writer = js.native
  def encodeDelimited(message: ITestStepStarted, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestStepStarted message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestStepStarted
    */
  def fromObject(`object`: StringDictionary[js.Any]): TestStepStarted = js.native
  
  /**
    * Creates a plain object from a TestStepStarted message. Also converts values to other types if specified.
    * @param message TestStepStarted
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TestStepStarted): StringDictionary[js.Any] = js.native
  def toObject(message: TestStepStarted, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestStepStarted message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
