package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IGeneratedExpression
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GeneratedExpression. */
@JSImport("cucumber-messages", "messages.GeneratedExpression")
@js.native
/**
  * Constructs a new GeneratedExpression.
  * @param [properties] Properties to set
  */
class GeneratedExpression ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression {
  def this(properties: IGeneratedExpression) = this()
}
object GeneratedExpression {
  
  /**
    * Creates a new GeneratedExpression instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GeneratedExpression instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GeneratedExpression.create")
  @js.native
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  @JSImport("cucumber-messages", "messages.GeneratedExpression.create")
  @js.native
  def create(properties: IGeneratedExpression): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  
  @JSImport("cucumber-messages", "messages.GeneratedExpression.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  @JSImport("cucumber-messages", "messages.GeneratedExpression.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  /**
    * Decodes a GeneratedExpression message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GeneratedExpression
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GeneratedExpression.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  @JSImport("cucumber-messages", "messages.GeneratedExpression.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  
  @JSImport("cucumber-messages", "messages.GeneratedExpression.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  /**
    * Decodes a GeneratedExpression message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GeneratedExpression
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GeneratedExpression.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  
  /**
    * Encodes the specified GeneratedExpression message. Does not implicitly {@link io.cucumber.messages.GeneratedExpression.verify|verify} messages.
    * @param message GeneratedExpression message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GeneratedExpression.encode")
  @js.native
  def encode(message: IGeneratedExpression): Writer = js.native
  @JSImport("cucumber-messages", "messages.GeneratedExpression.encode")
  @js.native
  def encode(message: IGeneratedExpression, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GeneratedExpression message, length delimited. Does not implicitly {@link io.cucumber.messages.GeneratedExpression.verify|verify} messages.
    * @param message GeneratedExpression message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GeneratedExpression.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGeneratedExpression): Writer = js.native
  @JSImport("cucumber-messages", "messages.GeneratedExpression.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGeneratedExpression, writer: Writer): Writer = js.native
  
  /**
    * Creates a GeneratedExpression message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GeneratedExpression
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GeneratedExpression.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  
  /**
    * Creates a plain object from a GeneratedExpression message. Also converts values to other types if specified.
    * @param message GeneratedExpression
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GeneratedExpression.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression
  ): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.GeneratedExpression.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GeneratedExpression message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.GeneratedExpression.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
