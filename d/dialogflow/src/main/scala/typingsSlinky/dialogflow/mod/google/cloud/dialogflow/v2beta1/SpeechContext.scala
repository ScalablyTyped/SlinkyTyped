package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SpeechContext. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext")
@js.native
/**
  * Constructs a new SpeechContext.
  * @param [properties] Properties to set
  */
class SpeechContext () extends ISpeechContext {
  def this(properties: ISpeechContext) = this()
  
  /** SpeechContext boost. */
  @JSName("boost")
  var boost_SpeechContext: Double = js.native
  
  /** SpeechContext phrases. */
  @JSName("phrases")
  var phrases_SpeechContext: js.Array[String] = js.native
  
  /**
    * Converts this SpeechContext to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SpeechContext {
  
  /**
    * Creates a new SpeechContext instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SpeechContext instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.create")
  @js.native
  def create(): SpeechContext = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.create")
  @js.native
  def create(properties: ISpeechContext): SpeechContext = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): SpeechContext = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): SpeechContext = js.native
  /**
    * Decodes a SpeechContext message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SpeechContext
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.decode")
  @js.native
  def decode(reader: Reader): SpeechContext = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.decode")
  @js.native
  def decode(reader: Reader, length: Double): SpeechContext = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): SpeechContext = js.native
  /**
    * Decodes a SpeechContext message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SpeechContext
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SpeechContext = js.native
  
  /**
    * Encodes the specified SpeechContext message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SpeechContext.verify|verify} messages.
    * @param message SpeechContext message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.encode")
  @js.native
  def encode(message: ISpeechContext): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.encode")
  @js.native
  def encode(message: ISpeechContext, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SpeechContext message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SpeechContext.verify|verify} messages.
    * @param message SpeechContext message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISpeechContext): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISpeechContext, writer: Writer): Writer = js.native
  
  /**
    * Creates a SpeechContext message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SpeechContext
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SpeechContext = js.native
  
  /**
    * Creates a plain object from a SpeechContext message. Also converts values to other types if specified.
    * @param message SpeechContext
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.toObject")
  @js.native
  def toObject(message: SpeechContext): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.toObject")
  @js.native
  def toObject(message: SpeechContext, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SpeechContext message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechContext.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
