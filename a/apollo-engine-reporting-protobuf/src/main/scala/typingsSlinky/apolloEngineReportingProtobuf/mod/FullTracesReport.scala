package typingsSlinky.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.IFullTracesReport
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "FullTracesReport")
@js.native
/**
  * Constructs a new FullTracesReport.
  * @param [properties] Properties to set
  */
class FullTracesReport ()
  extends typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FullTracesReport {
  def this(properties: IFullTracesReport) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "FullTracesReport")
@js.native
object FullTracesReport extends js.Object {
  /**
    * Creates a new FullTracesReport instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FullTracesReport instance
    */
  def create(): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FullTracesReport = js.native
  def create(properties: IFullTracesReport): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FullTracesReport = js.native
  /**
    * Decodes a FullTracesReport message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FullTracesReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FullTracesReport = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FullTracesReport = js.native
  def decode(reader: Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FullTracesReport = js.native
  def decode(reader: Uint8Array, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FullTracesReport = js.native
  /**
    * Decodes a FullTracesReport message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FullTracesReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FullTracesReport = js.native
  def decodeDelimited(reader: Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FullTracesReport = js.native
  /**
    * Encodes the specified FullTracesReport message. Does not implicitly {@link FullTracesReport.verify|verify} messages.
    * @param message FullTracesReport message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFullTracesReport): Writer = js.native
  def encode(message: IFullTracesReport, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FullTracesReport message, length delimited. Does not implicitly {@link FullTracesReport.verify|verify} messages.
    * @param message FullTracesReport message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFullTracesReport): Writer = js.native
  def encodeDelimited(message: IFullTracesReport, writer: Writer): Writer = js.native
  /**
    * Creates a FullTracesReport message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FullTracesReport
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FullTracesReport = js.native
  /**
    * Creates a plain object from a FullTracesReport message. Also converts values to other types if specified.
    * @param message FullTracesReport
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FullTracesReport): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FullTracesReport,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FullTracesReport message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

