package typingsSlinky.googleGax.iamServiceMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ServiceDescriptorProto. */
@JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto")
@js.native
/**
  * Constructs a new ServiceDescriptorProto.
  * @param [properties] Properties to set
  */
class ServiceDescriptorProto () extends IServiceDescriptorProto {
  def this(properties: IServiceDescriptorProto) = this()
  
  /** ServiceDescriptorProto method. */
  @JSName("method")
  var method_ServiceDescriptorProto: js.Array[IMethodDescriptorProto] = js.native
  
  /** ServiceDescriptorProto name. */
  @JSName("name")
  var name_ServiceDescriptorProto: String = js.native
  
  /**
    * Converts this ServiceDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ServiceDescriptorProto {
  
  /**
    * Creates a new ServiceDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ServiceDescriptorProto instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.create")
  @js.native
  def create(): ServiceDescriptorProto = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.create")
  @js.native
  def create(properties: IServiceDescriptorProto): ServiceDescriptorProto = js.native
  
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ServiceDescriptorProto = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ServiceDescriptorProto = js.native
  /**
    * Decodes a ServiceDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ServiceDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.decode")
  @js.native
  def decode(reader: Reader): ServiceDescriptorProto = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.decode")
  @js.native
  def decode(reader: Reader, length: Double): ServiceDescriptorProto = js.native
  
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ServiceDescriptorProto = js.native
  /**
    * Decodes a ServiceDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ServiceDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ServiceDescriptorProto = js.native
  
  /**
    * Encodes the specified ServiceDescriptorProto message. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
    * @param message ServiceDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.encode")
  @js.native
  def encode(message: IServiceDescriptorProto): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.encode")
  @js.native
  def encode(message: IServiceDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ServiceDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
    * @param message ServiceDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IServiceDescriptorProto): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IServiceDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates a ServiceDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ServiceDescriptorProto
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ServiceDescriptorProto = js.native
  
  /**
    * Creates a plain object from a ServiceDescriptorProto message. Also converts values to other types if specified.
    * @param message ServiceDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.toObject")
  @js.native
  def toObject(message: ServiceDescriptorProto): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.toObject")
  @js.native
  def toObject(message: ServiceDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ServiceDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceDescriptorProto.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
