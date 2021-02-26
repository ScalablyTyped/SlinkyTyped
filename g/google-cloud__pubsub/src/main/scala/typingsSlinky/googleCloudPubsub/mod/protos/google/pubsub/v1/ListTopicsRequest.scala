package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicsRequest
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListTopicsRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest")
@js.native
/**
  * Constructs a new ListTopicsRequest.
  * @param [properties] Properties to set
  */
class ListTopicsRequest ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsRequest {
  def this(properties: IListTopicsRequest) = this()
}
object ListTopicsRequest {
  
  /**
    * Creates a new ListTopicsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicsRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.create")
  @js.native
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.create")
  @js.native
  def create(properties: IListTopicsRequest): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsRequest = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsRequest = js.native
  /**
    * Decodes a ListTopicsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsRequest = js.native
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsRequest = js.native
  /**
    * Decodes a ListTopicsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsRequest = js.native
  
  /**
    * Encodes the specified ListTopicsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicsRequest.verify|verify} messages.
    * @param message ListTopicsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.encode")
  @js.native
  def encode(message: IListTopicsRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.encode")
  @js.native
  def encode(message: IListTopicsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListTopicsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicsRequest.verify|verify} messages.
    * @param message ListTopicsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicsRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListTopicsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicsRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsRequest = js.native
  
  /**
    * Creates a plain object from a ListTopicsRequest message. Also converts values to other types if specified.
    * @param message ListTopicsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.toObject")
  @js.native
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicsRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListTopicsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicsRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
