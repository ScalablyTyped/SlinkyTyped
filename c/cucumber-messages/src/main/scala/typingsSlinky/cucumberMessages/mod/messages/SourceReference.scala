package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ISourceReference
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Points to a [Source](#io.cucumber.messages.Source) identified by `uri` and a
  * [Location](#io.cucumber.messages.Location) within that file.
  */
@JSImport("cucumber-messages", "messages.SourceReference")
@js.native
/**
  * Constructs a new SourceReference.
  * @param [properties] Properties to set
  */
class SourceReference ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference {
  def this(properties: ISourceReference) = this()
}
object SourceReference {
  
  /**
    * Creates a new SourceReference instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourceReference instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourceReference.create")
  @js.native
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  @JSImport("cucumber-messages", "messages.SourceReference.create")
  @js.native
  def create(properties: ISourceReference): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  
  @JSImport("cucumber-messages", "messages.SourceReference.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  @JSImport("cucumber-messages", "messages.SourceReference.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  /**
    * Decodes a SourceReference message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourceReference
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourceReference.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  @JSImport("cucumber-messages", "messages.SourceReference.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  
  @JSImport("cucumber-messages", "messages.SourceReference.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  /**
    * Decodes a SourceReference message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourceReference
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourceReference.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  
  /**
    * Encodes the specified SourceReference message. Does not implicitly {@link io.cucumber.messages.SourceReference.verify|verify} messages.
    * @param message SourceReference message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourceReference.encode")
  @js.native
  def encode(message: ISourceReference): Writer = js.native
  @JSImport("cucumber-messages", "messages.SourceReference.encode")
  @js.native
  def encode(message: ISourceReference, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SourceReference message, length delimited. Does not implicitly {@link io.cucumber.messages.SourceReference.verify|verify} messages.
    * @param message SourceReference message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourceReference.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourceReference): Writer = js.native
  @JSImport("cucumber-messages", "messages.SourceReference.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourceReference, writer: Writer): Writer = js.native
  
  /**
    * Creates a SourceReference message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourceReference
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourceReference.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  
  /**
    * Creates a plain object from a SourceReference message. Also converts values to other types if specified.
    * @param message SourceReference
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourceReference.toObject")
  @js.native
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.SourceReference.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SourceReference message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.SourceReference.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
