package typingsSlinky.apolloEngineReportingProtobuf.mod.Trace

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.ICachePolicy
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a CachePolicy. */
@JSImport("apollo-engine-reporting-protobuf", "Trace.CachePolicy")
@js.native
/**
  * Constructs a new CachePolicy.
  * @param [properties] Properties to set
  */
class CachePolicy ()
  extends typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy {
  def this(properties: ICachePolicy) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "Trace.CachePolicy")
@js.native
object CachePolicy extends js.Object {
  /**
    * Creates a new CachePolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CachePolicy instance
    */
  def create(): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  def create(properties: ICachePolicy): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  /**
    * Decodes a CachePolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CachePolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  /**
    * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CachePolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  /**
    * Encodes the specified CachePolicy message. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
    * @param message CachePolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICachePolicy): Writer = js.native
  def encode(message: ICachePolicy, writer: Writer): Writer = js.native
  /**
    * Encodes the specified CachePolicy message, length delimited. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
    * @param message CachePolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICachePolicy): Writer = js.native
  def encodeDelimited(message: ICachePolicy, writer: Writer): Writer = js.native
  /**
    * Creates a CachePolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CachePolicy
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  /**
    * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
    * @param message CachePolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a CachePolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Scope enum. */
  @js.native
  object Scope extends js.Object {
    /* 2 */ val PRIVATE: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.PRIVATE with Double = js.native
    /* 1 */ val PUBLIC: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.PUBLIC with Double = js.native
    /* 0 */ val UNKNOWN: typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy.Scope with Double
      ] = js.native
  }
  
}

