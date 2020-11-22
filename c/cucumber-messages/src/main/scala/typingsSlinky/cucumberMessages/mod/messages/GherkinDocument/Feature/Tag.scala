package typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITag
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A tag */
@JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag")
@js.native
/**
  * Constructs a new Tag.
  * @param [properties] Properties to set
  */
class Tag ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag {
  def this(properties: ITag) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Tag")
@js.native
object Tag extends js.Object {
  
  /**
    * Creates a new Tag instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Tag instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
  def create(properties: ITag): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
  
  /**
    * Decodes a Tag message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Tag
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
  
  /**
    * Decodes a Tag message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Tag
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
  
  /**
    * Encodes the specified Tag message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Tag.verify|verify} messages.
    * @param message Tag message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITag): Writer = js.native
  def encode(message: ITag, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Tag message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Tag.verify|verify} messages.
    * @param message Tag message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITag): Writer = js.native
  def encodeDelimited(message: ITag, writer: Writer): Writer = js.native
  
  /**
    * Creates a Tag message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Tag
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag = js.native
  
  /**
    * Creates a plain object from a Tag message. Also converts values to other types if specified.
    * @param message Tag
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Tag,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Tag message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
