package typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IScenario
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.IExamples
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Scenario. */
@JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario")
@js.native
/**
  * Constructs a new Scenario.
  * @param [properties] Properties to set
  */
class Scenario ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario {
  def this(properties: IScenario) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Scenario")
@js.native
object Scenario extends js.Object {
  
  /**
    * Creates a new Scenario instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Scenario instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
  def create(properties: IScenario): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
  
  /**
    * Decodes a Scenario message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Scenario
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
  
  /**
    * Decodes a Scenario message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Scenario
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
  
  /**
    * Encodes the specified Scenario message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.verify|verify} messages.
    * @param message Scenario message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IScenario): Writer = js.native
  def encode(message: IScenario, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Scenario message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.verify|verify} messages.
    * @param message Scenario message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IScenario): Writer = js.native
  def encodeDelimited(message: IScenario, writer: Writer): Writer = js.native
  
  /**
    * Creates a Scenario message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Scenario
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario = js.native
  
  /**
    * Creates a plain object from a Scenario message. Also converts values to other types if specified.
    * @param message Scenario
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Scenario message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Represents an Examples. */
  @js.native
  /**
    * Constructs a new Examples.
    * @param [properties] Properties to set
    */
  class Examples ()
    extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples {
    def this(properties: IExamples) = this()
  }
  /* static members */
  @js.native
  object Examples extends js.Object {
    
    /**
      * Creates a new Examples instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Examples instance
      */
    def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
    def create(properties: IExamples): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
    
    /**
      * Decodes an Examples message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Examples
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
    
    /**
      * Decodes an Examples message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Examples
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
    
    /**
      * Encodes the specified Examples message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.verify|verify} messages.
      * @param message Examples message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IExamples): Writer = js.native
    def encode(message: IExamples, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Examples message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.verify|verify} messages.
      * @param message Examples message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IExamples): Writer = js.native
    def encodeDelimited(message: IExamples, writer: Writer): Writer = js.native
    
    /**
      * Creates an Examples message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Examples
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples = js.native
    
    /**
      * Creates a plain object from an Examples message. Also converts values to other types if specified.
      * @param message Examples
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(
      message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples
    ): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Examples message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
