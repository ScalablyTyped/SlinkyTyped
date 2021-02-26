package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListSubscriptionsRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest")
@js.native
/**
  * Constructs a new ListSubscriptionsRequest.
  * @param [properties] Properties to set
  */
class ListSubscriptionsRequest () extends IListSubscriptionsRequest {
  def this(properties: IListSubscriptionsRequest) = this()
  
  /** ListSubscriptionsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListSubscriptionsRequest: Double = js.native
  
  /** ListSubscriptionsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListSubscriptionsRequest: String = js.native
  
  /** ListSubscriptionsRequest project. */
  @JSName("project")
  var project_ListSubscriptionsRequest: String = js.native
  
  /**
    * Converts this ListSubscriptionsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListSubscriptionsRequest {
  
  /**
    * Creates a new ListSubscriptionsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSubscriptionsRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.create")
  @js.native
  def create(): ListSubscriptionsRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.create")
  @js.native
  def create(properties: IListSubscriptionsRequest): ListSubscriptionsRequest = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ListSubscriptionsRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ListSubscriptionsRequest = js.native
  /**
    * Decodes a ListSubscriptionsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSubscriptionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.decode")
  @js.native
  def decode(reader: Reader): ListSubscriptionsRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListSubscriptionsRequest = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ListSubscriptionsRequest = js.native
  /**
    * Decodes a ListSubscriptionsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSubscriptionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListSubscriptionsRequest = js.native
  
  /**
    * Encodes the specified ListSubscriptionsRequest message. Does not implicitly {@link google.pubsub.v1.ListSubscriptionsRequest.verify|verify} messages.
    * @param message ListSubscriptionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.encode")
  @js.native
  def encode(message: IListSubscriptionsRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.encode")
  @js.native
  def encode(message: IListSubscriptionsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListSubscriptionsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSubscriptionsRequest.verify|verify} messages.
    * @param message ListSubscriptionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListSubscriptionsRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListSubscriptionsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListSubscriptionsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSubscriptionsRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListSubscriptionsRequest = js.native
  
  /**
    * Creates a plain object from a ListSubscriptionsRequest message. Also converts values to other types if specified.
    * @param message ListSubscriptionsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.toObject")
  @js.native
  def toObject(message: ListSubscriptionsRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.toObject")
  @js.native
  def toObject(message: ListSubscriptionsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListSubscriptionsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSubscriptionsRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
