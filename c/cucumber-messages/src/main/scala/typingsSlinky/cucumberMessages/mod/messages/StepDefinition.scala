package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IStepDefinition
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StepDefinition. */
@JSImport("cucumber-messages", "messages.StepDefinition")
@js.native
/**
  * Constructs a new StepDefinition.
  * @param [properties] Properties to set
  */
class StepDefinition ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinition {
  def this(properties: IStepDefinition) = this()
}
object StepDefinition {
  
  /**
    * Creates a new StepDefinition instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StepDefinition instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinition.create")
  @js.native
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinition = js.native
  @JSImport("cucumber-messages", "messages.StepDefinition.create")
  @js.native
  def create(properties: IStepDefinition): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinition = js.native
  
  @JSImport("cucumber-messages", "messages.StepDefinition.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinition = js.native
  @JSImport("cucumber-messages", "messages.StepDefinition.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinition = js.native
  /**
    * Decodes a StepDefinition message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StepDefinition
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinition.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinition = js.native
  @JSImport("cucumber-messages", "messages.StepDefinition.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinition = js.native
  
  @JSImport("cucumber-messages", "messages.StepDefinition.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinition = js.native
  /**
    * Decodes a StepDefinition message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StepDefinition
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinition.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinition = js.native
  
  /**
    * Encodes the specified StepDefinition message. Does not implicitly {@link io.cucumber.messages.StepDefinition.verify|verify} messages.
    * @param message StepDefinition message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinition.encode")
  @js.native
  def encode(message: IStepDefinition): Writer = js.native
  @JSImport("cucumber-messages", "messages.StepDefinition.encode")
  @js.native
  def encode(message: IStepDefinition, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StepDefinition message, length delimited. Does not implicitly {@link io.cucumber.messages.StepDefinition.verify|verify} messages.
    * @param message StepDefinition message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinition.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStepDefinition): Writer = js.native
  @JSImport("cucumber-messages", "messages.StepDefinition.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStepDefinition, writer: Writer): Writer = js.native
  
  /**
    * Creates a StepDefinition message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StepDefinition
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinition.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinition = js.native
  
  /**
    * Creates a plain object from a StepDefinition message. Also converts values to other types if specified.
    * @param message StepDefinition
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinition.toObject")
  @js.native
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinition): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.StepDefinition.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepDefinition,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StepDefinition message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.StepDefinition.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
