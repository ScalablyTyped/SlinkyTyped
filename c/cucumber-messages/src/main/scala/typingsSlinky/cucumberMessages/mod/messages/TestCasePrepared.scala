package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestCasePrepared
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCasePrepared. */
@JSImport("cucumber-messages", "messages.TestCasePrepared")
@js.native
/**
  * Constructs a new TestCasePrepared.
  * @param [properties] Properties to set
  */
class TestCasePrepared ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePrepared {
  def this(properties: ITestCasePrepared) = this()
}
object TestCasePrepared {
  
  /**
    * Creates a new TestCasePrepared instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCasePrepared instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePrepared.create")
  @js.native
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePrepared = js.native
  @JSImport("cucumber-messages", "messages.TestCasePrepared.create")
  @js.native
  def create(properties: ITestCasePrepared): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePrepared = js.native
  
  @JSImport("cucumber-messages", "messages.TestCasePrepared.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePrepared = js.native
  @JSImport("cucumber-messages", "messages.TestCasePrepared.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePrepared = js.native
  /**
    * Decodes a TestCasePrepared message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCasePrepared
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePrepared.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePrepared = js.native
  @JSImport("cucumber-messages", "messages.TestCasePrepared.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePrepared = js.native
  
  @JSImport("cucumber-messages", "messages.TestCasePrepared.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePrepared = js.native
  /**
    * Decodes a TestCasePrepared message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCasePrepared
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePrepared.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePrepared = js.native
  
  /**
    * Encodes the specified TestCasePrepared message. Does not implicitly {@link io.cucumber.messages.TestCasePrepared.verify|verify} messages.
    * @param message TestCasePrepared message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePrepared.encode")
  @js.native
  def encode(message: ITestCasePrepared): Writer = js.native
  @JSImport("cucumber-messages", "messages.TestCasePrepared.encode")
  @js.native
  def encode(message: ITestCasePrepared, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestCasePrepared message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCasePrepared.verify|verify} messages.
    * @param message TestCasePrepared message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePrepared.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCasePrepared): Writer = js.native
  @JSImport("cucumber-messages", "messages.TestCasePrepared.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCasePrepared, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestCasePrepared message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCasePrepared
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePrepared.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePrepared = js.native
  
  /**
    * Creates a plain object from a TestCasePrepared message. Also converts values to other types if specified.
    * @param message TestCasePrepared
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePrepared.toObject")
  @js.native
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePrepared): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.TestCasePrepared.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePrepared,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestCasePrepared message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePrepared.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
