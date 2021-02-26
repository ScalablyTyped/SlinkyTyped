package typingsSlinky.googleCloudTextToSpeech.srcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.IFileOptions
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileOptions. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions")
@js.native
/**
  * Constructs a new FileOptions.
  * @param [properties] Properties to set
  */
class FileOptions ()
  extends typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions {
  def this(properties: IFileOptions) = this()
}
object FileOptions {
  
  /** OptimizeMode enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.OptimizeMode")
  @js.native
  object OptimizeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions.OptimizeMode with Double
      ] = js.native
    
    /* 2 */ val CODE_SIZE: typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions.OptimizeMode.CODE_SIZE with Double = js.native
    
    /* 3 */ val LITE_RUNTIME: typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions.OptimizeMode.LITE_RUNTIME with Double = js.native
    
    /* 1 */ val SPEED: typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions.OptimizeMode.SPEED with Double = js.native
  }
  
  /**
    * Creates a new FileOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileOptions instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.create")
  @js.native
  def create(): typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.create")
  @js.native
  def create(properties: IFileOptions): typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions = js.native
  
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions = js.native
  /**
    * Decodes a FileOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions = js.native
  
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions = js.native
  /**
    * Decodes a FileOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions = js.native
  
  /**
    * Encodes the specified FileOptions message. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
    * @param message FileOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.encode")
  @js.native
  def encode(message: IFileOptions): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.encode")
  @js.native
  def encode(message: IFileOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FileOptions message, length delimited. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
    * @param message FileOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFileOptions): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFileOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates a FileOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileOptions
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions = js.native
  
  /**
    * Creates a plain object from a FileOptions message. Also converts values to other types if specified.
    * @param message FileOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleCloudTextToSpeech.mod.google.protobuf.FileOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FileOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FileOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
