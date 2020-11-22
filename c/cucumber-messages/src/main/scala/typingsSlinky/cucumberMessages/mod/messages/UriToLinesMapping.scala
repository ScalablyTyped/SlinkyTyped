package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IUriToLinesMapping
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UriToLinesMapping. */
@JSImport("cucumber-messages", "messages.UriToLinesMapping")
@js.native
/**
  * Constructs a new UriToLinesMapping.
  * @param [properties] Properties to set
  */
class UriToLinesMapping ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping {
  def this(properties: IUriToLinesMapping) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.UriToLinesMapping")
@js.native
object UriToLinesMapping extends js.Object {
  
  /**
    * Creates a new UriToLinesMapping instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UriToLinesMapping instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  def create(properties: IUriToLinesMapping): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  
  /**
    * Decodes an UriToLinesMapping message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UriToLinesMapping
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  
  /**
    * Decodes an UriToLinesMapping message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UriToLinesMapping
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  
  /**
    * Encodes the specified UriToLinesMapping message. Does not implicitly {@link io.cucumber.messages.UriToLinesMapping.verify|verify} messages.
    * @param message UriToLinesMapping message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IUriToLinesMapping): Writer = js.native
  def encode(message: IUriToLinesMapping, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified UriToLinesMapping message, length delimited. Does not implicitly {@link io.cucumber.messages.UriToLinesMapping.verify|verify} messages.
    * @param message UriToLinesMapping message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IUriToLinesMapping): Writer = js.native
  def encodeDelimited(message: IUriToLinesMapping, writer: Writer): Writer = js.native
  
  /**
    * Creates an UriToLinesMapping message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UriToLinesMapping
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping = js.native
  
  /**
    * Creates a plain object from an UriToLinesMapping message. Also converts values to other types if specified.
    * @param message UriToLinesMapping
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.UriToLinesMapping,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an UriToLinesMapping message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
