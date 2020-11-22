package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StepDefinitionPattern. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinitionPattern")
@js.native
/**
  * Constructs a new StepDefinitionPattern.
  * @param [properties] Properties to set
  */
class StepDefinitionPattern () extends IStepDefinitionPattern {
  def this(properties: IStepDefinitionPattern) = this()
  
  /** StepDefinitionPattern source. */
  @JSName("source")
  var source_StepDefinitionPattern: String = js.native
  
  /**
    * Converts this StepDefinitionPattern to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** StepDefinitionPattern type. */
  @JSName("type")
  var type_StepDefinitionPattern: StepDefinitionPatternType = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinitionPattern")
@js.native
object StepDefinitionPattern extends js.Object {
  
  /**
    * Creates a new StepDefinitionPattern instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StepDefinitionPattern instance
    */
  def create(): StepDefinitionPattern = js.native
  def create(properties: IStepDefinitionPattern): StepDefinitionPattern = js.native
  
  /**
    * Decodes a StepDefinitionPattern message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StepDefinitionPattern
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): StepDefinitionPattern = js.native
  def decode(reader: Reader, length: Double): StepDefinitionPattern = js.native
  def decode(reader: js.typedarray.Uint8Array): StepDefinitionPattern = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): StepDefinitionPattern = js.native
  
  /**
    * Decodes a StepDefinitionPattern message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StepDefinitionPattern
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): StepDefinitionPattern = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): StepDefinitionPattern = js.native
  
  /**
    * Encodes the specified StepDefinitionPattern message. Does not implicitly {@link io.cucumber.messages.StepDefinitionPattern.verify|verify} messages.
    * @param message StepDefinitionPattern message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IStepDefinitionPattern): Writer = js.native
  def encode(message: IStepDefinitionPattern, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StepDefinitionPattern message, length delimited. Does not implicitly {@link io.cucumber.messages.StepDefinitionPattern.verify|verify} messages.
    * @param message StepDefinitionPattern message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IStepDefinitionPattern): Writer = js.native
  def encodeDelimited(message: IStepDefinitionPattern, writer: Writer): Writer = js.native
  
  /**
    * Creates a StepDefinitionPattern message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StepDefinitionPattern
    */
  def fromObject(`object`: StringDictionary[js.Any]): StepDefinitionPattern = js.native
  
  /**
    * Creates a plain object from a StepDefinitionPattern message. Also converts values to other types if specified.
    * @param message StepDefinitionPattern
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: StepDefinitionPattern): StringDictionary[js.Any] = js.native
  def toObject(message: StepDefinitionPattern, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StepDefinitionPattern message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
