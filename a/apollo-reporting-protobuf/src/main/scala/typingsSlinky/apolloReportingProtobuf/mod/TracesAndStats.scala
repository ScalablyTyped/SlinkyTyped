package typingsSlinky.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.apolloReportingProtobuf.protobufMod.ITracesAndStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "TracesAndStats")
@js.native
/**
  * Constructs a new TracesAndStats.
  * @param [properties] Properties to set
  */
class TracesAndStats ()
  extends typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats {
  def this(properties: ITracesAndStats) = this()
}
/* static members */
object TracesAndStats {
  
  /**
    * Creates a new TracesAndStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TracesAndStats instance
    */
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.create")
  @js.native
  def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.create")
  @js.native
  def create(properties: ITracesAndStats): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  /**
    * Decodes a TracesAndStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TracesAndStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  /**
    * Decodes a TracesAndStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TracesAndStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  
  /**
    * Encodes the specified TracesAndStats message. Does not implicitly {@link TracesAndStats.verify|verify} messages.
    * @param message TracesAndStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.encode")
  @js.native
  def encode(message: ITracesAndStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.encode")
  @js.native
  def encode(message: ITracesAndStats, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TracesAndStats message, length delimited. Does not implicitly {@link TracesAndStats.verify|verify} messages.
    * @param message TracesAndStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITracesAndStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITracesAndStats, writer: Writer): Writer = js.native
  
  /**
    * Creates a TracesAndStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TracesAndStats
    */
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  
  /**
    * Creates a plain object from a TracesAndStats message. Also converts values to other types if specified.
    * @param message TracesAndStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.toObject")
  @js.native
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TracesAndStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "TracesAndStats.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
