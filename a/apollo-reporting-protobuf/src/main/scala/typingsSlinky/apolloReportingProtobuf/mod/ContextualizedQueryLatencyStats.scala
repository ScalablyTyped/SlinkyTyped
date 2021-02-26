package typingsSlinky.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.apolloReportingProtobuf.protobufMod.IContextualizedQueryLatencyStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats")
@js.native
/**
  * Constructs a new ContextualizedQueryLatencyStats.
  * @param [properties] Properties to set
  */
class ContextualizedQueryLatencyStats ()
  extends typingsSlinky.apolloReportingProtobuf.protobufMod.ContextualizedQueryLatencyStats {
  def this(properties: IContextualizedQueryLatencyStats) = this()
}
/* static members */
object ContextualizedQueryLatencyStats {
  
  /**
    * Creates a new ContextualizedQueryLatencyStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ContextualizedQueryLatencyStats instance
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.create")
  @js.native
  def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.ContextualizedQueryLatencyStats = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.create")
  @js.native
  def create(properties: IContextualizedQueryLatencyStats): typingsSlinky.apolloReportingProtobuf.protobufMod.ContextualizedQueryLatencyStats = js.native
  
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.ContextualizedQueryLatencyStats = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.ContextualizedQueryLatencyStats = js.native
  /**
    * Decodes a ContextualizedQueryLatencyStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ContextualizedQueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.ContextualizedQueryLatencyStats = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.ContextualizedQueryLatencyStats = js.native
  
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.ContextualizedQueryLatencyStats = js.native
  /**
    * Decodes a ContextualizedQueryLatencyStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ContextualizedQueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.ContextualizedQueryLatencyStats = js.native
  
  /**
    * Encodes the specified ContextualizedQueryLatencyStats message. Does not implicitly {@link ContextualizedQueryLatencyStats.verify|verify} messages.
    * @param message ContextualizedQueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.encode")
  @js.native
  def encode(message: IContextualizedQueryLatencyStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.encode")
  @js.native
  def encode(message: IContextualizedQueryLatencyStats, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ContextualizedQueryLatencyStats message, length delimited. Does not implicitly {@link ContextualizedQueryLatencyStats.verify|verify} messages.
    * @param message ContextualizedQueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: IContextualizedQueryLatencyStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: IContextualizedQueryLatencyStats, writer: Writer): Writer = js.native
  
  /**
    * Creates a ContextualizedQueryLatencyStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ContextualizedQueryLatencyStats
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.ContextualizedQueryLatencyStats = js.native
  
  /**
    * Creates a plain object from a ContextualizedQueryLatencyStats message. Also converts values to other types if specified.
    * @param message ContextualizedQueryLatencyStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.toObject")
  @js.native
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.ContextualizedQueryLatencyStats): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.apolloReportingProtobuf.protobufMod.ContextualizedQueryLatencyStats,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ContextualizedQueryLatencyStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "ContextualizedQueryLatencyStats.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
