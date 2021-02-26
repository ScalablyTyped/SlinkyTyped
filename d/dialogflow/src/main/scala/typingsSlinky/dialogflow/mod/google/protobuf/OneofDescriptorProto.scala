package typingsSlinky.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an OneofDescriptorProto. */
@JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto")
@js.native
/**
  * Constructs a new OneofDescriptorProto.
  * @param [properties] Properties to set
  */
class OneofDescriptorProto () extends IOneofDescriptorProto {
  def this(properties: IOneofDescriptorProto) = this()
  
  /** OneofDescriptorProto name. */
  @JSName("name")
  var name_OneofDescriptorProto: String = js.native
  
  /**
    * Converts this OneofDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object OneofDescriptorProto {
  
  /**
    * Creates a new OneofDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OneofDescriptorProto instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.create")
  @js.native
  def create(): OneofDescriptorProto = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.create")
  @js.native
  def create(properties: IOneofDescriptorProto): OneofDescriptorProto = js.native
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): OneofDescriptorProto = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): OneofDescriptorProto = js.native
  /**
    * Decodes an OneofDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OneofDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.decode")
  @js.native
  def decode(reader: Reader): OneofDescriptorProto = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.decode")
  @js.native
  def decode(reader: Reader, length: Double): OneofDescriptorProto = js.native
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): OneofDescriptorProto = js.native
  /**
    * Decodes an OneofDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OneofDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): OneofDescriptorProto = js.native
  
  /**
    * Encodes the specified OneofDescriptorProto message. Does not implicitly {@link google.protobuf.OneofDescriptorProto.verify|verify} messages.
    * @param message OneofDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.encode")
  @js.native
  def encode(message: IOneofDescriptorProto): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.encode")
  @js.native
  def encode(message: IOneofDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified OneofDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.OneofDescriptorProto.verify|verify} messages.
    * @param message OneofDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IOneofDescriptorProto): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IOneofDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates an OneofDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OneofDescriptorProto
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): OneofDescriptorProto = js.native
  
  /**
    * Creates a plain object from an OneofDescriptorProto message. Also converts values to other types if specified.
    * @param message OneofDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.toObject")
  @js.native
  def toObject(message: OneofDescriptorProto): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.toObject")
  @js.native
  def toObject(message: OneofDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an OneofDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.OneofDescriptorProto.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
