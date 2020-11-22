package typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.HTTP

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.IHTTP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP")
@js.native
object ^ extends js.Object {
  
  /**
    * Creates a new HTTP instance using the specified properties.
    * @param [properties] Properties to set
    * @returns HTTP instance
    */
  def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def create(properties: IHTTP): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
  
  /**
    * Decodes a HTTP message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns HTTP
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
  
  /**
    * Decodes a HTTP message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns HTTP
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
  
  /**
    * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
    * @param message HTTP message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IHTTP): Writer = js.native
  def encode(message: IHTTP, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified HTTP message, length delimited. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
    * @param message HTTP message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IHTTP): Writer = js.native
  def encodeDelimited(message: IHTTP, writer: Writer): Writer = js.native
  
  /**
    * Creates a HTTP message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns HTTP
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
  
  /**
    * Creates a plain object from a HTTP message. Also converts values to other types if specified.
    * @param message HTTP
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.HTTP): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.HTTP, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a HTTP message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
