package typingsSlinky.apolloReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.apolloReportingProtobuf.protobufMod.ITrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace")
@js.native
object ^ extends js.Object {
  
  /**
    * Creates a new Trace instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Trace instance
    */
  def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace = js.native
  def create(properties: ITrace): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace = js.native
  
  /**
    * Decodes a Trace message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace = js.native
  
  /**
    * Decodes a Trace message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace = js.native
  
  /**
    * Encodes the specified Trace message. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITrace): Writer = js.native
  def encode(message: ITrace, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Trace message, length delimited. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITrace): Writer = js.native
  def encodeDelimited(message: ITrace, writer: Writer): Writer = js.native
  
  /**
    * Creates a Trace message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Trace
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace = js.native
  
  /**
    * Creates a plain object from a Trace message. Also converts values to other types if specified.
    * @param message Trace
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Trace message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
