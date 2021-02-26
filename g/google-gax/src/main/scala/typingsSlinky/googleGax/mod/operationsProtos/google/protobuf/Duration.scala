package typingsSlinky.googleGax.mod.operationsProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.operationsMod.google.protobuf.IDuration
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Duration. */
@JSImport("google-gax", "operationsProtos.google.protobuf.Duration")
@js.native
/**
  * Constructs a new Duration.
  * @param [properties] Properties to set
  */
class Duration ()
  extends typingsSlinky.googleGax.operationsMod.google.protobuf.Duration {
  def this(properties: IDuration) = this()
}
object Duration {
  
  /**
    * Creates a new Duration instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Duration instance
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.create")
  @js.native
  def create(): typingsSlinky.googleGax.operationsMod.google.protobuf.Duration = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.create")
  @js.native
  def create(properties: IDuration): typingsSlinky.googleGax.operationsMod.google.protobuf.Duration = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.Duration = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.Duration = js.native
  /**
    * Decodes a Duration message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Duration
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.Duration = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleGax.operationsMod.google.protobuf.Duration = js.native
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.operationsMod.google.protobuf.Duration = js.native
  /**
    * Decodes a Duration message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Duration
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleGax.operationsMod.google.protobuf.Duration = js.native
  
  /**
    * Encodes the specified Duration message. Does not implicitly {@link google.protobuf.Duration.verify|verify} messages.
    * @param message Duration message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.encode")
  @js.native
  def encode(message: IDuration): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.encode")
  @js.native
  def encode(message: IDuration, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Duration message, length delimited. Does not implicitly {@link google.protobuf.Duration.verify|verify} messages.
    * @param message Duration message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDuration): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDuration, writer: Writer): Writer = js.native
  
  /**
    * Creates a Duration message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Duration
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleGax.operationsMod.google.protobuf.Duration = js.native
  
  /**
    * Creates a plain object from a Duration message. Also converts values to other types if specified.
    * @param message Duration
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleGax.operationsMod.google.protobuf.Duration): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleGax.operationsMod.google.protobuf.Duration,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Duration message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.Duration.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
