package typingsSlinky.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.IPathErrorStats
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-engine-reporting-protobuf", "PathErrorStats")
@js.native
/**
  * Constructs a new PathErrorStats.
  * @param [properties] Properties to set
  */
class PathErrorStats ()
  extends typingsSlinky.apolloEngineReportingProtobuf.protobufMod.PathErrorStats {
  def this(properties: IPathErrorStats) = this()
}
/* static members */
@JSImport("apollo-engine-reporting-protobuf", "PathErrorStats")
@js.native
object PathErrorStats extends js.Object {
  
  /**
    * Creates a new PathErrorStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PathErrorStats instance
    */
  def create(): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.PathErrorStats = js.native
  def create(properties: IPathErrorStats): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.PathErrorStats = js.native
  
  /**
    * Decodes a PathErrorStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PathErrorStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.PathErrorStats = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.PathErrorStats = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.PathErrorStats = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.PathErrorStats = js.native
  
  /**
    * Decodes a PathErrorStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PathErrorStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.PathErrorStats = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.PathErrorStats = js.native
  
  /**
    * Encodes the specified PathErrorStats message. Does not implicitly {@link PathErrorStats.verify|verify} messages.
    * @param message PathErrorStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPathErrorStats): Writer = js.native
  def encode(message: IPathErrorStats, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PathErrorStats message, length delimited. Does not implicitly {@link PathErrorStats.verify|verify} messages.
    * @param message PathErrorStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPathErrorStats): Writer = js.native
  def encodeDelimited(message: IPathErrorStats, writer: Writer): Writer = js.native
  
  /**
    * Creates a PathErrorStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PathErrorStats
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.PathErrorStats = js.native
  
  /**
    * Creates a plain object from a PathErrorStats message. Also converts values to other types if specified.
    * @param message PathErrorStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.PathErrorStats): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.PathErrorStats,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PathErrorStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
