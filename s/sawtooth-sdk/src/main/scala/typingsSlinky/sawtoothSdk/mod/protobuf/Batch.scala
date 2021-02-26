package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IBatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.Batch")
@js.native
/**
  * Constructs a new Batch.
  * @param [properties] Properties to set
  */
class Batch ()
  extends typingsSlinky.sawtoothSdk.protobufMod.Batch {
  def this(properties: IBatch) = this()
}
/* static members */
object Batch {
  
  /**
    * Creates a new Batch instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Batch instance
    */
  @JSImport("sawtooth-sdk", "protobuf.Batch.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.Batch = js.native
  @JSImport("sawtooth-sdk", "protobuf.Batch.create")
  @js.native
  def create(properties: IBatch): typingsSlinky.sawtoothSdk.protobufMod.Batch = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.Batch.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Batch = js.native
  @JSImport("sawtooth-sdk", "protobuf.Batch.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Batch = js.native
  /**
    * Decodes a Batch message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Batch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.Batch.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Batch = js.native
  @JSImport("sawtooth-sdk", "protobuf.Batch.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Batch = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.Batch.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Batch = js.native
  /**
    * Decodes a Batch message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Batch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.Batch.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Batch = js.native
  
  /**
    * Encodes the specified Batch message. Does not implicitly {@link Batch.verify|verify} messages.
    * @param message Batch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.Batch.encode")
  @js.native
  def encode(message: IBatch): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.Batch.encode")
  @js.native
  def encode(message: IBatch, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Batch message, length delimited. Does not implicitly {@link Batch.verify|verify} messages.
    * @param message Batch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.Batch.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatch): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.Batch.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatch, writer: Writer): Writer = js.native
  
  /**
    * Creates a Batch message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Batch
    */
  @JSImport("sawtooth-sdk", "protobuf.Batch.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.Batch = js.native
  
  /**
    * Creates a plain object from a Batch message. Also converts values to other types if specified.
    * @param message Batch
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.Batch.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Batch): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.Batch.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Batch, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Batch message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.Batch.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
