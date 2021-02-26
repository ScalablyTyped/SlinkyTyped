package typingsSlinky.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldMask. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask")
@js.native
/**
  * Constructs a new FieldMask.
  * @param [properties] Properties to set
  */
class FieldMask () extends IFieldMask {
  def this(properties: IFieldMask) = this()
  
  /** FieldMask paths. */
  @JSName("paths")
  var paths_FieldMask: js.Array[String] = js.native
  
  /**
    * Converts this FieldMask to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object FieldMask {
  
  /**
    * Creates a new FieldMask instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldMask instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.create")
  @js.native
  def create(): FieldMask = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.create")
  @js.native
  def create(properties: IFieldMask): FieldMask = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): FieldMask = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): FieldMask = js.native
  /**
    * Decodes a FieldMask message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldMask
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.decode")
  @js.native
  def decode(reader: Reader): FieldMask = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.decode")
  @js.native
  def decode(reader: Reader, length: Double): FieldMask = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): FieldMask = js.native
  /**
    * Decodes a FieldMask message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldMask
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): FieldMask = js.native
  
  /**
    * Encodes the specified FieldMask message. Does not implicitly {@link google.protobuf.FieldMask.verify|verify} messages.
    * @param message FieldMask message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.encode")
  @js.native
  def encode(message: IFieldMask): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.encode")
  @js.native
  def encode(message: IFieldMask, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FieldMask message, length delimited. Does not implicitly {@link google.protobuf.FieldMask.verify|verify} messages.
    * @param message FieldMask message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldMask): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldMask, writer: Writer): Writer = js.native
  
  /**
    * Creates a FieldMask message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldMask
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): FieldMask = js.native
  
  /**
    * Creates a plain object from a FieldMask message. Also converts values to other types if specified.
    * @param message FieldMask
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.toObject")
  @js.native
  def toObject(message: FieldMask): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.toObject")
  @js.native
  def toObject(message: FieldMask, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FieldMask message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldMask.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
