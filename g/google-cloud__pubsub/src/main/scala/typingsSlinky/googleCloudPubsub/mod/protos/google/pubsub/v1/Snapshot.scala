package typingsSlinky.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ISnapshot
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Snapshot. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Snapshot")
@js.native
/**
  * Constructs a new Snapshot.
  * @param [properties] Properties to set
  */
class Snapshot ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.Snapshot {
  def this(properties: ISnapshot) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Snapshot")
@js.native
object Snapshot extends js.Object {
  /**
    * Creates a new Snapshot instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Snapshot instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.Snapshot = js.native
  def create(properties: ISnapshot): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.Snapshot = js.native
  /**
    * Decodes a Snapshot message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Snapshot
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.Snapshot = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.Snapshot = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.Snapshot = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.Snapshot = js.native
  /**
    * Decodes a Snapshot message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Snapshot
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.Snapshot = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.Snapshot = js.native
  /**
    * Encodes the specified Snapshot message. Does not implicitly {@link google.pubsub.v1.Snapshot.verify|verify} messages.
    * @param message Snapshot message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISnapshot): Writer = js.native
  def encode(message: ISnapshot, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Snapshot message, length delimited. Does not implicitly {@link google.pubsub.v1.Snapshot.verify|verify} messages.
    * @param message Snapshot message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISnapshot): Writer = js.native
  def encodeDelimited(message: ISnapshot, writer: Writer): Writer = js.native
  /**
    * Creates a Snapshot message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Snapshot
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.Snapshot = js.native
  /**
    * Creates a plain object from a Snapshot message. Also converts values to other types if specified.
    * @param message Snapshot
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.Snapshot): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.Snapshot,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Snapshot message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

