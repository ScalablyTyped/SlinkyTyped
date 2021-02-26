package typingsSlinky.googleGax.mod.IamProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.iamServiceMod.google.protobuf.IMethodDescriptorProto
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MethodDescriptorProto. */
@JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto")
@js.native
/**
  * Constructs a new MethodDescriptorProto.
  * @param [properties] Properties to set
  */
class MethodDescriptorProto ()
  extends typingsSlinky.googleGax.iamServiceMod.google.protobuf.MethodDescriptorProto {
  def this(properties: IMethodDescriptorProto) = this()
}
object MethodDescriptorProto {
  
  /**
    * Creates a new MethodDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MethodDescriptorProto instance
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.create")
  @js.native
  def create(): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MethodDescriptorProto = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.create")
  @js.native
  def create(properties: IMethodDescriptorProto): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MethodDescriptorProto = js.native
  
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MethodDescriptorProto = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MethodDescriptorProto = js.native
  /**
    * Decodes a MethodDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MethodDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MethodDescriptorProto = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MethodDescriptorProto = js.native
  
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MethodDescriptorProto = js.native
  /**
    * Decodes a MethodDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MethodDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MethodDescriptorProto = js.native
  
  /**
    * Encodes the specified MethodDescriptorProto message. Does not implicitly {@link google.protobuf.MethodDescriptorProto.verify|verify} messages.
    * @param message MethodDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.encode")
  @js.native
  def encode(message: IMethodDescriptorProto): Writer = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.encode")
  @js.native
  def encode(message: IMethodDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified MethodDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.MethodDescriptorProto.verify|verify} messages.
    * @param message MethodDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMethodDescriptorProto): Writer = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMethodDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates a MethodDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MethodDescriptorProto
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleGax.iamServiceMod.google.protobuf.MethodDescriptorProto = js.native
  
  /**
    * Creates a plain object from a MethodDescriptorProto message. Also converts values to other types if specified.
    * @param message MethodDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleGax.iamServiceMod.google.protobuf.MethodDescriptorProto): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleGax.iamServiceMod.google.protobuf.MethodDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a MethodDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.MethodDescriptorProto.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
