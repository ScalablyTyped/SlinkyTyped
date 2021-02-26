package typingsSlinky.googleGax.mod.operationsProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.operationsMod.google.protobuf.IExtensionRangeOptions
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExtensionRangeOptions. */
@JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions")
@js.native
/**
  * Constructs a new ExtensionRangeOptions.
  * @param [properties] Properties to set
  */
class ExtensionRangeOptions ()
  extends typingsSlinky.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions {
  def this(properties: IExtensionRangeOptions) = this()
}
object ExtensionRangeOptions {
  
  /**
    * Creates a new ExtensionRangeOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExtensionRangeOptions instance
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.create")
  @js.native
  def create(): typingsSlinky.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.create")
  @js.native
  def create(properties: IExtensionRangeOptions): typingsSlinky.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = js.native
  /**
    * Decodes an ExtensionRangeOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExtensionRangeOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = js.native
  /**
    * Decodes an ExtensionRangeOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExtensionRangeOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = js.native
  
  /**
    * Encodes the specified ExtensionRangeOptions message. Does not implicitly {@link google.protobuf.ExtensionRangeOptions.verify|verify} messages.
    * @param message ExtensionRangeOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.encode")
  @js.native
  def encode(message: IExtensionRangeOptions): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.encode")
  @js.native
  def encode(message: IExtensionRangeOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ExtensionRangeOptions message, length delimited. Does not implicitly {@link google.protobuf.ExtensionRangeOptions.verify|verify} messages.
    * @param message ExtensionRangeOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IExtensionRangeOptions): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IExtensionRangeOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates an ExtensionRangeOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExtensionRangeOptions
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions = js.native
  
  /**
    * Creates a plain object from an ExtensionRangeOptions message. Also converts values to other types if specified.
    * @param message ExtensionRangeOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleGax.operationsMod.google.protobuf.ExtensionRangeOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an ExtensionRangeOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.ExtensionRangeOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
