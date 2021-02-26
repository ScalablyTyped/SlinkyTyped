package typingsSlinky.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.MethodOptions.IdempotencyLevel
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MethodOptions. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions")
@js.native
/**
  * Constructs a new MethodOptions.
  * @param [properties] Properties to set
  */
class MethodOptions () extends IMethodOptions {
  def this(properties: IMethodOptions) = this()
  
  /** MethodOptions deprecated. */
  @JSName("deprecated")
  var deprecated_MethodOptions: Boolean = js.native
  
  /** MethodOptions idempotencyLevel. */
  @JSName("idempotencyLevel")
  var idempotencyLevel_MethodOptions: IdempotencyLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.MethodOptions.IdempotencyLevel * / any */ String) = js.native
  
  /**
    * Converts this MethodOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** MethodOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_MethodOptions: js.Array[IUninterpretedOption] = js.native
}
object MethodOptions {
  
  @js.native
  sealed trait IdempotencyLevel extends StObject
  /** IdempotencyLevel enum. */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.IdempotencyLevel")
  @js.native
  object IdempotencyLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IdempotencyLevel with Double] = js.native
    
    @js.native
    sealed trait IDEMPOTENCY_UNKNOWN extends IdempotencyLevel
    /* 0 */ val IDEMPOTENCY_UNKNOWN: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN with Double = js.native
    
    @js.native
    sealed trait IDEMPOTENT extends IdempotencyLevel
    /* 2 */ val IDEMPOTENT: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.MethodOptions.IdempotencyLevel.IDEMPOTENT with Double = js.native
    
    @js.native
    sealed trait NO_SIDE_EFFECTS extends IdempotencyLevel
    /* 1 */ val NO_SIDE_EFFECTS: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.MethodOptions.IdempotencyLevel.NO_SIDE_EFFECTS with Double = js.native
  }
  
  /**
    * Creates a new MethodOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MethodOptions instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.create")
  @js.native
  def create(): MethodOptions = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.create")
  @js.native
  def create(properties: IMethodOptions): MethodOptions = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): MethodOptions = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): MethodOptions = js.native
  /**
    * Decodes a MethodOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MethodOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.decode")
  @js.native
  def decode(reader: Reader): MethodOptions = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): MethodOptions = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): MethodOptions = js.native
  /**
    * Decodes a MethodOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MethodOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): MethodOptions = js.native
  
  /**
    * Encodes the specified MethodOptions message. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
    * @param message MethodOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.encode")
  @js.native
  def encode(message: IMethodOptions): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.encode")
  @js.native
  def encode(message: IMethodOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified MethodOptions message, length delimited. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
    * @param message MethodOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMethodOptions): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMethodOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates a MethodOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MethodOptions
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): MethodOptions = js.native
  
  /**
    * Creates a plain object from a MethodOptions message. Also converts values to other types if specified.
    * @param message MethodOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.toObject")
  @js.native
  def toObject(message: MethodOptions): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.toObject")
  @js.native
  def toObject(message: MethodOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a MethodOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.MethodOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
