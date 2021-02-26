package typingsSlinky.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions.OptimizeMode
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileOptions. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions")
@js.native
/**
  * Constructs a new FileOptions.
  * @param [properties] Properties to set
  */
class FileOptions () extends IFileOptions {
  def this(properties: IFileOptions) = this()
  
  /** FileOptions ccEnableArenas. */
  @JSName("ccEnableArenas")
  var ccEnableArenas_FileOptions: Boolean = js.native
  
  /** FileOptions ccGenericServices. */
  @JSName("ccGenericServices")
  var ccGenericServices_FileOptions: Boolean = js.native
  
  /** FileOptions csharpNamespace. */
  @JSName("csharpNamespace")
  var csharpNamespace_FileOptions: String = js.native
  
  /** FileOptions deprecated. */
  @JSName("deprecated")
  var deprecated_FileOptions: Boolean = js.native
  
  /** FileOptions goPackage. */
  @JSName("goPackage")
  var goPackage_FileOptions: String = js.native
  
  /** FileOptions javaGenerateEqualsAndHash. */
  @JSName("javaGenerateEqualsAndHash")
  var javaGenerateEqualsAndHash_FileOptions: Boolean = js.native
  
  /** FileOptions javaGenericServices. */
  @JSName("javaGenericServices")
  var javaGenericServices_FileOptions: Boolean = js.native
  
  /** FileOptions javaMultipleFiles. */
  @JSName("javaMultipleFiles")
  var javaMultipleFiles_FileOptions: Boolean = js.native
  
  /** FileOptions javaOuterClassname. */
  @JSName("javaOuterClassname")
  var javaOuterClassname_FileOptions: String = js.native
  
  /** FileOptions javaPackage. */
  @JSName("javaPackage")
  var javaPackage_FileOptions: String = js.native
  
  /** FileOptions javaStringCheckUtf8. */
  @JSName("javaStringCheckUtf8")
  var javaStringCheckUtf8_FileOptions: Boolean = js.native
  
  /** FileOptions objcClassPrefix. */
  @JSName("objcClassPrefix")
  var objcClassPrefix_FileOptions: String = js.native
  
  /** FileOptions optimizeFor. */
  @JSName("optimizeFor")
  var optimizeFor_FileOptions: OptimizeMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FileOptions.OptimizeMode * / any */ String) = js.native
  
  /** FileOptions phpClassPrefix. */
  @JSName("phpClassPrefix")
  var phpClassPrefix_FileOptions: String = js.native
  
  /** FileOptions phpGenericServices. */
  @JSName("phpGenericServices")
  var phpGenericServices_FileOptions: Boolean = js.native
  
  /** FileOptions phpMetadataNamespace. */
  @JSName("phpMetadataNamespace")
  var phpMetadataNamespace_FileOptions: String = js.native
  
  /** FileOptions phpNamespace. */
  @JSName("phpNamespace")
  var phpNamespace_FileOptions: String = js.native
  
  /** FileOptions pyGenericServices. */
  @JSName("pyGenericServices")
  var pyGenericServices_FileOptions: Boolean = js.native
  
  /** FileOptions rubyPackage. */
  @JSName("rubyPackage")
  var rubyPackage_FileOptions: String = js.native
  
  /** FileOptions swiftPrefix. */
  @JSName("swiftPrefix")
  var swiftPrefix_FileOptions: String = js.native
  
  /**
    * Converts this FileOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** FileOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_FileOptions: js.Array[IUninterpretedOption] = js.native
}
object FileOptions {
  
  @js.native
  sealed trait OptimizeMode extends StObject
  /** OptimizeMode enum. */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.OptimizeMode")
  @js.native
  object OptimizeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OptimizeMode with Double] = js.native
    
    @js.native
    sealed trait CODE_SIZE extends OptimizeMode
    /* 2 */ val CODE_SIZE: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions.OptimizeMode.CODE_SIZE with Double = js.native
    
    @js.native
    sealed trait LITE_RUNTIME extends OptimizeMode
    /* 3 */ val LITE_RUNTIME: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions.OptimizeMode.LITE_RUNTIME with Double = js.native
    
    @js.native
    sealed trait SPEED extends OptimizeMode
    /* 1 */ val SPEED: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FileOptions.OptimizeMode.SPEED with Double = js.native
  }
  
  /**
    * Creates a new FileOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileOptions instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.create")
  @js.native
  def create(): FileOptions = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.create")
  @js.native
  def create(properties: IFileOptions): FileOptions = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): FileOptions = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): FileOptions = js.native
  /**
    * Decodes a FileOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.decode")
  @js.native
  def decode(reader: Reader): FileOptions = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): FileOptions = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): FileOptions = js.native
  /**
    * Decodes a FileOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): FileOptions = js.native
  
  /**
    * Encodes the specified FileOptions message. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
    * @param message FileOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.encode")
  @js.native
  def encode(message: IFileOptions): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.encode")
  @js.native
  def encode(message: IFileOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FileOptions message, length delimited. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
    * @param message FileOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFileOptions): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFileOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates a FileOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileOptions
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): FileOptions = js.native
  
  /**
    * Creates a plain object from a FileOptions message. Also converts values to other types if specified.
    * @param message FileOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.toObject")
  @js.native
  def toObject(message: FileOptions): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.toObject")
  @js.native
  def toObject(message: FileOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FileOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FileOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
