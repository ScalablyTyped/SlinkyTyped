package typingsSlinky.apolloReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CachePolicy. */
@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy")
@js.native
/**
  * Constructs a new CachePolicy.
  * @param [properties] Properties to set
  */
class CachePolicy () extends ICachePolicy {
  def this(properties: ICachePolicy) = this()
  
  /** CachePolicy maxAgeNs. */
  @JSName("maxAgeNs")
  var maxAgeNs_CachePolicy: Double = js.native
  
  /** CachePolicy scope. */
  @JSName("scope")
  var scope_CachePolicy: Scope = js.native
  
  /**
    * Converts this CachePolicy to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy")
@js.native
object CachePolicy extends js.Object {
  
  /**
    * Creates a new CachePolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CachePolicy instance
    */
  def create(): CachePolicy = js.native
  def create(properties: ICachePolicy): CachePolicy = js.native
  
  /**
    * Decodes a CachePolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CachePolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): CachePolicy = js.native
  def decode(reader: Reader, length: Double): CachePolicy = js.native
  def decode(reader: js.typedarray.Uint8Array): CachePolicy = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): CachePolicy = js.native
  
  /**
    * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CachePolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): CachePolicy = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): CachePolicy = js.native
  
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
  def fromObject(`object`: StringDictionary[js.Any]): CachePolicy = js.native
  
  /**
    * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
    * @param message CachePolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: CachePolicy): StringDictionary[js.Any] = js.native
  def toObject(message: CachePolicy, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CachePolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  @js.native
  sealed trait Scope extends js.Object
  /** Scope enum. */
  @js.native
  object Scope extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Scope with Double] = js.native
    
    @js.native
    sealed trait PRIVATE extends Scope
    /* 2 */ @js.native
    object PRIVATE extends TopLevel[PRIVATE with Double]
    
    @js.native
    sealed trait PUBLIC extends Scope
    /* 1 */ @js.native
    object PUBLIC extends TopLevel[PUBLIC with Double]
    
    @js.native
    sealed trait UNKNOWN extends Scope
    /* 0 */ @js.native
    object UNKNOWN extends TopLevel[UNKNOWN with Double]
  }
}
