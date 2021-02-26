package typingsSlinky.googleGax.mod.IamProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.iamServiceMod.google.protobuf.ISourceCodeInfo
import typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo.ILocation
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourceCodeInfo. */
@JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo")
@js.native
/**
  * Constructs a new SourceCodeInfo.
  * @param [properties] Properties to set
  */
class SourceCodeInfo ()
  extends typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo {
  def this(properties: ISourceCodeInfo) = this()
}
object SourceCodeInfo {
  
  /** Represents a Location. */
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location")
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  class Location ()
    extends typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo.Location {
    def this(properties: ILocation) = this()
  }
  object Location {
    
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    /* static member */
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.create")
    @js.native
    def create(): org.scalajs.dom.raw.Location = js.native
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.create")
    @js.native
    def create(properties: ILocation): org.scalajs.dom.raw.Location = js.native
    
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.decode")
    @js.native
    def decode(reader: js.typedarray.Uint8Array): org.scalajs.dom.raw.Location = js.native
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.decode")
    @js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): org.scalajs.dom.raw.Location = js.native
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.decode")
    @js.native
    def decode(reader: Reader): org.scalajs.dom.raw.Location = js.native
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.decode")
    @js.native
    def decode(reader: Reader, length: Double): org.scalajs.dom.raw.Location = js.native
    
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.decodeDelimited")
    @js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): org.scalajs.dom.raw.Location = js.native
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): org.scalajs.dom.raw.Location = js.native
    
    /**
      * Encodes the specified Location message. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.encode")
    @js.native
    def encode(message: ILocation): Writer = js.native
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.encode")
    @js.native
    def encode(message: ILocation, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Location message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILocation): Writer = js.native
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILocation, writer: Writer): Writer = js.native
    
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    /* static member */
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): org.scalajs.dom.raw.Location = js.native
    
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.toObject")
    @js.native
    def toObject(message: org.scalajs.dom.raw.Location): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.toObject")
    @js.native
    def toObject(message: org.scalajs.dom.raw.Location, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new SourceCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourceCodeInfo instance
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.create")
  @js.native
  def create(): typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.create")
  @js.native
  def create(properties: ISourceCodeInfo): typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = js.native
  
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = js.native
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = js.native
  
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = js.native
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = js.native
  
  /**
    * Encodes the specified SourceCodeInfo message. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.encode")
  @js.native
  def encode(message: ISourceCodeInfo): Writer = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.encode")
  @js.native
  def encode(message: ISourceCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SourceCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourceCodeInfo): Writer = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourceCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Creates a SourceCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourceCodeInfo
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = js.native
  
  /**
    * Creates a plain object from a SourceCodeInfo message. Also converts values to other types if specified.
    * @param message SourceCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SourceCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
