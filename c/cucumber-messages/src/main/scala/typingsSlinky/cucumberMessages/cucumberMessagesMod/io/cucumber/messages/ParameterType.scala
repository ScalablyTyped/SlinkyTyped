package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ParameterType. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType")
@js.native
/**
  * Constructs a new ParameterType.
  * @param [properties] Properties to set
  */
class ParameterType () extends IParameterType {
  def this(properties: IParameterType) = this()
  
  /** ParameterType name. */
  @JSName("name")
  var name_ParameterType: String = js.native
  
  /** ParameterType preferForRegularExpressionMatch. */
  @JSName("preferForRegularExpressionMatch")
  var preferForRegularExpressionMatch_ParameterType: Boolean = js.native
  
  /** ParameterType regularExpressions. */
  @JSName("regularExpressions")
  var regularExpressions_ParameterType: js.Array[String] = js.native
  
  /**
    * Converts this ParameterType to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ParameterType useForSnippets. */
  @JSName("useForSnippets")
  var useForSnippets_ParameterType: Boolean = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType")
@js.native
object ParameterType extends js.Object {
  
  /**
    * Creates a new ParameterType instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ParameterType instance
    */
  def create(): ParameterType = js.native
  def create(properties: IParameterType): ParameterType = js.native
  
  /**
    * Decodes a ParameterType message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ParameterType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ParameterType = js.native
  def decode(reader: Reader, length: Double): ParameterType = js.native
  def decode(reader: js.typedarray.Uint8Array): ParameterType = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ParameterType = js.native
  
  /**
    * Decodes a ParameterType message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ParameterType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ParameterType = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ParameterType = js.native
  
  /**
    * Encodes the specified ParameterType message. Does not implicitly {@link io.cucumber.messages.ParameterType.verify|verify} messages.
    * @param message ParameterType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IParameterType): Writer = js.native
  def encode(message: IParameterType, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ParameterType message, length delimited. Does not implicitly {@link io.cucumber.messages.ParameterType.verify|verify} messages.
    * @param message ParameterType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IParameterType): Writer = js.native
  def encodeDelimited(message: IParameterType, writer: Writer): Writer = js.native
  
  /**
    * Creates a ParameterType message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ParameterType
    */
  def fromObject(`object`: StringDictionary[js.Any]): ParameterType = js.native
  
  /**
    * Creates a plain object from a ParameterType message. Also converts values to other types if specified.
    * @param message ParameterType
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ParameterType): StringDictionary[js.Any] = js.native
  def toObject(message: ParameterType, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ParameterType message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
