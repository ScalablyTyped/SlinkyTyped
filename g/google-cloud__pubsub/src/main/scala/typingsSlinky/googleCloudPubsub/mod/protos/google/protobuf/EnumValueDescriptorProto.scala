package typingsSlinky.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.IEnumValueDescriptorProto
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumValueDescriptorProto. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto")
@js.native
/**
  * Constructs a new EnumValueDescriptorProto.
  * @param [properties] Properties to set
  */
class EnumValueDescriptorProto ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumValueDescriptorProto {
  def this(properties: IEnumValueDescriptorProto) = this()
}
object EnumValueDescriptorProto {
  
  /**
    * Creates a new EnumValueDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumValueDescriptorProto instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.create")
  @js.native
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumValueDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.create")
  @js.native
  def create(properties: IEnumValueDescriptorProto): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumValueDescriptorProto = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumValueDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumValueDescriptorProto = js.native
  /**
    * Decodes an EnumValueDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumValueDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumValueDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumValueDescriptorProto = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumValueDescriptorProto = js.native
  /**
    * Decodes an EnumValueDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumValueDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumValueDescriptorProto = js.native
  
  /**
    * Encodes the specified EnumValueDescriptorProto message. Does not implicitly {@link google.protobuf.EnumValueDescriptorProto.verify|verify} messages.
    * @param message EnumValueDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.encode")
  @js.native
  def encode(message: IEnumValueDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.encode")
  @js.native
  def encode(message: IEnumValueDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EnumValueDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumValueDescriptorProto.verify|verify} messages.
    * @param message EnumValueDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnumValueDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnumValueDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates an EnumValueDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumValueDescriptorProto
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumValueDescriptorProto = js.native
  
  /**
    * Creates a plain object from an EnumValueDescriptorProto message. Also converts values to other types if specified.
    * @param message EnumValueDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumValueDescriptorProto): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumValueDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EnumValueDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumValueDescriptorProto.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
