package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.attachment
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.commandActionComplete
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.commandError
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.commandGenerateSnippet
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.commandInitializeTestCase
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.commandRunAfterTestCaseHook
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.commandRunAfterTestRunHooks
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.commandRunBeforeTestCaseHook
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.commandRunBeforeTestRunHooks
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.commandRunTestStep
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.commandStart
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.gherkinDocument
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.hook
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.pickle
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.pickleAccepted
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.pickleRejected
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.source
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.stepDefinition
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.testCase
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.testCaseFinished
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.testCasePrepared
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.testCaseStarted
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.testRunFinished
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.testRunStarted
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.testStepFinished
import typingsSlinky.cucumberMessages.cucumberMessagesStrings.testStepStarted
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All the messages that are passed between different components/processes are Envelope
  * messages.
  */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope")
@js.native
/**
  * Constructs a new Envelope.
  * @param [properties] Properties to set
  */
class Envelope () extends IEnvelope {
  def this(properties: IEnvelope) = this()
  
  /** Envelope commandError. */
  @JSName("commandError")
  var commandError_Envelope: String = js.native
  
  /** Envelope message. */
  var message: js.UndefOr[
    source | gherkinDocument | pickle | attachment | testCaseStarted | testStepStarted | testStepFinished | testCaseFinished | pickleAccepted | pickleRejected | testCasePrepared | testRunStarted | testRunFinished | commandStart | commandActionComplete | commandRunBeforeTestRunHooks | commandInitializeTestCase | commandRunBeforeTestCaseHook | commandRunTestStep | commandRunAfterTestCaseHook | commandRunAfterTestRunHooks | commandGenerateSnippet | commandError | testCase | stepDefinition | hook
  ] = js.native
  
  /**
    * Converts this Envelope to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope")
@js.native
object Envelope extends js.Object {
  
  /**
    * Creates a new Envelope instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Envelope instance
    */
  def create(): Envelope = js.native
  def create(properties: IEnvelope): Envelope = js.native
  
  /**
    * Decodes an Envelope message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Envelope
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Envelope = js.native
  def decode(reader: Reader, length: Double): Envelope = js.native
  def decode(reader: js.typedarray.Uint8Array): Envelope = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Envelope = js.native
  
  /**
    * Decodes an Envelope message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Envelope
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Envelope = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): Envelope = js.native
  
  /**
    * Encodes the specified Envelope message. Does not implicitly {@link io.cucumber.messages.Envelope.verify|verify} messages.
    * @param message Envelope message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEnvelope): Writer = js.native
  def encode(message: IEnvelope, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Envelope message, length delimited. Does not implicitly {@link io.cucumber.messages.Envelope.verify|verify} messages.
    * @param message Envelope message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEnvelope): Writer = js.native
  def encodeDelimited(message: IEnvelope, writer: Writer): Writer = js.native
  
  /**
    * Creates an Envelope message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Envelope
    */
  def fromObject(`object`: StringDictionary[js.Any]): Envelope = js.native
  
  /**
    * Creates a plain object from an Envelope message. Also converts values to other types if specified.
    * @param message Envelope
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Envelope): StringDictionary[js.Any] = js.native
  def toObject(message: Envelope, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Envelope message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
