package typingsSlinky.googleGax.mod.operationsProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.operationsMod.google.protobuf.IEnumOptions
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumOptions. */
@JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions")
@js.native
/**
  * Constructs a new EnumOptions.
  * @param [properties] Properties to set
  */
class EnumOptions ()
  extends typingsSlinky.googleGax.operationsMod.google.protobuf.EnumOptions {
  def this(properties: IEnumOptions) = this()
}
object EnumOptions {
  
  /**
    * Creates a new EnumOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumOptions instance
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.create")
  @js.native
  def create(): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumOptions = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.create")
  @js.native
  def create(properties: IEnumOptions): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumOptions = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumOptions = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumOptions = js.native
  /**
    * Decodes an EnumOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumOptions = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumOptions = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumOptions = js.native
  /**
    * Decodes an EnumOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumOptions = js.native
  
  /**
    * Encodes the specified EnumOptions message. Does not implicitly {@link google.protobuf.EnumOptions.verify|verify} messages.
    * @param message EnumOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.encode")
  @js.native
  def encode(message: IEnumOptions): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.encode")
  @js.native
  def encode(message: IEnumOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EnumOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumOptions.verify|verify} messages.
    * @param message EnumOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnumOptions): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnumOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates an EnumOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumOptions
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumOptions = js.native
  
  /**
    * Creates a plain object from an EnumOptions message. Also converts values to other types if specified.
    * @param message EnumOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleGax.operationsMod.google.protobuf.EnumOptions): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleGax.operationsMod.google.protobuf.EnumOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EnumOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
