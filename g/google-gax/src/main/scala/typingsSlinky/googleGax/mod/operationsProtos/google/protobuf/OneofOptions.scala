package typingsSlinky.googleGax.mod.operationsProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.operationsMod.google.protobuf.IOneofOptions
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an OneofOptions. */
@JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions")
@js.native
/**
  * Constructs a new OneofOptions.
  * @param [properties] Properties to set
  */
class OneofOptions ()
  extends typingsSlinky.googleGax.operationsMod.google.protobuf.OneofOptions {
  def this(properties: IOneofOptions) = this()
}
object OneofOptions {
  
  /**
    * Creates a new OneofOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OneofOptions instance
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.create")
  @js.native
  def create(): typingsSlinky.googleGax.operationsMod.google.protobuf.OneofOptions = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.create")
  @js.native
  def create(properties: IOneofOptions): typingsSlinky.googleGax.operationsMod.google.protobuf.OneofOptions = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.OneofOptions = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.OneofOptions = js.native
  /**
    * Decodes an OneofOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OneofOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.OneofOptions = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.OneofOptions = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.OneofOptions = js.native
  /**
    * Decodes an OneofOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OneofOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.OneofOptions = js.native
  
  /**
    * Encodes the specified OneofOptions message. Does not implicitly {@link google.protobuf.OneofOptions.verify|verify} messages.
    * @param message OneofOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.encode")
  @js.native
  def encode(message: IOneofOptions): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.encode")
  @js.native
  def encode(message: IOneofOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified OneofOptions message, length delimited. Does not implicitly {@link google.protobuf.OneofOptions.verify|verify} messages.
    * @param message OneofOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IOneofOptions): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IOneofOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates an OneofOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OneofOptions
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleGax.operationsMod.google.protobuf.OneofOptions = js.native
  
  /**
    * Creates a plain object from an OneofOptions message. Also converts values to other types if specified.
    * @param message OneofOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleGax.operationsMod.google.protobuf.OneofOptions): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleGax.operationsMod.google.protobuf.OneofOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an OneofOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.OneofOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
