package typingsSlinky.jqueryValidation.JQueryValidation

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jqueryValidation.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator extends js.Object {
  
  def checkForm(): Boolean = js.native
  
  def destroy(): Unit = js.native
  
  def element(element: String): Boolean = js.native
  def element(element: JQuery): Boolean = js.native
  
  def elementValue(element: Element): js.Any = js.native
  
  var errorList: js.Array[ErrorListItem] = js.native
  
  var errorMap: ErrorDictionary = js.native
  
  def focusInvalid(): Unit = js.native
  
  /**
    * Validates the form, returns true if it is valid, false otherwise.
    */
  def form(): Boolean = js.native
  
  def hideErrors(): Unit = js.native
  
  def invalidElements(): js.Array[HTMLElement] = js.native
  
  /**
    * Returns the number of invalid fields.
    */
  def numberOfInvalids(): Double = js.native
  
  /**
    * Resets the controlled form.
    */
  def resetForm(): Unit = js.native
  
  var settings: ValidationOptions = js.native
  
  /**
    * Show the specified messages.
    *
    * @param errors One or more key/value pairs of input names and messages.
    */
  def showErrors(errors: js.Any): Unit = js.native
  
  def size(): Double = js.native
  
  def valid(): Boolean = js.native
  
  def validElements(): js.Array[HTMLElement] = js.native
}
