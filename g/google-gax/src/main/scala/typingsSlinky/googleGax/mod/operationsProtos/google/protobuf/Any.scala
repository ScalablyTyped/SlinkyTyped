package typingsSlinky.googleGax.mod.operationsProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.operationsMod.google.protobuf.IAny
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Any. */
@JSImport("google-gax", "operationsProtos.google.protobuf.Any")
@js.native
/**
  * Constructs a new Any.
  * @param [properties] Properties to set
  */
class Any ()
  extends typingsSlinky.googleGax.operationsMod.google.protobuf.Any {
  def this(properties: IAny) = this()
}
object Any {
  
  /**
    * Creates a new Any instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Any instance
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.create")
  @js.native
  def create(): typingsSlinky.googleGax.operationsMod.google.protobuf.Any = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.create")
  @js.native
  def create(properties: IAny): typingsSlinky.googleGax.operationsMod.google.protobuf.Any = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.Any = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.Any = js.native
  /**
    * Decodes an Any message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Any
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.Any = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.Any = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.Any = js.native
  /**
    * Decodes an Any message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Any
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.Any = js.native
  
  /**
    * Encodes the specified Any message. Does not implicitly {@link google.protobuf.Any.verify|verify} messages.
    * @param message Any message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.encode")
  @js.native
  def encode(message: IAny): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.encode")
  @js.native
  def encode(message: IAny, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Any message, length delimited. Does not implicitly {@link google.protobuf.Any.verify|verify} messages.
    * @param message Any message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.encodeDelimited")
  @js.native
  def encodeDelimited(message: IAny): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.encodeDelimited")
  @js.native
  def encodeDelimited(message: IAny, writer: Writer): Writer = js.native
  
  /**
    * Creates an Any message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Any
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleGax.operationsMod.google.protobuf.Any = js.native
  
  /**
    * Creates a plain object from an Any message. Also converts values to other types if specified.
    * @param message Any
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleGax.operationsMod.google.protobuf.Any): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleGax.operationsMod.google.protobuf.Any, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Any message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Any.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
