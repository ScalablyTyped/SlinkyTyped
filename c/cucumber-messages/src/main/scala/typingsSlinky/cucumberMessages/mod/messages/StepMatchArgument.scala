package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IStepMatchArgument
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.IGroup
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single argument extracted from a step match and passed to a step definition.
  * This is used for the following purposes:
  * - Construct an argument to pass to a step definition (possibly through a parameter type transform)
  * - Highlight the matched parameter in rich formatters such as the HTML formatter
  *
  * This message closely matches the `Argument` class in the `cucumber-expressions` library.
  */
@JSImport("cucumber-messages", "messages.StepMatchArgument")
@js.native
/**
  * Constructs a new StepMatchArgument.
  * @param [properties] Properties to set
  */
class StepMatchArgument ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument {
  def this(properties: IStepMatchArgument) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.StepMatchArgument")
@js.native
object StepMatchArgument extends js.Object {
  
  /**
    * Creates a new StepMatchArgument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StepMatchArgument instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  def create(properties: IStepMatchArgument): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  
  /**
    * Decodes a StepMatchArgument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StepMatchArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  
  /**
    * Decodes a StepMatchArgument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StepMatchArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  
  /**
    * Encodes the specified StepMatchArgument message. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.verify|verify} messages.
    * @param message StepMatchArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IStepMatchArgument): Writer = js.native
  def encode(message: IStepMatchArgument, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StepMatchArgument message, length delimited. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.verify|verify} messages.
    * @param message StepMatchArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IStepMatchArgument): Writer = js.native
  def encodeDelimited(message: IStepMatchArgument, writer: Writer): Writer = js.native
  
  /**
    * Creates a StepMatchArgument message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StepMatchArgument
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument = js.native
  
  /**
    * Creates a plain object from a StepMatchArgument message. Also converts values to other types if specified.
    * @param message StepMatchArgument
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StepMatchArgument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Represents a Group. */
  @js.native
  /**
    * Constructs a new Group.
    * @param [properties] Properties to set
    */
  class Group ()
    extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group {
    def this(properties: IGroup) = this()
  }
  /* static members */
  @js.native
  object Group extends js.Object {
    
    /**
      * Creates a new Group instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Group instance
      */
    def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    def create(properties: IGroup): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    
    /**
      * Decodes a Group message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Group
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    
    /**
      * Decodes a Group message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Group
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    
    /**
      * Encodes the specified Group message. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.Group.verify|verify} messages.
      * @param message Group message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IGroup): Writer = js.native
    def encode(message: IGroup, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Group message, length delimited. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.Group.verify|verify} messages.
      * @param message Group message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IGroup): Writer = js.native
    def encodeDelimited(message: IGroup, writer: Writer): Writer = js.native
    
    /**
      * Creates a Group message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Group
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group = js.native
    
    /**
      * Creates a plain object from a Group message. Also converts values to other types if specified.
      * @param message Group
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(
      message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group
    ): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.Group,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Group message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
