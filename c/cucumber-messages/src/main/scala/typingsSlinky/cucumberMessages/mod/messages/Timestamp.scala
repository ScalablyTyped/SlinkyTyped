package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITimestamp
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Timestamp. */
@JSImport("cucumber-messages", "messages.Timestamp")
@js.native
/**
  * Constructs a new Timestamp.
  * @param [properties] Properties to set
  */
class Timestamp ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Timestamp {
  def this(properties: ITimestamp) = this()
}
object Timestamp {
  
  /**
    * Creates a new Timestamp instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Timestamp instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Timestamp.create")
  @js.native
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Timestamp = js.native
  @JSImport("cucumber-messages", "messages.Timestamp.create")
  @js.native
  def create(properties: ITimestamp): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Timestamp = js.native
  
  @JSImport("cucumber-messages", "messages.Timestamp.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Timestamp = js.native
  @JSImport("cucumber-messages", "messages.Timestamp.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Timestamp = js.native
  /**
    * Decodes a Timestamp message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Timestamp
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Timestamp.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Timestamp = js.native
  @JSImport("cucumber-messages", "messages.Timestamp.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Timestamp = js.native
  
  @JSImport("cucumber-messages", "messages.Timestamp.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Timestamp = js.native
  /**
    * Decodes a Timestamp message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Timestamp
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Timestamp.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Timestamp = js.native
  
  /**
    * Encodes the specified Timestamp message. Does not implicitly {@link io.cucumber.messages.Timestamp.verify|verify} messages.
    * @param message Timestamp message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Timestamp.encode")
  @js.native
  def encode(message: ITimestamp): Writer = js.native
  @JSImport("cucumber-messages", "messages.Timestamp.encode")
  @js.native
  def encode(message: ITimestamp, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Timestamp message, length delimited. Does not implicitly {@link io.cucumber.messages.Timestamp.verify|verify} messages.
    * @param message Timestamp message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Timestamp.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITimestamp): Writer = js.native
  @JSImport("cucumber-messages", "messages.Timestamp.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITimestamp, writer: Writer): Writer = js.native
  
  /**
    * Creates a Timestamp message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Timestamp
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Timestamp.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Timestamp = js.native
  
  /**
    * Creates a plain object from a Timestamp message. Also converts values to other types if specified.
    * @param message Timestamp
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Timestamp.toObject")
  @js.native
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Timestamp): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.Timestamp.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Timestamp,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Timestamp message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Timestamp.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
