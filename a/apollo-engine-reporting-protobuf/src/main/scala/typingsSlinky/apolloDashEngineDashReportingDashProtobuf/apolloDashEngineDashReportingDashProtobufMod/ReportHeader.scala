package typingsSlinky.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.IReportHeader
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsMod.IConversionOptions
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsMod.Reader
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsMod.Writer
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "ReportHeader")
@js.native
/**
  * Constructs a new ReportHeader.
  * @param [properties] Properties to set
  */
class ReportHeader ()
  extends typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ReportHeader {
  def this(properties: IReportHeader) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "ReportHeader")
@js.native
object ReportHeader extends js.Object {
  /**
    * Creates a new ReportHeader instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ReportHeader instance
    */
  def create(): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ReportHeader = js.native
  def create(properties: IReportHeader): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ReportHeader = js.native
  /**
    * Decodes a ReportHeader message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ReportHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ReportHeader = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ReportHeader = js.native
  def decode(reader: Uint8Array): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ReportHeader = js.native
  def decode(reader: Uint8Array, length: Double): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ReportHeader = js.native
  /**
    * Decodes a ReportHeader message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ReportHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ReportHeader = js.native
  def decodeDelimited(reader: Uint8Array): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ReportHeader = js.native
  /**
    * Encodes the specified ReportHeader message. Does not implicitly {@link ReportHeader.verify|verify} messages.
    * @param message ReportHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IReportHeader): Writer = js.native
  def encode(message: IReportHeader, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ReportHeader message, length delimited. Does not implicitly {@link ReportHeader.verify|verify} messages.
    * @param message ReportHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IReportHeader): Writer = js.native
  def encodeDelimited(message: IReportHeader, writer: Writer): Writer = js.native
  /**
    * Creates a ReportHeader message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ReportHeader
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ReportHeader = js.native
  /**
    * Creates a plain object from a ReportHeader message. Also converts values to other types if specified.
    * @param message ReportHeader
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ReportHeader): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ReportHeader,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ReportHeader message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

