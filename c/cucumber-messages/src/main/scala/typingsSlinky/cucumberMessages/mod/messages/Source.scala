package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ISource
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A source file, typically a Gherkin document */
@JSImport("cucumber-messages", "messages.Source")
@js.native
/**
  * Constructs a new Source.
  * @param [properties] Properties to set
  */
class Source ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Source {
  def this(properties: ISource) = this()
}
object Source {
  
  /**
    * Creates a new Source instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Source instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Source.create")
  @js.native
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Source = js.native
  @JSImport("cucumber-messages", "messages.Source.create")
  @js.native
  def create(properties: ISource): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Source = js.native
  
  @JSImport("cucumber-messages", "messages.Source.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Source = js.native
  @JSImport("cucumber-messages", "messages.Source.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Source = js.native
  /**
    * Decodes a Source message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Source
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Source.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Source = js.native
  @JSImport("cucumber-messages", "messages.Source.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Source = js.native
  
  @JSImport("cucumber-messages", "messages.Source.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Source = js.native
  /**
    * Decodes a Source message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Source
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Source.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Source = js.native
  
  /**
    * Encodes the specified Source message. Does not implicitly {@link io.cucumber.messages.Source.verify|verify} messages.
    * @param message Source message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Source.encode")
  @js.native
  def encode(message: ISource): Writer = js.native
  @JSImport("cucumber-messages", "messages.Source.encode")
  @js.native
  def encode(message: ISource, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Source message, length delimited. Does not implicitly {@link io.cucumber.messages.Source.verify|verify} messages.
    * @param message Source message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Source.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISource): Writer = js.native
  @JSImport("cucumber-messages", "messages.Source.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISource, writer: Writer): Writer = js.native
  
  /**
    * Creates a Source message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Source
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Source.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Source = js.native
  
  /**
    * Creates a plain object from a Source message. Also converts values to other types if specified.
    * @param message Source
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Source.toObject")
  @js.native
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Source): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.Source.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Source,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Source message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Source.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
