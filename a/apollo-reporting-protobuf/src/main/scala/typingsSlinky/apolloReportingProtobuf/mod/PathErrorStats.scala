package typingsSlinky.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.apolloReportingProtobuf.protobufMod.IPathErrorStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "PathErrorStats")
@js.native
/**
  * Constructs a new PathErrorStats.
  * @param [properties] Properties to set
  */
class PathErrorStats ()
  extends typingsSlinky.apolloReportingProtobuf.protobufMod.PathErrorStats {
  def this(properties: IPathErrorStats) = this()
}
/* static members */
object PathErrorStats {
  
  /**
    * Creates a new PathErrorStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PathErrorStats instance
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.create")
  @js.native
  def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.create")
  @js.native
  def create(properties: IPathErrorStats): typingsSlinky.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  /**
    * Decodes a PathErrorStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PathErrorStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  /**
    * Decodes a PathErrorStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PathErrorStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  
  /**
    * Encodes the specified PathErrorStats message. Does not implicitly {@link PathErrorStats.verify|verify} messages.
    * @param message PathErrorStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.encode")
  @js.native
  def encode(message: IPathErrorStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.encode")
  @js.native
  def encode(message: IPathErrorStats, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PathErrorStats message, length delimited. Does not implicitly {@link PathErrorStats.verify|verify} messages.
    * @param message PathErrorStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPathErrorStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPathErrorStats, writer: Writer): Writer = js.native
  
  /**
    * Creates a PathErrorStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PathErrorStats
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  
  /**
    * Creates a plain object from a PathErrorStats message. Also converts values to other types if specified.
    * @param message PathErrorStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.toObject")
  @js.native
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.PathErrorStats): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.apolloReportingProtobuf.protobufMod.PathErrorStats,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PathErrorStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
