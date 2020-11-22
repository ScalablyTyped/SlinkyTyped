package typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITableRow
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.ITableCell
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TableRow. */
@JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow")
@js.native
/**
  * Constructs a new TableRow.
  * @param [properties] Properties to set
  */
class TableRow ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow {
  def this(properties: ITableRow) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.GherkinDocument.Feature.TableRow")
@js.native
object TableRow extends js.Object {
  
  /**
    * Creates a new TableRow instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TableRow instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
  def create(properties: ITableRow): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
  
  /**
    * Decodes a TableRow message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TableRow
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
  
  /**
    * Decodes a TableRow message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TableRow
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
  
  /**
    * Encodes the specified TableRow message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.verify|verify} messages.
    * @param message TableRow message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITableRow): Writer = js.native
  def encode(message: ITableRow, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TableRow message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.verify|verify} messages.
    * @param message TableRow message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITableRow): Writer = js.native
  def encodeDelimited(message: ITableRow, writer: Writer): Writer = js.native
  
  /**
    * Creates a TableRow message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TableRow
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow = js.native
  
  /**
    * Creates a plain object from a TableRow message. Also converts values to other types if specified.
    * @param message TableRow
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TableRow message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Represents a TableCell. */
  @js.native
  /**
    * Constructs a new TableCell.
    * @param [properties] Properties to set
    */
  class TableCell ()
    extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell {
    def this(properties: ITableCell) = this()
  }
  /* static members */
  @js.native
  object TableCell extends js.Object {
    
    /**
      * Creates a new TableCell instance using the specified properties.
      * @param [properties] Properties to set
      * @returns TableCell instance
      */
    def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
    def create(properties: ITableCell): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
    
    /**
      * Decodes a TableCell message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns TableCell
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
    
    /**
      * Decodes a TableCell message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns TableCell
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
    
    /**
      * Encodes the specified TableCell message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.verify|verify} messages.
      * @param message TableCell message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: ITableCell): Writer = js.native
    def encode(message: ITableCell, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified TableCell message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.verify|verify} messages.
      * @param message TableCell message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: ITableCell): Writer = js.native
    def encodeDelimited(message: ITableCell, writer: Writer): Writer = js.native
    
    /**
      * Creates a TableCell message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns TableCell
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell = js.native
    
    /**
      * Creates a plain object from a TableCell message. Also converts values to other types if specified.
      * @param message TableCell
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(
      message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell
    ): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a TableCell message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
