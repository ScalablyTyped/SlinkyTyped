package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestResult
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestResult. */
@JSImport("cucumber-messages", "messages.TestResult")
@js.native
/**
  * Constructs a new TestResult.
  * @param [properties] Properties to set
  */
class TestResult ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult {
  def this(properties: ITestResult) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.TestResult")
@js.native
object TestResult extends js.Object {
  
  /**
    * Creates a new TestResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestResult instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  def create(properties: ITestResult): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  
  /**
    * Decodes a TestResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  
  /**
    * Decodes a TestResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  
  /**
    * Encodes the specified TestResult message. Does not implicitly {@link io.cucumber.messages.TestResult.verify|verify} messages.
    * @param message TestResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestResult): Writer = js.native
  def encode(message: ITestResult, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestResult message, length delimited. Does not implicitly {@link io.cucumber.messages.TestResult.verify|verify} messages.
    * @param message TestResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestResult): Writer = js.native
  def encodeDelimited(message: ITestResult, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestResult
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  
  /**
    * Creates a plain object from a TestResult message. Also converts values to other types if specified.
    * @param message TestResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /**
    * Status of a step. Can also represent status of a Pickle (aggregated
    * from the status of its steps).
    *
    * The ordinal values of statuses are significant. The status of a Pickle
    * is determined by the union of statuses of its steps. The
    * status of the Pickle is the status with the highest ordinal
    * in the enum.
    *
    * For example, if a pickle has steps with statuses passed, undefined and skipped,
    * then the pickle's status is undefined.
    */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status with Double
      ] = js.native
    
    /* 5 */ val AMBIGUOUS: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.AMBIGUOUS with Double = js.native
    
    /* 6 */ val FAILED: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.FAILED with Double = js.native
    
    /* 1 */ val PASSED: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.PASSED with Double = js.native
    
    /* 3 */ val PENDING: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.PENDING with Double = js.native
    
    /* 2 */ val SKIPPED: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.SKIPPED with Double = js.native
    
    /* 4 */ val UNDEFINED: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.UNDEFINED with Double = js.native
    
    /* 0 */ val UNKNOWN: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.UNKNOWN with Double = js.native
  }
}
