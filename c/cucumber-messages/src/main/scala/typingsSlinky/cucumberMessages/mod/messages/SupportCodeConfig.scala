package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ISupportCodeConfig
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SupportCodeConfig. */
@JSImport("cucumber-messages", "messages.SupportCodeConfig")
@js.native
/**
  * Constructs a new SupportCodeConfig.
  * @param [properties] Properties to set
  */
class SupportCodeConfig ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SupportCodeConfig {
  def this(properties: ISupportCodeConfig) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.SupportCodeConfig")
@js.native
object SupportCodeConfig extends js.Object {
  
  /**
    * Creates a new SupportCodeConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SupportCodeConfig instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SupportCodeConfig = js.native
  def create(properties: ISupportCodeConfig): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SupportCodeConfig = js.native
  
  /**
    * Decodes a SupportCodeConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SupportCodeConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SupportCodeConfig = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SupportCodeConfig = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SupportCodeConfig = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SupportCodeConfig = js.native
  
  /**
    * Decodes a SupportCodeConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SupportCodeConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SupportCodeConfig = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SupportCodeConfig = js.native
  
  /**
    * Encodes the specified SupportCodeConfig message. Does not implicitly {@link io.cucumber.messages.SupportCodeConfig.verify|verify} messages.
    * @param message SupportCodeConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISupportCodeConfig): Writer = js.native
  def encode(message: ISupportCodeConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SupportCodeConfig message, length delimited. Does not implicitly {@link io.cucumber.messages.SupportCodeConfig.verify|verify} messages.
    * @param message SupportCodeConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISupportCodeConfig): Writer = js.native
  def encodeDelimited(message: ISupportCodeConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates a SupportCodeConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SupportCodeConfig
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SupportCodeConfig = js.native
  
  /**
    * Creates a plain object from a SupportCodeConfig message. Also converts values to other types if specified.
    * @param message SupportCodeConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SupportCodeConfig): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SupportCodeConfig,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SupportCodeConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
