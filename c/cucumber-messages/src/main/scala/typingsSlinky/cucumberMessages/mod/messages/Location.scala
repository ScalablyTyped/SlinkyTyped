package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Points to a line and a column in a text file */
@JSImport("cucumber-messages", "messages.Location")
@js.native
/**
  * Constructs a new Location.
  * @param [properties] Properties to set
  */
class Location ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Location {
  def this(properties: ILocation) = this()
}
object Location {
  
  /**
    * Creates a new Location instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Location instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Location.create")
  @js.native
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Location = js.native
  @JSImport("cucumber-messages", "messages.Location.create")
  @js.native
  def create(properties: ILocation): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Location = js.native
  
  @JSImport("cucumber-messages", "messages.Location.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Location = js.native
  @JSImport("cucumber-messages", "messages.Location.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Location = js.native
  /**
    * Decodes a Location message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Location
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Location.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Location = js.native
  @JSImport("cucumber-messages", "messages.Location.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Location = js.native
  
  @JSImport("cucumber-messages", "messages.Location.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Location = js.native
  /**
    * Decodes a Location message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Location
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Location.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Location = js.native
  
  /**
    * Encodes the specified Location message. Does not implicitly {@link io.cucumber.messages.Location.verify|verify} messages.
    * @param message Location message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Location.encode")
  @js.native
  def encode(message: ILocation): Writer = js.native
  @JSImport("cucumber-messages", "messages.Location.encode")
  @js.native
  def encode(message: ILocation, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Location message, length delimited. Does not implicitly {@link io.cucumber.messages.Location.verify|verify} messages.
    * @param message Location message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Location.encodeDelimited")
  @js.native
  def encodeDelimited(message: ILocation): Writer = js.native
  @JSImport("cucumber-messages", "messages.Location.encodeDelimited")
  @js.native
  def encodeDelimited(message: ILocation, writer: Writer): Writer = js.native
  
  /**
    * Creates a Location message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Location
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Location.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Location = js.native
  
  /**
    * Creates a plain object from a Location message. Also converts values to other types if specified.
    * @param message Location
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Location.toObject")
  @js.native
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Location): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.Location.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Location,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Location message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Location.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
