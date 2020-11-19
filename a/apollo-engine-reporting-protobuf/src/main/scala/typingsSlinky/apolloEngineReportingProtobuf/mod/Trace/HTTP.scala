package typingsSlinky.apolloEngineReportingProtobuf.mod.Trace

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.IValues
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.IHTTP
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a HTTP. */
@JSImport("apollo-engine-reporting-protobuf", "Trace.HTTP")
@js.native
/**
  * Constructs a new HTTP.
  * @param [properties] Properties to set
  */
class HTTP ()
  extends typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP {
  def this(properties: IHTTP) = this()
}
/* static members */
@JSImport("apollo-engine-reporting-protobuf", "Trace.HTTP")
@js.native
object HTTP extends js.Object {
  
  /**
    * Creates a new HTTP instance using the specified properties.
    * @param [properties] Properties to set
    * @returns HTTP instance
    */
  def create(): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def create(properties: IHTTP): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  
  /**
    * Decodes a HTTP message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns HTTP
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  
  /**
    * Decodes a HTTP message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns HTTP
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  
  /**
    * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
    * @param message HTTP message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IHTTP): Writer = js.native
  def encode(message: IHTTP, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified HTTP message, length delimited. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
    * @param message HTTP message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IHTTP): Writer = js.native
  def encodeDelimited(message: IHTTP, writer: Writer): Writer = js.native
  
  /**
    * Creates a HTTP message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns HTTP
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP = js.native
  
  /**
    * Creates a plain object from a HTTP message. Also converts values to other types if specified.
    * @param message HTTP
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a HTTP message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Method enum. */
  @js.native
  object Method extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method with Double
      ] = js.native
    
    /* 8 */ val CONNECT: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method.CONNECT with Double = js.native
    
    /* 6 */ val DELETE: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method.DELETE with Double = js.native
    
    /* 2 */ val GET: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method.GET with Double = js.native
    
    /* 3 */ val HEAD: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method.HEAD with Double = js.native
    
    /* 1 */ val OPTIONS: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method.OPTIONS with Double = js.native
    
    /* 9 */ val PATCH: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method.PATCH with Double = js.native
    
    /* 4 */ val POST: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method.POST with Double = js.native
    
    /* 5 */ val PUT: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method.PUT with Double = js.native
    
    /* 7 */ val TRACE: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method.TRACE with Double = js.native
    
    /* 0 */ val UNKNOWN: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method.UNKNOWN with Double = js.native
  }
  
  /** Represents a Values. */
  @js.native
  /**
    * Constructs a new Values.
    * @param [properties] Properties to set
    */
  class Values ()
    extends typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Values {
    def this(properties: IValues) = this()
  }
  /* static members */
  @js.native
  object Values extends js.Object {
    
    /**
      * Creates a new Values instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Values instance
      */
    def create(): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
    def create(properties: IValues): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
    
    /**
      * Decodes a Values message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Values
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
    
    /**
      * Decodes a Values message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Values
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
    
    /**
      * Encodes the specified Values message. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
      * @param message Values message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IValues): Writer = js.native
    def encode(message: IValues, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Values message, length delimited. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
      * @param message Values message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IValues): Writer = js.native
    def encodeDelimited(message: IValues, writer: Writer): Writer = js.native
    
    /**
      * Creates a Values message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Values
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
    
    /**
      * Creates a plain object from a Values message. Also converts values to other types if specified.
      * @param message Values
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Values): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Values,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Values message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
