package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A source file, typically a Gherkin document */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Source")
@js.native
/**
  * Constructs a new Source.
  * @param [properties] Properties to set
  */
class Source () extends ISource {
  def this(properties: ISource) = this()
  
  /** Source data. */
  @JSName("data")
  var data_Source: String = js.native
  
  /**
    * Converts this Source to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /**
    * The [URI](https://en.wikipedia.org/wiki/Uniform_Resource_Identifier)
    * of the source, typically a file path relative to the root directory
    */
  @JSName("uri")
  var uri_Source: String = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Source")
@js.native
object Source extends js.Object {
  
  /**
    * Creates a new Source instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Source instance
    */
  def create(): Source = js.native
  def create(properties: ISource): Source = js.native
  
  /**
    * Decodes a Source message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Source
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Source = js.native
  def decode(reader: Reader, length: Double): Source = js.native
  def decode(reader: js.typedarray.Uint8Array): Source = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Source = js.native
  
  /**
    * Decodes a Source message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Source
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Source = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): Source = js.native
  
  /**
    * Encodes the specified Source message. Does not implicitly {@link io.cucumber.messages.Source.verify|verify} messages.
    * @param message Source message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISource): Writer = js.native
  def encode(message: ISource, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Source message, length delimited. Does not implicitly {@link io.cucumber.messages.Source.verify|verify} messages.
    * @param message Source message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISource): Writer = js.native
  def encodeDelimited(message: ISource, writer: Writer): Writer = js.native
  
  /**
    * Creates a Source message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Source
    */
  def fromObject(`object`: StringDictionary[js.Any]): Source = js.native
  
  /**
    * Creates a plain object from a Source message. Also converts values to other types if specified.
    * @param message Source
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Source): StringDictionary[js.Any] = js.native
  def toObject(message: Source, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Source message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
