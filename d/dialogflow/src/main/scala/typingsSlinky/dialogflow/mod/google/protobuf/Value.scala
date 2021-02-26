package typingsSlinky.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.dialogflow.dialogflowStrings.boolValue
import typingsSlinky.dialogflow.dialogflowStrings.listValue
import typingsSlinky.dialogflow.dialogflowStrings.nullValue
import typingsSlinky.dialogflow.dialogflowStrings.numberValue
import typingsSlinky.dialogflow.dialogflowStrings.stringValue
import typingsSlinky.dialogflow.dialogflowStrings.structValue
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Value. */
@JSImport("dialogflow/protos/protos", "google.protobuf.Value")
@js.native
/**
  * Constructs a new Value.
  * @param [properties] Properties to set
  */
class Value () extends IValue {
  def this(properties: IValue) = this()
  
  /** Value boolValue. */
  @JSName("boolValue")
  var boolValue_Value: Boolean = js.native
  
  /** Value kind. */
  var kind: js.UndefOr[nullValue | numberValue | stringValue | boolValue | structValue | listValue] = js.native
  
  /** Value nullValue. */
  @JSName("nullValue")
  var nullValue_Value: NullValue | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.NullValue * / any */ String) = js.native
  
  /** Value numberValue. */
  @JSName("numberValue")
  var numberValue_Value: Double = js.native
  
  /** Value stringValue. */
  @JSName("stringValue")
  var stringValue_Value: String = js.native
  
  /**
    * Converts this Value to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Value {
  
  /**
    * Creates a new Value instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Value instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.create")
  @js.native
  def create(): Value = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.create")
  @js.native
  def create(properties: IValue): Value = js.native
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): Value = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Value = js.native
  /**
    * Decodes a Value message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Value
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.decode")
  @js.native
  def decode(reader: Reader): Value = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.decode")
  @js.native
  def decode(reader: Reader, length: Double): Value = js.native
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): Value = js.native
  /**
    * Decodes a Value message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Value
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Value = js.native
  
  /**
    * Encodes the specified Value message. Does not implicitly {@link google.protobuf.Value.verify|verify} messages.
    * @param message Value message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.encode")
  @js.native
  def encode(message: IValue): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.encode")
  @js.native
  def encode(message: IValue, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Value message, length delimited. Does not implicitly {@link google.protobuf.Value.verify|verify} messages.
    * @param message Value message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.encodeDelimited")
  @js.native
  def encodeDelimited(message: IValue): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.encodeDelimited")
  @js.native
  def encodeDelimited(message: IValue, writer: Writer): Writer = js.native
  
  /**
    * Creates a Value message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Value
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Value = js.native
  
  /**
    * Creates a plain object from a Value message. Also converts values to other types if specified.
    * @param message Value
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.toObject")
  @js.native
  def toObject(message: Value): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.toObject")
  @js.native
  def toObject(message: Value, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Value message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
