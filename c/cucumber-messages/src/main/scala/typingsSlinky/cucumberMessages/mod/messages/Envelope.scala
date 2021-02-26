package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IEnvelope
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All the messages that are passed between different components/processes are Envelope
  * messages.
  */
@JSImport("cucumber-messages", "messages.Envelope")
@js.native
/**
  * Constructs a new Envelope.
  * @param [properties] Properties to set
  */
class Envelope ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope {
  def this(properties: IEnvelope) = this()
}
object Envelope {
  
  /**
    * Creates a new Envelope instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Envelope instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Envelope.create")
  @js.native
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  @JSImport("cucumber-messages", "messages.Envelope.create")
  @js.native
  def create(properties: IEnvelope): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  
  @JSImport("cucumber-messages", "messages.Envelope.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  @JSImport("cucumber-messages", "messages.Envelope.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  /**
    * Decodes an Envelope message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Envelope
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Envelope.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  @JSImport("cucumber-messages", "messages.Envelope.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  
  @JSImport("cucumber-messages", "messages.Envelope.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  /**
    * Decodes an Envelope message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Envelope
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Envelope.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  
  /**
    * Encodes the specified Envelope message. Does not implicitly {@link io.cucumber.messages.Envelope.verify|verify} messages.
    * @param message Envelope message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Envelope.encode")
  @js.native
  def encode(message: IEnvelope): Writer = js.native
  @JSImport("cucumber-messages", "messages.Envelope.encode")
  @js.native
  def encode(message: IEnvelope, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Envelope message, length delimited. Does not implicitly {@link io.cucumber.messages.Envelope.verify|verify} messages.
    * @param message Envelope message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Envelope.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnvelope): Writer = js.native
  @JSImport("cucumber-messages", "messages.Envelope.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnvelope, writer: Writer): Writer = js.native
  
  /**
    * Creates an Envelope message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Envelope
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Envelope.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  
  /**
    * Creates a plain object from an Envelope message. Also converts values to other types if specified.
    * @param message Envelope
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Envelope.toObject")
  @js.native
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.Envelope.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Envelope message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Envelope.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
