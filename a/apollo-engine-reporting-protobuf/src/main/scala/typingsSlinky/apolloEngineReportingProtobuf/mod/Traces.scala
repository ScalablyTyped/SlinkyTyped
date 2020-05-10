package typingsSlinky.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.ITraces
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "Traces")
@js.native
/**
  * Constructs a new Traces.
  * @param [properties] Properties to set
  */
class Traces ()
  extends typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Traces {
  def this(properties: ITraces) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "Traces")
@js.native
object Traces extends js.Object {
  /**
    * Creates a new Traces instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Traces instance
    */
  def create(): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Traces = js.native
  def create(properties: ITraces): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Traces = js.native
  /**
    * Decodes a Traces message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Traces
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Traces = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Traces = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Traces = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Traces = js.native
  /**
    * Decodes a Traces message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Traces
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Traces = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Traces = js.native
  /**
    * Encodes the specified Traces message. Does not implicitly {@link Traces.verify|verify} messages.
    * @param message Traces message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITraces): Writer = js.native
  def encode(message: ITraces, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Traces message, length delimited. Does not implicitly {@link Traces.verify|verify} messages.
    * @param message Traces message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITraces): Writer = js.native
  def encodeDelimited(message: ITraces, writer: Writer): Writer = js.native
  /**
    * Creates a Traces message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Traces
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Traces = js.native
  /**
    * Creates a plain object from a Traces message. Also converts values to other types if specified.
    * @param message Traces
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Traces): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Traces,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Traces message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

