package typingsSlinky.googleGax.mod.operationsProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.operationsMod.google.protobuf.IEmpty
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Empty. */
@JSImport("google-gax", "operationsProtos.google.protobuf.Empty")
@js.native
/**
  * Constructs a new Empty.
  * @param [properties] Properties to set
  */
class Empty ()
  extends typingsSlinky.googleGax.operationsMod.google.protobuf.Empty {
  def this(properties: IEmpty) = this()
}
object Empty {
  
  /**
    * Creates a new Empty instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Empty instance
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.create")
  @js.native
  def create(): typingsSlinky.googleGax.operationsMod.google.protobuf.Empty = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.create")
  @js.native
  def create(properties: IEmpty): typingsSlinky.googleGax.operationsMod.google.protobuf.Empty = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.Empty = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.Empty = js.native
  /**
    * Decodes an Empty message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Empty
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.Empty = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.Empty = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.Empty = js.native
  /**
    * Decodes an Empty message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Empty
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.Empty = js.native
  
  /**
    * Encodes the specified Empty message. Does not implicitly {@link google.protobuf.Empty.verify|verify} messages.
    * @param message Empty message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.encode")
  @js.native
  def encode(message: IEmpty): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.encode")
  @js.native
  def encode(message: IEmpty, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Empty message, length delimited. Does not implicitly {@link google.protobuf.Empty.verify|verify} messages.
    * @param message Empty message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEmpty): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEmpty, writer: Writer): Writer = js.native
  
  /**
    * Creates an Empty message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Empty
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleGax.operationsMod.google.protobuf.Empty = js.native
  
  /**
    * Creates a plain object from an Empty message. Also converts values to other types if specified.
    * @param message Empty
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleGax.operationsMod.google.protobuf.Empty): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleGax.operationsMod.google.protobuf.Empty, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Empty message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Empty.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
