package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an IntentBatch. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch")
@js.native
/**
  * Constructs a new IntentBatch.
  * @param [properties] Properties to set
  */
class IntentBatch () extends IIntentBatch {
  def this(properties: IIntentBatch) = this()
  
  /** IntentBatch intents. */
  @JSName("intents")
  var intents_IntentBatch: js.Array[IIntent] = js.native
  
  /**
    * Converts this IntentBatch to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object IntentBatch {
  
  /**
    * Creates a new IntentBatch instance using the specified properties.
    * @param [properties] Properties to set
    * @returns IntentBatch instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.create")
  @js.native
  def create(): IntentBatch = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.create")
  @js.native
  def create(properties: IIntentBatch): IntentBatch = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): IntentBatch = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): IntentBatch = js.native
  /**
    * Decodes an IntentBatch message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns IntentBatch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.decode")
  @js.native
  def decode(reader: Reader): IntentBatch = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.decode")
  @js.native
  def decode(reader: Reader, length: Double): IntentBatch = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): IntentBatch = js.native
  /**
    * Decodes an IntentBatch message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns IntentBatch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): IntentBatch = js.native
  
  /**
    * Encodes the specified IntentBatch message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.IntentBatch.verify|verify} messages.
    * @param message IntentBatch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.encode")
  @js.native
  def encode(message: IIntentBatch): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.encode")
  @js.native
  def encode(message: IIntentBatch, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified IntentBatch message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.IntentBatch.verify|verify} messages.
    * @param message IntentBatch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.encodeDelimited")
  @js.native
  def encodeDelimited(message: IIntentBatch): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.encodeDelimited")
  @js.native
  def encodeDelimited(message: IIntentBatch, writer: Writer): Writer = js.native
  
  /**
    * Creates an IntentBatch message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns IntentBatch
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): IntentBatch = js.native
  
  /**
    * Creates a plain object from an IntentBatch message. Also converts values to other types if specified.
    * @param message IntentBatch
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.toObject")
  @js.native
  def toObject(message: IntentBatch): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.toObject")
  @js.native
  def toObject(message: IntentBatch, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an IntentBatch message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentBatch.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
