package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IPickleAccepted
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PickleAccepted. */
@JSImport("cucumber-messages", "messages.PickleAccepted")
@js.native
/**
  * Constructs a new PickleAccepted.
  * @param [properties] Properties to set
  */
class PickleAccepted ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleAccepted {
  def this(properties: IPickleAccepted) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.PickleAccepted")
@js.native
object PickleAccepted extends js.Object {
  
  /**
    * Creates a new PickleAccepted instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleAccepted instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleAccepted = js.native
  def create(properties: IPickleAccepted): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleAccepted = js.native
  
  /**
    * Decodes a PickleAccepted message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleAccepted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleAccepted = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleAccepted = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleAccepted = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleAccepted = js.native
  
  /**
    * Decodes a PickleAccepted message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleAccepted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleAccepted = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleAccepted = js.native
  
  /**
    * Encodes the specified PickleAccepted message. Does not implicitly {@link io.cucumber.messages.PickleAccepted.verify|verify} messages.
    * @param message PickleAccepted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPickleAccepted): Writer = js.native
  def encode(message: IPickleAccepted, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PickleAccepted message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleAccepted.verify|verify} messages.
    * @param message PickleAccepted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPickleAccepted): Writer = js.native
  def encodeDelimited(message: IPickleAccepted, writer: Writer): Writer = js.native
  
  /**
    * Creates a PickleAccepted message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleAccepted
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleAccepted = js.native
  
  /**
    * Creates a plain object from a PickleAccepted message. Also converts values to other types if specified.
    * @param message PickleAccepted
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleAccepted): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleAccepted,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PickleAccepted message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
