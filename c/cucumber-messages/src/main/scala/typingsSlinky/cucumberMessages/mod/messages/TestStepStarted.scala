package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestStepStarted
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestStepStarted. */
@JSImport("cucumber-messages", "messages.TestStepStarted")
@js.native
/**
  * Constructs a new TestStepStarted.
  * @param [properties] Properties to set
  */
class TestStepStarted ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted {
  def this(properties: ITestStepStarted) = this()
}
object TestStepStarted {
  
  /**
    * Creates a new TestStepStarted instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestStepStarted instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.create")
  @js.native
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.create")
  @js.native
  def create(properties: ITestStepStarted): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  
  @JSImport("cucumber-messages", "messages.TestStepStarted.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  /**
    * Decodes a TestStepStarted message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestStepStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  
  @JSImport("cucumber-messages", "messages.TestStepStarted.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  /**
    * Decodes a TestStepStarted message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestStepStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  
  /**
    * Encodes the specified TestStepStarted message. Does not implicitly {@link io.cucumber.messages.TestStepStarted.verify|verify} messages.
    * @param message TestStepStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.encode")
  @js.native
  def encode(message: ITestStepStarted): Writer = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.encode")
  @js.native
  def encode(message: ITestStepStarted, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestStepStarted message, length delimited. Does not implicitly {@link io.cucumber.messages.TestStepStarted.verify|verify} messages.
    * @param message TestStepStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestStepStarted): Writer = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestStepStarted, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestStepStarted message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestStepStarted
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted = js.native
  
  /**
    * Creates a plain object from a TestStepStarted message. Also converts values to other types if specified.
    * @param message TestStepStarted
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.toObject")
  @js.native
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.TestStepStarted.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestStepStarted,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestStepStarted message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestStepStarted.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
