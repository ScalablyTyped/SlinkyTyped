package typingsSlinky.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.apolloReportingProtobuf.protobufMod.IFieldStat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "FieldStat")
@js.native
/**
  * Constructs a new FieldStat.
  * @param [properties] Properties to set
  */
class FieldStat ()
  extends typingsSlinky.apolloReportingProtobuf.protobufMod.FieldStat {
  def this(properties: IFieldStat) = this()
}
/* static members */
object FieldStat {
  
  /**
    * Creates a new FieldStat instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldStat instance
    */
  @JSImport("apollo-reporting-protobuf", "FieldStat.create")
  @js.native
  def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.FieldStat = js.native
  @JSImport("apollo-reporting-protobuf", "FieldStat.create")
  @js.native
  def create(properties: IFieldStat): typingsSlinky.apolloReportingProtobuf.protobufMod.FieldStat = js.native
  
  @JSImport("apollo-reporting-protobuf", "FieldStat.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.FieldStat = js.native
  @JSImport("apollo-reporting-protobuf", "FieldStat.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.FieldStat = js.native
  /**
    * Decodes a FieldStat message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "FieldStat.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.FieldStat = js.native
  @JSImport("apollo-reporting-protobuf", "FieldStat.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.FieldStat = js.native
  
  @JSImport("apollo-reporting-protobuf", "FieldStat.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.FieldStat = js.native
  /**
    * Decodes a FieldStat message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "FieldStat.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.FieldStat = js.native
  
  /**
    * Encodes the specified FieldStat message. Does not implicitly {@link FieldStat.verify|verify} messages.
    * @param message FieldStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "FieldStat.encode")
  @js.native
  def encode(message: IFieldStat): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "FieldStat.encode")
  @js.native
  def encode(message: IFieldStat, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FieldStat message, length delimited. Does not implicitly {@link FieldStat.verify|verify} messages.
    * @param message FieldStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "FieldStat.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldStat): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "FieldStat.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldStat, writer: Writer): Writer = js.native
  
  /**
    * Creates a FieldStat message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldStat
    */
  @JSImport("apollo-reporting-protobuf", "FieldStat.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.FieldStat = js.native
  
  /**
    * Creates a plain object from a FieldStat message. Also converts values to other types if specified.
    * @param message FieldStat
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "FieldStat.toObject")
  @js.native
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.FieldStat): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "FieldStat.toObject")
  @js.native
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.FieldStat, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FieldStat message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "FieldStat.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
