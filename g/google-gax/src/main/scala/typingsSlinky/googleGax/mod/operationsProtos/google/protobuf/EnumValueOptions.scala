package typingsSlinky.googleGax.mod.operationsProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.operationsMod.google.protobuf.IEnumValueOptions
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumValueOptions. */
@JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions")
@js.native
/**
  * Constructs a new EnumValueOptions.
  * @param [properties] Properties to set
  */
class EnumValueOptions ()
  extends typingsSlinky.googleGax.operationsMod.google.protobuf.EnumValueOptions {
  def this(properties: IEnumValueOptions) = this()
}
object EnumValueOptions {
  
  /**
    * Creates a new EnumValueOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumValueOptions instance
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.create")
  @js.native
  def create(): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumValueOptions = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.create")
  @js.native
  def create(properties: IEnumValueOptions): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumValueOptions = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumValueOptions = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumValueOptions = js.native
  /**
    * Decodes an EnumValueOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumValueOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumValueOptions = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumValueOptions = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumValueOptions = js.native
  /**
    * Decodes an EnumValueOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumValueOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumValueOptions = js.native
  
  /**
    * Encodes the specified EnumValueOptions message. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
    * @param message EnumValueOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.encode")
  @js.native
  def encode(message: IEnumValueOptions): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.encode")
  @js.native
  def encode(message: IEnumValueOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EnumValueOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
    * @param message EnumValueOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnumValueOptions): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnumValueOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates an EnumValueOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumValueOptions
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleGax.operationsMod.google.protobuf.EnumValueOptions = js.native
  
  /**
    * Creates a plain object from an EnumValueOptions message. Also converts values to other types if specified.
    * @param message EnumValueOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleGax.operationsMod.google.protobuf.EnumValueOptions): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleGax.operationsMod.google.protobuf.EnumValueOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EnumValueOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumValueOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
