package typingsSlinky.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.apolloReportingProtobuf.protobufMod.IStatsContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "StatsContext")
@js.native
/**
  * Constructs a new StatsContext.
  * @param [properties] Properties to set
  */
class StatsContext ()
  extends typingsSlinky.apolloReportingProtobuf.protobufMod.StatsContext {
  def this(properties: IStatsContext) = this()
}
/* static members */
object StatsContext {
  
  /**
    * Creates a new StatsContext instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StatsContext instance
    */
  @JSImport("apollo-reporting-protobuf", "StatsContext.create")
  @js.native
  def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.StatsContext = js.native
  @JSImport("apollo-reporting-protobuf", "StatsContext.create")
  @js.native
  def create(properties: IStatsContext): typingsSlinky.apolloReportingProtobuf.protobufMod.StatsContext = js.native
  
  @JSImport("apollo-reporting-protobuf", "StatsContext.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.StatsContext = js.native
  @JSImport("apollo-reporting-protobuf", "StatsContext.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.StatsContext = js.native
  /**
    * Decodes a StatsContext message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StatsContext
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "StatsContext.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.StatsContext = js.native
  @JSImport("apollo-reporting-protobuf", "StatsContext.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.StatsContext = js.native
  
  @JSImport("apollo-reporting-protobuf", "StatsContext.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.StatsContext = js.native
  /**
    * Decodes a StatsContext message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StatsContext
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "StatsContext.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.StatsContext = js.native
  
  /**
    * Encodes the specified StatsContext message. Does not implicitly {@link StatsContext.verify|verify} messages.
    * @param message StatsContext message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "StatsContext.encode")
  @js.native
  def encode(message: IStatsContext): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "StatsContext.encode")
  @js.native
  def encode(message: IStatsContext, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StatsContext message, length delimited. Does not implicitly {@link StatsContext.verify|verify} messages.
    * @param message StatsContext message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "StatsContext.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStatsContext): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "StatsContext.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStatsContext, writer: Writer): Writer = js.native
  
  /**
    * Creates a StatsContext message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StatsContext
    */
  @JSImport("apollo-reporting-protobuf", "StatsContext.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.StatsContext = js.native
  
  /**
    * Creates a plain object from a StatsContext message. Also converts values to other types if specified.
    * @param message StatsContext
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "StatsContext.toObject")
  @js.native
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.StatsContext): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "StatsContext.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.apolloReportingProtobuf.protobufMod.StatsContext,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StatsContext message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "StatsContext.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
