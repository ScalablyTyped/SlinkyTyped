package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SentimentAnalysisResult. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult")
@js.native
/**
  * Constructs a new SentimentAnalysisResult.
  * @param [properties] Properties to set
  */
class SentimentAnalysisResult () extends ISentimentAnalysisResult {
  def this(properties: ISentimentAnalysisResult) = this()
  
  /**
    * Converts this SentimentAnalysisResult to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SentimentAnalysisResult {
  
  /**
    * Creates a new SentimentAnalysisResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SentimentAnalysisResult instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.create")
  @js.native
  def create(): SentimentAnalysisResult = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.create")
  @js.native
  def create(properties: ISentimentAnalysisResult): SentimentAnalysisResult = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): SentimentAnalysisResult = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): SentimentAnalysisResult = js.native
  /**
    * Decodes a SentimentAnalysisResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SentimentAnalysisResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.decode")
  @js.native
  def decode(reader: Reader): SentimentAnalysisResult = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.decode")
  @js.native
  def decode(reader: Reader, length: Double): SentimentAnalysisResult = js.native
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): SentimentAnalysisResult = js.native
  /**
    * Decodes a SentimentAnalysisResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SentimentAnalysisResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SentimentAnalysisResult = js.native
  
  /**
    * Encodes the specified SentimentAnalysisResult message. Does not implicitly {@link google.cloud.dialogflow.v2.SentimentAnalysisResult.verify|verify} messages.
    * @param message SentimentAnalysisResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.encode")
  @js.native
  def encode(message: ISentimentAnalysisResult): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.encode")
  @js.native
  def encode(message: ISentimentAnalysisResult, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SentimentAnalysisResult message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.SentimentAnalysisResult.verify|verify} messages.
    * @param message SentimentAnalysisResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISentimentAnalysisResult): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISentimentAnalysisResult, writer: Writer): Writer = js.native
  
  /**
    * Creates a SentimentAnalysisResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SentimentAnalysisResult
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SentimentAnalysisResult = js.native
  
  /**
    * Creates a plain object from a SentimentAnalysisResult message. Also converts values to other types if specified.
    * @param message SentimentAnalysisResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.toObject")
  @js.native
  def toObject(message: SentimentAnalysisResult): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.toObject")
  @js.native
  def toObject(message: SentimentAnalysisResult, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SentimentAnalysisResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SentimentAnalysisResult.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
