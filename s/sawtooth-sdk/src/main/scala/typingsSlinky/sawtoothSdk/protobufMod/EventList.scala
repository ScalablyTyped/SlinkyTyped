package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "EventList")
@js.native
/**
  * Constructs a new EventList.
  * @param [properties] Properties to set
  */
class EventList () extends IEventList {
  def this(properties: IEventList) = this()
  
  /** EventList events. */
  @JSName("events")
  var events_EventList: js.Array[IEvent] = js.native
  
  /**
    * Converts this EventList to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "EventList")
@js.native
object EventList extends js.Object {
  
  /**
    * Creates a new EventList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EventList instance
    */
  def create(): EventList = js.native
  def create(properties: IEventList): EventList = js.native
  
  /**
    * Decodes an EventList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EventList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): EventList = js.native
  def decode(reader: Reader, length: Double): EventList = js.native
  def decode(reader: js.typedarray.Uint8Array): EventList = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): EventList = js.native
  
  /**
    * Decodes an EventList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EventList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): EventList = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): EventList = js.native
  
  /**
    * Encodes the specified EventList message. Does not implicitly {@link EventList.verify|verify} messages.
    * @param message EventList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEventList): Writer = js.native
  def encode(message: IEventList, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EventList message, length delimited. Does not implicitly {@link EventList.verify|verify} messages.
    * @param message EventList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEventList): Writer = js.native
  def encodeDelimited(message: IEventList, writer: Writer): Writer = js.native
  
  /**
    * Creates an EventList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EventList
    */
  def fromObject(`object`: StringDictionary[js.Any]): EventList = js.native
  
  /**
    * Creates a plain object from an EventList message. Also converts values to other types if specified.
    * @param message EventList
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: EventList): StringDictionary[js.Any] = js.native
  def toObject(message: EventList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EventList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
