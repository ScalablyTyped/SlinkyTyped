package typingsSlinky.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.IFieldStat
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "FieldStat")
@js.native
/**
  * Constructs a new FieldStat.
  * @param [properties] Properties to set
  */
class FieldStat ()
  extends typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FieldStat {
  def this(properties: IFieldStat) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "FieldStat")
@js.native
object FieldStat extends js.Object {
  /**
    * Creates a new FieldStat instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldStat instance
    */
  def create(): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FieldStat = js.native
  def create(properties: IFieldStat): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FieldStat = js.native
  /**
    * Decodes a FieldStat message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FieldStat = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FieldStat = js.native
  def decode(reader: Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FieldStat = js.native
  def decode(reader: Uint8Array, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FieldStat = js.native
  /**
    * Decodes a FieldStat message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FieldStat = js.native
  def decodeDelimited(reader: Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FieldStat = js.native
  /**
    * Encodes the specified FieldStat message. Does not implicitly {@link FieldStat.verify|verify} messages.
    * @param message FieldStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFieldStat): Writer = js.native
  def encode(message: IFieldStat, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FieldStat message, length delimited. Does not implicitly {@link FieldStat.verify|verify} messages.
    * @param message FieldStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFieldStat): Writer = js.native
  def encodeDelimited(message: IFieldStat, writer: Writer): Writer = js.native
  /**
    * Creates a FieldStat message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldStat
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FieldStat = js.native
  /**
    * Creates a plain object from a FieldStat message. Also converts values to other types if specified.
    * @param message FieldStat
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FieldStat): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.FieldStat,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FieldStat message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

