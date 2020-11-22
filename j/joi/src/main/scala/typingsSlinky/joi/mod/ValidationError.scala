package typingsSlinky.joi.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationError extends Error {
  
  var _original: js.Any = js.native
  
  /**
    * function that returns a string with an annotated version of the object pointing at the places where errors occurred.
    *
    * NOTE: This method does not exist in browser builds of Joi
    *
    * @param stripColors - if truthy, will strip the colors out of the output.
    */
  def annotate(): String = js.native
  def annotate(stripColors: Boolean): String = js.native
  
  /**
    * array of errors.
    */
  var details: js.Array[ValidationErrorItem] = js.native
  
  var isJoi: Boolean = js.native
  
  @JSName("name")
  var name_ValidationError: typingsSlinky.joi.joiStrings.ValidationError = js.native
}
