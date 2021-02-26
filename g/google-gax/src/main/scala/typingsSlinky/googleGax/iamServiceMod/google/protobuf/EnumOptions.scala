package typingsSlinky.googleGax.iamServiceMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumOptions. */
@JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions")
@js.native
/**
  * Constructs a new EnumOptions.
  * @param [properties] Properties to set
  */
class EnumOptions () extends IEnumOptions {
  def this(properties: IEnumOptions) = this()
  
  /** EnumOptions allowAlias. */
  @JSName("allowAlias")
  var allowAlias_EnumOptions: Boolean = js.native
  
  /** EnumOptions deprecated. */
  @JSName("deprecated")
  var deprecated_EnumOptions: Boolean = js.native
  
  /**
    * Converts this EnumOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** EnumOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_EnumOptions: js.Array[IUninterpretedOption] = js.native
}
object EnumOptions {
  
  /**
    * Creates a new EnumOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumOptions instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.create")
  @js.native
  def create(): EnumOptions = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.create")
  @js.native
  def create(properties: IEnumOptions): EnumOptions = js.native
  
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): EnumOptions = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): EnumOptions = js.native
  /**
    * Decodes an EnumOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.decode")
  @js.native
  def decode(reader: Reader): EnumOptions = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): EnumOptions = js.native
  
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): EnumOptions = js.native
  /**
    * Decodes an EnumOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): EnumOptions = js.native
  
  /**
    * Encodes the specified EnumOptions message. Does not implicitly {@link google.protobuf.EnumOptions.verify|verify} messages.
    * @param message EnumOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.encode")
  @js.native
  def encode(message: IEnumOptions): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.encode")
  @js.native
  def encode(message: IEnumOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EnumOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumOptions.verify|verify} messages.
    * @param message EnumOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnumOptions): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnumOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates an EnumOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumOptions
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): EnumOptions = js.native
  
  /**
    * Creates a plain object from an EnumOptions message. Also converts values to other types if specified.
    * @param message EnumOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.toObject")
  @js.native
  def toObject(message: EnumOptions): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.toObject")
  @js.native
  def toObject(message: EnumOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EnumOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.EnumOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
