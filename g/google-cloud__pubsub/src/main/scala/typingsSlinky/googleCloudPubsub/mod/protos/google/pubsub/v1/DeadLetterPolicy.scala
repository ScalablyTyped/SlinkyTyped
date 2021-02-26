package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IDeadLetterPolicy
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeadLetterPolicy. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy")
@js.native
/**
  * Constructs a new DeadLetterPolicy.
  * @param [properties] Properties to set
  */
class DeadLetterPolicy ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy {
  def this(properties: IDeadLetterPolicy) = this()
}
object DeadLetterPolicy {
  
  /**
    * Creates a new DeadLetterPolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeadLetterPolicy instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.create")
  @js.native
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.create")
  @js.native
  def create(properties: IDeadLetterPolicy): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  /**
    * Decodes a DeadLetterPolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeadLetterPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  /**
    * Decodes a DeadLetterPolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeadLetterPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  
  /**
    * Encodes the specified DeadLetterPolicy message. Does not implicitly {@link google.pubsub.v1.DeadLetterPolicy.verify|verify} messages.
    * @param message DeadLetterPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.encode")
  @js.native
  def encode(message: IDeadLetterPolicy): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.encode")
  @js.native
  def encode(message: IDeadLetterPolicy, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DeadLetterPolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.DeadLetterPolicy.verify|verify} messages.
    * @param message DeadLetterPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeadLetterPolicy): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeadLetterPolicy, writer: Writer): Writer = js.native
  
  /**
    * Creates a DeadLetterPolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeadLetterPolicy
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  
  /**
    * Creates a plain object from a DeadLetterPolicy message. Also converts values to other types if specified.
    * @param message DeadLetterPolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DeadLetterPolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
