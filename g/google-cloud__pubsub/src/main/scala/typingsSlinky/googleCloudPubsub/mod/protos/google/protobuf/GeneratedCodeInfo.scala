package typingsSlinky.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.IAnnotation
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.IGeneratedCodeInfo
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GeneratedCodeInfo. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo")
@js.native
/**
  * Constructs a new GeneratedCodeInfo.
  * @param [properties] Properties to set
  */
class GeneratedCodeInfo ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo {
  def this(properties: IGeneratedCodeInfo) = this()
}
object GeneratedCodeInfo {
  
  /** Represents an Annotation. */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation")
  @js.native
  /**
    * Constructs a new Annotation.
    * @param [properties] Properties to set
    */
  class Annotation ()
    extends typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation {
    def this(properties: IAnnotation) = this()
  }
  object Annotation {
    
    /**
      * Creates a new Annotation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Annotation instance
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.create")
    @js.native
    def create(): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.create")
    @js.native
    def create(properties: IAnnotation): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.decode")
    @js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.decode")
    @js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    /**
      * Decodes an Annotation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Annotation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.decode")
    @js.native
    def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.decode")
    @js.native
    def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.decodeDelimited")
    @js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    /**
      * Decodes an Annotation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Annotation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    
    /**
      * Encodes the specified Annotation message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
      * @param message Annotation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.encode")
    @js.native
    def encode(message: IAnnotation): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.encode")
    @js.native
    def encode(message: IAnnotation, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Annotation message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
      * @param message Annotation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.encodeDelimited")
    @js.native
    def encodeDelimited(message: IAnnotation): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.encodeDelimited")
    @js.native
    def encodeDelimited(message: IAnnotation, writer: Writer): Writer = js.native
    
    /**
      * Creates an Annotation message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Annotation
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation = js.native
    
    /**
      * Creates a plain object from an Annotation message. Also converts values to other types if specified.
      * @param message Annotation
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.toObject")
    @js.native
    def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.toObject")
    @js.native
    def toObject(
      message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo.Annotation,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Annotation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.Annotation.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new GeneratedCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GeneratedCodeInfo instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.create")
  @js.native
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.create")
  @js.native
  def create(properties: IGeneratedCodeInfo): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  
  /**
    * Encodes the specified GeneratedCodeInfo message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.encode")
  @js.native
  def encode(message: IGeneratedCodeInfo): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.encode")
  @js.native
  def encode(message: IGeneratedCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GeneratedCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGeneratedCodeInfo): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGeneratedCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Creates a GeneratedCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GeneratedCodeInfo
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo = js.native
  
  /**
    * Creates a plain object from a GeneratedCodeInfo message. Also converts values to other types if specified.
    * @param message GeneratedCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GeneratedCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.GeneratedCodeInfo.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
