package typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod

import typingsSlinky.materialUiLab.materialUiLabBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteSingleProps[T]
  - typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteMultipleProps[T]
*/
trait UseAutocompleteProps[T] extends js.Object

object UseAutocompleteProps {
  @scala.inline
  def UseAutocompleteSingleProps[T](options: js.Array[T]): UseAutocompleteProps[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseAutocompleteProps[T]]
  }
  @scala.inline
  def UseAutocompleteMultipleProps[T](multiple: `true`, options: js.Array[T]): UseAutocompleteProps[T] = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseAutocompleteProps[T]]
  }
}

