package typingsSlinky.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.IDetails
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsMod.IConversionOptions
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsMod.Reader
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsMod.Writer
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Details. */
@JSImport("apollo-engine-reporting-protobuf", "Trace.Details")
@js.native
/**
  * Constructs a new Details.
  * @param [properties] Properties to set
  */
class Details ()
  extends typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Details {
  def this(properties: IDetails) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "Trace.Details")
@js.native
object Details extends js.Object {
  /**
    * Creates a new Details instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Details instance
    */
  def create(): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Details = js.native
  def create(properties: IDetails): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Details = js.native
  /**
    * Decodes a Details message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Details
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Details = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Details = js.native
  def decode(reader: Uint8Array): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Details = js.native
  def decode(reader: Uint8Array, length: Double): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Details = js.native
  /**
    * Decodes a Details message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Details
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Details = js.native
  def decodeDelimited(reader: Uint8Array): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Details = js.native
  /**
    * Encodes the specified Details message. Does not implicitly {@link Trace.Details.verify|verify} messages.
    * @param message Details message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDetails): Writer = js.native
  def encode(message: IDetails, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Details message, length delimited. Does not implicitly {@link Trace.Details.verify|verify} messages.
    * @param message Details message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDetails): Writer = js.native
  def encodeDelimited(message: IDetails, writer: Writer): Writer = js.native
  /**
    * Creates a Details message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Details
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Details = js.native
  /**
    * Creates a plain object from a Details message. Also converts values to other types if specified.
    * @param message Details
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Details): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Details,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Details message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

