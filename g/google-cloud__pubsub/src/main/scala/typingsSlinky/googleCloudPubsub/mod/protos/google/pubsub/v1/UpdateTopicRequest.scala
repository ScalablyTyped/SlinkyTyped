package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IUpdateTopicRequest
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateTopicRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest")
@js.native
/**
  * Constructs a new UpdateTopicRequest.
  * @param [properties] Properties to set
  */
class UpdateTopicRequest ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateTopicRequest {
  def this(properties: IUpdateTopicRequest) = this()
}
object UpdateTopicRequest {
  
  /**
    * Creates a new UpdateTopicRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateTopicRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.create")
  @js.native
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateTopicRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.create")
  @js.native
  def create(properties: IUpdateTopicRequest): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateTopicRequest = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateTopicRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateTopicRequest = js.native
  /**
    * Decodes an UpdateTopicRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateTopicRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateTopicRequest = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateTopicRequest = js.native
  /**
    * Decodes an UpdateTopicRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateTopicRequest = js.native
  
  /**
    * Encodes the specified UpdateTopicRequest message. Does not implicitly {@link google.pubsub.v1.UpdateTopicRequest.verify|verify} messages.
    * @param message UpdateTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.encode")
  @js.native
  def encode(message: IUpdateTopicRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.encode")
  @js.native
  def encode(message: IUpdateTopicRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified UpdateTopicRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.UpdateTopicRequest.verify|verify} messages.
    * @param message UpdateTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateTopicRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateTopicRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates an UpdateTopicRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateTopicRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateTopicRequest = js.native
  
  /**
    * Creates a plain object from an UpdateTopicRequest message. Also converts values to other types if specified.
    * @param message UpdateTopicRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateTopicRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateTopicRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an UpdateTopicRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateTopicRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
