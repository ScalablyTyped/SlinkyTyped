package typingsSlinky.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.apolloReportingProtobuf.protobufMod.ITracesAndStats
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
@JSImport("apollo-reporting-protobuf", "TracesAndStats")
@js.native
object TracesAndStats extends js.Object {
  
  /**
    * Creates a new TracesAndStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TracesAndStats instance
    */
  def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  def create(properties: ITracesAndStats): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  
  /**
    * Decodes a TracesAndStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TracesAndStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  
  /**
    * Decodes a TracesAndStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TracesAndStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  
  /**
    * Encodes the specified TracesAndStats message. Does not implicitly {@link TracesAndStats.verify|verify} messages.
    * @param message TracesAndStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITracesAndStats): Writer = js.native
  def encode(message: ITracesAndStats, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TracesAndStats message, length delimited. Does not implicitly {@link TracesAndStats.verify|verify} messages.
    * @param message TracesAndStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITracesAndStats): Writer = js.native
  def encodeDelimited(message: ITracesAndStats, writer: Writer): Writer = js.native
  
  /**
    * Creates a TracesAndStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TracesAndStats
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats = js.native
  
  /**
    * Creates a plain object from a TracesAndStats message. Also converts values to other types if specified.
    * @param message TracesAndStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.apolloReportingProtobuf.protobufMod.TracesAndStats,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TracesAndStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
