package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IModifyAckDeadlineRequest
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ModifyAckDeadlineRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest")
@js.native
/**
  * Constructs a new ModifyAckDeadlineRequest.
  * @param [properties] Properties to set
  */
class ModifyAckDeadlineRequest ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyAckDeadlineRequest {
  def this(properties: IModifyAckDeadlineRequest) = this()
}
object ModifyAckDeadlineRequest {
  
  /**
    * Creates a new ModifyAckDeadlineRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ModifyAckDeadlineRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.create")
  @js.native
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyAckDeadlineRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.create")
  @js.native
  def create(properties: IModifyAckDeadlineRequest): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyAckDeadlineRequest = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyAckDeadlineRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyAckDeadlineRequest = js.native
  /**
    * Decodes a ModifyAckDeadlineRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ModifyAckDeadlineRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyAckDeadlineRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyAckDeadlineRequest = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyAckDeadlineRequest = js.native
  /**
    * Decodes a ModifyAckDeadlineRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ModifyAckDeadlineRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyAckDeadlineRequest = js.native
  
  /**
    * Encodes the specified ModifyAckDeadlineRequest message. Does not implicitly {@link google.pubsub.v1.ModifyAckDeadlineRequest.verify|verify} messages.
    * @param message ModifyAckDeadlineRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.encode")
  @js.native
  def encode(message: IModifyAckDeadlineRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.encode")
  @js.native
  def encode(message: IModifyAckDeadlineRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ModifyAckDeadlineRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ModifyAckDeadlineRequest.verify|verify} messages.
    * @param message ModifyAckDeadlineRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IModifyAckDeadlineRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IModifyAckDeadlineRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ModifyAckDeadlineRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ModifyAckDeadlineRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyAckDeadlineRequest = js.native
  
  /**
    * Creates a plain object from a ModifyAckDeadlineRequest message. Also converts values to other types if specified.
    * @param message ModifyAckDeadlineRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyAckDeadlineRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyAckDeadlineRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ModifyAckDeadlineRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyAckDeadlineRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
