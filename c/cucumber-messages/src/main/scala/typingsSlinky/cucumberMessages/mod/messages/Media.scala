package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IMedia
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Meta information about encoded contents */
@JSImport("cucumber-messages", "messages.Media")
@js.native
/**
  * Constructs a new Media.
  * @param [properties] Properties to set
  */
class Media ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media {
  def this(properties: IMedia) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.Media")
@js.native
object Media extends js.Object {
  
  /**
    * Creates a new Media instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Media instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  def create(properties: IMedia): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  
  /**
    * Decodes a Media message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Media
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  
  /**
    * Decodes a Media message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Media
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  
  /**
    * Encodes the specified Media message. Does not implicitly {@link io.cucumber.messages.Media.verify|verify} messages.
    * @param message Media message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IMedia): Writer = js.native
  def encode(message: IMedia, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Media message, length delimited. Does not implicitly {@link io.cucumber.messages.Media.verify|verify} messages.
    * @param message Media message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IMedia): Writer = js.native
  def encodeDelimited(message: IMedia, writer: Writer): Writer = js.native
  
  /**
    * Creates a Media message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Media
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media = js.native
  
  /**
    * Creates a plain object from a Media message. Also converts values to other types if specified.
    * @param message Media
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Media message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Encoding enum. */
  @js.native
  object Encoding extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media.Encoding with Double
      ] = js.native
    
    /* 0 */ val BASE64: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media.Encoding.BASE64 with Double = js.native
    
    /* 1 */ val UTF8: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media.Encoding.UTF8 with Double = js.native
  }
}
