package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IEventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.EventSubscription")
@js.native
/**
  * Constructs a new EventSubscription.
  * @param [properties] Properties to set
  */
class EventSubscription ()
  extends typingsSlinky.sawtoothSdk.protobufMod.EventSubscription {
  def this(properties: IEventSubscription) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.EventSubscription")
@js.native
object EventSubscription extends js.Object {
  
  /**
    * Creates a new EventSubscription instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EventSubscription instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.EventSubscription = js.native
  def create(properties: IEventSubscription): typingsSlinky.sawtoothSdk.protobufMod.EventSubscription = js.native
  
  /**
    * Decodes an EventSubscription message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EventSubscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.EventSubscription = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.EventSubscription = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.EventSubscription = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.EventSubscription = js.native
  
  /**
    * Decodes an EventSubscription message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EventSubscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.EventSubscription = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.EventSubscription = js.native
  
  /**
    * Encodes the specified EventSubscription message. Does not implicitly {@link EventSubscription.verify|verify} messages.
    * @param message EventSubscription message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEventSubscription): Writer = js.native
  def encode(message: IEventSubscription, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EventSubscription message, length delimited. Does not implicitly {@link EventSubscription.verify|verify} messages.
    * @param message EventSubscription message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEventSubscription): Writer = js.native
  def encodeDelimited(message: IEventSubscription, writer: Writer): Writer = js.native
  
  /**
    * Creates an EventSubscription message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EventSubscription
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.EventSubscription = js.native
  
  /**
    * Creates a plain object from an EventSubscription message. Also converts values to other types if specified.
    * @param message EventSubscription
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.EventSubscription): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.EventSubscription, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EventSubscription message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
