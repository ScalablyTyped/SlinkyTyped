package typingsSlinky.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "Field")
@js.native
/**
  * Constructs a new Field.
  * @param [properties] Properties to set
  */
class Field () extends IField {
  def this(properties: IField) = this()
  
  /** Field name. */
  @JSName("name")
  var name_Field: String = js.native
  
  /** Field returnType. */
  @JSName("returnType")
  var returnType_Field: String = js.native
  
  /**
    * Converts this Field to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object Field {
  
  /**
    * Creates a new Field instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Field instance
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.create")
  @js.native
  def create(): Field = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.create")
  @js.native
  def create(properties: IField): Field = js.native
  
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): Field = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Field = js.native
  /**
    * Decodes a Field message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Field
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.decode")
  @js.native
  def decode(reader: Reader): Field = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.decode")
  @js.native
  def decode(reader: Reader, length: Double): Field = js.native
  
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): Field = js.native
  /**
    * Decodes a Field message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Field
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Field = js.native
  
  /**
    * Encodes the specified Field message. Does not implicitly {@link Field.verify|verify} messages.
    * @param message Field message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.encode")
  @js.native
  def encode(message: IField): Writer = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.encode")
  @js.native
  def encode(message: IField, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Field message, length delimited. Does not implicitly {@link Field.verify|verify} messages.
    * @param message Field message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.encodeDelimited")
  @js.native
  def encodeDelimited(message: IField): Writer = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.encodeDelimited")
  @js.native
  def encodeDelimited(message: IField, writer: Writer): Writer = js.native
  
  /**
    * Creates a Field message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Field
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Field = js.native
  
  /**
    * Creates a plain object from a Field message. Also converts values to other types if specified.
    * @param message Field
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.toObject")
  @js.native
  def toObject(message: Field): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.toObject")
  @js.native
  def toObject(message: Field, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Field message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Field.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
