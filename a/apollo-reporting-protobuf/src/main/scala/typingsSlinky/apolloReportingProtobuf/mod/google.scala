package typingsSlinky.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object google {
  
  /** Namespace protobuf. */
  object protobuf {
    
    /** Represents a Timestamp. */
    @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp")
    @js.native
    /**
      * Constructs a new Timestamp.
      * @param [properties] Properties to set
      */
    class Timestamp ()
      extends typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp {
      def this(properties: ITimestamp) = this()
    }
    object Timestamp {
      
      /**
        * Creates a new Timestamp instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Timestamp instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.create")
      @js.native
      def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.create")
      @js.native
      def create(properties: ITimestamp): typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.decode")
      @js.native
      def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.decode")
      @js.native
      def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      /**
        * Decodes a Timestamp message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.decode")
      @js.native
      def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.decode")
      @js.native
      def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.decodeDelimited")
      @js.native
      def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      /**
        * Decodes a Timestamp message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      
      /**
        * Encodes the specified Timestamp message. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.encode")
      @js.native
      def encode(message: ITimestamp): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.encode")
      @js.native
      def encode(message: ITimestamp, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Timestamp message, length delimited. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITimestamp): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITimestamp, writer: Writer): Writer = js.native
      
      /**
        * Creates a Timestamp message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Timestamp
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      
      /**
        * Creates a plain object from a Timestamp message. Also converts values to other types if specified.
        * @param message Timestamp
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.toObject")
      @js.native
      def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.toObject")
      @js.native
      def toObject(
        message: typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.Timestamp,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Timestamp message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "google.protobuf.Timestamp.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
  }
}
