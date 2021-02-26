package typingsSlinky.googleGax.mod.IamProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.iamServiceMod.google.protobuf.IMessageOptions
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MessageOptions. */
@JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions")
@js.native
/**
  * Constructs a new MessageOptions.
  * @param [properties] Properties to set
  */
class MessageOptions ()
  extends typingsSlinky.googleGax.iamServiceMod.google.protobuf.MessageOptions {
  def this(properties: IMessageOptions) = this()
}
object MessageOptions {
  
  /**
    * Creates a new MessageOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MessageOptions instance
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.create")
  @js.native
  def create(): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MessageOptions = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.create")
  @js.native
  def create(properties: IMessageOptions): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MessageOptions = js.native
  
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MessageOptions = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MessageOptions = js.native
  /**
    * Decodes a MessageOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MessageOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MessageOptions = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MessageOptions = js.native
  
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MessageOptions = js.native
  /**
    * Decodes a MessageOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MessageOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MessageOptions = js.native
  
  /**
    * Encodes the specified MessageOptions message. Does not implicitly {@link google.protobuf.MessageOptions.verify|verify} messages.
    * @param message MessageOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.encode")
  @js.native
  def encode(message: IMessageOptions): Writer = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.encode")
  @js.native
  def encode(message: IMessageOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified MessageOptions message, length delimited. Does not implicitly {@link google.protobuf.MessageOptions.verify|verify} messages.
    * @param message MessageOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMessageOptions): Writer = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMessageOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates a MessageOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MessageOptions
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MessageOptions = js.native
  
  /**
    * Creates a plain object from a MessageOptions message. Also converts values to other types if specified.
    * @param message MessageOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleGax.iamServiceMod.google.protobuf.MessageOptions): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleGax.iamServiceMod.google.protobuf.MessageOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a MessageOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MessageOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
