package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourcesConfig. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig")
@js.native
/**
  * Constructs a new SourcesConfig.
  * @param [properties] Properties to set
  */
class SourcesConfig () extends ISourcesConfig {
  def this(properties: ISourcesConfig) = this()
  
  /** SourcesConfig absolutePaths. */
  @JSName("absolutePaths")
  var absolutePaths_SourcesConfig: js.Array[String] = js.native
  
  /** SourcesConfig language. */
  @JSName("language")
  var language_SourcesConfig: String = js.native
  
  /**
    * Converts this SourcesConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SourcesConfig {
  
  /**
    * Creates a new SourcesConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourcesConfig instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.create")
  @js.native
  def create(): SourcesConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.create")
  @js.native
  def create(properties: ISourcesConfig): SourcesConfig = js.native
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): SourcesConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): SourcesConfig = js.native
  /**
    * Decodes a SourcesConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourcesConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.decode")
  @js.native
  def decode(reader: Reader): SourcesConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.decode")
  @js.native
  def decode(reader: Reader, length: Double): SourcesConfig = js.native
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): SourcesConfig = js.native
  /**
    * Decodes a SourcesConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourcesConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SourcesConfig = js.native
  
  /**
    * Encodes the specified SourcesConfig message. Does not implicitly {@link io.cucumber.messages.SourcesConfig.verify|verify} messages.
    * @param message SourcesConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.encode")
  @js.native
  def encode(message: ISourcesConfig): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.encode")
  @js.native
  def encode(message: ISourcesConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SourcesConfig message, length delimited. Does not implicitly {@link io.cucumber.messages.SourcesConfig.verify|verify} messages.
    * @param message SourcesConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourcesConfig): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourcesConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates a SourcesConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourcesConfig
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SourcesConfig = js.native
  
  /**
    * Creates a plain object from a SourcesConfig message. Also converts values to other types if specified.
    * @param message SourcesConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.toObject")
  @js.native
  def toObject(message: SourcesConfig): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.toObject")
  @js.native
  def toObject(message: SourcesConfig, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SourcesConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesConfig.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
