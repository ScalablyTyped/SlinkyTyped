package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Background. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background")
@js.native
/**
  * Constructs a new Background.
  * @param [properties] Properties to set
  */
class Background () extends IBackground {
  def this(properties: IBackground) = this()
  
  /** Background description. */
  @JSName("description")
  var description_Background: String = js.native
  
  /** Background keyword. */
  @JSName("keyword")
  var keyword_Background: String = js.native
  
  /** Background name. */
  @JSName("name")
  var name_Background: String = js.native
  
  /** Background steps. */
  @JSName("steps")
  var steps_Background: js.Array[IStep] = js.native
  
  /**
    * Converts this Background to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Background")
@js.native
object Background extends js.Object {
  
  /**
    * Creates a new Background instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Background instance
    */
  def create(): Background = js.native
  def create(properties: IBackground): Background = js.native
  
  /**
    * Decodes a Background message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Background
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Background = js.native
  def decode(reader: Reader, length: Double): Background = js.native
  def decode(reader: js.typedarray.Uint8Array): Background = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Background = js.native
  
  /**
    * Decodes a Background message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Background
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Background = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): Background = js.native
  
  /**
    * Encodes the specified Background message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Background.verify|verify} messages.
    * @param message Background message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBackground): Writer = js.native
  def encode(message: IBackground, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Background message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Background.verify|verify} messages.
    * @param message Background message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBackground): Writer = js.native
  def encodeDelimited(message: IBackground, writer: Writer): Writer = js.native
  
  /**
    * Creates a Background message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Background
    */
  def fromObject(`object`: StringDictionary[js.Any]): Background = js.native
  
  /**
    * Creates a plain object from a Background message. Also converts values to other types if specified.
    * @param message Background
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Background): StringDictionary[js.Any] = js.native
  def toObject(message: Background, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Background message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
