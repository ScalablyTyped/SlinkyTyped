package typingsSlinky.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a VoiceSelectionParams. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams")
@js.native
/**
  * Constructs a new VoiceSelectionParams.
  * @param [properties] Properties to set
  */
class VoiceSelectionParams () extends IVoiceSelectionParams {
  def this(properties: IVoiceSelectionParams) = this()
  
  /** VoiceSelectionParams languageCode. */
  @JSName("languageCode")
  var languageCode_VoiceSelectionParams: String = js.native
  
  /** VoiceSelectionParams name. */
  @JSName("name")
  var name_VoiceSelectionParams: String = js.native
  
  /** VoiceSelectionParams ssmlGender. */
  @JSName("ssmlGender")
  var ssmlGender_VoiceSelectionParams: SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1beta1.SsmlVoiceGender * / any */ String) = js.native
  
  /**
    * Converts this VoiceSelectionParams to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object VoiceSelectionParams {
  
  /**
    * Creates a new VoiceSelectionParams instance using the specified properties.
    * @param [properties] Properties to set
    * @returns VoiceSelectionParams instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.create")
  @js.native
  def create(): VoiceSelectionParams = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.create")
  @js.native
  def create(properties: IVoiceSelectionParams): VoiceSelectionParams = js.native
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): VoiceSelectionParams = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): VoiceSelectionParams = js.native
  /**
    * Decodes a VoiceSelectionParams message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns VoiceSelectionParams
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.decode")
  @js.native
  def decode(reader: Reader): VoiceSelectionParams = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.decode")
  @js.native
  def decode(reader: Reader, length: Double): VoiceSelectionParams = js.native
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): VoiceSelectionParams = js.native
  /**
    * Decodes a VoiceSelectionParams message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns VoiceSelectionParams
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): VoiceSelectionParams = js.native
  
  /**
    * Encodes the specified VoiceSelectionParams message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.VoiceSelectionParams.verify|verify} messages.
    * @param message VoiceSelectionParams message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.encode")
  @js.native
  def encode(message: IVoiceSelectionParams): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.encode")
  @js.native
  def encode(message: IVoiceSelectionParams, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified VoiceSelectionParams message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.VoiceSelectionParams.verify|verify} messages.
    * @param message VoiceSelectionParams message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.encodeDelimited")
  @js.native
  def encodeDelimited(message: IVoiceSelectionParams): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.encodeDelimited")
  @js.native
  def encodeDelimited(message: IVoiceSelectionParams, writer: Writer): Writer = js.native
  
  /**
    * Creates a VoiceSelectionParams message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns VoiceSelectionParams
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): VoiceSelectionParams = js.native
  
  /**
    * Creates a plain object from a VoiceSelectionParams message. Also converts values to other types if specified.
    * @param message VoiceSelectionParams
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.toObject")
  @js.native
  def toObject(message: VoiceSelectionParams): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.toObject")
  @js.native
  def toObject(message: VoiceSelectionParams, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a VoiceSelectionParams message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.VoiceSelectionParams.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
