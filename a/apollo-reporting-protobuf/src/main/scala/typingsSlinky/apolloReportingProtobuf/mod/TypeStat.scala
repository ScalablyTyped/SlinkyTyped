package typingsSlinky.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.apolloReportingProtobuf.protobufMod.ITypeStat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "TypeStat")
@js.native
/**
  * Constructs a new TypeStat.
  * @param [properties] Properties to set
  */
class TypeStat ()
  extends typingsSlinky.apolloReportingProtobuf.protobufMod.TypeStat {
  def this(properties: ITypeStat) = this()
}
/* static members */
object TypeStat {
  
  /**
    * Creates a new TypeStat instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TypeStat instance
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.create")
  @js.native
  def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.create")
  @js.native
  def create(properties: ITypeStat): typingsSlinky.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  
  @JSImport("apollo-reporting-protobuf", "TypeStat.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  /**
    * Decodes a TypeStat message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TypeStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  
  @JSImport("apollo-reporting-protobuf", "TypeStat.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  /**
    * Decodes a TypeStat message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TypeStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  
  /**
    * Encodes the specified TypeStat message. Does not implicitly {@link TypeStat.verify|verify} messages.
    * @param message TypeStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.encode")
  @js.native
  def encode(message: ITypeStat): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.encode")
  @js.native
  def encode(message: ITypeStat, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TypeStat message, length delimited. Does not implicitly {@link TypeStat.verify|verify} messages.
    * @param message TypeStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITypeStat): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITypeStat, writer: Writer): Writer = js.native
  
  /**
    * Creates a TypeStat message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TypeStat
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  
  /**
    * Creates a plain object from a TypeStat message. Also converts values to other types if specified.
    * @param message TypeStat
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.toObject")
  @js.native
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.TypeStat): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.toObject")
  @js.native
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.TypeStat, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TypeStat message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
