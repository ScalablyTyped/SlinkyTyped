package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunTestStep. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunTestStep")
@js.native
/**
  * Constructs a new CommandRunTestStep.
  * @param [properties] Properties to set
  */
class CommandRunTestStep () extends ICommandRunTestStep {
  def this(properties: ICommandRunTestStep) = this()
  
  /** CommandRunTestStep actionId. */
  @JSName("actionId")
  var actionId_CommandRunTestStep: String = js.native
  
  /** CommandRunTestStep stepDefinitionId. */
  @JSName("stepDefinitionId")
  var stepDefinitionId_CommandRunTestStep: String = js.native
  
  /** CommandRunTestStep stepMatchArguments. */
  @JSName("stepMatchArguments")
  var stepMatchArguments_CommandRunTestStep: js.Array[IStepMatchArgument] = js.native
  
  /** CommandRunTestStep testCaseId. */
  @JSName("testCaseId")
  var testCaseId_CommandRunTestStep: String = js.native
  
  /**
    * Converts this CommandRunTestStep to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunTestStep")
@js.native
object CommandRunTestStep extends js.Object {
  
  /**
    * Creates a new CommandRunTestStep instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunTestStep instance
    */
  def create(): CommandRunTestStep = js.native
  def create(properties: ICommandRunTestStep): CommandRunTestStep = js.native
  
  /**
    * Decodes a CommandRunTestStep message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunTestStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): CommandRunTestStep = js.native
  def decode(reader: Reader, length: Double): CommandRunTestStep = js.native
  def decode(reader: js.typedarray.Uint8Array): CommandRunTestStep = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): CommandRunTestStep = js.native
  
  /**
    * Decodes a CommandRunTestStep message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunTestStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): CommandRunTestStep = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): CommandRunTestStep = js.native
  
  /**
    * Encodes the specified CommandRunTestStep message. Does not implicitly {@link io.cucumber.messages.CommandRunTestStep.verify|verify} messages.
    * @param message CommandRunTestStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICommandRunTestStep): Writer = js.native
  def encode(message: ICommandRunTestStep, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandRunTestStep message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunTestStep.verify|verify} messages.
    * @param message CommandRunTestStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICommandRunTestStep): Writer = js.native
  def encodeDelimited(message: ICommandRunTestStep, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandRunTestStep message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunTestStep
    */
  def fromObject(`object`: StringDictionary[js.Any]): CommandRunTestStep = js.native
  
  /**
    * Creates a plain object from a CommandRunTestStep message. Also converts values to other types if specified.
    * @param message CommandRunTestStep
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: CommandRunTestStep): StringDictionary[js.Any] = js.native
  def toObject(message: CommandRunTestStep, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandRunTestStep message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
