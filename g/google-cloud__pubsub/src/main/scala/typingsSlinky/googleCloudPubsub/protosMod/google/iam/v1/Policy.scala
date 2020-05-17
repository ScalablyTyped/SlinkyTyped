package typingsSlinky.googleCloudPubsub.protosMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Policy. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.iam.v1.Policy")
@js.native
/**
  * Constructs a new Policy.
  * @param [properties] Properties to set
  */
class Policy () extends IPolicy {
  def this(properties: IPolicy) = this()
  /** Policy bindings. */
  @JSName("bindings")
  var bindings_Policy: js.Array[IBinding] = js.native
  /** Policy etag. */
  @JSName("etag")
  var etag_Policy: js.typedarray.Uint8Array | String = js.native
  /** Policy version. */
  @JSName("version")
  var version_Policy: Double = js.native
  /**
    * Converts this Policy to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.iam.v1.Policy")
@js.native
object Policy extends js.Object {
  /**
    * Creates a new Policy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Policy instance
    */
  def create(): Policy = js.native
  def create(properties: IPolicy): Policy = js.native
  /**
    * Decodes a Policy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Policy = js.native
  def decode(reader: Reader, length: Double): Policy = js.native
  def decode(reader: js.typedarray.Uint8Array): Policy = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Policy = js.native
  /**
    * Decodes a Policy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Policy = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): Policy = js.native
  /**
    * Encodes the specified Policy message. Does not implicitly {@link google.iam.v1.Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPolicy): Writer = js.native
  def encode(message: IPolicy, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Policy message, length delimited. Does not implicitly {@link google.iam.v1.Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPolicy): Writer = js.native
  def encodeDelimited(message: IPolicy, writer: Writer): Writer = js.native
  /**
    * Creates a Policy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Policy
    */
  def fromObject(`object`: StringDictionary[js.Any]): Policy = js.native
  /**
    * Creates a plain object from a Policy message. Also converts values to other types if specified.
    * @param message Policy
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Policy): StringDictionary[js.Any] = js.native
  def toObject(message: Policy, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Policy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

