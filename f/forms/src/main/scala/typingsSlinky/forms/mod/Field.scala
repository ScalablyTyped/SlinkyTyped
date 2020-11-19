package typingsSlinky.forms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field extends FieldParameters {
  
  /** Returns a new bound field object. Calls parse on the data and stores in the bound field's data attribute, stores the raw value in the value attribute. */
  def bind(rawData: js.Any): FieldBound = js.native
  
  /** Returns an array of default CSS classes considering the field's attributes, e.g. ['field', 'required', 'error'] for a required field with an error message. */
  def classes(): js.Array[String] = js.native
  
  /** Returns a string containing a HTML element containing the fields error message, or an empty string if there is no error associated with the field. */
  def errorHTML(): String = js.native
  
  /** Returns a string containing a label element with the correct 'for' attribute containing the text from field.labelText(name). */
  def labelHTML(name: String): String = js.native
  def labelHTML(name: String, id: String): String = js.native
  def labelHTML(name: String, id: Boolean): String = js.native
  
  /** Returns a string containing the label text from field.label, or defaults to using the field name with underscores replaced with spaces and the first letter capitalised. */
  def labelText(): String = js.native
  def labelText(name: String): String = js.native
  
  /** Coerces the raw data from the request into the correct format for the field, returning the result, e.g. '123' becomes 123 for the number field. */
  def parse(rawData: js.Any): js.Any = js.native
  
  /**
    * Calls the iterator with the name and field object as arguments. Defaults to using forms.render.div as the iterator,
    * which returns a HTML representation of the field label, error message and widget wrapped in a div.
    */
  def toHTML(): String = js.native
  def toHTML(name: js.UndefOr[scala.Nothing], iterator: FieldIterator): String = js.native
  def toHTML(name: String): String = js.native
  def toHTML(name: String, iterator: FieldIterator): String = js.native
  
  /** A widget object to use when rendering the field. */
  @JSName("widget")
  var widget_Field: Widget = js.native
}
